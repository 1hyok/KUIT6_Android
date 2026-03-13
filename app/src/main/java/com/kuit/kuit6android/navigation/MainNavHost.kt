package com.kuit.kuit6android.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.toRoute
import com.kuit.kuit6android.ui.favorite.FavoriteDetailScreen
import com.kuit.kuit6android.ui.favorite.screen.FavoriteScreen
import com.kuit.kuit6android.ui.home.data.restaurant.RestaurantData
import com.kuit.kuit6android.ui.home.data.restaurant.RestaurantRatingData
import com.kuit.kuit6android.ui.home.screen.HomeScreen
import com.kuit.kuit6android.ui.myeats.screen.MyEatsScreen
import com.kuit.kuit6android.ui.orderhistory.screen.OrderHistoryScreen
import com.kuit.kuit6android.ui.restaurant.RestaurantSamples
import com.kuit.kuit6android.ui.search.screen.SearchResultScreen
import com.kuit.kuit6android.ui.search.screen.SearchScreen

@Composable
fun MainNavHost(
    padding: PaddingValues,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Route.Home,
    ) {
        composable<Route.Home> {
            HomeScreen(
                padding = padding
            )
        }

        navigation<Route.SearchNestedGraphRoute>(startDestination = Route.Search) {
            composable<Route.Search> {
                SearchScreen(
                    padding = padding,
                    onNavigateToResult = {
                        navController.navigate(Route.SearchResult(searchKeyword = it))
                    },
                    onNavigateToBack = {
                        navController.navigateUp()
//                        navController.popBackStack()
                    }
                )
            }
            composable<Route.SearchResult> { backStackEntry ->
                val searchKeyword = backStackEntry.toRoute<Route.SearchResult>().searchKeyword
                SearchResultScreen(
                    searchKeyword = searchKeyword,
                    padding = padding,
                    onNavigateToBack = {
                        navController.navigateUp()
                    }
                )
            }
        }
//        composable<Route.SearchResult> { backStackEntry ->
//            val searchKeyword = backStackEntry.toRoute<Route.SearchResult>().searchKeyword
//            SearchResultScreen(
//                searchKeyword = searchKeyword,
//                padding = padding,
//                onNavigateToBack = {
//                    navController.navigateUp()
//                }
//            )
//        }

        navigation<Route.MyEatsNestedGraphRoute>(startDestination = Route.MyEats) {
            composable<Route.MyEats> {
                MyEatsScreen(
                    padding = padding,
                    onNavigateToFavorite = {
                        navController.navigate(Route.Favorite)
                    }
                )
            }
            navigation<Route.FavoriteNestedGraphRoute>(startDestination = Route.Favorite) {
                composable<Route.Favorite> {
                    FavoriteScreen(
                        padding = padding,
                        restaurantDataList = RestaurantSamples.restaurantDataList,
                        onNavigateToBack = { navController.navigateUp() },
                        onNavigateToRestaurantDetail = { restaurantData ->
                            navController.navigate(
                                Route.FavoriteDetail(
                                    imageId = restaurantData.imageId,
                                    name = restaurantData.name,
                                    time = restaurantData.time,
                                    rating = restaurantData.ratingData.rating,
                                    raters = restaurantData.ratingData.raters
                                )
                            )
                        }
                    )
                }

                composable<Route.FavoriteDetail> { backStackEntry ->
                    val favoriteDetailRoute =
                        backStackEntry.toRoute<Route.FavoriteDetail>()
                    FavoriteDetailScreen(
                        restaurantData = RestaurantData(
                            imageId = favoriteDetailRoute.imageId,
                            name = favoriteDetailRoute.name,
                            time = favoriteDetailRoute.time,
                            ratingData = RestaurantRatingData(
                                rating = favoriteDetailRoute.rating,
                                raters = favoriteDetailRoute.raters
                            )
                        )
                    )
                }
            }
        }

        composable<Route.OrderHistory> {
            OrderHistoryScreen(
                padding = padding
            )
        }
    }
}