package net.vinid.demodaggerandroid.di

import dagger.Module
import dagger.Provides
import net.vinid.demodaggerandroid.data.remote.ApiService
import net.vinid.demodaggerandroid.data.remote.ApiServiceImp
import net.vinid.demodaggerandroid.repository.Repository
import net.vinid.demodaggerandroid.repository.RepositoryImp
import net.vinid.demodaggerandroid.utils.rx.AppSchedulerProvider
import net.vinid.demodaggerandroid.utils.rx.SchedulerProvider
import javax.inject.Singleton

/**
 * Created by Nguyen Van Lieu on 2/26/2020.
 */

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApiService(apiServiceImp: ApiServiceImp): ApiService {
        return apiServiceImp
    }

    @Provides
    @Singleton
    fun provideRepository(repositoryImp: RepositoryImp): Repository {
        return repositoryImp
    }

    @Provides
    @Singleton
    fun provideSchedulerProvider(): SchedulerProvider = AppSchedulerProvider()

}