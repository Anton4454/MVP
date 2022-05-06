package com.example.mvp

class User {
    private var fullName = ""
    private var email = ""

    constructor() {}
    constructor(fullName: String, email: String) {
        this.fullName = fullName
        this.email = email
    }

    fun getFullName() : String{
        return fullName
    }

    fun getEmail(): String {
        return email
    }

    fun setFullName(fullName: String){
        this.fullName = fullName
    }

    fun setEmail(email: String){
        this.email = email
    }
    override fun toString(): String {
        return "Email : $email\nFullName : $fullName"
    }
}