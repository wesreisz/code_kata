package com.wesleyreisz.katas.combination;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wesleyreisz on 5/4/16.
 */
public class CombinationUtilTest {
    @Test
    public void testCombinationUtil() throws Exception{
        char[] correctResults = new char[]{'a', '1', 'b', '2', 'c', '3', 'd', '4'};
        char[] list1 = new char[]{'a','b','c','d'};
        char[] list2 = new char[]{'1','2','3','4'};

        Assert.assertArrayEquals(correctResults,CombinationUtil.combine(list1,list2));
    }
}
