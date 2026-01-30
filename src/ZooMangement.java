public class ZooMangement {
    public int nbrCages;
    public String zooName;
    ZooMangement(){}
    ZooMangement(int nbrCages,String zooName){
        this.nbrCages=nbrCages;
        this.zooName=zooName;
    }
    int getNbrCages(){
        return nbrCages;
    }
    String getZooName(){
        return zooName;
    }
    void setNbrCages(int nbrCages)
    {
        this.nbrCages=nbrCages;

    }
    void setZooName(String zooName)
    {
        this.zooName=zooName;
    }

    public void displayInfo() {
        System.out.println("Zoo Name: " + " " +   zooName +" "+"Comporte " + nbrCages +" Cages");
        // Correct variable name: 'nbrCages' instead of 'nbrCage'
//        System.out.println("Number of Cages: " + nbrCages);
    }


}
