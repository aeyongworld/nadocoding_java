package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String priNum = "010714-1234567";

        System.out.println(priNum.indexOf("-"));
        System.out.println(priNum.substring(0, 8));

        // 추가 모범 답안
        System.out.println(priNum.substring(0, priNum.indexOf("-") + 2));
    }
}
