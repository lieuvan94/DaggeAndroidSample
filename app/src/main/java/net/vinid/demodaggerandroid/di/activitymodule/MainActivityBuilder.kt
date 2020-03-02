package net.vinid.demodaggerandroid.di.activitymodule

import dagger.Module
import dagger.android.ContributesAndroidInjector
import net.vinid.demodaggerandroid.MainActivity

@Module
interface MainActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun contributeMainActivity(): MainActivity
}