package com.myapplicationdev.android.tw_listview;

public class Module {

    private String id;
    private boolean prog;

    public Module(String id, boolean prog) {
        this.id = id;
        this.prog = prog;
    }

    public String getId() {
        return id;
    }

    public boolean isProg() {
        return prog;
    }
}
