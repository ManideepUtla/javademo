public class StudentProfile {
    public String clgName;
    public String studentName;
    public int rollNumber;
    public String dataOfBirth;
    public String phNumber;
    public String bloodGroup;
    public String a="hello";
    public String b="world";
    public String add(){
        String c= a+b;
        System.out.println(c);
        return c;


    }

    public static void main(String[] args){
        StudentProfile profiles = new StudentProfile();
        profiles.clgName="RGUKTN";
        profiles.studentName="Manideep Utla";
        profiles.rollNumber=180605;
        profiles.dataOfBirth="30-10-2002";
        profiles.phNumber="9985533134";
        profiles.bloodGroup="AB+";
        profiles.add();


        System.out.println(profiles.rollNumber);
        System.out.println(profiles.phNumber);







    }

}
