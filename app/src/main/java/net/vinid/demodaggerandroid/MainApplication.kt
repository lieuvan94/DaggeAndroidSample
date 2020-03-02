package net.vinid.demodaggerandroid


import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import net.vinid.demodaggerandroid.di.DaggerAppComponent

/**
 * Created by Nguyen Van Lieu on 2/26/2020.
 */
class MainApplication : DaggerApplication(){

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(applicationContext)
    }

}