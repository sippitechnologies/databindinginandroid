package com.sippitehnologies.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sippitehnologies.databinding.databinding.ActivityInstanceOperatorNullCollascingOpertorBinding
import com.sippitehnologies.databinding.model.Person
import com.sippitehnologies.databinding.model.Vehicle

class InstanceOperatorNullCollascingOpertor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      val instanceOpratorDatabinding = DataBindingUtil.setContentView<ActivityInstanceOperatorNullCollascingOpertorBinding>(this,R.layout.activity_instance_operator_null_collascing_opertor)
        val vehicle = Vehicle("Honda","Red","2010")
        val person = Person(null,"last Name","testing",40, arrayOf("Watching Movies","Playing Cricket"))
        instanceOpratorDatabinding.setVariable(BR.myObject,person)
        instanceOpratorDatabinding.setVariable(BR.person,person)
    }
}