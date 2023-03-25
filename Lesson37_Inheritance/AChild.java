package Lesson37_Inheritance;

public class AChild extends AParent{

    String isim = "Child isim belirtilmedi";

    protected String ChildKlubu = "Child klubu";

    AChild(){
        System.out.println("AChild constructor calisti");
    }

    public static void main(String[] args) {

        AGrandParent gp1 = new AGrandParent();

        AChild child1 = new AChild();
        child1.ChildKlubu= "Child1";
        child1.parentKlubu= "Child2";


    }
}
