package com.example.natureapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.natureapp.ui.theme.NatureAppTheme

@Composable
fun NatureScreen(innerPaddingValues: PaddingValues) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(vertical = 40.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        // Primera imagen
        Column (
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .height(300.dp)
                .background(color = MaterialTheme.colorScheme.onPrimary)
                .fillMaxWidth(fraction = 0.95F)
                .padding(vertical = 0.dp)
        ) {
            Box (
                modifier = Modifier.fillMaxWidth()
                    .height(200.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data("https://upload.wikimedia.org/wikipedia/commons/7/7b/Mont_Hubbard_from_Enchantment_Bay_with_the_Hubbard_Glacier_in_the_foreground.jpg")
                        .build(),
                    contentDescription = "Mountain images",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Text(
                text = "Mount Hubbard",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.DarkGray,
                modifier = Modifier.offset(y = 15.dp)
                    .padding(horizontal = 10.dp)

            )
            Text(
                text = " \nMount Hubbard is one of the major mountains of the Saint Elias Range." ,
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                lineHeight = 20.sp,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
        }

        // Segunda imagen
        Column (
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .height(300.dp)
                .background(color = MaterialTheme.colorScheme.onPrimary)
                .fillMaxWidth(fraction = 0.95F)
                .padding(vertical = 0.dp),
        ) {
            Box (
                modifier = Modifier.fillMaxWidth()
                    .height(200.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data("https://tnphotos.s3.ca-central-1.amazonaws.com/uploads/2020/06/half-day-tours-niagara-falls-toronto-1.jpg")
                        .build(),
                    contentDescription = "Niagara Falls",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Text(
                text = "Niagara Falls",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.DarkGray,
                modifier = Modifier.offset(y = 15.dp)
                    .padding(horizontal = 10.dp)

            )
            Text(
                text = " \nNiagara Falls is a city in Ontario, Canada, adjacent to, and named after, Niagara Falls." ,
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                lineHeight = 20.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
        }

        // Tercera Imagen
        Column (
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .height(300.dp)
                .background(color = MaterialTheme.colorScheme.onPrimary)
                .fillMaxWidth(fraction = 0.95F)
                .padding(vertical = 0.dp),
        ) {
            Box (
                modifier = Modifier.fillMaxWidth()
                    .height(200.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/Columbia_icefield_view.jpg/1200px-Columbia_icefield_view.jpg")
                        .build(),
                    contentDescription = "Columba Icefield",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Text(
                text = "Columba Icefield",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.DarkGray,
                modifier = Modifier.offset(y = 15.dp)
                    .padding(horizontal = 10.dp)

            )
            Text(
                text = " \nThe Columbia Icefield is the largest ice field in North America's Rocky Mountains." ,
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                lineHeight = 20.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
        }

        // Cuarta imagen
        Column (
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .height(300.dp)
                .background(color = MaterialTheme.colorScheme.onPrimary)
                .fillMaxWidth(fraction = 0.95F)
                .padding(vertical = 0.dp),
        ) {
            Box (
                modifier = Modifier.fillMaxWidth()
                    .height(200.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data("https://scene7.vailresorts.com/is/image/vailresorts/20171231_WB_Winton_001:Featured-Content-AND-Sliding-Cards-AND-Container-Long-Amount?resMode=sharp2&w=855&h=480&wid=392&fit=constrain,1&dpr=on,2.625")
                        .build(),
                    contentDescription = "Whistler",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Text(
                text = "Whistler",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.DarkGray,
                modifier = Modifier.offset(y = 15.dp)
                    .padding(horizontal = 10.dp)

            )
            Text(
                text = " \nWhistler is a resort municipality in Squamish-Lillooet, British Columbia, Canada." ,
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                lineHeight = 20.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
        }

        // Quinta Imagen
        Column (
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .height(300.dp)
                .background(color = MaterialTheme.colorScheme.onPrimary)
                .fillMaxWidth(fraction = 0.95F)
                .padding(vertical = 0.dp),
        ) {
            Box (
                modifier = Modifier.fillMaxWidth()
                    .height(200.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data("https://mevoyacanada.org/wp-content/uploads/2020/11/lago-emerald-en-parque-yoho-e1605912573118.jpg")
                        .build(),
                    contentDescription = "Yoho National Park",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Text(
                text = "Yoho National Park",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.DarkGray,
                modifier = Modifier.offset(y = 15.dp)
                    .padding(horizontal = 10.dp)

            )
            Text(
                text = " \nYoho National Park is a national park of Canada. " ,
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                lineHeight = 20.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
        }
    }

}

@Preview(
    showBackground = true,
    showSystemUi = true
)


@Preview
@Composable
fun NatureScreenPreview(){
    NatureAppTheme {
        NatureScreen(innerPaddingValues = PaddingValues(0.dp))
    }
}