package com.sippitehnologies.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sippitehnologies.databinding.databinding.ActivityControlVisiabilityOfViewBinding

class ControlVisiabilityOfView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var labelVisibility=true
       val visibilityBinding = DataBindingUtil.setContentView<ActivityControlVisiabilityOfViewBinding>(this,R.layout.activity_control_visiability_of_view)
        visibilityBinding.button.setOnClickListener {
            labelVisibility = !labelVisibility
            visibilityBinding.setVariable(BR.isLabelVisible,labelVisibility)
        }
    }
}