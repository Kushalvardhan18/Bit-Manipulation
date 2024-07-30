public class CheckEvenOrOdd {
    public static void oddOrEven(int n){
        int bitMask =1;
        if((n& bitMask) ==0){
            System.out.println("Even");
        }if((n& bitMask) !=0){
            System.out.println("Odd");
        }

    }
    public static void main(String[] args){
        // LSB =0 ----> Evem
        // LSB =1 ----> Odd
        oddOrEven(3);
        oddOrEven(13);
        oddOrEven(8);
    }
}
