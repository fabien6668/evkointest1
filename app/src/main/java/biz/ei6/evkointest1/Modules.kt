package biz.ei6.evkointest1

import androidx.lifecycle.ViewModel
import androidx.room.Room
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import java.lang.reflect.Array.get


val mesModules = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            EVDatabase::class.java,
            "EV"
        ).build()
    }
    single<EVDao> {
        val database = get<EVDatabase>()
        database.getEVDao()
    }
    singleOf(::ListeRepository)
    viewModel{ListeViewModel(get())}
}
