import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ZooMangement zoo = new ZooMangement();
////zoo.displayInfo();
//        int nbrCages;
//        String name;
//        Scanner scanner = new Scanner(System.in);
//
//
//        do {
//            System.out.print("Nom de la cage:");
//            name = scanner.nextLine();
//            if (name.length() == 0) {
//                System.out.println("le nom de doit etre vide");
//            }
//
//
//        } while (name.length() == 0);
//
//
//        do {
//            System.out.print("donner le nombre de cage dans votre zoo: ");
//            nbrCages = scanner.nextInt();
//        }while(nbrCages<=0);
//        zoo.setZooName(name);
//        zoo.setNbrCages(nbrCages);
//        zoo.displayInfo();

//        Zoo zoo1=new Zoo("Belvider","Tunis");
//        Animal animal=new Animal("Lion","Lion",20,true);
//        Animal animal2=new Animal("Tiger","Lion",10,true);
//        Animal animal3=new Animal("Rabbit","Rabbit",10,true);
//        Animal animal4=new Animal("Pig","Pig",10,true);
//        Animal animal5=new Animal("mouton","Rabbit",10,true);
//        Animal animal6=new Animal("Piguin","Pig",10,true);
//        Animal animal7=new Animal("oiseau","Pig",10,true);
//        zoo1.displayZoo();
//        System.out.println(zoo1);
////        System.out.println(zoo1.toString());
//
//        zoo1.addAnimal(animal,zoo1);
//        zoo1.addAnimal(animal2,zoo1);
//        zoo1.addAnimal(animal3,zoo1);
//        zoo1.addAnimal(animal4,zoo1);
//        zoo1.addAnimal(animal5,zoo1);
//        zoo1.addAnimal(animal6,zoo1);
//        zoo1.addAnimal(animal7,zoo1);
//        zoo1.addAnimal(animal5);


//       zoo1.removeAnimal(animal4);
//       zoo1.displayAnimals();
       Aquatic anmal=new Aquatic("piguin","oisaux",23,false,"sea");
       System.out.println(anmal.toString());
       Dolphin d=new Dolphin(10,"papi","poisson",10,true,"sea");
       System.out.println(d.toString());
       Penguin p=new Penguin(20,"yassine","mammiphel",10,true, "sea");
       System.out.println(p.toString());





    }




}