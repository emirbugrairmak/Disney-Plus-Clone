package com.example.disneyplusapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.disneyplusapp.R
import com.example.disneyplusapp.data.entity.Filmler
import com.example.disneyplusapp.databinding.FragmentAramaBinding
import com.google.android.material.snackbar.Snackbar


class AramaFragment : Fragment() {

    private lateinit var binding: FragmentAramaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentAramaBinding.inflate(inflater, container, false)






        binding.searchView.setOnQueryTextListener(object : OnQueryTextListener{
            override fun onQueryTextChange(newText: String): Boolean {
                if (newText=="Loki" || newText=="loki"){
                    binding.imageViewGereksiz.setImageResource(resources.getIdentifier("loki_film","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setImageResource(resources.getIdentifier("izle_tusu","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setOnClickListener {
                        Snackbar.make(it, "Loki başlıyor. İyi seyirler!", Snackbar.LENGTH_SHORT).show()
                    }
                }
                if (newText=="Acolyte" || newText=="acolyte"){
                    binding.imageViewGereksiz.setImageResource(resources.getIdentifier("acolyte_film","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setImageResource(resources.getIdentifier("izle_tusu","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setOnClickListener {
                        Snackbar.make(it, "Acolyte başlıyor. İyi seyirler!", Snackbar.LENGTH_SHORT).show()
                    }
                }
                if (newText=="How I Met Your Father" || newText=="how i met your father"){
                    binding.imageViewGereksiz.setImageResource(resources.getIdentifier("himyf_film","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setImageResource(resources.getIdentifier("izle_tusu","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setOnClickListener {
                        Snackbar.make(it, "How I Met Your Father başlıyor. İyi seyirler!", Snackbar.LENGTH_SHORT).show()
                    }
                }
                if (newText=="Mandalorian" || newText=="mandalorian"){
                    binding.imageViewGereksiz.setImageResource(resources.getIdentifier("mandalorian_film","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setImageResource(resources.getIdentifier("izle_tusu","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setOnClickListener {
                        Snackbar.make(it, "Mandalorian başlıyor. İyi seyirler!", Snackbar.LENGTH_SHORT).show()
                    }
                }
                if (newText=="Moon Knight" || newText=="moon knight"){
                    binding.imageViewGereksiz.setImageResource(resources.getIdentifier("moonknight_film","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setImageResource(resources.getIdentifier("izle_tusu","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setOnClickListener {
                        Snackbar.make(it, "Moon Knight başlıyor. İyi seyirler!", Snackbar.LENGTH_SHORT).show()
                    }
                }
                if (newText=="Veil" || newText=="veil"){
                    binding.imageViewGereksiz.setImageResource(resources.getIdentifier("veil_film","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setImageResource(resources.getIdentifier("izle_tusu","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setOnClickListener {
                        Snackbar.make(it, "Veil başlıyor. İyi seyirler!", Snackbar.LENGTH_SHORT).show()
                    }
                }
                if (newText=="What If" || newText=="what if"){
                    binding.imageViewGereksiz.setImageResource(resources.getIdentifier("whatif_film","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setImageResource(resources.getIdentifier("izle_tusu","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setOnClickListener {
                        Snackbar.make(it, "What If başlıyor. İyi seyirler!", Snackbar.LENGTH_SHORT).show()
                    }
                }
                if (newText=="X Men" || newText=="x men"){
                    binding.imageViewGereksiz.setImageResource(resources.getIdentifier("xmen_film","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setImageResource(resources.getIdentifier("izle_tusu","drawable",requireContext().packageName))
                    binding.imageViewIzle2.setOnClickListener {
                        Snackbar.make(it, "X Men başlıyor. İyi seyirler!", Snackbar.LENGTH_SHORT).show()
                    }
                }



                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {

                return true
            }
        })


        binding.searchView.isIconifiedByDefault=false /*searchview'ın sadece büyütece tıklayınca açılması yerine herhangi bir yerine tıklayınca açılmasını sağlar.(aslında genişletir)
        ayrıca bu genişletme sayesinde arkada silik şekilde "Dizi Film Ara" yazısını tıklamadan da görebiliyoruz*/






        return binding.root
    }
    
}