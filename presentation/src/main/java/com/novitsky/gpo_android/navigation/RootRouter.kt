package com.novitsky.gpo_android.navigation

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.novitsky.gpo_android.activity.ClosingAppActivity

class RootRouter(
	private val context: Context,
	private val manager: FragmentManager,
	private val containerViewID: Int,
	private val closingApp: ClosingAppActivity
) {
	fun getCurrentFragment(): Fragment {
		return manager.fragments.last()
	}

	fun back() {
		if (manager.fragments.size == 1) {
			closingApp.close()
		} else {
			manager.popBackStack()
		}
	}

	fun clearBackStack(numberOfFragmentsSaved: Int = 0) {
		for (i in 0..(manager.fragments.size - numberOfFragmentsSaved)) {
			manager.popBackStack()
		}
	}

	private fun addToBackStack(fragment: Fragment) {
		val transaction = manager.beginTransaction()
		transaction.add(containerViewID, fragment)
		transaction.addToBackStack(null)
		transaction.commit()
	}

	private fun replaceFragment(fragment: Fragment) {
		val transaction = manager.beginTransaction()
		transaction.replace(containerViewID, fragment)
		transaction.addToBackStack(null)
		transaction.commit()
	}
}
