package main.calculator;

public class StringCalculator2 {
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
        return this.sum(this.toInts(values));
    }

    /**
     * 문자열 배열 값을 받아 숫자배열로 바꾸는 메소드
     */
    private int[] toInts(String[] values) {
        int numbers[] = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }

    /**
     * 숫자배열을 받아 합을 구하는 메소든
     */
    private int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }


}
