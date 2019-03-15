package com.prash;

import java.util.List;

public class Players implements IStorageMedium {
    private String playerName;

    public Players(String playerName) {
        this.playerName = playerName;
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
