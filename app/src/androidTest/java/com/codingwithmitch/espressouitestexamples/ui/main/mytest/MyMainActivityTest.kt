package com.codingwithmitch.espressouitestexamples.ui.main.mytest

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.R
import com.codingwithmitch.espressouitestexamples.ui.main.MainActivity
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MyMainActivityTest {

    @Test
    fun test_text_and_activity_view() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    @Test
    fun test_title_displayed() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(isDisplayed()))
    }

    @Test
    fun test_title_match() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.activity_main_title)).check(matches(withText("MainActivity")))
    }

    @Test
    fun test_button_show() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.button_next_activity)).check(matches(isDisplayed()))
    }

    @Test
    fun test_button_click() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.button_next_activity)).perform(click())
    }

    @Test
    fun test_button_text() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.button_next_activity)).perform(click())
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))
        pressBack()
    }

}















