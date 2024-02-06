package com.example.models
import kotlinx.serialization.Serializable

@Serializable
data class Customer(val id: String, val firstName: String, val lastName:String, val email: String) {

}

val c1 = Customer("1", "Israel", "oyedele", "example@gmail.com")
val c2 = Customer("2", "Israel", "oyedele", "example@gmail.com")
val c3 = Customer("3", "Israel", "oyedele", "example@gmail.com")
val customers = mutableListOf<Customer>(c1, c2, c3)