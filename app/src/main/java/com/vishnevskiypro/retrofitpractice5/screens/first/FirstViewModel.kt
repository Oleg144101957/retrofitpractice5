package com.vishnevskiypro.retrofitpractice5.screens.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retrofitpractice5.data.repository.Repository
import com.vishnevskiypro.retrofitpractice5.model.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class FirstViewModel : ViewModel() {

    val repository = Repository()
    val myMoneyList : MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalForViewModel(){
        viewModelScope.launch {
            myMoneyList.value = repository.getNalRepo()
        }
    }

}