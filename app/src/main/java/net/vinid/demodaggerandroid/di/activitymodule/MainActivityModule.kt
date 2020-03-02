package net.vinid.demodaggerandroid.di.activitymodule

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import net.vinid.demodaggerandroid.MainActivity
import net.vinid.demodaggerandroid.di.viewmodelmodule.ViewModelKey
import net.vinid.demodaggerandroid.viewmodel.DataViewModel

@Module
interface MainActivityModule {

    @Binds
    fun bindMainActivity(activity: MainActivity): AppCompatActivity



    @Binds
    @IntoMap
    @ViewModelKey(DataViewModel::class)
    fun bindDataViewModel(
        dataViewModel: DataViewModel
    ): ViewModel

}