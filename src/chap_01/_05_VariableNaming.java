package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "동주"; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "2001-07-14"; // 생년월일
        String residentialAddress = "냥냥 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE657"; // 항공 편명
        String _flightNo = "KE657"; // 밑줄 시작
        String flight_no_2 = "KE657"; // 밑줄과 숫자 포함
//        String -flightNo = "KE657";

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        String itme1 = "시계";
        String item2 = "가방";
//        String 3item = "전자제품";

        // 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 때)
        int i = 0;
        String s = "";
        String str = "";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}