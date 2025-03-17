public class Main {

    public static void main(String[] args){

        int armsNum = 0;

        while (armsNum <= 10000) {
            int armsNumNumeric = 0;
            String numStr = Integer.toString(armsNum);

            for (char ch : numStr.toCharArray()) {
                int digit = Character.getNumericValue(ch);
                armsNumNumeric += Math.pow(digit, numStr.length());
            }

            if (armsNumNumeric == armsNum) {
                System.out.println(armsNum);
            }

            armsNum += 1;
        }


    }
}
