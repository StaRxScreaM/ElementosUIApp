package com.cristobal.elementosuiapp.ui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.cristobal.elementosuiapp.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import com.google.android.material.progressindicator.CircularProgressIndicator
import com.google.android.material.textfield.TextInputEditText

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editNombre = view.findViewById<TextInputEditText>(R.id.editNombre)
        val btnSimular = view.findViewById<MaterialButton>(R.id.btnSimular)
        val progress = view.findViewById<CircularProgressIndicator>(R.id.progressIndicador)
        val cardResultado = view.findViewById<MaterialCardView>(R.id.cardResultado)
        val txtResultado = view.findViewById<TextView>(R.id.txtResultado)

        progress.visibility = View.GONE
        cardResultado.visibility = View.GONE

        btnSimular.setOnClickListener {
            val nombre = editNombre.text?.toString()?.trim().orEmpty()

            if (nombre.isEmpty()) {
                editNombre.error = getString(R.string.error_nombre_vacio)
                return@setOnClickListener
            }

            editNombre.error = null
            progress.visibility = View.VISIBLE
            cardResultado.visibility = View.GONE

            // Simulación simple de "carga"
            view.postDelayed({
                progress.visibility = View.GONE
                cardResultado.visibility = View.VISIBLE
                txtResultado.text = getString(R.string.mensaje_resultado, nombre)
            }, 1500)
        }
    }
}
