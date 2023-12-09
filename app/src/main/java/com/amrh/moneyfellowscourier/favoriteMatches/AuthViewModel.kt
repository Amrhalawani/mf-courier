/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amrh.moneyfellowscourier.favoriteMatches


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.innov8.data.data.repo.AppUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val appUseCase: AppUseCases
) : ViewModel() {

    //mutable able to change
    private val _stateFavoritesMatches: MutableLiveData<Map<String, List<Match>>> =
        MutableLiveData()

    //just for observing
    val stateFavoritesMatches: LiveData<Map<String, List<Match>>> = _stateFavoritesMatches


    private fun login(country_code:String, phone:String) {
        viewModelScope.launch(Dispatchers.IO) {
            appUseCase.login(country_code, phone).collect {
                _stateFavoritesMatches.postValue(it)
            }
        }
    }




//    init {
//        getFavoriteMatches()
//    }
//
//    private fun getFavoriteMatches() {
//        viewModelScope.launch(Dispatchers.IO) {
//            appUseCase.getFavoriteMatches().collect {
//                _stateFavoritesMatches.postValue(it)
//            }
//        }
//    }
//
//     fun removeFavoriteMatch(match: Match) {
//        viewModelScope.launch(Dispatchers.IO) {
//            appUseCase.removeFavoriteMatch(match)
//        }
//    }
}

