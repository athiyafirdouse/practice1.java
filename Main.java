public class Main {
    public static void main(String[] args) {
        int in1 = Integer.MIN_VALUE;
        int in2 = Integer.MAX_VALUE;
        System.out.println("signed integers :" + in1 + " ," + in2);
        System.out.println("------------------------------");
        int compare_signed_num = Integer.compare(in1,in2);
        System.out.println("result of comparing unsigned number:" + compare_signed_num);
    }
    
}
