package com.sippitehnologies.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import androidx.databinding.DataBindingUtil
import com.sippitehnologies.databinding.databinding.ActivityEventButtonClickDemoBinding

class EventButtonClickDemo : AppCompatActivity(),View.OnClickListener,CompoundButton.OnCheckedChangeListener {
      lateinit var activityEventButtonClickDemoBinding :ActivityEventButtonClickDemoBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
   activityEventButtonClickDemoBinding = DataBindingUtil.setContentView(this,R.layout.activity_event_button_click_demo)
        activityEventButtonClickDemoBinding.setVariable(BR.onButtonClick,this)
    }

    override fun onClick(v: View?) {
        when(v?.id)
        {
            R.id.button2-> activityEventButtonClickDemoBinding.textView.text = activityEventButtonClickDemoBinding.buttonpanel.button2.text
            R.id.button3-> activityEventButtonClickDemoBinding.textView.text = activityEventButtonClickDemoBinding.buttonpanel.button3.text
            R.id.button4-> activityEventButtonClickDemoBinding.textView.text = activityEventButtonClickDemoBinding.buttonpanel.button4.text
        }
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        TODO("Not yet implemented")
    }
}