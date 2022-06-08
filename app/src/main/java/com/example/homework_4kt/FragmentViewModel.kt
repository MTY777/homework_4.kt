package com.example.homework_4kt

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentViewModel : ViewModel() {

    private var mCounter = 0
    private var mHistory = ""

    var history = MutableLiveData<String>()
    val counter = MutableLiveData<Int>()

    fun onPlusClick() {
        mCounter++
        counter.value = mCounter
        mHistory = "$mHistory\n+"
        history.value = mHistory

        Log.e("counter: ", mCounter.toString())
        Log.e("history: ", mHistory)
        Log.e("history: ", history.toString())
    }

    fun onMinusClick() {
        mCounter--
        counter.value = mCounter
        mHistory = "$mHistory\n-"
        history.value = mHistory

        Log.e("counter: ", mCounter.toString())
        Log.e("history: ", mHistory)
        Log.e("history: ", history.toString())
    }

}