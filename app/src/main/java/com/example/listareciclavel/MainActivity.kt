package com.example.listareciclavel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listareciclavel.databinding.ActivityMainBinding
import com.example.listareciclavel.model.ItemListaModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
val lAdapter = ItemLinhaAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //var rc = findViewById<RecyclerView>(R.id.lista_reciclavel_rv)

        setupRecycler()
    }
    private fun setupRecycler(){
        binding.listaReciclavelRv.layoutManager = LinearLayoutManager(this);
        val l = mutableListOf<ItemListaModel>()
        l.add(ItemListaModel("aaaa", "AAAA"))
        l.add(ItemListaModel("bbbb", "BBBB"))
        l.add(ItemListaModel("cccc", "CCCC"))
        lAdapter.setLista(l)
        binding.listaReciclavelRv.adapter = lAdapter
    }

}