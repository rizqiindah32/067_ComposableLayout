package com.example.fore.ui

import androidx.lifecycle.ViewModel
import com.example.fore.data.FormState
import com.example.fore.data.OrderUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.NumberFormat

private const val HARGA_PER_CUP = 3000

class OrderViewModel : ViewModel() {
    private val _stateUI = MutableStateFlow(OrderUiState())
    private val _nameSTATE = MutableStateFlow(FormState())
    val stateUI : StateFlow<OrderUiState> = _stateUI.asStateFlow()
    val nameST : StateFlow<FormState> = _nameSTATE.asStateFlow()

    fun setNama(list: MutableList<String>){
        _nameSTATE.update { stateSaatIni -> stateSaatIni.copy(
            nama = list[0],
            alamat = list[1],
            telepon = list[2]
        ) }
    }

    fun setJumlah(jmlFore:Int) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                jumlah = jmlFore,
                harga = hitunganHarga(jumlah = jmlFore)
            )
        }
    }
    fun setRasa(rasaPilihan : String) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(rasa = rasaPilihan)
        }
    }
    fun resetOrder(){
        _stateUI.value = OrderUiState()
    }

    private fun hitunganHarga(
        jumlah: Int = _stateUI.value.jumlah,
    ): String{
        val kalkulasiHarga = jumlah * HARGA_PER_CUP

        return NumberFormat.getNumberInstance().format(kalkulasiHarga)
    };
}