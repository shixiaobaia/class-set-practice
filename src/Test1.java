import java.util.ArrayList;
import java.util.List;

class Person{
    private String name;
    private Integer age;
    public Person(String name , Integer age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj){
        if(obj==this){
            return true;
        }
        else if(obj==null){
            return false;
        }
        else if(!(obj instanceof  Person)){
            return false;
        }
        //向下转型还原为Person对象
        Person  per=(Person)obj;
        return  this.age.equals(per.age)&&this.name.equals(per.name);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age=age;
    }


    @Override
    public java.lang.String toString() {
        return "name="+name+"age="+age;
    }
}

public class Test1 {
    public static void main(String[] args) {
        List<Person>  list=new ArrayList<>();
        list.add(new Person("xiaohong",25));
        list.add(new Person("saner",5));
        System.out.println(list);
        System.out.println(list.contains(new Person("saner",5)));//用的是equals方法，判断地址是否相同，输出是false
        System.out.println(list.remove(new Person("saner",5)));
        System.out.println(list.size());//结果是2，没删掉，因为equals
    }
}
