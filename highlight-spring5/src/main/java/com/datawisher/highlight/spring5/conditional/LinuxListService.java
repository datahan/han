package com.datawisher.highlight.spring5.conditional;

public class LinuxListService implements ListService {

    @Override
    public String showListCmd() {
        return "ls";
    }

}
