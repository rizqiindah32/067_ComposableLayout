package com.example.fore.ui.componen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.activity5.R


@Composable
fun FormatLabelHarga(subtotal: String, modifier: Modifier = Modifier){
    Text(
        text =  stringResource(R.string.subtotal_price, subtotal),
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall
    )
}

@Composable
fun FormatDataPemesanan(
    namaPemesanan: String,
    alamatPemesanan: String,
    teleponPemesanan: String,
){
    Text(
        text = stringResource(R.string.namaorder),
        )
    Text(namaPemesanan)
    Divider()
    Spacer(modifier = Modifier.padding(8.dp))

    Text(
        text = stringResource(R.string.alamatorder),
        )
    Text(alamatPemesanan)
    Divider()
    Spacer(modifier = Modifier.padding(10.dp))

    Text(
        text = stringResource(R.string.teleponorder),
        )
    Text(teleponPemesanan)
    Divider()
}
