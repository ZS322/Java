package returnData;

import com.google.gson.Gson;

import java.util.*;

public class TestGson {

    public static String gZ() {

        Set<User> userList = new HashSet<>();

        String[] name = {"小梁", "俊哥", "直视"};

        String[] address = {"广东", "湛江", "霞山"};

        for (int i = 0; i < 3; i++) {
            userList.add(new User(name[i], address[i]));
        }

        //把集合转成数组
        User[] getUserArr = userList.toArray(new User[]{new User()});

        UserDTO getUserDTO = new UserDTO("200", "成功", getUserArr);

//        BaseString returnData = new BaseString(getUserDTO);

        Map<String, Object> returnData = new HashMap<>();

        returnData.put("userInfo", getUserDTO);

        Gson gson = new Gson();

        String jsonData = gson.toJson(returnData);

        return jsonData;
    }


    public static void main(String[] args) {

        String jsonData = gZ();

        Gson gson = new Gson();
        BaseString bs = gson.fromJson(jsonData, BaseString.class);

        UserDTO userInfo = bs.getUserInfo();

        if ("200".equals(userInfo.getStatus())) {

            User[] getUserData = userInfo.getData();

            Set<User> set = new HashSet<>();

            for (int i = 0; i < getUserData.length; i++) {
                set.add(getUserData[i]);
            }

            set.forEach(System.out::println);


            Iterator<User> it = set.iterator();

            while (it.hasNext()) {

                User getUser = it.next();

                System.out.println(getUser.getUserName() + "---" + getUser.getAddress());
            }
        }else{
            System.out.println("查询成功"+"记录为空");
        }


    }

}
