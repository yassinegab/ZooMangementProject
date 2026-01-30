public class Dolphin extends Aquatic {
    public float swimmingSpeed;
    public Dolphin(float swimmingSpeed,String name, String familiy, int age, boolean isMammel, String habitat  ) {
        super(name,familiy,age,isMammel,habitat);
        this.swimmingSpeed=swimmingSpeed;

    }
    @Override  public String toString(){
        return super.toString()+"swimming speed: "+swimmingSpeed;
    }
}
