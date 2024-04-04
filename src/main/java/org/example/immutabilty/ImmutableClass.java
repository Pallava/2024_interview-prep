package org.example.immutabilty;

import java.util.HashSet;
import java.util.Set;

public final class ImmutableClass {
    private final int id;
    private final String name;

    private final Set<String> set;

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", set=" + set +
                '}';
    }

    public ImmutableClass(int id, String name, Set<String> set) {
        this.id = id;
        this.name = name;
        this.set = new HashSet<>(set);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<String> getSet() {
       return new HashSet<>(set); //perform deep copy of object , returns different reference;
       // return set;
    }
}
