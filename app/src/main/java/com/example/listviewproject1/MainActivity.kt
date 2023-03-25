package com.example.listviewproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val listView = findViewById<ListView>(R.id.ListView)

        val taskList = arrayListOf<String>()

        taskList.add("complete second project")
        taskList.add("do daily dsa")
        taskList.add("get proper sleep")
        taskList.add("Go out for walk")
        taskList.add("tweet #30DaysOfCode ")

        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1,taskList)

        listView.adapter = adapterForMyListView

        listView.setOnItemClickListener { adapterView, view, i, l ->
            val text = "Clicked on Item : " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

    }
}