public class Zoo {
    Animal[] animals;
    String name;
    String city;
    static final int nbrCages=6;
    int count;
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;

        animals = new Animal[nbrCages];
        this.count=0;
    }
    String getName() {
        return name;

    }
    String getCity() {
        return city;

    }
//    int getNbrCages() {
//        return nbrCages;
//    }
    public void setName(String name) {
        if(name.isEmpty())
        { System.out.println("Invalid name!");}
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
//    public void setNbrCages(int nbrCages) {
//        this.nbrCages = nbrCages;
//
//    }
public void  displayZoo(){
        System.out.println("zoo name est : " +name);
        System.out.println("zoo city est : " +city);
        System.out.println("zoo nbrCages est : " +nbrCages);

}
public String toString(){
    String s = "zoo name est : " + name + " zoo city est " + city + " zoo nbrCages est : " + nbrCages;
    return s;
}
boolean addAnimal(Animal animal,Zoo zoo){
        int i=searchAnimal(animal);
        if(i!=-1){

            System.out.println("deja exist!");
            return false;

        }
        else {
            if (!zooIsFull()) {

                animals[count] = animal;
                count++;
                return true;

            }
            System.out.println("maximum exceeded!");
            return false;
        }



}
void displayAnimals(){
       for(int i=0;i<count;i++){
           System.out.println(animals[i].age+ " " + animals[i].name +" "+ animals[i].family+" "+ animals[i].isMammel);
       }
}
    int searchAnimal(Animal animal){
        if (animal == null){
            return -1;
        }


        for(int i = 0; i < count; i++){

            if(animals[i].name.equals(animal.name)){
                return i;
            }
        }

        return -1;
    }
    int searchAnimal(Animal animal){

        if (animal == null){
            return -1;
        }


        int i = 0;


        for(Animal a : animals){


            if (a != null && a.name.equals(animal.name)){
                return i;
            }
            i++;
        }


        return -1;
    }
int searchAnimal(Animal animal){
 for(int i=0;i<count;i++)
 if animals[i].name.equals(animal.name){
 return i;
    return-1;
 }
public boolean removeAnimal(Animal animal) {


    int index = this.searchAnimal(animal);


    if (index == -1) {
        System.out.println("no animal found!");

        return false;
    }


else{
    for (int i = index; i < count - 1; i++) {

        animals[i] = animals[i + 1];
    }


    animals[count- 1] = null;


    count--;

System.out.println("suppression avec success!");
    return true;
}
    }
    public Boolean zooIsFull() {
        return nbrCages<=this.count;
        }
    }


