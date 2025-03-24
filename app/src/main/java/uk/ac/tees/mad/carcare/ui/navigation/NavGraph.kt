package uk.ac.tees.mad.carcare.ui.navigation

import kotlinx.serialization.Serializable

sealed class SubGraph {
    @Serializable
    data object  SplashScreenGraph : SubGraph()

    @Serializable
    data object AuthGraph : SubGraph()

    @Serializable
    data object HomeGraph : SubGraph()
}

sealed class Dest {
    @Serializable
    data object SplashScreen : Dest()

    @Serializable
    data object LogInScreen : Dest()
}