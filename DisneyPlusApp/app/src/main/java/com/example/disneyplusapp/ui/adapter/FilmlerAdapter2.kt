package com.example.disneyplusapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.disneyplusapp.data.entity.Filmler2
import com.example.disneyplusapp.databinding.CardTasarim2Binding
import com.example.disneyplusapp.databinding.FragmentAnaSayfaBinding
import com.example.disneyplusapp.ui.fragment.AnaSayfaFragmentDirections

class FilmlerAdapter2(var mContext: Context,var filmlerListesi2:List<Filmler2>):RecyclerView.Adapter<FilmlerAdapter2.CardTasarimTutucu2>() {

    inner class CardTasarimTutucu2(var tasarim:CardTasarim2Binding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu2 {
        val binding= CardTasarim2Binding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu2(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu2, position: Int) {
        val film=filmlerListesi2.get(position)
        val t=holder.tasarim

        t.imageViewFilm2.setImageResource(mContext.resources.getIdentifier(film.resim,"drawable",mContext.packageName))

        t.cardViewFilm2.setOnClickListener{
            val gecis=AnaSayfaFragmentDirections.detayGecis( film1 = null, film2 = film)
            Navigation.findNavController(it).navigate(gecis)
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi2.size
    }


}