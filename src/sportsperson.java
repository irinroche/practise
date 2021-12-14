class sportsperson{
    String Name;
    int age;
    int years;
    sportsperson(String Name,int age,int years){
        this.Name = Name;
        this.age = age;
        this.years =years;
    }
}
class athlete extends sportsperson{
    String event;
    athlete(String Name,int age,int years,String event){
        super( Name,age,years);
        this.event=event;
    }
    void display(){
        System.out.println("Name: "+Name+" Age:"+age+" Years of playing:"+years+" Event:"+event);
    }
}
class hockey extends sportsperson{
    int goals;
    hockey(String Name,int age,int years,int goals){
        super( Name, age, years);
        this.goals=goals;
    }
    void display() {
        System.out.println("Name: " + Name + " Age:" + age + " Years of playing:" + years + " Goals:" +goals);
    }
}
public class Q7 {
    public static void main(String[] args) {
        athlete j = new athlete("Joey",30,6,"Pivot");
        athlete a = new athlete("Angela",26,4,"Scranton");
        hockey ji = new hockey("Jim",25,2,24);
        hockey m = new hockey("Monica",27,5,39);
        System.out.println("Athletes:");
        j.display();
        a.display();
        System.out.println("Hockey:");
        ji.display();
        m.display();
    }
}
