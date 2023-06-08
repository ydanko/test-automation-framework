package com.wallethub.entity;

import com.wallethub.utils.DataPropertiesUtils;

public class UserInfo {

    public static final String USER_NAME_EMAIL = DataPropertiesUtils.getDataProperties("db.login");
    public static final String PASSWORD = DataPropertiesUtils.getDataProperties("db.password");

    public static User createDefaultUser() {
        return new User(USER_NAME_EMAIL, PASSWORD);
    }

}
