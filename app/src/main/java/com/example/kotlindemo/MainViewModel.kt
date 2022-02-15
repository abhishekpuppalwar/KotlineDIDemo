package com.example.kotlindemo

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.Bindable

class MainViewModel : ViewModel() {

    val currentRandomFruitName: LiveData<String>
        get() = DataRepository.currentPersonName

    fun onChangeRandomFruitName() = DataRepository.changeCurrentRandomFruitName()

    @Bindable
    val editTextContent = MutableLiveData<String>()

    private val _displayEdittextContent = MutableLiveData<String>()

    val displayEdittextContent: LiveData<String>
        get() = _displayEdittextContent

    fun ondisplayEdittextContent() {
        _displayEdittextContent.value = editTextContent.value
        DataRepository.addFruit(_displayEdittextContent.value.toString())
    }
}