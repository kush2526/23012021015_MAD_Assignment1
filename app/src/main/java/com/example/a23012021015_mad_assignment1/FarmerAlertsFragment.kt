package com.example.a23012021015_mad_assignment1


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a23012021015_mad_assignment1.databinding.FragmentFarmerAlertsBinding
import android.widget.TextView

class FarmerAlertsFragment : Fragment() {

    private var _binding: FragmentFarmerAlertsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFarmerAlertsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
