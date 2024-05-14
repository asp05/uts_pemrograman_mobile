package com.example.utsmobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listNews);

        val names = arrayOf("Detik.com","Liputan 6","Viva","Tempo","Sindo News","Berita Satu","Republika","Patroli","Kompas","BBC","CNN");

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)

        listView.adapter = arrayAdapter
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"Anda memilih "+names[position],Toast.LENGTH_SHORT).show()
        }
    }
}