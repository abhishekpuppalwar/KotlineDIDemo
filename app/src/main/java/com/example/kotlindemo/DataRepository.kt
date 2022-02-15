package com.example.kotlindemo

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import java.util.*

object DataRepository {

    private val fruits: MutableList<String> = mutableListOf(
        "Banana", "Apple", "Cherry", "Pear", "Grapes", "Fit", "Strawberry", "blueberry", "blackberry"
    )

    private val _currentRandomFruitName = MutableLiveData<String>()

    val currentPersonName: LiveData<String>
        get() = _currentRandomFruitName

    init {
        _currentRandomFruitName.value = fruits.first()
    }

    fun getRandomFruitName(): String {
        val random = Random()
        return fruits[random.nextInt(fruits.size)]
    }

    fun changeCurrentRandomFruitName() {
        _currentRandomFruitName.value = getRandomFruitName()
    }

    fun addFruit(fruit: String) {
        fruits.add(fruit)
    }
}