package com.luther.monoexpense.feature.onboarding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.luther.android_ext.ui.BaseFragment
import com.luther.monoexpense.databinding.FragmentOnboardBinding

class OnBoardFragment : BaseFragment<FragmentOnboardBinding, OnBoardViewModel>() {

    override fun inflate(): FragmentOnboardBinding = FragmentOnboardBinding.inflate(inflater)

    override val vm: OnBoardViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}