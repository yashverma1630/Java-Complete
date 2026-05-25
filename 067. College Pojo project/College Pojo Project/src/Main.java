import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("how many entries you want ? ");
        System.out.print("Enter here : ");
        int n = scn.nextInt();
        scn.nextLine();

        Student a[] = new Student[n];

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.print("Enter First Name"+(i+1)+": ");
            String firstname = scn.nextLine();
//            System.out.println();
            System.out.print("Enter Middle Name"+(i+1)+": ");
            String middlename = scn.nextLine();
            System.out.print("Enter Last Name"+(i+1)+": ");
            String lastname = scn.nextLine();
            System.out.print("Enter Date of Birth"+(i+1)+": ");
            String dateofbirth = scn.nextLine();
            System.out.print("Enter Email"+(i+1)+": ");
            String email = scn.nextLine();

            String phonefinal = "";
            boolean phoneflag = false;
            do{
                System.out.print("Enter phone"+(i+1)+": ");
                String phone = scn.nextLine();
                try{
                    Long ph = Long.parseLong(phone);
                    if(phone.length()==10 && ph>=0){
                        phonefinal = phone;
                        phoneflag=true;
                    }
                    else{
                        System.out.println("phone number must be of 10 digits and can't be -ive ");
                    }
                }catch(Exception e){
                    System.out.println("you cannot enter alphabets to phone number and phone number must contain 10 digits");
                }
            }while(phoneflag==false);

            String genderfinal="";
            boolean gflag = false;
            do{
                System.out.print("Enter Gender (Male/Female/Others)"+(i+1)+": ");
                String gender=scn.nextLine();

                if(gender.equals("Male")){
                    genderfinal=gender;
                    gflag=true;
                }
                else if(gender.equals("Female")){
                    genderfinal=gender;
                    gflag=true;
                }
                else if(gender.equals("Others")){
                    genderfinal=gender;
                    gflag=true;
                }
                else{
                    System.out.println("Please enter correct spellings *Male* *Female* *Others*");
                }
            }while(gflag==false);

            String citizenshipfinal="";
            boolean citizenflag=false;
            do{
                System.out.print("Enter Citizenship(India, USA, Canada, Australia)"+(i+1)+": ");
                String citizenship = scn.nextLine();

                if(citizenship.equals("India")){
                    citizenshipfinal=citizenship;
                    citizenflag=true;
                }

                else if(citizenship.equals("USA")){
                    citizenshipfinal=citizenship;
                    citizenflag=true;
                }
                else if(citizenship.equals("Canada")){
                    citizenshipfinal=citizenship;
                    citizenflag=true;
                }
                else if(citizenship.equals("Australia")){
                    citizenshipfinal=citizenship;
                    citizenflag=true;
                }
                else{
                    System.out.println("Please Enter correct spellings *India*, *USA*, *Canada*, *Australia*");
                }
            }while(citizenflag==false);

            System.out.print("Enter Address"+(i+1)+": ");
            String address = scn.nextLine();

            String secondaryschoolfinal="";
            boolean schoolflag=false;
            do{
                System.out.print("Enter Secondary School Percentage"+(i+1)+": ");
                String secondaryschool = scn.nextLine();
                try{
                    Double sec = Double.parseDouble(secondaryschool);
                    if(sec<=100 && sec>=0){
                        secondaryschoolfinal=secondaryschool;
                        schoolflag=true;
                    }
                    else{
                        System.out.println("Percentage should be 0 to 100 !");
                    }
                }catch(Exception e){
                    System.out.println("Percentage only includes digits from 0 to 100... Alphabets are not allowed !!!");
                }
            }while(schoolflag==false);

            String cgpafinal="";
            boolean cgpaflag=false;
            do{
                System.out.print("Enter University CGPA"+(i+1)+": ");
                String cgpa = scn.nextLine();
                try{
                    Double cg = Double.parseDouble(cgpa);
                    if(cg<=10 && cg>=0){
                        cgpafinal=cgpa;
                        cgpaflag=true;
                    }
                    else{
                        System.out.println("CGPA should be between 0 to 10 !");
                    }
                }catch(Exception e){
                    System.out.println("CGPA only includes digits from 0 to 10... Alphabets are not allowed !!!");
                }
            }while(cgpaflag==false);

            Student s = new Student(firstname, middlename, lastname, dateofbirth, email, phonefinal, genderfinal, citizenshipfinal, address, secondaryschoolfinal, cgpafinal);
            System.out.println(s);

            a[i] = s;
        }

//        System.out.println(Arrays.toString(a));

        System.out.println();
        System.out.println("***** Final Data *****");
        for(int j = 0 ; j<n; j++){
            System.out.println(a[j]);
        }
    }
}
