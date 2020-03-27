package com.martinez;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
    }

    public String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    public String findIpAddress(address) {
        return "127.0.0.1";
    }
}
