package com.sippitehnologies.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sippitehnologies.databinding.databinding.ActivityComparsionOperatorBinding

class ComparsionOperator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val comparsionOperatorBinding = DataBindingUtil.setContentView<ActivityComparsionOperatorBinding>(this,R.layout.activity_comparsion_operator)
        comparsionOperatorBinding.setVariable(BR.num1,20)
        comparsionOperatorBinding.setVariable(BR.num2,30)
    }
}