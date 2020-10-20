package com.example.daggerviewmodel

import dagger.Component


@Component
interface ApplicationComponent {

    // where you want to inject
    fun inject(activity: MainActivity)

}