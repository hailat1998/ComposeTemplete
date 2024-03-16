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
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
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
    val config = LocalConfiguration.current
    Scaffold {
        Column {
            Box(
                Modifier
                    .padding(it)
                    .weight(1f)){
                AppNav(navController = rememberNavController())
            }
            if(config.orientation == ORIENTATION_PORTRAIT){
                BottomNavigationContent(navController = rememberNavController(), Destination.list)
            }else{
                NavigationRailContent(navController = rememberNavController(), list = Destination.list )
            }
        }
    }

}


@Composable
fun BottomNavigationContent(navController: NavController, list : List<Destination>) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    NavigationBar {
        NavigationBarItem(selected = true, onClick = { /*TODO*/ },
            icon = { Icon(painterResource(id = R.drawable.home_fill0_wght400_grad0_opsz24), null)})
        NavigationBarItem(selected = true, onClick = { /*TODO*/ },
            icon = { Icon(painterResource(id = R.drawable.search_fill0_wght400_grad0_opsz24), null)})
        NavigationBarItem(selected = true, onClick = { /*TODO*/ },
            icon = { Icon(painterResource(id = R.drawable.grade_fill0_wght400_grad0_opsz24), null)})
        NavigationBarItem(selected = true, onClick = { /*TODO*/ },
            icon = { Icon(painterResource(id = R.drawable.acute_fill0_wght400_grad0_opsz24), null)})
        }
}

@Composable
fun NavigationRailContent(navController: NavController, list: List<Destination>){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    NavigationRail {

        NavigationRailItem(selected = true, onClick = { /*TODO*/ },
                icon = { Icon(painterResource(id = R.drawable.home_fill0_wght400_grad0_opsz24), null)})
        NavigationRailItem(selected = true, onClick = { /*TODO*/ },
            icon = { Icon(painterResource(id = R.drawable.search_fill0_wght400_grad0_opsz24), null)})
        NavigationRailItem(selected = true, onClick = { /*TODO*/ },
            icon = { Icon(painterResource(id = R.drawable.grade_fill0_wght400_grad0_opsz24), null)})
        NavigationRailItem(selected = true, onClick = { /*TODO*/ },
            icon = { Icon(painterResource(id = R.drawable.acute_fill0_wght400_grad0_opsz24), null)})

    }
}





