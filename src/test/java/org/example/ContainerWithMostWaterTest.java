package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
     private ContainerWithMostWater containerWithMostWater;
    @BeforeEach
    void setUp() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    void maxArea() {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int actual = containerWithMostWater.maxArea(height);
        assertEquals(49, actual);
    }
}