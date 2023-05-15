package br.com.bragasoftwares.andromeda.sampledata

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.List
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import br.com.bragasoftwares.andromeda.menus.BottomAppBarItem
import br.com.bragasoftwares.andromeda.model.Product
import java.math.BigDecimal
import kotlin.random.Random

private val loremName = LoremIpsum(Random.nextInt(10)).values.first()
private val loremDesc = LoremIpsum(Random.nextInt(30)).values.first()

val sampleProductWithImage = Product(
    name = LoremIpsum(10).values.first(),
    price = BigDecimal("9.99"),
    description = LoremIpsum(30).values.first(),
    image = "https://picsum.photos/1920/1080"
)

val sampleProductWithoutImage = Product(
    name = LoremIpsum(10).values.first(),
    price = BigDecimal("9.99"),
    description = LoremIpsum(30).values.first(),
)

val sampleProducts = List(10) { index ->
    Product(
        name = loremName,
        price = BigDecimal("9.99"),
        description = loremDesc,
        image = if (index % 2 == 0) "https://picsum.photos/1920/1080" else null
    )
}

val bottomAppBarItems = listOf(
    BottomAppBarItem(
        label = "Início",
        icon = Icons.Filled.Home
    ),
    BottomAppBarItem(
        label = "Mensagens",
        icon = Icons.Filled.MailOutline
    ),
    BottomAppBarItem(
        label = "Informações",
        icon = Icons.Outlined.Info
    ),
)