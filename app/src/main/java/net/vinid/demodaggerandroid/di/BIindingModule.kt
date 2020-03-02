package net.vinid.demodaggerandroid.di

import dagger.Binds
import dagger.Module
import net.vinid.demodaggerandroid.data.remote.ApiService
import net.vinid.demodaggerandroid.data.remote.ApiServiceImp
import net.vinid.demodaggerandroid.repository.Repository
import net.vinid.demodaggerandroid.repository.RepositoryImp

/**
 * Created by Nguyen Van Lieu on 2/27/2020.
 */
@Module
interface BIindingModule {

    @Binds
    fun bindApiService(apiServiceImp: ApiServiceImp): ApiService

    @Binds
    fun bindRepository(repositoryImp: RepositoryImp): Repository

}