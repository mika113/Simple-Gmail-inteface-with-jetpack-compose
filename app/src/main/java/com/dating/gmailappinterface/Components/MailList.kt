package com.dating.gmailappinterface.Components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dating.gmailappinterface.mailList
import com.dating.gmailappinterface.models.MailData

@Composable
fun MailList(paddingValues: PaddingValues,scrollState:ScrollState){
    Box(modifier = Modifier.padding(paddingValues)){
        LazyColumn(modifier= Modifier
            .fillMaxSize()
            .padding(16.dp)
            .scrollable(scrollState,Orientation.Vertical)){
            items(mailList){
                mailData -> 
                MailIteml(mailData = mailData, modifier = Modifier)
            }
        }
    }
    
}
@Composable
fun MailIteml(mailData:MailData,modifier: Modifier){
    Row(modifier= Modifier
        .fillMaxSize()
        .padding(bottom = 8.dp)) {
        Card(modifier = Modifier
            .padding(end = 3.dp)
            .size(40.dp)
            .clip(CircleShape),
            backgroundColor = Color.Gray) {
            Text(text = mailData.name[0].toString(),
            textAlign = TextAlign.Center,modifier=Modifier.padding(8.dp))
        }
        Column(modifier.weight(2.0f)) {
            Text(text = mailData.name,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp)
            Text(text = mailData.subject,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp)
            Text(text = mailData.body,
                fontSize = 13.sp)
        }
        Column() {
            Text(text = mailData.timeStamp)
            IconButton(onClick = { /*TODO*/ },modifier= Modifier
                .size(40.dp)
                .padding(top = 16.dp)) {
                Icon(imageVector = Icons.Outlined.StarOutline, contentDescription = "")
                
            }
            
        }
    }
    
}