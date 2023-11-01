package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar

//https://codersguidebook.com/how-to-create-an-android-app/create-a-menu
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.mytollbar))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        getMenuInflater().inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
         when (item.itemId) {
            R.id.menu_ajustes -> Toast.makeText(this,"Ajustes",Toast.LENGTH_SHORT).show()
             R.id.menu_inicio -> Toast.makeText(this,"Inicio",Toast.LENGTH_SHORT).show()
             R.id.menu_perfil -> Toast.makeText(this,"Perfil",Toast.LENGTH_SHORT).show()
            R.id.menu_guardar -> Toast.makeText(this,"Guardado",Toast.LENGTH_LONG).show()

         }
            return super.onOptionsItemSelected(item)
        }

}