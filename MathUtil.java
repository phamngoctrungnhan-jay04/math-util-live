//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO CẦN NHỚ CÁI GÌ
//CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {

    //n! = 1.2.3.4...n
    //Quy ước: 0! = 1! = 1
    //ko tính giai thừa cho số âm
    //20! là khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    //nếu đưa vào âm, 21 giai thừa, ta ko tính, ta sẽ ném ra ngoại lệ
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
        }
        if(n == 0 || n == 1) {
            return 1;
        }
        long result = 1; //biến lưu trữ kết quả
        //chơi for hoặc đệ quy - recursion
        for(int i = 2; i <= n; i++) {
            //nếu i = 2, 3, 4, 5... thì ta sẽ nhân dồn vào biến result
            result *= i;
            
        }
        return result;
    }
}