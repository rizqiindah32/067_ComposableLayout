package com.example.pam6.ui.theme.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.pam6.R
import com.example.pam6.data.ContactUiState

@Composable
fun HalamanDua(
    contactUiState: ContactUiState,
    onButtonClicked: ()-> Unit
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(),
        verticalArrangement = Arrangement.Center
    ){
        Text(text = stringResource(id = R.string.nama))
        Text(text = contactUiState.nama)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))

        Text(text = stringResource(id = R.string.alamat))
        Text(text = contactUiState.alamat)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))

        Text(text = stringResource(id = R.string.no_telp))
        Text(text = contactUiState.tlp)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
    }

}