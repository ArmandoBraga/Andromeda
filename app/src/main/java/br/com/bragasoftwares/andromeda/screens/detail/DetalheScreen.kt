package br.com.bragasoftwares.andromeda.screens.detail

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.bragasoftwares.andromeda.ui.theme.Purple40


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun DetalheScreen (): @Composable () -> Unit {
    return { Text(modifier = Modifier.padding(30.dp), text = "Tela Detalhe",color = Purple40)
    }

}


@Composable
@Preview
fun InicialScreenPreview() {

    DetalheScreen().invoke()
}