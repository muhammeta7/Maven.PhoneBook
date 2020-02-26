package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    Map<String, List<String>> phoneBookMap;
    List<String> phoneNumbers;

    public PhoneBook() {
        this.phoneBookMap = new LinkedHashMap<>();
        this.phoneNumbers = new ArrayList<>();
    }

    public PhoneBook(Map<String, List<String>> map) {
        this.phoneBookMap = map;
    }

    public void add(String name, String phoneNumber) {
       this.phoneNumbers.add(phoneNumber);
       this.phoneBookMap.put(name, this.phoneNumbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        for (int i = 0; i < phoneNumbers.length ; i++) {
            this.phoneBookMap.put(name, Arrays.asList(phoneNumbers));
        }
    }

    public void remove(String name) {
        this.phoneBookMap.remove(name);
    }

    public Boolean hasEntry(String phoneNumber) {
        return this.phoneNumbers.contains(phoneNumber);
    }

    public List<String> lookup(String name) {
        return this.phoneBookMap.get(name);
    }

    public String reverseLookup(String phoneNumber) {
        for (Map.Entry<String, List<String>> entry : this.phoneBookMap.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        List<String> toAdd = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : this.phoneBookMap.entrySet()) {
            toAdd.add(entry.getKey());
        }
        return toAdd;
    }

    public Map<String, List<String>> getMap() {
        return this.phoneBookMap;
    }

}
