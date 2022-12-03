package com.example.noteapp.ui.screens.add_task

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.noteapp.R
import com.example.noteapp.common.BaseFragment
import com.example.noteapp.data.TaskEntity
import com.example.noteapp.databinding.FragmentAddTaskBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddTaskFragment : BaseFragment<FragmentAddTaskBinding>(FragmentAddTaskBinding::inflate) {

//    delegireba gadabareba
    private val vm: AddTaskViewModel by viewModels()

    override fun viewCreated() {

    }

    override fun listeners() {

        binding.addNutton.setOnClickListener {
            val task = TaskEntity(
                0,
                binding.etTitle.text.toString(),
                binding.etDescription.text.toString()
            )
            vm.insertTask(task)
            findNavController().navigate(R.id.action_addTaskFragment_to_dashboardFragment)
        }
    }
}