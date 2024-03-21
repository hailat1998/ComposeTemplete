package com.hd.misale

import android.content.res.Configuration.ORIENTATION_PORTRAIT
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.NavigationRail
import androidx.compose.material.NavigationRailItem
import androidx.compose.material.Text
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.hd.misale.ui.theme.MisaleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MisaleTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    MainContent()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainContent(){
    val navController = rememberNavController()
    val config = LocalConfiguration.current
    val selected = remember{ mutableStateOf("home") }
    Scaffold {
        Column {
            Box(
                Modifier
                    .padding(it)
                    .weight(1f)){
                AppNav(navController = navController)
            }
            if(config.orientation == ORIENTATION_PORTRAIT){
                BottomNavigationContent(navController = navController, Destination.list , selected)
            }else{
                NavigationRailContent(navController = navController, list = Destination.list , selected)
            }
        }
    }

}


@Composable
fun BottomNavigationContent(navController: NavController, list : List<Destination> , selected : MutableState<String>) {

    NavigationBar {
        NavigationBarItem(selected = selected.value == "home", onClick = {
            selected.value = "home"
            navController.navigate("home")
        },
            icon = { Icon(painterResource(id = R.drawable.home_fill0_wght400_grad0_opsz24), null)},
            label = { Text(text = "Home")})

        NavigationBarItem(selected = selected.value == "fav", onClick = {
            selected.value = "fav"
            navController.navigate("fav")
        },
            icon = { Icon(painterResource(id = R.drawable.grade_fill0_wght400_grad0_opsz24), null)},
                    label = { Text(text = "Fav")})


        NavigationBarItem(selected = selected.value == "recent", onClick = {
            selected.value = "recent"
            navController.navigate("recent")
        },
            icon = { Icon(painterResource(id = R.drawable.acute_fill0_wght400_grad0_opsz24), null)},
            label = { Text(text = "Recent")})


        NavigationBarItem(selected = selected.value == "search", onClick = {
            selected.value = "search"
            navController.navigate("search") },
            icon = { Icon(painterResource(id = R.drawable.search_fill0_wght400_grad0_opsz24), null)},
            label = { Text(text = "Search")})
        }
}

@Composable
fun NavigationRailContent(navController: NavController, list: List<Destination>, selected : MutableState<String>){

    NavigationRail {
        NavigationRailItem(selected = selected.value == "home", onClick = {
            selected.value = "home"
            navController.navigate("home")
        },
            icon = { Icon(painterResource(id = R.drawable.home_fill0_wght400_grad0_opsz24), null)},
            label = { Text(text = "Home")})

        NavigationRailItem(selected = selected.value == "fav", onClick = {
            selected.value = "fav"
            navController.navigate("fav")
        },
            icon = { Icon(painterResource(id = R.drawable.grade_fill0_wght400_grad0_opsz24), null)},
            label = { Text(text = "Fav")})


        NavigationRailItem(selected = selected.value == "recent", onClick = {
            selected.value = "recent"
            navController.navigate("recent")
        },
            icon = { Icon(painterResource(id = R.drawable.acute_fill0_wght400_grad0_opsz24), null)},
            label = { Text(text = "Recent")})


        NavigationRailItem(selected = selected.value == "search", onClick = {
            selected.value = "search"
            navController.navigate("search") },
            icon = { Icon(painterResource(id = R.drawable.search_fill0_wght400_grad0_opsz24), null)},
            label = { Text(text = "Search")})
    }
}





