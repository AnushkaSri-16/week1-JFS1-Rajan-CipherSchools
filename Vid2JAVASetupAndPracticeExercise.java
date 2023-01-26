import java.util.Scanner;

public class Vid2JAVASetupAndPracticeExercise {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Scanner is a class used to take ip from multiples ources, can take input from any input device. eg. touch screen, notepad file, streams, monitors
        //thus we specify-
        //system.in is java representation for keyboard
        
        System.out.println("Enter any number !");
        int num= sc.nextInt();
        sc.close();
        if(num>0){
            System.out.println("+ve");
        }
        else if(num==0){
            System.out.println("Neutral");
        }
        else{
            System.out.println("-ve");
        }
    }
}
