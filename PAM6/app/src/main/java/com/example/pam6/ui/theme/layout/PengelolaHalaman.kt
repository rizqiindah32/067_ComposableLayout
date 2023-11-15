package com.example.pam6.ui.theme.layout

import androidx.annotation.OptIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import java.security.AccessController

enum class PengelolaHalaman {
    Formulir,
    Detail
}

@kotlin.OptIn(ExperimentalMaterial3Api::class)
@OptIn()
@Composable
fun ContactApp(
    viewModel: ContactViewModel = viewModel(),
    navHostController: NavHostController = rememberNavController()
){
    Scaffold {innerpadding ->
        val uiState by viewModel.stateUI.collectAsState()

        NavHost(
            navController = navHostController ,
            startDestination = PengelolaHalaman.Formulir.name,
            modifier = Modifier.padding(innerpadding)
        )
        {
            composable(route = PengelolaHalaman.Formulir.name){
                HalamanSatu(
                    onSubmitButtonClicked = {
                        viewModel.setContact(it)
                        navHostController.navigate(PengelolaHalaman.Detail.name)
                    }
                )
            }
            composable(route = PengelolaHalaman.Detail.name){
                HalamanDua(
                    contactUiState = uiState,
                    onButtonClicked = {
                        navHostController.popBackStack(
                            PengelolaHalaman.Formulir.name,
                            false
                        )
                    }
                )
            }
        }
    }
}