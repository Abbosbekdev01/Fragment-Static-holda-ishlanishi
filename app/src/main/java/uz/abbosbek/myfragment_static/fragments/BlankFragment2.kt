package uz.abbosbek.myfragment_static.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import uz.abbosbek.myfragment_static.R
import uz.abbosbek.myfragment_static.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {

    private val binding by lazy { FragmentBlank2Binding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding.btnFragment2.setOnClickListener {
            Toast.makeText(context, "2-Clicked", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}