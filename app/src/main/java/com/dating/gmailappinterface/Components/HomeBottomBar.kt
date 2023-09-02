package com.dating.gmailappinterface.Components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.dating.gmailappinterface.models.BottomMenuData

@Composable
fun HomeBottomBar(){
    val menuItems= listOf(
        BottomMenuData.Mail,
        BottomMenuData.Meet
    )
    BottomNavigation(backgroundColor = Color.White, contentColor = Color.Black) {
        menuItems.forEach {
            BottomNavigationItem( 
                label ={(Text(text = it.title))},
                alwaysShowLabel = true,
                selected = false, 
                onClick = { /*TODO*/ },
            icon = { Icon(imageVector = it.icon, contentDescription = it.title)})
        }
        
    }
}