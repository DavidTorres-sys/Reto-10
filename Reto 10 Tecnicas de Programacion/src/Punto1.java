public class Punto1 {

    private static int sumaEnteros(int x){
        if (x <=0){
            return 0;
        }
        return x%10 + sumaEnteros(x/10);
        
    }
    public static void main(String[]args){
        System.out.println(sumaEnteros(559191543));
    }
}
