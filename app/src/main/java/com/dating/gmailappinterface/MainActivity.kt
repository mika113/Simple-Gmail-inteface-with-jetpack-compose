package com.dating.gmailappinterface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dating.gmailappinterface.Components.*
import com.dating.gmailappinterface.ui.theme.GmailAppInterfaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailAppInterfaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val openDialog=remember{
        mutableStateOf(false)
    }
    Scaffold(scaffoldState = scaffoldState,
        topBar = {
            HomeAppBar(scaffoldState,coroutineScope,openDialog)
        },
        drawerContent = {
            GmailDrawerMenu(scrollState = scrollState)
        },
        floatingActionButton = {
            GmailFab(scrollState)
        },
        bottomBar = {
            HomeBottomBar()
        }){
        MailList(it,scrollState)
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailAppInterfaceTheme {
        GmailApp()
    }
}