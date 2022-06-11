package com.generation.todoapplication.API

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }

}