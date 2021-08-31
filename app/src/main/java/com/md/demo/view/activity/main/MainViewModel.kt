package com.md.demo.view.activity.main

import androidx.lifecycle.MutableLiveData
import androidx.databinding.ObservableField
import com.md.demo.data.ResponseRepository
import com.md.demo.data.model.ResponseBean
import com.md.demo.view.AbstractViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainViewModel(private val repository: ResponseRepository) : AbstractViewModel() {

}