package chat.simplex.common.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import chat.simplex.res.MR
import org.jetbrains.compose.resources.painterResource

@Composable
fun SplashView(nonTransparent: Boolean = false) {
  Surface(
    Modifier
      .fillMaxSize(),
    color = if (nonTransparent) MaterialTheme.colors.background.copy(1f) else MaterialTheme.colors.background,
    contentColor = LocalContentColor.current
  ) {
    Image(
      painter = painterResource(MR.images.logo),
      contentDescription = "Aganora Icon",
      modifier = Modifier
        .height(230.dp)
        .align(Alignment.Center)
    )
  }
}
