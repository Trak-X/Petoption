package com.example.androiddevchallenge.backend

sealed class Navigation(val destination: String) {
    object Dashboard : Navigation("Dashboard")
    object PupDetails : Navigation("PupDetails")
}