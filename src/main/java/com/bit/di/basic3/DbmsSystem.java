package com.bit.di.basic3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DbmsSystem {
    //또다른 파일이 있을수도 있으므로 구분해서 사용한다 -> 소대문자 구분해서 같아야 한다 bit.com적는 이유는
    //같은 서버가 있을수도 있으니까 구분하기 위함
    @Value("${bit.com.serverName}")
    private String serverName;
    @Value("${bit.com.serverPort}")
    private int serverPort;
    @Value("${bit.com.serverUrl}")
    private String serverUrl;
    @Value("${bit.com.connectionCount}")
    private int connectionCount;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(int connectionCount) {
        this.connectionCount = connectionCount;
    }

    public DbmsSystem() {
        System.out.println("DbmsSystem");
    }

    @PostConstruct
    public void initDbms(){
        System.out.println("initDbms");
    }
    @PreDestroy
    public void destroyDbms(){
        System.out.println("destroyDbms");
    }

    public DbmsSystem(String serverName, int serverPort, String serverUrl, int connectionCount) {
        super();
        this.serverName = serverName;
        this.serverPort = serverPort;
        this.serverUrl = serverUrl;
        this.connectionCount = connectionCount;
    }



    @Override
    public String toString() {
        return "DbmsSystem{" +
                "serverName='" + serverName + '\'' +
                ", serverPort=" + serverPort +
                ", serverUrl='" + serverUrl + '\'' +
                ", connectionCount=" + connectionCount +
                '}';
    }
}
