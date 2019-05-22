package com.example.wits_vuvuzela_app;

import android.app.Activity;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayingAtLeast;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.AllOf.allOf;
import static org.junit.Assert.*;

public class ReadArticleActivityTest {


    @Rule
    public ActivityTestRule<ReadArticleActivity> readArticleActivityActivityRule = new ActivityTestRule<>(ReadArticleActivity.class);
    public  ReadArticleActivity readArticleActivity =null;


    @Before
    public void setUp() throws Exception {
        readArticleActivity = readArticleActivityActivityRule.getActivity();
    }

    public static ViewAction handleConstraints(final ViewAction action, final Matcher<View> constraints)
    {
        return new ViewAction()
        {
            @Override
            public Matcher<View> getConstraints()
            {
                return constraints;
            }

            @Override
            public String getDescription()
            {
                return action.getDescription();
            }

            @Override
            public void perform(UiController uiController, View view)
            {
                action.perform(uiController, view);
            }
        };
    }


    @Test
    public void readArticleTest(){
        Espresso.onView(withId(R.id.ReadArticleHeading)).check(matches(not(withText("Article Heading"))));
        Espresso.onView(withId(R.id.ReadArticleBody)).check(matches(not(withText(""))));
        View imageview = (readArticleActivity).findViewById(R.id.ArticleImageView);
        Espresso.onView(withId(R.id.likeNum)).check(matches(not(withText(""))));
        Espresso.onView(withId(R.id.dislikeNum)).check(matches(not(withText(""))));
        Espresso.onView(withId(R.id.commentANum)).check(matches(not(withText(""))));
       // Espresso.onView(withId(R.id.commentBtn)).perform(handleConstraints(click(), isDisplayingAtLeast(65)));
        Espresso.onView(withId(R.id.likebtn)).perform(handleConstraints(click(), isDisplayingAtLeast(65)));
        Espresso.onView(withId(R.id.dislikebtn)).perform(handleConstraints(click(), isDisplayingAtLeast(65)));
    }


    @After
    public void tearDown() throws Exception {
    }
}