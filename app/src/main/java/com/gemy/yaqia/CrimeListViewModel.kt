package com.gemy.yaqia

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    //        val crimes = mutableListOf<Crime>()
//
//    init {
//        for (i in 0 until 100) {
//            val crime = Crime().apply {
//                title = "Crime #$i"
//                isSolved = (i % 2) == 0 //Evens
//            }
//            crimes+=crime
//        }
//    }
    private val crimeRepository = CrimeRepository.get()
    val crimesLiveData = crimeRepository.getCrimes()
    override fun onCleared() {
        super.onCleared()
    }
}