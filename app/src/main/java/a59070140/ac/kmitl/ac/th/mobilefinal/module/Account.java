package a59070140.ac.kmitl.ac.th.mobilefinal.module;

public class Account {

    private static Account accountInstance;

    private int primaryid;
    private String username = null;
    private String password;
    private String name;
    private String age;

    private Account() {}

    public static Account getAccountInstance() {
        if (accountInstance == null) {
            accountInstance = new Account();
        }
        return accountInstance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPrimaryid() {
        return primaryid;
    }

    public void setPrimaryid(int primaryid) {
        this.primaryid = primaryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
