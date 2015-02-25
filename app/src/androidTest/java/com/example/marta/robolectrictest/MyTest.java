package com.example.marta.robolectrictest;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Marta on 25/02/2015.
 */
@RunWith(AndroidJUnit4.class)
public class MyTest {

    @Test
    public void testJUnit(){
        Assert.assertTrue("jUnit works", false);
    }
}
