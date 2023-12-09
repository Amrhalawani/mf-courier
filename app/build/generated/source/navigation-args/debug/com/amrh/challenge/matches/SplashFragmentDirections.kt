package com.amrh.challenge.matches

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.innov8.moneyfellowscourier.R

public class SplashFragmentDirections private constructor() {
  public companion object {
    public fun actionNavigationMatchesToFavoritesMatchesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_matches_to_favoritesMatchesFragment)

    public fun actionNavigationSplashToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_splash_to_homeFragment)

    public fun actionNavigationSplashToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigation_splash_to_loginFragment)
  }
}
