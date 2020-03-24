package com.example.quiz;

public class Questions {
    // Sample questions
    public String mQuestions[] = {
            // Scenario
            "Janet notices that her daughter Jackie is texting a lot. She wonders if Jackie has a boyfriend. What should Janet do?",
            // A, B
            "Janet decides to talk to Jackie about her texting habits. How should she approach Jackie?",
            "Janet secretly gets Jackie's phone and looks at her texts. What might happen next?",
            // A1, A2
            "Janet approaches Jackie, saying 'I know you're growing up to be a young woman. If you ever need any advice, well, I'm here!'. How might Jackie respond?",
            "Janet approaches Jackie, saying 'I saw you spending too much time on your phone! You shouldn't be talking to boys!'. How might Jackie respond?",
            // A1 outcome, game over
            "After Janet offers Jackie some emotional support, Jackie feels like she can trust her mom.",
            // A2 outcome, game over
            "Janet and Jackie get into an argument, and Jackie walks away.",
            // B1, B2
            "Janet approaches Jackie about what she read on her phone. What might Janet say?",
            "Jackie catches her mom reading her texts, saying 'Mom, WHAT are you doing?! Stop going through my phone!'. How might Janet respond?",
            // B1 outcome, game over
            "Janet and Jackie have a big argument that doesn't get resolved.",
            // B2 outcome, game over
            "Janet and Jackie have a big argument. Jackie doesn't talk to her mom for a few days."
    };

    // Sample choices
    private String mChoices[][] = {
            // Scenario
            {"Talk to Jackie.", "Secretly get Jackie's phone and look at her texts.", "", ""},
            // A
            {"Approach Jackie with openness and ability to listen.", "Approach Jackie nervous and defensive.", "", ""},
            // B
            {"She finds out that Jackie is talking to a boy, and will go to Jackie with what she read.", "Jackie catches her mom reading her text messages.", "", ""},
            // A1
            {"Jackie says, 'Alright. Thanks, mom.'", "Jackie says, 'Don't worry about it, mom.'", "", ""},
            // A2
            {"Jackie says, 'Ugh, well what would YOU know?!'", "Jackie says, 'You have no idea what you're talking about.'", "", ""},
            // A1 and A2 outcome
            {"Finish game", "", "", ""},
            {"Finish game", "", "", ""},
            // B1
            {"'Jackie, I just went through your phone, and... I want to talk to you about this boy you're seeing.", "'Jackie, you're too young to be doing this!'", "", ""},
            // B2
            {"'Jackie, I'm your mother. You know I care about you.'", "'I can't believe the way you're showing yourself off to this boy.'", "'Jackie, you're too young to be doing this!'", ""},
            // B1 and B2 outcome
            {"Finish game", "", "", ""},
            {"Finish game", "", "", ""},
    };

    // Bank of correct answers, or with "least worst options"
    private String mCorrectAnswers[] = {
            "Talk to Jackie.",
            "Approach Jackie with openness and ability to listen.",
            "She finds out that Jackie is talking to a boy, and will go to Jackie with what she read.",
            "Jackie says, 'Alright. Thanks, mom.'",
            "Jackie says, 'Ugh, well what would YOU know?!'",
            "Finish game",
            "Finish game",
            "'Jackie, I just went through your phone, and... I want to talk to you about this boy you're seeing.",
            "'Jackie, I'm your mother. You know I care about you.'",
            "Finish game",
            "Finish game"
    };

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
