package com.example.android.wearable.composestarter.presentation.purse

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Card
import androidx.wear.compose.material.CardDefaults
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import com.example.android.wearable.composestarter.R

@Composable
fun PurseScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.primaryVariant)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Medicinski Otpad",
            style = MaterialTheme.typography.title1,
            color = MaterialTheme.colors.onPrimary,
        )
        Text(
            text = "Neseser 01 ima lek kojem je istekao rok!",
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.onPrimary,
        )
        Spacer(modifier = Modifier.height(8.dp))

        Card(
            onClick = {},
            modifier = Modifier
                .background(MaterialTheme.colors.primaryVariant)
                .border(1.dp, MaterialTheme.colors.secondaryVariant, MaterialTheme.shapes.large),
            backgroundPainter = CardDefaults.cardBackgroundPainter(
                startBackgroundColor = MaterialTheme.colors.primaryVariant,
                endBackgroundColor = MaterialTheme.colors.primaryVariant
            )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.secondaryVariant),
            ) {
                Image(
                    painter = painterResource(R.drawable.dnk),
                    contentDescription = "",
                    modifier = Modifier
                        .size(64.dp)
                        .align(Alignment.Center)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.primary)
            ) {
                Text(
                    text = "Neseser 01",
                    style = MaterialTheme.typography.title1,
                    color = MaterialTheme.colors.onPrimary,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Bensedin",
                        style = MaterialTheme.typography.body1,
                        color = MaterialTheme.colors.onPrimary,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "23/09/2022",
                        style = MaterialTheme.typography.body1,
                        color = MaterialTheme.colors.error,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
