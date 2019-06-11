public class MethodTwoPar {
        public static void main(String args[]){
            String message = doSomething("Paul has " );
            int second = doSomethingElse(3);
            System.out.println(message + second + " years.");
        }

        public static String doSomething(String name){
         return name;
        }
        public static int doSomethingElse(int age){
            return age;
        }
    }
