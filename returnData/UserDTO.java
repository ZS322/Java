package returnData;

import java.util.Arrays;

public class UserDTO {

    private String status;
    private String message;
    private User[] data;

    public UserDTO() {

    }

    public UserDTO(String status, String message, User[] data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User[] getData() {
        return data;
    }

    public void setData(User[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
