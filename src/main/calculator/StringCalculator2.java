package main.calculator;

public class StringCalculator {
    int add(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        //TODO 분기문제거 test code split 참고
//        if (text.contains(",")) {
//            String[] values = text.split(",");
//            int sum = 0;
//            for (String value : values) {
//                sum += Integer.parseInt(value);
//            }
//            return sum;
//        }

        String[] values = text.split(",");
       //TODO 메소드로 빼기
//        int sum = 0;
//        for (String value : values) {
//            sum += Integer.parseInt(value);
//        }
//        return sum;
        return this.sum(values);
    }

    //TODO 단일 책임 원칙을 위한 리팩토링
    /**
     * 현재 sum 메소드는 문자열을 숫자로 바꾸는 행위 + 숫자를 더하는 행위
     * 2가지 일을 하고 있다.
     * => StringCalculator2
     */
    private int sum (String[] values) {
        int sum = 0;
        for (String value : values) {
            sum += Integer.parseInt(value);
        }

        return sum;
    }


}
