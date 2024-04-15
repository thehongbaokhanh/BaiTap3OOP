public class test {
    public static void main(String[] args) {
        usingMathClass();
    }
    static void usingMathClass() {
        //Vòng lặp in ra 5 số ngẫu nhiên
        for (int i=0; i<5; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 10 ;
            int randomInt = (int) randomDouble;
            System.out.println("Random number is : " + randomInt);
        }
    }
}
