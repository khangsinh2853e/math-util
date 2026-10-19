package com.neo.mathutil.core;

public class MathUtil {

    public static long getFactorial(int n) {

        //ĐỔI HÀM TÍNH THEO ĐỆ QUY

        if( n < 0 || n > 20 ){
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        if( n == 0 || n == 1 ){
            return 1;// điểm dừng đệ quy, k lùi ữa, lùi đén 1 là tính được
        }
        //tính được n! = (n-1)! x n
        return n * getFactorial(n-1);

        //TỐI ƯU TINH CHỈNH CODE CHO NÓ HAY HƠN, ỔN HƠN (THUẬT TOÁN CHẠY NHANH HƠN)
        //VIỆC CHỈNH CODE ĐỂ TỐT HƠN GỌI LÀ REFACTOR/REFACTORING


//        long result = 1; //CỐ TÌNH THỬ GITHUB ACTIONS XEM CÓ PHÁT HIỆN CODE LỖI LOGIC, LỖI TÍNH TOÁN HAY K
//        //FIX LẠI 10 THÀNH 1 ĐỂ PASSED TEST CASE ĐỂ THẤY MÀU XANH TRÊN GITHUB
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
//        }
//        //n đang ổn, làm vòng for mà tính dồn, nhân dồn vào result
//        for (int i = 1; i <= n; i++){
//            result *= i;
//        }
//        return result;
    }
}
//CODE CHÍNH, CODE BASE, CODE DÂN DEV PHẢI LÀM