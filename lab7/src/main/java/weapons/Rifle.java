package weapons;

public class Rifle extends Weapon  {
    private String name;
    private String ammo;

    public Rifle(String name, String ammo){
        this.name = name;
        this.ammo = ammo;

    }

    @Override
    public void shot() {
        System.out.println("ра-та-та-та");
    }
    @Override
    public String toString(){
        return "Название: "+this.name+" "+this.ammo;
    }
}
