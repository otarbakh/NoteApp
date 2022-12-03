package com.example.noteapp.ui.screens.edit

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.noteapp.R
import com.example.noteapp.common.BaseFragment
import com.example.noteapp.data.TaskEntity
import com.example.noteapp.databinding.FragmentEditBinding
import com.example.noteapp.ui.screens.dashboard.DashboardViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EditFragment : BaseFragment<FragmentEditBinding>(FragmentEditBinding::inflate) {

    val args:EditFragmentArgs by navArgs()
    private val vm: EditViewModel by viewModels()

    override fun viewCreated() {
        binding.etEditTitle.setText(args.tasksinfo.title)
        binding.etEditDescription.setText(args.tasksinfo.taskDescription)
    }

    override fun listeners() {
        binding.editButton.setOnClickListener {
            val task = TaskEntity(
                args.tasksinfo.taskid,
                binding.etEditTitle.text.toString(),
                binding.etEditDescription.text.toString()
            )
            vm.update(task)
            findNavController().navigate(EditFragmentDirections.actionEditFragmentToDashboardFragment())
        }
    }
}