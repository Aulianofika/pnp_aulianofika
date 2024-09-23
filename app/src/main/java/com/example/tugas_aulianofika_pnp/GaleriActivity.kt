package com.example.tugas_aulianofika_pnp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas_aulianofika_pnp.adapter.GaleriAdapter
import com.example.tugas_aulianofika_pnp.model.ModelGaleri

class GaleriActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var GaleriAdapter: GaleriAdapter? = null
    private var galeriList = mutableListOf<ModelGaleri>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_galeri)

        galeriList = ArrayList()
        recyclerView = findViewById(R.id.rv_galeri)
        GaleriAdapter = GaleriAdapter(this, galeriList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(
            this, 2
        )
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = GaleriAdapter

        prepareCardList()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }

            private fun prepareCardList(){
                var galeri = ModelGaleri("pnp", R.drawable.pnp)
                galeriList.add(galeri)

                galeri = ModelGaleri("politeknik", R.drawable.satu)
                galeriList.add(galeri)

                galeri = ModelGaleri("politeknik", R.drawable.empat)
                galeriList.add(galeri)

                galeri = ModelGaleri("politeknik", R.drawable.enam)
                galeriList.add(galeri)

                galeri = ModelGaleri("politeknik", R.drawable.dua)
                galeriList.add(galeri)

                galeri = ModelGaleri("politeknik", R.drawable.lima)
                galeriList.add(galeri)

                GaleriAdapter!!.notifyDataSetChanged()
            }

        }

