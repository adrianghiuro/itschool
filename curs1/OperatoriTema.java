public class OperatoriTema{
    public static void main(String args[]){
        int result1 = add(1,2);
        System.out.println(result1);
        int result2 = subtract(120,1);
        System.out.println(result2);
        int result3 = divide(827,23);
        System.out.println(result3);
        int result4 = multiplication(244,13);
        System.out.println(result4);
        int result5 = rest(7,3);
        System.out.println(result5);
        String result6 = division(7,3);
        System.out.println(result6);
    }
    public static int add(int numar1, int numar2){
     return numar1 + numar2;
    }
    public static int subtract(int numar1, int numar2){
        return numar1 - numar2;
    }
    public static int divide(int numar1, int numar2){
        return numar1 / numar2;
    }
    public static int multiplication(int numar1, int numar2){
        return numar1 * numar2;
    }
    public static int rest(int numar1, int numar2){
        return numar1 % numar2;
    }
    public static String division(int numar1, int numar2){
    int divide = divide(numar1, numar2);
    int rest = rest(numar1, numar2);
        return numar1+"="+numar2+"*"+divide+"+"+rest;
    }
}