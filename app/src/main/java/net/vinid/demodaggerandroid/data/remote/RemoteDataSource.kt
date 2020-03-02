package net.vinid.demodaggerandroid.data.remote

import android.util.Log
import net.vinid.demodaggerandroid.data.remote.ApiService
import javax.inject.Inject

/**
 * Created by Nguyen Van Lieu on 2/26/2020.
 */

class RemoteDataSource @Inject constructor(
    private val apiService: ApiService
){
    init {
        Log.d("TAG","instance RemoteDataSource")
    }

    fun getData():String{
        return "Hello Remote"
    }
}