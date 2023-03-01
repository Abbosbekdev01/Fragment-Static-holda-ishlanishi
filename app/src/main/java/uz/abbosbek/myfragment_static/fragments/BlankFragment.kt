package uz.abbosbek.myfragment_static.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import uz.abbosbek.myfragment_static.R
import uz.abbosbek.myfragment_static.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private val binding by lazy { FragmentBlankBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding.btnFragment1.setOnClickListener {
            Toast.makeText(context, "1-Clicked", Toast.LENGTH_SHORT).show()
        }


        return binding.root

    }
}