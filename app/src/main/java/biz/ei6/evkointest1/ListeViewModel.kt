package biz.ei6.evkointest1

import androidx.lifecycle.ViewModel


class ListeViewModel(val repository : ListeRepository) : ViewModel()  {

    private val _datas  : List<String> by lazy {
        repository.getDatas()
    }

    val datas : List<String>
        get() = _datas



}
