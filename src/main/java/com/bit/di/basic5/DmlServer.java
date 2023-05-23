package com.bit.di.basic5;

public class DmlServer {
    private StateServer stateServer;


    public StateServer getStateServer() {
        return stateServer;
    }

    public void setStateServer(StateServer stateServer) {
        this.stateServer = stateServer;
    }

    public DmlServer() {
        super();
    }

    public DmlServer(StateServer stateServer) {
        super();
        this.stateServer = stateServer;
    }

    @Override
    public String toString() {
        return "DmlServer{" +
                "stateServer=" + stateServer +
                '}';
    }
}
