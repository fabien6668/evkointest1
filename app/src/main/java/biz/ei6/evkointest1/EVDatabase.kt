package biz.ei6.evkointest1

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [EVEntity::class],version = 1 , exportSchema = false)
abstract class EVDatabase : RoomDatabase() {

    abstract fun getEVDao(): EVDao
}