package com.terence.retrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    val items: MutableLiveData<List<Todo>> = MutableLiveData()

    fun getAllTodos(){
        CoroutineScope(Dispatchers.IO).launch {
            val todos : List<Todo> = RetrofitProvider.service.getALLTodos()

            items.postValue(todos)
        }

    }
}