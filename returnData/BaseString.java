package returnData;

public class BaseString {

    private UserDTO userInfo;

    public BaseString(UserDTO userInfo) {
        this.userInfo = userInfo;
    }

    public UserDTO getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserDTO userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {

        return "userInfo:"+userInfo;
    }
}
