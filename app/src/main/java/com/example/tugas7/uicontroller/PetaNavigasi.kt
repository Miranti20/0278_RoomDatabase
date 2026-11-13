package com.example.tugas7.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SiswaApp(navController: NavHostController = rememberNavController()) {
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinasiEntry.route)
                }
            )
        }

        composable(DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = { navController.popBackStack() }
            )
        }
    }
}

@Composable
fun EntrySiswaScreen(navigateBack: () -> Boolean) {
    TODO("Not yet implemented")
}

@Composable
fun HomeScreen(navigateToItemEntry: () -> Unit) {
    TODO("Not yet implemented")
}







