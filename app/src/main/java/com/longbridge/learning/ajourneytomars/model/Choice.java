package com.longbridge.learning.ajourneytomars.model;

/**
 * Created by EMMA PC on 16/08/2018.
 */

public class Choice {
    private int textId;
    private int nextPage;

    public Choice() {
    }

    public Choice(int textId, int nextPage) {
        this.textId = textId;
        this.nextPage = nextPage;
    }


    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
