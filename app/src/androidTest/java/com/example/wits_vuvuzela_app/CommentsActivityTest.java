package com.example.wits_vuvuzela_app;

<<<<<<< HEAD
import org.junit.Test;

import static org.junit.Assert.*;

public class CommentsActivityTest {

    @Test
    public void onCreate() {
    }

    @Test
    public void sortByLikes() {
    }

    @Test
    public void reverseArrayLists() {
    }

    @Test
    public void hierarchialdata() {
=======
import android.support.test.espresso.Espresso;
import android.support.test.runner.AndroidJUnit4;
//import android.support.test.espresso.UiController;
//import android.support.test.espresso.ViewAction;
//import android.support.v7.widget.WithHint;
//import android.view.View;
import android.support.test.rule.ActivityTestRule;
import android.view.View;


//import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

//import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
//import static android.support.test.espresso.matcher.ViewMatchers.isDisplayingAtLeast;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class CommentsActivityTest {

    @Rule
    public ActivityTestRule<CommentsActivity> commentsActivityTestActivityTestRule = new ActivityTestRule<>(CommentsActivity.class);
    public  CommentsActivity commentsActivity =null;

    private String comment = "SomeComment";

    @Before
    public void setUp() throws Exception {
        commentsActivity = commentsActivityTestActivityTestRule.getActivity();
    }

    /*public static ViewAction handleConstraints(final ViewAction action, final Matcher<View> constraints)
    {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return constraints;
            }

            @Override
            public String getDescription() {
                return action.getDescription();
            }

            @Override
            public void perform(UiController uiController, View view) {
                 action.perform(uiController, view );
            }
        };
    }*/

    @Test
    public void TestViews(){
        CommentsActivity commentsActivity = new CommentsActivity();
        if (commentsActivity.customAdapter1 != null) {
            View listview = (commentsActivity).findViewById(R.id.listview);
            assertNotNull(listview);
        }

    }

    @Test
    public void TestCommentsActivity(){

        View backArrow = (commentsActivity).findViewById(R.id.backArrow);
        assertNotNull(backArrow);
        View txtComment = (commentsActivity).findViewById(R.id.txtcomment);
        assertNotNull(txtComment);
        View CommentTitle = (commentsActivity).findViewById(R.id.CommentTitle);
        assertNotNull(CommentTitle);





        /*
       Espresso.onView(withId(R.id.txtcomment)).check(matches((withText(""))));
      Espresso.onView(withId(R.id.listview)).check(matches(isDisplayed()));
      Espresso.closeSoftKeyboard();;
     */

    }


    @Test
    public void CommentEdit() throws Exception{
        onView(withId(R.id.editComments)).perform(replaceText(comment));
        View editComments = (commentsActivity).findViewById(R.id.editComments);
        assertNotNull(editComments);
        onView(withId(R.id.commentBtns)).perform(click());

    }

    @After
    public void tearDown() throws Exception {
<<<<<<< HEAD
        commentsActivity = null;
=======
>>>>>>> 1bcaa90be40fbe43027199467808a6bd1c772df5
>>>>>>> 37957fb8d69b39572512252550937082e5d447f6
    }
}