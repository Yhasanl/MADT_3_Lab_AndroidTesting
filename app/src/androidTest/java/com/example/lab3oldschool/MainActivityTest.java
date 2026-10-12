package com.example.lab3oldschool;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import com.example.wordcounteroldsch.R;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testWordCountingUI() {
        // "hello" sözünü mətn qutusuna yazmaq və klaviaturanı bağlamaq
        onView(withId(R.id.txtInput)).perform(typeText("hello"), closeSoftKeyboard());

        // "Count" düyməsinə klikləmək
        onView(withId(R.id.btnCalculate)).perform(click());
    }
}