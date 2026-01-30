public class Animal {
    public String name;
    public String family;
    public int age;
    boolean isMammel;
    Animal() { }
    Animal(String name, String family, int age, boolean isMammel) {
        this.name=name;
        this.family=family;
        this.age=age;
        this.isMammel=isMammel;

    }
    String getName() {
        return name;
    }
    String getFamily() {
        return family;

    }
    int getAge(){
        return age;

    }
    boolean isMammel(){
        return isMammel;
    }
    public void setName(String name){
        this.name=name;

    }
    public void setFamily(String family){
        this.family=family;
    }
    public void setAge(int age){
        if(age<0||age>100){
            System.out.println("Invalid age!");
        }
        this.age=age;

    }
    public void setIsMammel(boolean isMammel){
        this.isMammel=isMammel;
    }
    public String toString(){
        String s= "le nom est" + name + "famille :" + family + "age :" + age + "is mammel :" + isMammel;
        return s;
    }
}
