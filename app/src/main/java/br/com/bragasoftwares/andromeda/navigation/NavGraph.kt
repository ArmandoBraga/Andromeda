package br.com.bragasoftwares.andromeda.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.bragasoftwares.andromeda.navigation.screens.home.HomeScreen
import br.com.bragasoftwares.andromeda.navigation.screens.login.LoginScreen
import br.com.bragasoftwares.andromeda.screens.detail.DetailScreen


@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.Login.route)
    {
        composable(route = Screens.Login.route){
            LoginScreen(navController)
        }
        composable(route = Screens.Home.route){
            HomeScreen(navController)
        }
        composable(route = Screens.Detail.route){
            DetailScreen()
        }
    }
}