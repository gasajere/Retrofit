package com.terence.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface TodoService {
    @GET("todos")
    fun getALLTodos(): Call<List<Todo>>
}