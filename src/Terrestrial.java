public class Terrestrial extends Animal {
    public int nbrLegs;
    public Terrestrial(String name, String family, int age, boolean isMammel, int nbrLegs)
        {
        super(name,family,age,isMammel);
        this.nbrLegs=nbrLegs;
        }
}
