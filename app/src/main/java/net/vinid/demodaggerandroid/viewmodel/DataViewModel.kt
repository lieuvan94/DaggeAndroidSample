package net.vinid.demodaggerandroid.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import net.vinid.demodaggerandroid.repository.Repository
import javax.inject.Inject

/**
 * Created by Nguyen Van Lieu on 2/26/2020.
 */

class DataViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel(){

    private val _data = MutableLiveData<String>()

    val data :LiveData<String>
    get() = _data

    init {
        Log.d("TAG","instance DataViewModel")
    }

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun dataViewModel(){
        _data.value = repository.getAllData()
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}