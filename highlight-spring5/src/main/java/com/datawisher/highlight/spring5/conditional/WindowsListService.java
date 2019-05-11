package com.datawisher.highlight.spring5.conditional;

public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }

}
