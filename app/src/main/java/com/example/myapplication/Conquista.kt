package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.tabs.TabLayout

class Conquista : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var categoriaTab: TabLayout.Tab
    private lateinit var conquistaTab: TabLayout.Tab
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conquista)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        // Referenciar o TabLayout e as guias
        tabLayout = findViewById(R.id.tabLayout)
        categoriaTab = tabLayout.getTabAt(0)!! // Índice da guia "categoriaTab"
        conquistaTab = tabLayout.getTabAt(1)!! // Índice da guia "conquistaTab"

        // Configurar a ação ao pressionar a guia "categoriaTab"
        categoriaTab.view.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish();
        }

        // Desabilitar a guia "conquistaTab" para que não seja clicável
        conquistaTab.view.isClickable = false
        conquistaTab.view.isFocusable = false
        conquistaTab.select()
}
}