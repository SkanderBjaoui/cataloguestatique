package com.example.cataloguestatique

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CatalogueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_catalogue)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainCatalogue)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnAcheter1 = findViewById<Button>(R.id.btnAcheter1)
        val btnAcheter2 = findViewById<Button>(R.id.btnAcheter2)
        val btnAcheter3 = findViewById<Button>(R.id.btnAcheter3)
        val btnAcheter4 = findViewById<Button>(R.id.btnAcheter4)
        val btnAcheter5 = findViewById<Button>(R.id.btnAcheter5)

        btnAcheter1?.setOnClickListener {
            Toast.makeText(this, getString(R.string.product_1_toast), Toast.LENGTH_SHORT).show()
        }

        btnAcheter2?.setOnClickListener {
            Toast.makeText(this, getString(R.string.product_2_toast), Toast.LENGTH_SHORT).show()
        }

        btnAcheter3?.setOnClickListener {
            Toast.makeText(this, getString(R.string.product_3_toast), Toast.LENGTH_SHORT).show()
        }

        btnAcheter4?.setOnClickListener {
            Toast.makeText(this, getString(R.string.product_4_toast), Toast.LENGTH_SHORT).show()
        }

        btnAcheter5?.setOnClickListener {
            Toast.makeText(this, getString(R.string.product_5_toast), Toast.LENGTH_SHORT).show()
        }
    }
}
