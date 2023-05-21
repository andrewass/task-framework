package com.taskframework.sample.utils

import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class UselessService {

    fun getSomethingUseless() = "somethingUseless"

    fun getRandomNumber(): Int = Random.nextInt()
}