package com.hd.misale

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hd.misale.fav.FavContent
import com.hd.misale.home.HomeContent
import com.hd.misale.recent.RecentContent
import com.hd.misale.search.SearchContent

@Composable
fun AppNav( navController: NavHostController){
    NavHost( navController , startDestination = Destination.Home.route){
        composable(Destination.Home.route){
            HomeContent()
        }
        composable(Destination.Fav.route){
            FavContent()
        }
        composable(Destination.Recent.route){
            RecentContent()
        }
        composable(Destination.SearchView.route){
            SearchContent()
        }
        /*
        composable(Destination.Home_card.route.plus("/{arg1}"),
            arguments = listOf(navArgument("arg1") { type = NavType.StringType })){ backStackEntry ->
            val arg1 = backStackEntry.arguments?.getString("arg1")
            Home_chard(data = arg1!!) {
                navController.navigate(Destination.Home.route)
            }
        }*/
    }
}

sealed class Destination(val route : String , val title : String , val icon : Int){
    data object Home : Destination("home" , "Home" , icon = R.drawable.baseline_search_24)
    data object Fav : Destination("fav" , "Fav" , icon = R.drawable.baseline_search_24)
    data object Recent : Destination("recent" , "Recent" , icon = R.drawable.baseline_search_24)
    data object SearchView : Destination("search" , "Search", icon = R.drawable.baseline_search_24)
    companion object{
        val list = listOf(Home , Fav , Recent, SearchView)
    }
}