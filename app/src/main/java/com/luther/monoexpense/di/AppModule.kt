package com.luther.monoexpense.di

import android.content.Context
import com.luther.android_ext.App
import com.luther.android_ext.ktx.res
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
@InstallIn(SingletonComponent::class)
@Module(
    includes = [
        ServiceModule::class,
        DataSourceModule::class
    ]
)
object AppModule {

    @Provides
    fun provideAppCtx() = App.appCtx

    @Provides
    fun provideAppRes(appCtx: Context) = appCtx.res
}