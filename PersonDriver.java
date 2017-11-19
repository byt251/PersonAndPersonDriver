
public class PersonDriver {
    public static void main(String []args){
        Person Beth=new Person();
        System.out.println(Beth);
        Beth.setName("Beth");
        Beth.setAge(22);
        System.out.println(Beth.getName());
        System.out.println(Beth.getAge());

        Person Hanna= new Person("Hanna", 14);
        if (Beth.getName().equals(Hanna.getName()) && (Beth.getAge()==Hanna.getAge())){
            System.out.println("Two persons have same name and age");
        }
        else if(Beth.getAge()>Hanna.getAge()){
            System.out.println("Beth is older than Hanna");
        }
        else if(Hanna.getAge()>Beth.getAge()){
            System.out.println("Hanna is older than Beth");
        }
        else{System.out.println("Two persons do not have same name and age");}
    }
}
