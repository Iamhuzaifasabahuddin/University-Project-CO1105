import  java.util.Scanner;
public class Studentmajor {
    public static void main(String[] args){
        String subject = null , level = null;
        Scanner inputScan = new Scanner(System.in);
        System.out.println("M: Mathematics\nC: Computer Science\nI: Information Technology");
        System.out.println("Enter subject: ");
        String subj = inputScan.next().toUpperCase();
        if(subj.startsWith("M")){
            subject = "Mathematics";
        }
        else if(subj.startsWith("C")){
            subject = "Computer Science";
            
        } else if (subj.startsWith("I")) {
            subject = "Information Technology";
        }

        if (subj.endsWith("1")){
            level = "Freshman";

        }
        else if (subj.endsWith("2")){
            level = "sophomore";
        }
        else if (subj.endsWith("3")){
            level = "junior";
        }
        else if (subj.endsWith("4")){
            level = "senior";
        }
        if (subject != null && level != null) {
            System.out.println("Subject details are: ");
            System.out.println(subject +" "+level);
        }
        else {
            System.out.println("Invalid subject details");
        }

    }


}

