package com.generation.todoapplication.API

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    val api: APIService by lazy {
        retrofit.create(APIService::class.java)

    }

}