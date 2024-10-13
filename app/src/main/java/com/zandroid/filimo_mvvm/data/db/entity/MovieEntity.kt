package com.zandroid.filimo_mvvm.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.zandroid.filimo_mvvm.data.models.home.ResponseMovie

import com.zandroid.filimo_mvvm.utils.MOVIE_TABLE_NAME

@Entity(tableName = MOVIE_TABLE_NAME)
data class MovieEntity (
    @PrimaryKey(autoGenerate = false)
    var id:Int,
    var responseMovie: ResponseMovie
)