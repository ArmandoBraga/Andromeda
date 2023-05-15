package br.com.bragasoftwares.andromeda.menus

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import br.com.bragasoftwares.andromeda.itemSelecionado
import br.com.bragasoftwares.andromeda.sampledata.bottomAppBarItems
import br.com.bragasoftwares.andromeda.ui.theme.AndromedaTheme


class BottomAppBarItem(
    val label: String,
    val icon: ImageVector
)

@Composable
fun AndromedaBottomAppBar(
    item: BottomAppBarItem,
    modifier: Modifier = Modifier,
    items: List<BottomAppBarItem> = emptyList(),
    onItemChange: (BottomAppBarItem) -> Unit = {}
) {
    NavigationBar(modifier) {
        items.forEach {
            val label = it.label
            val icon = it.icon
            NavigationBarItem(
                icon = { Icon(icon, contentDescription = label) },
                label = { Text(label) },
                selected = item.label == label,
                onClick = {
                    onItemChange(it)
                    itemSelecionado=label
                }
            )
        }
    }
}

@Preview
@Composable
fun AndromedaBottomAppBarPreview() {
    AndromedaTheme {
        AndromedaBottomAppBar(
            item = bottomAppBarItems.first(),
            items = bottomAppBarItems
        )
    }
}