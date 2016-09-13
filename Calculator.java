package calculator;


public class Calculator {

    
    public static void main(String[] args) {
      
    add(5,6);
    sub(5,2);
    }
    
    public static int add(int x, int y){
        int total = x + y;
        System.out.println(total);   
        return total;
    }
    public static int sub(int x, int y){
        int total = x - y;
        System.out.println(total);   
        return total;
    
    
}
