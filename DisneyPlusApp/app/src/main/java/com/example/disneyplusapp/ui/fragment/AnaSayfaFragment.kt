package com.example.disneyplusapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.disneyplusapp.R
import com.example.disneyplusapp.data.entity.Filmler
import com.example.disneyplusapp.data.entity.Filmler2
import com.example.disneyplusapp.databinding.FragmentAnaSayfaBinding
import com.example.disneyplusapp.ui.adapter.FilmlerAdapter
import com.example.disneyplusapp.ui.adapter.FilmlerAdapter2


class AnaSayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentAnaSayfaBinding.inflate(inflater, container, false)

        binding.filmRv.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val filmlerListesi=ArrayList<Filmler>()
        val f1=Filmler("The Acolyte","acolyte_film")
        val f2=Filmler("How I Met Your Father","himyf_film")
        val f3=Filmler("Loki","loki_film")
        val f4=Filmler("The Mandalorian","mandalorian_film")

        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)

        val adapter=FilmlerAdapter(requireContext(),filmlerListesi)
        binding.filmRv.adapter=adapter


        binding.filmrRv2.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val filmlerListesi2=ArrayList<Filmler2>()
        val F1=Filmler2("Moon Knight","moonknight_film")
        val F2=Filmler2("The Veil","veil_film")
        val F3=Filmler2("What If","whatif_film")
        val F4=Filmler2("Xmen 97","xmen_film")

        filmlerListesi2.add(F1)
        filmlerListesi2.add(F2)
        filmlerListesi2.add(F3)
        filmlerListesi2.add(F4)

        val adapter2=FilmlerAdapter2(requireContext(),filmlerListesi2)
        binding.filmrRv2.adapter=adapter2



        return binding.root
    }

}


