package Main;

public class AdminPanel {
    private static AdminPanel instance = null;

    private int version;

    private AdminPanel(){
        version = 2019;
    }

    public static AdminPanel getInstance(){
        if(instance == null){
            instance = new AdminPanel();
        }
        return instance;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
