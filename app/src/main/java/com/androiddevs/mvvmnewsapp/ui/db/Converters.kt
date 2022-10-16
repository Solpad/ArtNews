package com.androiddevs.mvvmnewsapp.ui.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.ui.models.Source

class Converters {
    @TypeConverter
    fun fromSourse(sourse: Source):String{
        return sourse.name
    }

    @TypeConverter
    fun toSourse(name:String): Source {
        return Source(name,name)
    }

}