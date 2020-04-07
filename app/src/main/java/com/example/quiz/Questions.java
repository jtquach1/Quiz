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
            "Janet and Jackie have a big argument. Jackie doesn't talk to her mom for a few days.",
            // -------------------------------------------------------------------------------------
            // Added 4/7/2020: Pick mom or daughter
            "Who do you want to play as, the mom or the daughter?", // index: 11
            // Scenario
            "Jackie is texting a boy from school. She's getting to know him, and is thinking of getting closer to him. She's worried that her mom might not approve of him. What should Jackie do?",
            // A, B
            "Jackie decides to lie to her mom about how she is hanging out with a girl friend from school. She goes out with the boy and their friends around town. What might happen next?",
            "Jackie decides to tell her mom about the boy she's interested in. How might her mom Janet take this?",
            // A1, A2
            "The boy and her friends joke about kids at school, making fun of people's appearances and bringing up rumors. Jackie doesn't feel comfortable about this, but she doesn't want to lose out on her crush and her only 'friends'. What should she do?",
            "Jackie hangs out with the boy and her friends, but she missed her mom's calls. What might happen next?",
            // A1 outcome, game over
            "Jackie goes along with the joking, and she starts worrying about if she should start wearing clothes that make her crush notice her more.",
            "Jackie doesn't say anything, and she starts feeling left out from her friend group.",
            // A2 outcome, game over
            "Jackie walks home and tries to enter the house quietly, hoping her mom doesn't catch her. Janet confronts her, and they have an argument. ",
            "Jackie calls her mom, telling her that she was out with friends, and forgot to call back. Her mom has a stern talk with her, and decides to pick her up.",
            // B1, B2
            "Janet confronts Jackie about how she is wasting her time, and tells her that she should focus on school.",
            "Janet confronts Jackie, firmly stating the importance of school. But Janet also reassures her that if she is looking for a good partner, that he should be someone that's not just pretty, but shares the same goals as her.",
            // B1 outcome, game over
            "Jackie and Janet get into an argument, and Jackie avoids talking to her mom about anything personal for days.",
            // B2 outcome, game over
            "Jackie is overwhelmed, but grateful that her mom didn't yell at her for having a crush."
    };

    // Sample choices
    private String mChoices[][] = {
            // Scenario
            {"Talk to Jackie.", "Secretly get Jackie's phone and look at her texts.", "", ""},
            // A, B
            {"Approach Jackie with openness and ability to listen.", "Approach Jackie nervous and defensive.", "", ""},
            {"She finds out that Jackie is talking to a boy, and will go to Jackie with what she read.", "Jackie catches her mom reading her text messages.", "", ""},
            // A1, A2
            {"Jackie says, 'Alright. Thanks, mom.'", "Jackie says, 'Don't worry about it, mom.'", "", ""},
            {"Jackie says, 'Ugh, well what would YOU know?!'", "Jackie says, 'You have no idea what you're talking about.'", "", ""},
            // A1 and A2 outcome
            {"Finish game", "", "", ""},
            {"Finish game", "", "", ""},
            // B1, B2
            {"'Jackie, I just went through your phone, and... I want to talk to you about this boy you're seeing.", "'Jackie, you're too young to be doing this!'", "", ""},
            {"'Jackie, I'm your mother. You know I care about you.'", "'I can't believe the way you're showing yourself off to this boy.'", "'Jackie, you're too young to be doing this!'", ""},
            // B1 and B2 outcome
            {"Finish game", "", "", ""},
            {"Finish game", "", "", ""},
            // -------------------------------------------------------------------------------------
            // Added 4/7/2020: Pick mom or daughter
            {"Mom", "Daughter", "", ""},
            // Scenario
            {"Jackie should lie to her mom, since she wouldn't approve of her hanging out with anyone anyways.", "Jackie should tell her mom the truth, that she wants to hang out with a boy.", "", ""},
            // A, B
            {"Jackie thinks about gossiping to fit in with her friends.", "Jackie stays out too late.", "", ""},
            {"Janet freaks out at Jackie.", "Janet reassures Jackie, and gives her advice.", "", ""},
            // A1, A2
            {"Jackie joins in with the gossip.", "Jackie doesn't say anything.", "", ""},
            {"Jackie sneaks into her house.", "Jackie calls her mom to pick her up.", "", ""},
            // A1 and A2 outcome
            {"Finish game", "", "", ""},
            {"Finish game", "", "", ""},
            {"Finish game", "", "", ""},
            {"Finish game", "", "", ""},
            // B1, B2
            {"Jackie says, 'Ugh, you don't get it, mom.'", "Jackie is defensive and tries to ignore her mom.", "", ""},
            {"Jackie says, 'That's.. really old-timey, mom.'", "Jackie says, 'Thanks, mom.'", "", ""},
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
            "Finish game",
            // Added 4/7/2020: Pick mom or daughter
            "Mom",
            "Janet should tell her mom the truth, that she wants to hang out with a boy.",
            "Jackie stays out too late.",
            "Janet reassures Jackie, and gives her advice.",
            "Jackie doesn't say anything.",
            "Jackie calls her mom to pick her up.",
            "Finish game",
            "Finish game",
            "Finish game",
            "Finish game",
            "Jackie says, 'Ugh, you don't get it, mom.'",
            "Jackie says, 'Thanks, mom.'",
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
