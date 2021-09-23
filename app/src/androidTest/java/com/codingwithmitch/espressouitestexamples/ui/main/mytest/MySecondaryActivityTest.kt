package com.codingwithmitch.espressouitestexamples.ui.main.mytest

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.R
import com.codingwithmitch.espressouitestexamples.ui.main.MainActivity
import com.codingwithmitch.espressouitestexamples.ui.main.SecondaryActivity
import org.junit.Rule
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MySecondaryActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(SecondaryActivity::class.java)

    @Test
    fun test_activity_show() {

        onView(withId(R.id.secondary)).check(matches(isDisplayed()))

    }

    @Test
    fun title_text_of_activity_show_() {

        onView(withId(R.id.activity_secondary_title)).check(matches(withText("SecondaryActivity")))

    }

    @Test
    fun test_text_button()  {

        onView(withId(R.id.button_back)).check(matches(withText("BACK")))

    }


    @Test
    fun test_back_button_click()  {

        onView(withId(R.id.button_back)).perform(click())

    }

    @Test
    fun test_button_show() {

        onView(withId(R.id.button_back)).check(matches(isDisplayed()))
    }

    @Test
    fun text_title_displayed() {

        onView(withId(R.id.activity_secondary_title)).check(matches(isDisplayed()))
    }
}
