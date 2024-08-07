package com.example.disneyplusapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.disneyplusapp.R
import com.example.disneyplusapp.databinding.FragmentDetayBinding
import com.google.android.material.snackbar.Snackbar


class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentDetayBinding.inflate(inflater, container, false)



        val bundle:DetayFragmentArgs by navArgs()
        val gelenFilm1=bundle.film1
        val gelenFilm2=bundle.film2

        /* film1=null ise film2, film2=null ise film1 çalışacak.Bunu if ile kontrole alıyoruz. */


        if (gelenFilm1!=null){ //Üst cardview nesnesini gönderiyor
            binding.imageViewGecis.setImageResource(resources.getIdentifier(gelenFilm1?.resim,"drawable",requireContext().packageName))
        }

        if (gelenFilm2!=null) { //Alt cardview nesnesini gönderiyor.
            binding.imageViewGecis.setImageResource(resources.getIdentifier(gelenFilm2?.resim, "drawable", requireContext().packageName
                )
            )
        }






        binding.imageViewIzle.setOnClickListener{
            if (gelenFilm1!=null) {
                Snackbar.make(it, "${gelenFilm1?.ad} başlıyor. İyi seyirler!", Snackbar.LENGTH_SHORT).show()
            }
            else{
                Snackbar.make(it, "${gelenFilm2?.ad} başlıyor. İyi seyirler!", Snackbar.LENGTH_SHORT).show()
            }
        }


        return binding.root


    }
}