package com.luther.monoexpense.feature.main

import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.luther.android_ext.ui.BaseActivity
import com.luther.monoexpense.R
import com.luther.monoexpense.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun inflate() = ActivityMainBinding.inflate(inflater)

    override val vm by viewModels<MainViewModel>()

    private val navController: NavController by lazy {
        (supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
                as NavHostFragment).navController
    }


}