import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.typesafenavigationcompose.navigation.Screen

enum class TopLevelDestination(
    val icon: ImageVector,
    val label: String,
    val screen: Screen,
) {
    HOME(
        icon = Icons.Rounded.Home,
        label = "Home",
        screen = Screen.Home,
    ),
    PROFILE(
        icon = Icons.Rounded.Person,
        label = "Profile",
        screen = Screen.Profile("John Doe"),
    ),
    SETTINGS(
        icon = Icons.Rounded.Settings,
        label = "Settings",
        screen = Screen.Settings,
    ),
}