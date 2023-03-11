package com.geektech.les7m5

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class ActivityTest {
    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.first_ed)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.first_ed)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.second_ed)).perform(ViewActions.typeText("5"))
            Espresso.onView(withId(R.id.second_ed)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.calculate_btn)).perform(ViewActions.click())
            delay(1000)
            Espresso.onView(withId(R.id.result_tv)).check(ViewAssertions.matches(ViewMatchers.withText("9.0")))
            delay(2000)
        }
    }
}