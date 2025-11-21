package com.cristobal.elementosuiapp.ui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.cristobal.elementosuiapp.R
import com.google.android.material.card.MaterialCardView

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cardInfo = view.findViewById<MaterialCardView>(R.id.cardInfo)
        val txtInfo = view.findViewById<TextView>(R.id.txtInfo)

        cardInfo.isChecked = false
        txtInfo.text = getString(R.string.texto_perfil)
    }
}
