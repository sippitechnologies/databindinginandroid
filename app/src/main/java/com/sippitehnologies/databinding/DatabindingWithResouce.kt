package com.sippitehnologies.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sippitehnologies.databinding.databinding.ActivityDatabindingWithResouceBinding

class DatabindingWithResouce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityDatabindingWithResouceBinding>(this,R.layout.activity_databinding_with_resouce)
    }
}