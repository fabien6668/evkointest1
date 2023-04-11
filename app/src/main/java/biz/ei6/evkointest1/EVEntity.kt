package biz.ei6.evkointest1

import androidx.room.Dao
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Query

@Entity(tableName = "verbs")
data class EVEntity(val infinitif : String) {
    @PrimaryKey(true) var id : Int =0
}

@Dao
interface EVDao {
    @Query("SELECT * FROM verbs")
    fun get() : List<EVEntity>
}