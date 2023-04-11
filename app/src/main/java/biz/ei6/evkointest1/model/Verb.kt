package biz.ei6.evkointest1.model

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName="verbs", indices = [Index(value=["id"])])
class Verb(
    @PrimaryKey
    val id : String = UUID.randomUUID().toString()

    val infinitif : String=""
){
    
}