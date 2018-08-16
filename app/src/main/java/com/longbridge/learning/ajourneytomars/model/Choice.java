package com.longbridge.learning.ajourneytomars.model;

/**
 * Created by EMMA PC on 16/08/2018.
 */

class Choice {
    private int choiceId;
    private int nextPage;

    public Choice(int choiceId, int nextPage) {
        this.choiceId = choiceId;
        this.nextPage = nextPage;
    }

    public int getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(int choiceId) {
        this.choiceId = choiceId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
