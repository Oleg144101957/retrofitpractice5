package com.vishnevskiypro.retrofitpractice5.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retrofitpractice5.data.repository.Repository
import com.vishnevskiypro.retrofitpractice5.model.beznal.Beznalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel : ViewModel(){

    val repository = Repository()
    val myMoneyList : MutableLiveData<Response<Beznalichka>> = MutableLiveData()

    fun getBeznalForViewModel(){
        viewModelScope.launch {
            myMoneyList.value = repository.getBeznalRepo()
        }
    }

}