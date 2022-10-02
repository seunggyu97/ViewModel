package com.anushka.viewmodeldemo2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startTotal: Int) : ViewModel() {
    private var total = MutableLiveData<Int>()
    val totalData : LiveData<Int>
    get() = total

    init{
        total.value = startTotal
    }

//    fun getTotal(): Int{
//        return total
//    }

    fun setTotal(input: Int){
        total.value = (total.value)?.plus(input)
    }
}