package com.bit.di.basic1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PersonCollection {
    private List<Person> list;
    private Set<Person> set;

    private Map<Integer,Person> map;
    private Properties properties;

    public Map<Integer, Person> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Person> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Set<Person> getSet() {
        return set;
    }

    public void setSet(Set<Person> set) {
        this.set = set;
    }

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PersonCollection{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
