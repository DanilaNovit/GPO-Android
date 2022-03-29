package com.novitsky.gpo_android.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.novitsky.gpo_android.R
import com.novitsky.gpo_android.navigation.RootRouter

class MainActivity : AppCompatActivity(), ClosingAppActivity {
	private val router = RootRouter(applicationContext, supportFragmentManager, R.id.main_container, this)

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		showUI()
	}

	override fun onBackPressed() {
		router.back()
	}

	override fun close() {
		finish()
	}

//	#TODO: Impl
	private fun showUI() {

	}
}