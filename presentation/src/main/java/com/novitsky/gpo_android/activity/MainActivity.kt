package com.novitsky.gpo_android.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.novitsky.gpo_android.R

class MainActivity : AppCompatActivity(), ClosingAppActivity {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}

	override fun close() {
		finish()
	}
}