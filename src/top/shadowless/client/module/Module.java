package top.shadowless.client.module;

public class Module {
    private String name;
    private int Keycode;
    private Category category;

    private boolean toggle;

    public Module(String name, int keycode, Category category) {
        this.name = name;
        this.Keycode = Keycode;
        this.category = category;
        this.toggle = false;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public void setKeycode() {
        this.Keycode = Keycode;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public boolean isToggle() {
        return toggle;
    }
    public void setToggle(boolean toggle) {
        this.toggle = toggle;
    }
    public void toggle() {
        this.toggle = !this.toggle;
        if(this.toggle)
            onEnable();
        else
            onDisable();

    }
    public void onEnable() {

    }
    public void onDisable() {

    }
}