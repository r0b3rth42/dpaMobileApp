package dev.roberth.appdpa.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import dev.roberth.appdpa.data.model.CountryModel

val mockCountries = listOf(
    CountryModel("Mexico", 41, "https://flagcdn.com/w320/mx.png"),
    CountryModel("Peru", 41, "https://flagcdn.com/w320/pe.png"),
    CountryModel("Argentina", 41, "https://flagcdn.com/w320/ar.png"),
    CountryModel("Portugal", 41, "https://flagcdn.com/w320/pt.png"),
    CountryModel("Brasil", 41, "https://flagcdn.com/w320/br.png"),
    CountryModel("España", 41, "https://flagcdn.com/w320/es.png"),

)

@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier.padding(16.dp)
            .fillMaxSize().
            statusBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Ranking fifa 2026", style = MaterialTheme.typography.titleLarge)
        LazyColumn {
            items(mockCountries) { country ->
                Card(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = rememberAsyncImagePainter(country.imageUrl),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp),
                            contentScale = ContentScale.Crop
                        )
                        Column {
                            Text( " " + country.name)
                        }
                    }
                }
            }
        }
    }
}