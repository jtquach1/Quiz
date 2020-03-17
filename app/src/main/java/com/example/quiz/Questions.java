package com.example.quiz;

public class Questions {
    // Sample questions
    public String mQuestions[] = {
            "Which is the first planet in the Solar system?",
            "Which is the second planet in the Solar system?",
            "Which is the third planet in the Solar system?",
            "Which is the fourth planet in the Solar system?",
            "Which is the fifth planet in the Solar system?",
            "Which is the sixth planet in the Solar system?",
            "Which is the seventh planet in the Solar system?",
            "Which is the eighth planet in the Solar system?",
            "Which is the ninth planet in the Solar system?"
    };

    // Sample choices
    private String mChoices[][] = {
            {"Mercury", "Venus", "Mars", "Saturn"},
            {"Jupiter", "Venus", "Earth", "Neptune"},
            {"Earth", "Jupiter", "Pluto", "Venus"},
            {"Jupiter", "Saturn", "Mars", "Earth"},
            {"Jupiter", "Pluto", "Mercury", "Earth"},
            {"Uranus", "Venus", "Mars", "Saturn"},
            {"Saturn", "Pluto", "Uranus", "Earth"},
            {"Venus", "Mercury", "Pluto", "Mars"},
            {"Mercury", "Venus", "Mars", "Pluto"}
    };

    // Bank of correct answers
    private String mCorrectAnswers[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

    // Get a question based on index in sample questions
    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    // Get a choice for a given question a
    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    // Get the correct answer for a given question a
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
