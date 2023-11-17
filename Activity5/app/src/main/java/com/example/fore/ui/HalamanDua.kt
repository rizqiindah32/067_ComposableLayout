package com.example.fore.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.activity5.R
import com.example.fore.data.FormState
import com.example.fore.data.OrderUiState
import com.example.fore.ui.componen.FormatDataPemesanan
import com.example.fore.ui.componen.FormatLabelHarga

@Composable
fun HalamanDua(
    formState: FormState,
    orderUiState: OrderUiState,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    val items = listOf(
        Pair(stringResource(R.string.quantity), orderUiState.jumlah),
        Pair(stringResource(R.string.flavor), orderUiState.rasa)
    )
    Column (
        modifier = Modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Column (
            modifier = Modifier
                .padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            FormatDataPemesanan(
                namaPemesanan = formState.nama,
                alamatPemesanan = formState.alamat,
                teleponPemesanan = formState.telepon
            )
            Spacer(modifier = Modifier.padding(8.dp))
            items.forEach { item ->
                Column {
                    Text(item.first.uppercase())
                    Text(text = item.second.toString(), fontWeight = FontWeight.Bold)
                }
                Divider(thickness =
                dimensionResource(R.dimen.thickness_divider))
            }
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
            FormatLabelHarga(
                subtotal = orderUiState.harga,
                modifier = Modifier.align(Alignment.End)
            )
        }
        Row (
            modifier = Modifier
                .weight(1f, false)
                .padding(dimensionResource(R.dimen.padding_medium))
        ){
            Column (
                verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
            ){
                Button(
                    modifier = Modifier
                        .fillMaxWidth(),
                    onClick = {}
                ) {
                    Text(stringResource(R.string.cancel))
                }
            }
        }
    }
}

