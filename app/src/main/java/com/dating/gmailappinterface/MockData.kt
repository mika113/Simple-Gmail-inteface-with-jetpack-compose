package com.dating.gmailappinterface

import android.accounts.Account
import com.dating.gmailappinterface.models.Accounts
import com.dating.gmailappinterface.models.MailData

val mailList = listOf(
    MailData(
        mailId = 1,
        name = "Christy",
        subject = "Weekly Android News",
        body = "Hello Christy we have got exciting addition  to the android api",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 2,
        name = "Agatha",
        subject = "Job Application",
        body = "This is regarding a job opportunity I found on your website.",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 3,
        name = "Cecilia",
        subject = "Flutter News",
        body = "Hello Cecilia we have got exciting addition  to the Flutter api",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 4,
        name = "Angelo",
        subject = "Email regarding job opportunity",
        body = "This is regarding a job opportunity for the profile or android developer in our organisation.",
        timeStamp = "21:10"
    ),
    MailData(
        mailId = 5,
        name = "Sam",
        subject = "New Event has been created",
        body = "A new event has been added to your dashboard go check it out",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 6,
        name = "Medium",
        subject = "JetPack compose for beginners",
        body = "This article will teach you all the basics of jetpack compose.",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 7,
        name = "Netflix",
        subject = "A new Device is using your account",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 8,
        name = "Collins",
        subject = "A request for partnership",
        body = "This is a follow up email about the partnership request",
        timeStamp = "20:50"
    ),
    MailData(
        mailId = 9,
        name = "Amazon",
        subject = "Your account has been created",
        body = "If you did not sign in with a new device then go to settings and reset your password",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 10,
        name = "Jobs",
        subject = "New opportunity that suits you",
        body = "We have an opening that suits your profile kindly check it out and indicate your interest",
        timeStamp = "20:10"
    )
)
val accountList = listOf<Accounts>(
    Accounts(icon =  R.drawable.datte,userName = "Tutorials Eu",email = "tutorials@eu.com",unReadMails = 99),
    Accounts(userName = "Chris Morty",email = "chris@gmail.com",unReadMails =80),
    Accounts(userName = "Christy Jane",email = "jane@gmail.com",unReadMails = 99)
)