package com.example.kotlindemo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import org.koin.android.ext.android.inject

open class BaseActivity : AppCompatActivity() {

    val person: Person by inject()
    val version: Int = 0

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
}