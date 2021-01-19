package com.sippitehnologies.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sippitehnologies.databinding.databinding.ActivityLogiacalOperatorBinding

class LogiacalOperatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      val logicalDatabinding = DataBindingUtil.setContentView<ActivityLogiacalOperatorBinding>(this,R.layout.activity_logiacal_operator)
        logicalDatabinding.setVariable(BR.number1,5)
        logicalDatabinding.setVariable(BR.number2,20)
    }
}