package br.com.bragasoftwares.andromeda

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import br.com.bragasoftwares.andromeda.menus.AndromedaBottomAppBar
import br.com.bragasoftwares.andromeda.menus.BottomAppBarItem
import br.com.bragasoftwares.andromeda.menus.ButtonBarMain
import br.com.bragasoftwares.andromeda.menus.TopBarMain
import br.com.bragasoftwares.andromeda.navigation.NavGraph
import br.com.bragasoftwares.andromeda.navigation.screens.home.HomeScreen
import br.com.bragasoftwares.andromeda.sampledata.bottomAppBarItems
import br.com.bragasoftwares.andromeda.sampledata.sampleProductWithImage
import br.com.bragasoftwares.andromeda.sampledata.sampleProducts
import br.com.bragasoftwares.andromeda.screens.HighlightsListScreen
import br.com.bragasoftwares.andromeda.screens.home.InicialScreen
import br.com.bragasoftwares.andromeda.screens.home.SegundaScreen
import br.com.bragasoftwares.andromeda.ui.theme.AndromedaTheme
import br.com.bragasoftwares.andromeda.ui.theme.Purple40

var itemSelecionado : String = "Início"

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndromedaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()
                    Log.i("MainActivit", "onCreate:NavController $navController")




              //      val initialScreen = "Destaques"
             //       val screens = remember {
             //           mutableStateListOf(initialScreen)
            //        }
           //         Log.i("MainActivity", "onCreate: screens ${screens.toList()}")

               //     val currentScreen = screens.last()
   //                 val currentScreen =""

                 //   BackHandler(screens.size > 1) {
               //         screens.removeLast()
                //    }


                   var selectedItem by remember {
                        val item = bottomAppBarItems.first()
                        mutableStateOf(item)
                    }




                    AndromedaApp(
                        bottomAppBarItemSelected = selectedItem ,
                        onBottomAppBarItemSelectedChange = {
                            selectedItem = it
                         //   screens.add(it.label)
                        },
                        onFabClick = {
                          //floateactionbutton  screens.add("Pedido")
                        }) {

              //          when (currentScreen) {
            //                "Destaques" -> HighlightsListScreen(
            //                    products = sampleProducts,
             //                   onOrderClick = {
            //                        screens.add("Pedido")
            //                    },
           //                     onProductClick = {
           //                         screens.add("DetalhesProduto")
           //                     }
         //                   )
          //                  "Menu" -> HighlightsListScreen(
         //                       products = sampleProducts
       //                     )
      //                      "Bebidas" -> HighlightsListScreen(
     //                           products = sampleProducts + sampleProducts
     //                       )
     //                       "DetalhesProduto" -> HighlightsListScreen(
     //                           products = sampleProducts + sampleProducts
    //                        )
   //                         "Pedido" -> HighlightsListScreen(products = sampleProducts)
     //                   }
                    }


                 //   NavGraph(navController = navController)
                  var selectedItem2 by remember { mutableStateOf( itemSelecionado) }
                    Log.i("MainActivity", "onCreate: telas ${itemSelecionado}")
                  // extracted()

                }
            }
        }
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun AndromedaApp(
        bottomAppBarItemSelected: BottomAppBarItem = bottomAppBarItems.first(),
        onBottomAppBarItemSelectedChange: (BottomAppBarItem) -> Unit = {},
        onFabClick: () -> Unit = {},
        content: @Composable () -> Unit

    ){

        Scaffold(
            topBar =  TopBarMain(),
            bottomBar = {
                AndromedaBottomAppBar(
                    item = bottomAppBarItemSelected,
                    items = bottomAppBarItems,
                    onItemChange = onBottomAppBarItemSelectedChange,
                )
            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = onFabClick
                ) {
                    Icon(
                        Icons.Filled.Call,
                        contentDescription = null
                    )
                }
            }
        ) {
            Box(
                modifier = Modifier.padding(it)
            ) {
  //              content()
          //  InicialScreen().invoke()
         //       SegundaScreen().invoke()
                TelaAtual(itemSelecionado).invoke()
            }
        }
    }



    @Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndromedaTheme {
      // extracted()
        AndromedaApp {}
    }
}

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    @OptIn(ExperimentalMaterial3Api::class)
    fun extracted() {
        Scaffold(
            topBar = TopBarMain(),
            bottomBar = {
                NavigationBar {

                    //items.forEachIndexed { index, item ->
                    NavigationBarItem(

                        icon = { Icon(Icons.Filled.Home, contentDescription = "Localized description" ) },
                        label = { Text("Item") },
                        onClick = {  },
                        selected  = true
                    )
                    NavigationBarItem(
                        icon = { Icon(Icons.Filled.Face, contentDescription = "Localized description" ) },
                        label = { Text("Item") },
                        onClick = {},
                        selected = false
                    )
                    NavigationBarItem(
                        icon = { Icon(Icons.Filled.LocationOn, contentDescription = "Localized description" ) },
                        label = { Text("Item") },
                        onClick = {},
                        selected = false
                    )
                    //  }
                }
            }

           ,
            content = {
                Column() {
                   // Text(modifier = Modifier.padding(30.dp),text = "Teldfdsf hfghh ",color = Purple40)
                  //  InicialScreen().invoke()
                    TelaAtual(itemSelecionado).invoke()
                }

            }
            // Conteúdo principal
            ,
            floatingActionButton = {
                // Botão flutuante
                FloatingActionButton(
                    onClick = { /* Ação do botão flutuante */ }
                ) {
                    Icon(Icons.Filled.Add, contentDescription = "Adicionar")
                }
            }
        )
    }

    @Composable
    fun TelaAtual(tela: String): @Composable () -> Unit {
        return when (tela) {
            "Início" -> InicialScreen()
            "Mensagens" -> SegundaScreen()
            "Informações" -> ButtonBarMain()
           else -> ButtonBarMain()
        }
    }

}