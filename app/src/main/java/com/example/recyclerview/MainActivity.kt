package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row_name_item.*




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNames.layoutAdapter = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(listOf("Andrew", "Pauline", "Sue", "Manuel", "Veronica", "Arthur", "Esther", "David", "Patience"))
        rvNames.adapter = namesAdapter
    }
}