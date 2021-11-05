package com.gemy.yaqia.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.gemy.yaqia.Crime

@Database(entities = [Crime::class], version = 1)
@TypeConverters(CrimeTypeConverters::class)
  abstract class CrimeDatabase : RoomDatabase() {
    abstract fun crimeDao(): CrimeDAO
}