public class Aquatic extends Animal {
    public String habitat;
    Aquatic(String name,String family,int age,boolean isMammel, String habitat) {
        super(name,family,age,isMammel);
        this.habitat=habitat;
    }
@Override  public String toString(){
        String s=super.toString();
        s+= "habitat: "+habitat;
        return s;

}
}
