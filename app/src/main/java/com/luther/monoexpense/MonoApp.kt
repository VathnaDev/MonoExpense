package com.luther.monoexpense

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import androidx.multidex.MultiDex
import com.facebook.stetho.Stetho
import com.luther.android_ext.App
import com.luther.android_ext.dev.Tree
import com.luther.android_ext.ktx.res
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MonoApp : Application() {

    companion object {

        @Volatile
        private var instance: Application? = null

        val appCtx get() = instance?.applicationContext!!
        val appRes get() = appCtx.res
    }

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        if (BuildConfig.DEBUG) {
            Tree.plan()
            Stetho.initializeWithDefaults(this)
        }
        App.init(appCtx)
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}