package com.bit.di.basic3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServerSystem {
    @Autowired
    private DbmsSystem db;

    //@Autowired
    public ServerSystem() {
        super();
    }

    //@Autowired
    public ServerSystem(DbmsSystem db) {
        super();
        this.db = db;
    }

    public DbmsSystem getDb() {
        return db;
    }

    public void setDb(DbmsSystem db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return "ServerSystem{" +
                "db=" + db +
                '}';
    }
}
