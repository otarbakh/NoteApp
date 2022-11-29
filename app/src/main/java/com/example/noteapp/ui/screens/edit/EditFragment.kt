package com.example.noteapp.ui.screens.edit

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.noteapp.common.BaseFragment
import com.example.noteapp.databinding.FragmentEditBinding
import com.example.noteapp.ui.screens.dashboard.DashboardViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EditFragment : BaseFragment<FragmentEditBinding>(FragmentEditBinding::inflate) {

    private val vm: EditViewModel by viewModels()

    override fun viewCreated() {
        TODO("Not yet implemented")
    }

    override fun listeners() {
        tasksAdapter.apply {
            setOnEditClickListener { taskEntity, i ->
                vm.update(taskEntity)
            }
        }
    }


}