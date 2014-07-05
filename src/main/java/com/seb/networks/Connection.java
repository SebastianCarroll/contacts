package com.seb.networks;

public class Connection {
    
    private LinkType type;
    private Person first;
    private Person second;
    
    public Connection(Person first, Person second, LinkType type) {
        setType(type);
        setFirst(first);
        setSecond(second);
    }
    
    public LinkType getType() {
        return type;
    }
    public void setType(LinkType type) {
        this.type = type;
    }
    public Person getFirst() {
        return first;
    }
    public void setFirst(Person first) {
        this.first = first;
    }
    public Person getSecond() {
        return second;
    }
    public void setSecond(Person second) {
        this.second = second;
    }
}
