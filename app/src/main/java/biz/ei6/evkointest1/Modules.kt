package biz.ei6.evkointest1

import androidx.lifecycle.ViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import java.lang.reflect.Array.get


val mesModules = module {
    singleOf(::ListeRepository)
    viewModel{ListeViewModel(get())}
}
