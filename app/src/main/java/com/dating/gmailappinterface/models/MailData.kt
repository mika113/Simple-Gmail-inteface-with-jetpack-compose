package com.dating.gmailappinterface.models

data class MailData(
    val mailId:Int,
    val name:String,
    val subject:String,
    val body:String,
    val timeStamp:String=""
)
