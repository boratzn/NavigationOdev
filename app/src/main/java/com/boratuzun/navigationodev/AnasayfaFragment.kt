package com.boratuzun.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.boratuzun.navigationodev.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.buttonGitA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.a_sayfasina_gecis)
        }

        tasarim.buttonGitX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.x_sayfasina_gecis)
        }

        return tasarim.root
    }

}