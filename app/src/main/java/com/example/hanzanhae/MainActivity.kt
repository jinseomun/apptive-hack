package com.example.hanzanhae

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hanzanhae.ui.theme.FirstLand
import com.example.hanzanhae.ui.theme.HanzanhaeTheme
import com.example.hanzanhae.ui.theme.SecondLand
import com.example.hanzanhae.ui.theme.ThirdLand

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavGraph(navController=navController)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun MyAppContentPreview() {
        val navController = rememberNavController()
        NavGraph(navController = navController)
    }

    @Composable
    fun NavGraph(navController: NavController) {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "first-land") {
            composable("first-land") { FirstLand(navController)}
            composable("second-land") { SecondLand(navController) }
            composable("third-land"){ ThirdLand()}
        }
    }

}

