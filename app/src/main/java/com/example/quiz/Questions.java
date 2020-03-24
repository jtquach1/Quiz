package com.example.quiz;

public class Questions {
    // Sample scenario
    public String mScenarios[] = {
            "Janet notices that her daughter Jackie is texting a lot. She wonders if Jackie has a boyfriend. What should Janet do?"
    };

    // Sample choices
    public String mChoices[] = {
            // Mom: Choice A
            "Talk to Jackie.",
            // Mom: Choice B
            "Secretly get Jackie's phone and look at her texts."
    };

    public String mChoicesA[] = {
            // A1
            "Approach Jackie with openness and ability to listen.",
            // A2
            "Approach Jackie nervous and defensive."
    };

    public String mChoicesB[] = {
            // B1
            "She finds out that Jackie is talking to a boy, and will go to Jackie with what she read.",
            // B2
            "Jackie catches her mom reading her text messages."
    };

    public String mDialogueA[] = {
            // A1
            "'Hon, I know you're growing up to be a young woman. If you ever need any advice, well, I'm here!'",
            // A2
            "'I saw you spending too much time on your phone! You shouldn't be talking to boys!'"
    };

    public String mDialogueB[] = {
            // B1
            "'Jackie, what were you thinking? I can't believe you!'",
            // B2
            "'Mom! WHAT are you doing?!'"
    };

    public String mOutcomeA[] = {
            // A1
            "'Thanks, mom.'",
            // A2
            "'Ugh, well what would YOU know?!'"
    };

    public String mOutcomeB[] = {
            // B1
            "Janet and Jackie get into a big argument that doesn't get resolved.",
            // B2
            "Janet and Jackie argue and Jackie doesn't talk to her mom for a few days."
    };

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
            {"Neptune", "Mercury", "Pluto", "Mars"},
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
