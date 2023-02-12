import java.util.Scanner;

public class Redondeo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("INTRODUCE UN numero DECIMAL");
  int redondeo;
  double numero=sc.nextDouble();
  redondeo=(int)(numero+0.5);
        System.out.println("este es redondeo " + redondeo);

    }
}
