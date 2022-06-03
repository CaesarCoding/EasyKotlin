package com.caesar.easy.easykotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.caesar.easy.easykotlin.databinding.FragmentEntryBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class EntryFragment : Fragment() {

    private var _binding: FragmentEntryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentEntryBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        findNavController().navigate(R.id.action_EntryFragment_to_HostFragment)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}