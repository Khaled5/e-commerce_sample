package com.easyinc.normalrepository

import com.easyinc.normalrepository.common.network_state.NetworkStateHolder.registerConnectivityBroadcaster
import com.easyinc.normalrepository.di.DaggerMainComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerMainComponent.builder().application(this).build()
    }

    override fun onCreate() {
        super.onCreate()
        registerConnectivityBroadcaster()
    }
}