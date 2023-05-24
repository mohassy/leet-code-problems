package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    private ThreeSum threeSum;
    @BeforeEach
    void setup(){
        threeSum = new ThreeSum();
    }
    @Test
    void threeSum() {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-1,-1,2));
        expected.add(List.of(-1,0,1));
        List<List<Integer>> actual = threeSum.threeSum(nums);
        assertEquals(expected, actual);
    }
}