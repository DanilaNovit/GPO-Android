package com.novitsky.gpo_android.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.novitsky.gpo_android.R
//	#TODO: imp
class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}
}