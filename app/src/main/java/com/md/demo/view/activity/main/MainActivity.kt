package com.md.demo.view.activity.main

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.md.demo.R
import com.md.demo.view.BaseActivity
import com.md.demo.view.fragment.list.ListFragment
import org.koin.android.architecture.ext.viewModel


class MainActivity : BaseActivity() {

    val viewModel: MainViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        showMovieFragment()
    }


    private fun showMovieFragment() {
        val host = NavHostFragment.create(R.navigation.welcome_nav)
        supportFragmentManager.beginTransaction().replace(R.id.container, host).setPrimaryNavigationFragment(host).commit()
    }


}
