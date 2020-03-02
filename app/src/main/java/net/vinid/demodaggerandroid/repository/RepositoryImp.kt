package net.vinid.demodaggerandroid.repository

import android.util.Log
import net.vinid.demodaggerandroid.data.local.LocalDataSource
import net.vinid.demodaggerandroid.data.remote.RemoteDataSource
import javax.inject.Inject

/**
 * Created by Nguyen Van Lieu on 2/26/2020.
 */

class RepositoryImp @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) :Repository {

    init {
        Log.d("TAG","instance Repository")
    }

    override fun getAllData(): String{
        return " Result: Repository"
    }
}