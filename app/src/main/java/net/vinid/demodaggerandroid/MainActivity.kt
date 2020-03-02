package net.vinid.demodaggerandroid

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerAppCompatActivity
import net.vinid.demodaggerandroid.di.viewmodelmodule.ViewModelFactory
import net.vinid.demodaggerandroid.viewmodel.DataViewModel
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val dataViewModel : DataViewModel by lazy {
        ViewModelProvider(this,viewModelFactory).get(DataViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)

        dataViewModel.dataViewModel()
        dataViewModel.data.observe(this, Observer<String> { data ->
            Log.d("TAG",data)
        })

    }
}

