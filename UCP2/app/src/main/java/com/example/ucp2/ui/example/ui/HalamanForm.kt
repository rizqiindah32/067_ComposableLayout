package com.example.ucp2.ui.example.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(
    onSubmitButtonClicked: (MutableList<String>)->Unit
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Formulir Pengajuan Skripsi",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(0.dp))
    }
    Spacer(modifier = Modifier.padding(10.dp))

    var txtNama by remember {
        mutableStateOf("")
    }

    var txtNim by remember {
        mutableStateOf("")
    }

    var txtKonsentrasi by remember {
        mutableStateOf("")
    }

    var txtJudul by remember {
        mutableStateOf("")
    }

    val listData = mutableListOf<String>(txtNama, txtNim, txtKonsentrasi, txtJudul)

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        OutlinedTextField(
            value = txtNama ,
            onValueChange = {
                txtNama = it
            },
            label = { Text(text = "Nama")}
        )
        Spacer(modifier = Modifier.padding(10.dp))

        OutlinedTextField(
            value = txtNim ,
            onValueChange = {
                txtNim = it
            },
            label = { Text(text = "Nim")}
        )
        Spacer(modifier = Modifier.padding(10.dp))

        OutlinedTextField(
            value = txtKonsentrasi ,
            onValueChange = {
                txtKonsentrasi = it
            },
            label = { Text(text = "Konsentrasi")}
        )
        Spacer(modifier = Modifier.padding(10.dp))

        OutlinedTextField(
            value = txtJudul ,
            onValueChange = {
                txtJudul = it
            },
            label = { Text(text = "Judul")}
        )
        Spacer(modifier = Modifier.padding(10.dp))
    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

    }
}