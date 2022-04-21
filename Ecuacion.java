package clase1;

public class Ecuacion{

    public static void main(String[] args){
            double a=2;
            double b=5;
            double c=-7;

            double y1;
            double y2;

            if(Math.pow(b, 2)-(4*a*c)>= 0){

            y1= (-b + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
            y2= (-b + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);

        System.out.println(y1);
        System.out.println(y2);
            }
        else System.out.println("Soluciones  muy complejas");
    }

}