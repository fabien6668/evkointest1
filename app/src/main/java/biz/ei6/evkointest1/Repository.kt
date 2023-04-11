package biz.ei6.evkointest1

class ListeRepository (val dao : EVDao){

    fun getDatas() : List<String> = listOf ("item1","item2")
}