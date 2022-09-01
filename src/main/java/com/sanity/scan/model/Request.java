package com.sanity.scan.model;

public class Request<T> {
    private T data;
    private String ip;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Request{" +
                "data=" + data +
                ", ip='" + ip + '\'' +
                '}';
    }
}
