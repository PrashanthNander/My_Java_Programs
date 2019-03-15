package com.prash;

import java.util.List;

public interface IStorageMedium {
    List<String> returnSavedList();
    void addObjectsToSave(List<String> addList);
}
