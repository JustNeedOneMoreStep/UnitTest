package com.epet.bonesocial.activity.unittest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * 日期: 2016/8/7
 * 时间: 22:12
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityUnitTest {

	@Rule
	public ActivityTestRule<MainActivity> mTestRule =
			new ActivityTestRule<MainActivity>(MainActivity.class);
	private String toBeTyped = "I'm your father";

	@Test
	public void sayHello() {
		onView(withText("")).perform(click(),closeSoftKeyboard());
		/*Espresso.onView(ViewMatchers.withId(R.id.editText))
				.perform(ViewActions.typeText(toBeTyped),ViewActions.closeSoftKeyboard());
		Espresso.onView(ViewMatchers.withText("Say hello!")).perform(ViewActions.click());
		String expected = "Hello, "+toBeTyped+"!";
		Espresso.onView(ViewMatchers.withId(R.id.textView))
				.check(ViewAssertions.matches(ViewMatchers.withText(expected)));*/
	}


}