package com.neo.mathutil.core;

public class MathUtil {

    public static long getFactorial(int n) {

        long result = 1; //CỐ TÌNH THỬ GITHUB ACTIONS XEM CÓ PHÁT HIỆN CODE LỖI LOGIC, LỖI TÍNH TOÁN HAY K
        //FIX LẠI 10 THÀNH 1 ĐỂ PASSED TEST CASE ĐỂ THẤY MÀU XANH TRÊN GITHUB
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        }
        //n đang ổn, làm vòng for mà tính dồn, nhân dồn vào result
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
//CODE CHÍNH, CODE BASE, CODE DÂN DEV PHẢI LÀM