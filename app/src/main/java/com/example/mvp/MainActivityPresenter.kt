package com.example.mvp

class MainActivityPresenter(view: View) {
    private val user: User
    private val view: View
    fun updateFullName(fullName: String?) {
        fullName?.let { user.setFullName(it) }
        view.updateUserInfoTextView(user.toString())
    }

    fun updateEmail(email: String?) {
        email?.let { user.setEmail(it) }
        view.updateUserInfoTextView(user.toString())
    }

    interface View {
        fun updateUserInfoTextView(info: String?)
        fun showProgressBar()
        fun hideProgressBar()
    }

    init {
        user = User()
        this.view = view
    }
}