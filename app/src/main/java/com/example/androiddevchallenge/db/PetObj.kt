package com.example.androiddevchallenge.db

data class PetObj(
    val id: String,
    val pupName: String,
    val pupAge: Int,
    val pupDesc: String,
    val pupImgLocation: Int,
    val pupGender: Gender,
    val pupBreed: String,
)

enum class Gender {
    Male,
    Female,
    Undefined
}