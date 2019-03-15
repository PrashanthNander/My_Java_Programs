package com.prash;

import java.util.List;

public class Monsters implements IStorageMedium {

    private String monsterName;

    public Monsters(String monsterName) {
        this.monsterName = monsterName;
    }

    @Override
    public List<String> returnSavedList() {
        return null;
    }

    @Override
    public void addObjectsToSave(List<String> addList) {

    }

    @Override
    public String toString() {
        return null;
    }
}
