package net.vinid.demodaggerandroid.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import net.vinid.demodaggerandroid.MainApplication
import net.vinid.demodaggerandroid.di.activitymodule.MainActivityBuilder
import net.vinid.demodaggerandroid.di.viewmodelmodule.ViewModelModule

/**
 * Created by Nguyen Van Lieu on 2/26/2020.
 */

@Component(
    modules = [AppModule::class,
        ViewModelModule::class,
        MainActivityBuilder::class,
        AndroidSupportInjectionModule::class]
)
interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}