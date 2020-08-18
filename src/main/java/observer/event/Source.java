package observer.event;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public class Source {

    private String userName;

    private String password;

    public Source(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
