package chap_04;

public class _Quiz_04_prac {
    public static void main(String[] args) {
        int hour = 10;
        int fee = hour * 4000;
        boolean lightcar = false;
        boolean disabled = true;

        if(fee > 30000) {
            fee = 30000;
        }

        if(lightcar || disabled) {
            fee = (int) (fee * 0.5f);
        }

        System.out.println("주차요금은 " + fee + "원입니다.");
    }
}
