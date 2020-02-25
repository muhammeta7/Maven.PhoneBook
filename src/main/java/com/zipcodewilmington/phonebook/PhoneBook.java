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
        this.phoneBookMap = new LinkedHashMap<>(map.size());
        this.phoneBookMap.putAll(map);
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

    public Boolean hasEntry(String name) {
        if(this.phoneBookMap.containsKey(name)){
            return true;
        }
        if(this.phoneBookMap.values().contains(name)){
            return true;
        }
        if(this.phoneNumbers.contains(name)){
            return true;
        }
        return false;
    }

    public List<String> lookup(String name) {
        return this.phoneBookMap.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return this.phoneBookMap;
    }


}
