package com.gemy.yaqia

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.gemy.yaqia.database.CrimeDatabase
import java.lang.IllegalStateException
import java.util.*

private const val DATABASE_NAME = "crime-database"
class CrimeRepository private constructor(context: Context) {
    companion object {
        private var INSTANCE: CrimeRepository? = null
        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = CrimeRepository(context,)
            }
        }
        fun get(): CrimeRepository {
            return INSTANCE ?:
            throw IllegalStateException("CrimeRepository must be initialized")
        }
    }

    private val database : CrimeDatabase = Room.databaseBuilder(context,CrimeDatabase::class.java,
        DATABASE_NAME).build()
    private val crimeDao = database.crimeDao()

    fun getCrimes(): LiveData<List<Crime>> = crimeDao.getCrimes()
    fun getCrime (id: UUID):LiveData<Crime?> = crimeDao.getCrime(id)
}