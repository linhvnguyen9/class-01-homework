package com.example.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController



class BlankFragment2 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(activity,"onAttach",Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(activity,"onCreate",Toast.LENGTH_LONG).show()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(activity,"onCreateView",Toast.LENGTH_LONG).show()
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonNext = view.findViewById<Button>(R.id.btn_next)
        buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment2_to_blankFragment)
        }

        val buttonBack = view.findViewById<Button>(R.id.btn_back)
        buttonBack.setOnClickListener {
            findNavController().navigateUp()
        }
        Toast.makeText(activity,"onViewCreated",Toast.LENGTH_LONG).show()

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(activity,"onStart",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(activity,"onResume",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(activity,"onPause",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(activity,"onStop",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(activity,"onDestroy",Toast.LENGTH_LONG).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(activity,"onDestroyView",Toast.LENGTH_LONG).show()
    }

    override fun onDetach() {
        super.onDetach()
        Toast.makeText(activity,"onDetach",Toast.LENGTH_LONG).show()
    }
}