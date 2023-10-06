package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        // 내가 푼 거
        int height = 121;
        String s = (height >= 120) ? "키가 " + height + "cm 이므로 탑승 가능합니다" : "키가 " + height + "cm 이므로 탑승 불가능합니다";
        System.out.println(s);


        // 모범답안
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result);

    }

}
