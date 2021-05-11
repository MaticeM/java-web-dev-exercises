package org.launchcode.java.studio.Quiz;

public abstract class Question {

    private String theQuestion;
    private String theAnswer;

    public Question (String theQuestion, String theAnswer) {
        this.theQuestion = theQuestion;
        this.theAnswer = theAnswer;
    }

    public String getTheQuestion() {
        return this.theQuestion;
    }

    public String getTheAnswer() {
        return this.theAnswer;
    }

    public abstract boolean checkAnswer(String theAnswer);
}
