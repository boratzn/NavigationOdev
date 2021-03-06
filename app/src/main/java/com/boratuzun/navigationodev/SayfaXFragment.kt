package com.boratuzun.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.boratuzun.navigationodev.databinding.FragmentSayfaBBinding
import com.boratuzun.navigationodev.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var tasarim: FragmentSayfaXBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaXBinding.inflate(inflater, container, false)

        tasarim.buttonXGitY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.xden_y_sayfasina_gecis)
        }

        return tasarim.root
    }

}