package com.neo.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.neo.mathutil.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    //test case 1: test hàm với đầu vào hợp lệ, n = 5 hi vọng hàm trả về 120
    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = getFactorial(n);

        //so snh tự động giúp tui expected có == actual hay k
        //nếu == thì quất màu xanh
        //nếu != quất màu đỏ!!!
        assertEquals(expected, actual);
        //assertEquals hàm so sánh xem có bằng không
    }

    //test case 2: test hàm với đầu vào hợp lệ, n = 6 hi vọng hàm trả về 720
    @Test
    void testFactorialGivenValidN6ReturnsWell720() {
        long expected = 720;
        int n = 6;
        long actual = getFactorial(n);

        //so snh tự động giúp tui expected có == actual hay k
        //nếu == thì quất màu xanh
        //nếu != quất màu đỏ!!!
        assertEquals(expected, actual);
    }

    //test case 3: test hàm với đầu vào hợp lệ, n = 0 hi vọng hàm trả về 1
    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        long expected = 1;
        int n = 0;
        long actual = getFactorial(n);

        //so snh tự động giúp tui expected có == actual hay k
        //nếu == thì quất màu xanh
        //nếu != quất màu đỏ!!!
        assertEquals(expected, actual);
    }

    //test case 4: test hàm với đầu vào không hợp lệ, n = -1 hi vọng hàm trả về ngoại lệ!!! IllegalArugmentException
    @Test
    void testFactorialGivenInvalidMinus1ThrowException(){
        assertThrows(IllegalArgumentException.class,
                () -> {getFactorial(-1);});
    }
}