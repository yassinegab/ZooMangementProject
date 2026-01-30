public class Penguin extends Aquatic{
    public float swimmingSpeed;
    Penguin(float swimmingSpeed,String name,String family,int age,boolean isMammel,String habitat){
        super(name,family,age,isMammel,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
   @Override public String toString(){
        return super.toString()+"swimming speed: "+swimmingSpeed;
    }
}
