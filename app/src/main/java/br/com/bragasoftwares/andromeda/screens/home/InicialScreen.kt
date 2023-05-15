package br.com.bragasoftwares.andromeda.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import br.com.bragasoftwares.andromeda.menus.ButtonBarMain
import br.com.bragasoftwares.andromeda.menus.ButtonBarMainPreview
import br.com.bragasoftwares.andromeda.ui.theme.Purple40


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun InicialScreen (): @Composable () -> Unit {
    return {


      Column( modifier = Modifier
          .fillMaxSize(),
        //  horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Bottom
      ) {
          Text(
              text = "Tela Inicial2",color = Purple40)

          Text(
              text = "Tela Inicial",color = Purple40)


          Row(

          ) {

              var text by rememberSaveable { mutableStateOf("") }

              TextField(
                  modifier = Modifier.weight(1f),
                  value = text,
                  onValueChange = { text = it },
                  label = { Text("Faça uma pergunta") },
                  //   leadingIcon = { Icon(Icons.Filled.Favorite, contentDescription = "Localized description") },
               //   trailingIcon = { Icon(Icons.Filled.Send, contentDescription = "Localized description") }
              )
              FloatingActionButton(
                  onClick = { /* do something */ },
              ) {
                  Icon(Icons.Filled.Send, "Localized description")
              }


          }


      }




    }
}


@Composable
@Preview
fun InicialScreenPreview() {

    InicialScreen().invoke()
}