package com.rejasupotaro.rejamotionapp;

public final class Constants {
    public static final boolean PRODUCTION = true;
    public static final String DOMAIN = PRODUCTION ? "rejasupotaro.com" : "192.168.3.2:3000";
    public static final String APP_SITE_URL = "http://" + DOMAIN;
    public static final String API_GENERATE_GIF_URL = APP_SITE_URL + "/api/upload";

}