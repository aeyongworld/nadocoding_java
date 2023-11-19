package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

//        String[] coffees = new String[4];
//        String coffees[] = new String[4];
//        coffees[0] = "아메리카노"; // 0부터 시작
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";


//        String[] coffees = new String[] { "아메리카노", "카페모카", "라떼", "카푸치노" };
        String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노" };

        System.out.println("--------------------------------");


        // 커피 주문
        System.out.println(coffees[0] + " 하나"); // 아메리카노 하나
        System.out.println(coffees[1] + " 하나");
        coffees[2] = "에스프레소"; // 값 변경
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");
        System.out.println("주세요");

        // 다른 자료형?
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] d = new double[] { 10.0, 11.2, 13.5 };
        boolean[] b = {true, false, true};
    }
}
