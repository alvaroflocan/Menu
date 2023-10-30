package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

//https://codersguidebook.com/how-to-create-an-android-app/create-a-menu
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            /*R.id.new_game -> {
                newGame()
                true
            }
            R.id.help -> {
                showHelp()
                true
            }*/
            else -> super.onOptionsItemSelected(item)
        }
    }
}