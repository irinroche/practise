class Teacher{
    String name;
    String subject;
    Teacher(String name,String subject){
        this.name = name;
        this.subject = subject;
    }
    void display(){
        System.out.println("Name:"+name+" Subject:"+subject);
    }
}
class Assistant_Prof extends Teacher{
    String a_name;
    Assistant_Prof( String name,String subject, String a_name) {
        super(name,subject);
        this.a_name=a_name;
    }
    void display(){
        System.out.println("Assitant Professor Name:"+a_name+" Under Supervisiom:"+name+" Subject:"+subject);
    }


}
public class Q3 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Swasti","Maths");
        Assistant_Prof a1 = new Assistant_Prof("Anshula","Sherine", "Maths");
        Teacher t2 = new Teacher("Irin","Biology");
        Assistant_Prof a2 = new Assistant_Prof("Mayuri","Pradnya","Biology");
        System.out.println("Teachers:");
        t1.display();
        t2.display();
        System.out.println("Assistant Professors:");
        a1.display();
        a2.display();
    }
}
