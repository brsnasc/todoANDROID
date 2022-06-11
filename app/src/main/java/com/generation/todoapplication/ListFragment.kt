package com.generation.todoapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.todoapplication.adapter.TarefaAdapter
import com.generation.todoapplication.databinding.FragmentListBinding
import com.generation.todoapplication.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentListBinding.inflate(layoutInflater, container, false)

       val listTarefas = listOf(
            Tarefa("Varrer a casa.",
                "Varrer a casa em 15min.",
                "Bruna.",
                "9 de Junho.",
                false,
                "Dia-a-dia."

        ),

            Tarefa("Lavar a louça.",
                "Lavar a louça em 30min.",
                "Bruna.",
                "9 de Junho.",
                false,
                "Dia-a-dia."

        ),

            Tarefa("Arrumar a cama.",
                "Arrumar a cama em 5min.",
                "Bruna.",
                "9 de Junho.",
                true,
                "Dia-a-dia."

        )
        )

        val TarefaAdapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = TarefaAdapter
        binding.recyclerTarefa.setHasFixedSize(true)

        TarefaAdapter.setList(listTarefas)

        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)

        }

        return binding.root
    }
}