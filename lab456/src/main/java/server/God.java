package server;


public class God {

    private int id;
    private String name;
    private String culture;
    private String power;
    private String god_of;

    public God(int id, String name, String culture, String power, String god_of) {
        this.id = id;
        this.name = name;
        this.culture = culture;
        this.power= power;
        this.god_of = god_of;
    }
    public int getid() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCulture() {
        return culture;
    }
    public String getPower() {
        return power;
    }
    public String getGod_of() {
        return god_of;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCulture(String culture) {
        this.culture = culture;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public void setId(int Id) {
        this.id = id;
    }
    public void setGod_of(String god_of) {
        this.god_of = god_of;
    }
    public void addPower (String new_power){
         this.power = this.power.concat(new_power);
    }
    public void addGod_of (String new_god_of){
        this.god_of = this.god_of.concat(new_god_of);
    }

    @Override
    public String toString() {
        return "Ancient GOD " + name + " from " + culture + " culture, " + power + ". God of " + god_of;
    }
}
