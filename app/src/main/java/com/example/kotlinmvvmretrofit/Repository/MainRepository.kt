package com.example.kotlinmvvmretrofit.Repository

import com.example.kotlinmvvmretrofit.Network.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {
    fun getAllMovies() = retrofitService.getAllMovies()
}