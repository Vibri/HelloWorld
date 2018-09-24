package prog;
import balicek1.*;
import balicek2.*;
public class Program {
        public static void main (String [] args) {
                System.out.println("Start Programu");
                ProgramBalicek1 instance1 = new ProgramBalicek1();
                System.out.println("Zde je ziskany text : "+instance1.ziskejText());
                System.out.println("Zde je soucet 4 a 5 : "+instance1.secti(4,5));
                ProgramBalicek2 instance2 = new ProgramBalicek2();
                System.out.println("Zde je ziskany text : "+instance2.ziskejText("Ahoj"));
                System.out.println("Konec Programu");
        }
}