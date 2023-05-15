package br.com.bragasoftwares.andromeda.menus

import android.util.Log
import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import br.com.bragasoftwares.andromeda.itemSelecionado
import br.com.bragasoftwares.andromeda.screens.home.InicialScreen
import kotlin.reflect.KProperty



//var selectedItem by remember { mutableStateOf(0) }
//val items = listOf("Songs", "Artists", "Playlists")
@Composable
fun ButtonBarMain(): @Composable () -> Unit {
    var selectedItem by remember { mutableStateOf(0) }
    return {
        NavigationBar {



              //items.forEachIndexed { index, item ->
            NavigationBarItem(

                icon = { Icon(Icons.Filled.Home, contentDescription = "Localized description" ) },
                label = { Text("Item") },
                onClick = { selectedItem=0
                    itemSelecionado="Inicial"
                    Log.i("MainActivity", "onCreate: back Inicial")


                },
                selected  = selectedItem == 0
            )
            NavigationBarItem(

                icon = { Icon(Icons.Filled.Face, contentDescription = "Localized description" ) },
                label = { Text("Item") },
                onClick = { selectedItem=1
                    itemSelecionado="verde"

                    Log.i("MainActivity", "onCreate: back verde")},
                selected =  selectedItem == 1
            )
            NavigationBarItem(
                icon = { Icon(Icons.Filled.LocationOn, contentDescription = "Localized description" ) },
                label = { Text("Item") },
                onClick = {selectedItem=2
                    itemSelecionado="azul"
                    Log.i("MainActivity", "onCreate: back azul")},
                selected = selectedItem == 2
            )
           //  }
        }


    }
}



@Composable
@Preview
fun ButtonBarMainPreview() {
    val navController = rememberNavController()
    ButtonBarMain().invoke()
}