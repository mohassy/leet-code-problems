package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {
    private TrappingRainWater trappingRainWater;
    @BeforeEach
    void setUp() {
        trappingRainWater = new TrappingRainWater();
    }

    @Test
    void trap() {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int actual = trappingRainWater.trap(height);
        assertEquals(6, actual);
    }
}