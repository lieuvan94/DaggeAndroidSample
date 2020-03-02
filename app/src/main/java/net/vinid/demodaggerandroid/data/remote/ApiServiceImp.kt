package net.vinid.demodaggerandroid.data.remote

import android.util.Log
import net.vinid.demodaggerandroid.data.remote.ApiService
import javax.inject.Inject

/**
 * Created by Nguyen Van Lieu on 2/26/2020.
 */

class ApiServiceImp @Inject constructor() :
    ApiService {

    init {
        Log.d("TAG","instance ApiServiceImp")
    }

    override fun getData(): String {
        return "ApiServiceImp"
    }
}