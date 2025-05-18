public class MathUtilLive {
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = " + result);

    //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CODE LÊN SERVER 13:26 18/5/2025
    System.out.println("expected: 1! = 1; actual: " + MathUtil.getFactorial(1));   
    System.out.println("expected: 3! = 6; actual: " + MathUtil.getFactorial(3));
    }
    
}
