package com.sippitehnologies.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sippitehnologies.databinding.databinding.ActivityDemoArthimaticsOperatorBinding

class DemoArthimaticsOperator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val demoArthimaticsOperator= DataBindingUtil.setContentView<ActivityDemoArthimaticsOperatorBinding>(this,R.layout.activity_demo_arthimatics_operator)
        demoArthimaticsOperator.setVariable(BR.number1,110)
        demoArthimaticsOperator.setVariable(BR.number2,20)
    }
}