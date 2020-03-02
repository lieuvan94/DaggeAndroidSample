package net.vinid.demodaggerandroid.data.local

import android.util.Log
import javax.inject.Inject

/**
 * Created by Nguyen Van Lieu on 2/26/2020.
 */


class LocalDataSource @Inject constructor(){

    init {
        Log.d("TAG","instance LocalDataSource")
    }

    fun getData():String {
        return "Hello Local"
    }
}