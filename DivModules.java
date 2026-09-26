public class DivModules {
    public static void main(String[] args) {

    int x=-24356;
    int y=125;
    System.out.println();
    System.out.println("floor division using '/' operators:" + (x/y));
    System.out.println("floor division using floorDiv() method is :" + Math.floorDiv(x,y));
    System.out.println();
    System.out.println("floor modules using '%' opertator:" + (x % y));
    System.out.println("floor modules using floorMod() method is :" + Math.floorMod(x,y));
    
}
}
