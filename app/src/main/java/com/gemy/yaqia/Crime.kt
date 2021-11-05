package com.gemy.yaqia

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.text.DateFormat
import java.util.*

@Entity
data class Crime(
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false,
){
    @Ignore
    var dateRep : String = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date)
}