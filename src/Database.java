public class Database {
    private String name;
    private static Database instance;

    //synchronized - no more than one thread can call this method
    public static synchronized Database getInstance(String name){
        if(null == instance){
            instance = new Database(name);
        }
        return instance;
    }
//this method (constructor) can only be used in the database class
    private Database(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String text = "Database class\n"+ "Name: " + this.name;
        return text;
    }
}
