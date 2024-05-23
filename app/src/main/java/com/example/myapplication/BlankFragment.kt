package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_blank, container, false)
        val view = inflater.inflate(R.layout.fragment_blank, container, false)

        val btnEnviarMensaje = view.findViewById<Button>(R.id.btnEnviarMensaje)
        val edtMensaje = view.findViewById<TextView>(R.id.edtMensaje)

        btnEnviarMensaje.setOnClickListener{
            val mensaje = edtMensaje.text.toString()
            clickBtnEnviarMensaje(mensaje)
        }

        return view
    }

    companion object {
        private lateinit var clickBtnEnviarMensaje:(String)-> Unit
        @JvmStatic
        fun newInstance(clickBtnEnviarMensaje:(String)-> Unit):BlankFragment{
            val blankFragment = BlankFragment()
            this.clickBtnEnviarMensaje=clickBtnEnviarMensaje
            return blankFragment
        }
      /*  @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }*/
    }
}