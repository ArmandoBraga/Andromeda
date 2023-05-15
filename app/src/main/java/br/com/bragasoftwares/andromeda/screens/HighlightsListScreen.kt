package br.com.bragasoftwares.andromeda.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.bragasoftwares.andromeda.model.Product
import br.com.bragasoftwares.andromeda.sampledata.sampleProducts
import br.com.bragasoftwares.andromeda.ui.theme.AndromedaTheme


@Composable
fun HighlightsListScreen(
    modifier: Modifier = Modifier,
    title: String = "Destaques do dia",
    products: List<Product> = emptyList(),
    onOrderClick: () -> Unit = {},
    onProductClick: () -> Unit = {}
) {
    Column(
        modifier
            .fillMaxSize()
    ) {
        Surface {
            Text(
                text = title,
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                fontSize = 32.sp,
                textAlign = TextAlign.Center
            )
        }


            }
}

@Preview
@Composable
fun HighlightsListScreenPreview() {
    AndromedaTheme {
        Surface {
            HighlightsListScreen(
                products = sampleProducts,
                title = "Destaques do dia"
            )
        }
    }
}