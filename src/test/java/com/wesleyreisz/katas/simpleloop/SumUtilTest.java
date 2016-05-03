package com.wesleyreisz.katas.simpleloop;

import org.junit.Assert;
import org.junit.Test;

public class SumUtilTest {
    @Test
    public void testSumUtil(){
        int[] numbers = new int[] {1,2,3,5,7,34,5,34,6};
        Assert.assertEquals(97,SumUtil.addWithFor(numbers));
    }
    @Test
    public void testSumUtilStream(){
        int[] numbers = new int[] {1,2,3,5,7,34,5,34,6};
        Assert.assertEquals(SumUtil.addWithFor(numbers),SumUtil.addWithForDeclarative(numbers));
    }
    @Test
    public void testSumUtilWhile(){
        int[] numbers = new int[] {1,2,3,5,7,34,5,34,6};
        Assert.assertEquals(SumUtil.addWithFor(numbers),SumUtil.addWithWhileLoop(numbers));
    }
    @Test
    public void testSumUtilRecursion(){
        int[] numbers = new int[] {1,2,3,5,7,34,5,34,6};
        Assert.assertEquals(SumUtil.addWithFor(numbers),SumUtil.addWithRecursion(numbers));
    }
}
