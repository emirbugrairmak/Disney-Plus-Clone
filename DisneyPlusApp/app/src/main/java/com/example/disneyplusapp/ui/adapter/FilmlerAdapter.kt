package com.example.disneyplusapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.disneyplusapp.data.entity.Filmler
import com.example.disneyplusapp.databinding.CardTasarimBinding
import com.example.disneyplusapp.databinding.FragmentAnaSayfaBinding
import com.example.disneyplusapp.ui.fragment.AnaSayfaFragmentDirections

class FilmlerAdapter(var mContext: Context,var filmlerListesi:List<Filmler>):RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding= CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }


    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film=filmlerListesi.get(position)
        val t=holder.tasarim

        t.imageViewFilm.setImageResource(mContext.resources.getIdentifier(film.resim,"drawable",mContext.packageName))


        t.cardViewFilm.setOnClickListener{
            val gecis=AnaSayfaFragmentDirections.detayGecis(film1 = film, film2 =null)  /* argument'lere nullable özelliğini eklemeliyiz. burada film1 nesnesini gönderdiği için
                                                                                           film2 bir şey göndermesin (null) istedik.*/
            Navigation.findNavController(it).navigate(gecis)
        }

    }


    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

}