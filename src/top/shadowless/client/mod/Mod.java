package top.shadowless.client.mod;

public abstract class Mod {
    private final String name;
    private final boolean enadle;

    public Mod(String name , boolean enadle){
        this.name = name;
        this.enadle = enadle;
    }

    public String getName(){
        return name;
    }

    public boolean isEnadle() {
        return enadle;
    }

    public void render(){}

    public void update(){

    }
    
}
