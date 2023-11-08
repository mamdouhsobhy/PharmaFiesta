package com.example.pharmafiesta.ui.home.chatscreen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.example.pharmafiesta.R
import com.example.pharmafiesta.ui.theme.Black

private const val TAG = "ChatScreenUi"

@Composable
fun ChatScreenUi () {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(id = R.string.bottomNav_chat_title), fontSize = 24.sp, color = Black)
    }
}
