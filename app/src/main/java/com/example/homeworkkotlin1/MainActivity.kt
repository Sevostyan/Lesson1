package com.example.homeworkkotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.PI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val x = 5
        fun circleArea(): Double {
            return x * x * PI
        }
        Log.d("Lesson1", "Площадь окружности равна: ${circleArea()}")
        fun squareArea(): Int {
            return x * x
        }
        Log.d("Lesson1", "Площадь квадрата равна:  ${squareArea()}")
        when {
            circleArea() < squareArea() -> {
                Log.d("Lesson1", "Площадь окружности больше площади квадрата")
            }
            circleArea() > squareArea() -> {
                Log.d("Lesson1", "Площадь квадрата больше площади окружности")
            }
        }
    }
}