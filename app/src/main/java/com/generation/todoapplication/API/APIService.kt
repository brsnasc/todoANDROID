package com.generation.todoapplication.API

import com.generation.todoapplication.model.Categoria

interface APIService {

    @GET("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>

}