package com.example.navcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController



class FirstFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //val tv=view.findViewById<TextView>(R.id.tv_text)
        view.findViewById<TextView>(R.id.tv_text).setOnClickListener(){

            var user=User("raj",123)
            val action=FirstFragmentDirections.actionFirstFragmentToTwoFragment(user)
            findNavController().navigate(action)
        }
    }

}