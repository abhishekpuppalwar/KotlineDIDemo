package com.example.kotlindemo

import org.koin.dsl.context.Context
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

object AppModule {
    fun getModule() : Module  = applicationContext{
        bean { Person("Abhishek ", 20, get()) }
    }
}