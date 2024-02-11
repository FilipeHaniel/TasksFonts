package com.devmasterteam.tasks.service.model

import android.os.Message

class ValidationModel(message: String = "") {
    private var status: Boolean = true
    private var validationMessage: String = ""

    init {
        if (message != "") {
            validationMessage = message
            status = false
        }
    }

    fun status() = status
    fun message() = validationMessage
}