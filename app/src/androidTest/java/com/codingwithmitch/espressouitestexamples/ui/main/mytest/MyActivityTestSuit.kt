package com.codingwithmitch.espressouitestexamples.ui.main.mytest

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MyMainActivityTest::class,
    MySecondaryActivityTest::class
)

class MyActivityTestSuit