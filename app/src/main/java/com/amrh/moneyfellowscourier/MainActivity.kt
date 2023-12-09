package com.amrh.moneyfellowscourier

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.innov8.moneyfellowscourier.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import com.innov8.moneyfellowscourier.R
import com.innov8.moneyfellowscourier.utils.gone
import com.innov8.moneyfellowscourier.utils.visible


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupNavComp()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

     fun showProgress(b: Boolean) {
        if (b) {
            binding.animationView.visible()
            binding.animationView.playAnimation()
        } else {
            binding.animationView.gone()
            binding.animationView.cancelAnimation()
        }
    }


    private fun setupNavComp() {

        navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main)


    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}