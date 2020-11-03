package com.example.navcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class TwoFragment : Fragment() {

    val args: TwoFragmentArgs  by navArgs<TwoFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tv=view.findViewById<TextView>(R.id.tv_text)
        tv.setOnClickListener(){
            findNavController().navigate(R.id.action_twoFragment_to_firstFragment)
        }
        tv.text=args.userObject.name
    }
}