import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println();
        System.out.println("*****WELCOME TO THE PROPERTY REGISTRATION*****");
        System.out.println();

        System.out.println("You need to enter the Password to start the program... It is for safety, so that any unautharised person can't access the Program");
        System.out.println();
        String password = "IDONTCARE";
        int count=0;
        String finalpassword = "";
        while(count<3){
            if(count==0){
                System.out.print("Enter Password : ");
                String pwd = scn.nextLine();
                if(pwd.equals(password)){
                    finalpassword=pwd;
                    break;
                }
                else{
                    count++;
                }
            }
            else if(count==1){
                System.out.println("Oops you Entered incorrect password, please try again ! ... 2 attempts left ");
                System.out.print("Re-Enter the password: ");
                String pwd = scn.nextLine();
                if(pwd.equals(password)){
                    finalpassword=pwd;
                    break;
                }
                else{
                    count++;
                }
            }
            else if(count==2){
                System.out.println("Oh No! you entered wrong password again !!!, Think before you attempt again because it will be your last attempt ");
                System.out.print("Re-Enter the password: ");
                String pwd = scn.nextLine();
                if(pwd.equals(password)){
                    finalpassword=pwd;
                    break;
                }
                else{
                    count++;
                }
            }

        }

        if(finalpassword.equals(password)){
            Property a[] = new Property[100000000];
            int i = 0;

            boolean Mainflag = true;
            do{
                System.out.print("Do you want to register Data? (Yes/No): ");
                String valid = scn.nextLine();

                if(valid.equals("No")){
                    if(i<1){
                        System.out.println("Oops!!!... You didn't enter any data!, Thanks for Using the Program...");
                    }
                    Mainflag=false;
                }

                else if(valid.equals("Yes")){
                    System.out.println("Yes you can enter data");

                    System.out.print("Enter PropertyID "+(i+1)+": ");
                    String propertyid = scn.nextLine();

                    System.out.print("Enter Owner's Name "+(i+1)+": ");
                    String ownername = scn.nextLine();

                    System.out.print("Enter Property Address "+(i+1)+": ");
                    String propertyaddress = scn.nextLine();

                    Date Currentdate = new Date();
                    String dateofregistration = Currentdate.toString();
                    System.out.println("Current Date "+(i+1)+": "+dateofregistration);

                    String finalpropertytype="";
                    boolean propertytypeflag=false;
                    do{
                        System.out.print("Enter Property type (Residential/Commercial/Industrial/Other) "+(i+1)+": ");
                        String propertytype = scn.nextLine();
                        if(propertytype.equals("Residential")){
                            finalpropertytype=propertytype;
                            propertytypeflag=true;
                        }
                        else if(propertytype.equals("Commercial")){
                            finalpropertytype=propertytype;
                            propertytypeflag=true;
                        }
                        else if(propertytype.equals("Industrial")){
                            finalpropertytype=propertytype;
                            propertytypeflag=true;
                        }
                        else if(propertytype.equals("Other")){
                            finalpropertytype=propertytype;
                            propertytypeflag=true;
                        }
                        else{
                            System.out.println("Please Enter the correct spellings *Residential* *Commercial* *Industrial* *Other* !!!");
                        }
                    }while(propertytypeflag==false);

                    String finalchoosegovid = "";
                    boolean choosegovidflag = false;
                    do{
                        System.out.print("Choose Gov ID (Aadhar Card/Voter Card/Pan Card/Driving Licence) "+(i+1)+": ");
                        String choosegovid=scn.nextLine();

                        if(choosegovid.equals("Aadhar Card")){
                            finalchoosegovid=choosegovid;
                            choosegovidflag=true;
                        }
                        else if(choosegovid.equals("Voter Card")){
                            finalchoosegovid=choosegovid;
                            choosegovidflag=true;
                        }
                        else if(choosegovid.equals("Pan Card")){
                            finalchoosegovid=choosegovid;
                            choosegovidflag=true;
                        }
                        else if(choosegovid.equals("Driving Licence")){
                            finalchoosegovid=choosegovid;
                            choosegovidflag=true;
                        }
                        else{
                            System.out.println("Please Enter Correct Spellings *Aadhar Card* *Voter Card* *Pan Card* *Driving Licence* !!!");
                        }
                    }while(choosegovidflag==false);

                    String finalid="";
                    if(finalchoosegovid.equals("Aadhar Card")){

                        boolean aadharcardflag=false;
                        do{
                            System.out.print("Enter Aadhar Card "+(i+1)+": ");
                            try{
                                long ac = scn.nextLong();
                                scn.nextLine();
                                String aadharcard = Long.toString(ac);
                                if(aadharcard.length()==12 && ac>=0){
                                    finalid=aadharcard;
                                    aadharcardflag=true;
                                }
                                else{
                                    System.out.println("Aadhar Card Number can only have 12 digits and it can't be negative !!!");
                                }
                            }catch(Exception e){
                                System.out.println("Alphabets are not allowed and Aadhar Card must contain 12 numbers !!!");
                                scn.next();
                            }
                        }while(aadharcardflag==false);
                    }

                    else if(finalchoosegovid.equals("Voter Card")){
                        boolean votercardflag=false;
                        do{
                            System.out.print("Enter Voter Card ID "+(i+1)+": ");
                            String votercard = scn.nextLine();
                            if(votercard.length()==10){
                                finalid=votercard;
                                votercardflag=true;
                            }
                            else{
                                System.out.println("Voter ID must contain 10 characters");
                            }
                        }while(votercardflag==false);
                    }

                    else if(finalchoosegovid.equals("Pan Card")){
                        boolean pancardflag=false;
                        do{
                            System.out.print("Enter Pan Card ID "+(i+1)+": ");
                            String pancard = scn.nextLine();
                            if(pancard.length()==10){
                                finalid =pancard;
                                pancardflag=true;
                            }
                            else{
                                System.out.println("Pan Card ID must contain 10 characters");
                            }
                        }while(pancardflag==false);
                    }

                    else if(finalchoosegovid.equals("Driving Licence")){
                        boolean drivinglicenceflag=false;
                        do{
                            System.out.print("Enter Driving Licence ID "+(i+1)+": ");
                            String drivinglicence = scn.nextLine();
                            if(drivinglicence.length()==16){
                                finalid=drivinglicence;
                                drivinglicenceflag=true;
                            }
                            else{
                                System.out.println("Driving Licence must contain 10 characters");
                            }
                        }while(drivinglicenceflag==false);
                    }

                    String finallandarea="";
                    boolean landareaflag=false;
                    do{
                        System.out.print("Enter Land Area in sq guz "+(i+1)+": ");
                        try{
                            double la = scn.nextDouble();
                            scn.nextLine();
                            String landarea= Double.toString(la);
                            if(la>=0){
                                finallandarea=landarea;
                                landareaflag=true;
                            }
                            else{
                                System.out.println("Land Area cannot be -ve");
                            }
                        }catch(Exception e){
                            System.out.println("You cannot enter alphabets to land area !!!");
                            scn.next();
                        }
                    }while(landareaflag==false);

                    System.out.print("Enter Latitude "+(i+1)+": ");
                    String latitude = scn.nextLine();

                    System.out.print("Enter Longitude "+(i+1)+": ");
                    String longitude = scn.nextLine();

                    String originalsaleprice="Rs. ";
                    boolean salepriceflag = false;
                    do{
                        System.out.print("Enter Original Sale Price "+(i+1)+": Rs. ");
                        try{
                            double sp = scn.nextDouble();
                            scn.nextLine();
                            String saleprice = Double.toString(sp);
                            if(sp>=0){
                                originalsaleprice+=saleprice;
                                salepriceflag=true;
                            }
                            else{
                                System.out.println("Sale Price Can not be negative number !!!");
                            }
                        }catch(Exception e){
                            System.out.println("You can not Enter alphabets to Original Sale Price !!!");
                            scn.next();
                        }
                    }while(salepriceflag==false);

                    Property p = new Property(propertyid, ownername, propertyaddress,dateofregistration,finalpropertytype,finalchoosegovid,finalid,finallandarea,latitude,longitude,originalsaleprice);
                    System.out.println(p);
                    System.out.println();

                    a[i]=p;

                    i++;
                }

                else{
                    System.out.println("You can only Type Yes or No ! and Numbers are not allowed");
                }

            }while(Mainflag==true);

            if(i>0){
                System.out.println();
                System.out.println ("**********PROPERTIES REGISTERED**********");
                System.out.println();
                for(int j = 0; j<i; j++){
                    System.out.println(a[j]);
                }
                System.out.println();
                System.out.println("**********Thanks for Using the Program**********");
            }
        }

        else{
            System.out.println();
            System.out.println("**********You can not access this program... Bye Bye !!!...**********");
        }
    }
}
