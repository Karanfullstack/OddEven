public class OddEven {
    public static void main(String[] args) {
        int num = 4;
        if (isOddEven(num))
            System.out.println("The Number is Even");
        else System.out.println("The Number is Odd");
        System.out.println(isOddEven(num));
    }
    public static boolean isOddEven(int num) { // Boolean function initiated..
        boolean flag = false;
        if (num % 2 == 0)
            flag = true;
        return flag;
    }
}


