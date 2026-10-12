package com.neo.mathutil;

import com.neo.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //TDD- Viet code bắt đầu từ viết test
        testFactorialGivenValidN5ReturnsWell120();
    }

    // Hàm tính giai thừa với n = 5 và hy vọng trả về 120
    public static void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        long actual = MathUtil.getFactorial(5);

        System.out.println("Check 5! | expected: "
                + expected
                + " | actual: "
                + actual);
    }
}
// CODE NÀY DÙNG ĐỂ TEST CODE BASE, THÌ CODE NÀY ĐƯỢC GỌI LÀ TEST SCRIPT
// CODE NÀY VỀ LÝ THUYẾT K CẦN SHIP CHO KHÁCH HÀNG