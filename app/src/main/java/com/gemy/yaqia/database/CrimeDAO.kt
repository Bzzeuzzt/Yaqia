package com.gemy.yaqia.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.gemy.yaqia.Crime
import java.util.*

@Dao
interface CrimeDAO {
    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id:UUID):LiveData<Crime?>
}