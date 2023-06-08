package com.wallethub.utils;

public class ConstantUtils {
    public static final String BASE_URL = DataPropertiesUtils.getDataProperties("db.host");
    public static final String PROFILE_COMPANY_URL = DataPropertiesUtils.getDataProperties("db.profile_page");
    public static final String ONE_STAR_RATING = "1";
    public static final String TWO_STAR_RATING = "2";
    public static final String THREE_STAR_RATING = "3";
    public static final String FOUR_STAR_RATING = "4";
    public static final String FIVE_STAR_RATING = "5";
    public static final String VALUE_POLICY = "Health Insurance";
    public static final int WAIT_TIMEOUT_SECONDS = 3;

 }
