package com.example.android.movieandtvmusicintrosquiz;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.checked;


import static android.R.attr.name;
import static android.R.attr.x;
import static android.R.id.message;
import static com.example.android.movieandtvmusicintrosquiz.R.raw.question1;


public class MainActivity extends AppCompatActivity {

    MediaPlayer questionMusic = new MediaPlayer();  // Media Player has a global scope so that the multiple song clips cannot be played at the same time (Multiple Instances)


    //String variables with global scope to store the answers given
    String answerQuestion1 = "no answer", answerQuestion2 = "no answer", answerQuestion3 = "no answer", answerQuestion4 = "no answer", answerQuestion5 = "no answer", answerQuestion6 = "no answer", answerQuestion7 = "no answer", answerQuestion8 = "no answer", answerQuestion9 = "no answer", righOrWrongAnswerQ10 = "";


    //Boolean variables with global scope to store results of Checkbox answers for Question 10
    Boolean answerQuestion10a, answerQuestion10b, answerQuestion10c, answerQuestion10d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String appIntroText;
        appIntroText = "Welcome to my Movie and TV theme music intros quiz\n\n";
        appIntroText = appIntroText + "There are 10 Questions listed below to test your knowledge\n\n";
        appIntroText = appIntroText + "Click the Submit Answers Button at the bottom when you are done \n\n";
        appIntroText = appIntroText + "There's also a Check Answers button to see what ones you get wrong\n\n";
        appIntroText = appIntroText + "Know your TV and Movie Music? \n\n";
        appIntroText = appIntroText + "Fancy yourself as an expert?.... Well, let's see! \n\n";
        appIntroText = appIntroText + "Good Luck!... \n";

        TextView appIntro = (TextView) findViewById(R.id.intro_text);

        appIntro.setText(appIntroText);


    }


    /**
     * THis method is called when the PLay intro is clicked for any Questin
     *
     * @param v is the Button view that is passed in for the PLay introl button on the question
     */

    public void playIntro(View v) {


        switch (v.getId()) {  // Get the ID of the Intro Button Clicked, then  play the music intro based on the button clicked with the below switch block


            case (R.id.question_one_button):


                if (!questionMusic.isPlaying()) {
                    questionMusic = MediaPlayer.create(this, question1);
                    questionMusic.start();

                }

                break;

            case (R.id.question_two_button):


                if (!questionMusic.isPlaying()) {
                    questionMusic = MediaPlayer.create(this, R.raw.question2);
                    questionMusic.start();


                }

                break;

            case (R.id.question_three_button):


                if (!questionMusic.isPlaying()) {
                    questionMusic = MediaPlayer.create(this, R.raw.question3);
                    questionMusic.start();


                }

                break;

            case (R.id.question_four_button):


                if (!questionMusic.isPlaying()) {
                    questionMusic = MediaPlayer.create(this, R.raw.question4);
                    questionMusic.start();


                }

                break;

            case (R.id.question_five_button):


                if (!questionMusic.isPlaying()) {
                    questionMusic = MediaPlayer.create(this, R.raw.question5);
                    questionMusic.start();


                }

                break;

            case (R.id.question_six_button):


                if (!questionMusic.isPlaying()) {
                    questionMusic = MediaPlayer.create(this, R.raw.question6);
                    questionMusic.start();


                }

                break;

            case (R.id.question_seven_button):


                if (!questionMusic.isPlaying()) {
                    questionMusic = MediaPlayer.create(this, R.raw.question7);
                    questionMusic.start();


                }

                break;

            case (R.id.question_eight_button):


                if (!questionMusic.isPlaying()) {
                    questionMusic = MediaPlayer.create(this, R.raw.question8);
                    questionMusic.start();


                }
                break;

            case (R.id.question_nine_button):


                if (!questionMusic.isPlaying()) {
                    questionMusic = MediaPlayer.create(this, R.raw.question9);
                    questionMusic.start();


                }

                break;

            case (R.id.question_ten_button):


                if (!questionMusic.isPlaying()) {
                    questionMusic = MediaPlayer.create(this, R.raw.question10);
                    questionMusic.start();


                }

                break;

        }


    }

    /**
     * THis method is called when Question 1 is answered
     *
     * @param view is the radio button selected for question 1
     */

    public void submitQuestion1Answer(View view) {

        //Declare Radio Button Objects for Question 1 Answer Options

        RadioButton option1Q1 = (RadioButton) findViewById(R.id.star_wars_1);
        RadioButton option2Q1 = (RadioButton) findViewById(R.id.star_wars_2);
        RadioButton option3Q1 = (RadioButton) findViewById(R.id.star_wars_7);
        RadioButton option4Q1 = (RadioButton) findViewById(R.id.star_wars_4);

        //Conditional block for answer selected
        if (option1Q1.isChecked()) {
            answerQuestion1 = option1Q1.getText().toString(); // global variable answerQuestion1 assigned text value of answer selected

        } else if (option2Q1.isChecked()) {
            answerQuestion1 = option2Q1.getText().toString(); // global variable answerQuestion1 assigned text value of answer selected

        } else if (option3Q1.isChecked()) {
            answerQuestion1 = option3Q1.getText().toString(); // global variable answerQuestion1 assigned text value of answer selected

        } else if (option4Q1.isChecked()) {
            answerQuestion1 = option4Q1.getText().toString(); // global variable answerQuestion1 assigned text value of answer selected
        }

    }

    /**
     * This method is called when Question 2 is answered
     *
     * @param view is the radio button selected for question 2
     */

    public void submitQuestion2Answer(View view) {

        //Declare Radio Button Objects for Question 2 Answer Options

        RadioButton option1Q2 = (RadioButton) findViewById(R.id.dungeons_and_dragons);
        RadioButton option2Q2 = (RadioButton) findViewById(R.id.breaking_bad);
        RadioButton option3Q2 = (RadioButton) findViewById(R.id.game_of_thrones);
        RadioButton option4Q2 = (RadioButton) findViewById(R.id.the_wire);

        //Conditional block for answer selected
        if (option1Q2.isChecked()) {
            answerQuestion2 = option1Q2.getText().toString(); // global variable answerQuestion2 assigned text value of answer selected

        } else if (option2Q2.isChecked()) {
            answerQuestion2 = option2Q2.getText().toString(); // global variable answerQuestion2 assigned text value of answer selected

        } else if (option3Q2.isChecked()) {
            answerQuestion2 = option3Q2.getText().toString(); // global variable answerQuestion2 assigned text value of answer selected

        } else if (option4Q2.isChecked()) {
            answerQuestion2 = option4Q2.getText().toString(); // global variable answerQuestion2 assigned text value of answer selected
        }

    }


    /**
     * This method is called when Question 5 is answered
     *
     * @param view is the radio button selected for question 5
     */

    public void submitQuestion5Answer(View view) {

        //Declare Radio Button Objects for Question 5 Answer Options

        RadioButton option1Q5 = (RadioButton) findViewById(R.id.the_a_team);
        RadioButton option2Q5 = (RadioButton) findViewById(R.id.airwolf);
        RadioButton option3Q5 = (RadioButton) findViewById(R.id.knightrider);
        RadioButton option4Q5 = (RadioButton) findViewById(R.id.gilligans_island);

        //Conditional block for answer selected
        if (option1Q5.isChecked()) {
            answerQuestion5 = option1Q5.getText().toString(); // global variable answerQuestion5 assigned text value of answer selected

        } else if (option2Q5.isChecked()) {
            answerQuestion5 = option2Q5.getText().toString(); // global variable answerQuestion5 assigned text value of answer selected

        } else if (option3Q5.isChecked()) {
            answerQuestion5 = option3Q5.getText().toString(); // global variable answerQuestion5 assigned text value of answer selected

        } else if (option4Q5.isChecked()) {
            answerQuestion5 = option4Q5.getText().toString(); // global variable answerQuestion5 assigned text value of answer selected
        }

    }

    /**
     * This method is called when Question 6 is answered
     *
     * @param view is the radio button selected for question 6
     */

    public void submitQuestion6Answer(View view) {

        //Declare Radio Button Objects for Question 6 Answer Options

        RadioButton option1Q6 = (RadioButton) findViewById(R.id.bergerac);
        RadioButton option2Q6 = (RadioButton) findViewById(R.id.inspector_morse);
        RadioButton option3Q6 = (RadioButton) findViewById(R.id.tagart);
        RadioButton option4Q6 = (RadioButton) findViewById(R.id.a_touch_of_frost);

        //Conditional block for answer selected
        if (option1Q6.isChecked()) {
            answerQuestion6 = option1Q6.getText().toString(); // global variable answerQuestion6 assigned text value of answer selected

        } else if (option2Q6.isChecked()) {
            answerQuestion6 = option2Q6.getText().toString(); // global variable answerQuestion6 assigned text value of answer selected

        } else if (option3Q6.isChecked()) {
            answerQuestion6 = option3Q6.getText().toString(); // global variable answerQuestion6 assigned text value of answer selected

        } else if (option4Q6.isChecked()) {
            answerQuestion6 = option4Q6.getText().toString(); // global variable answerQuestion6 assigned text value of answer selected
        }

    }

    /**
     * This method is called when Question 7 is answered
     *
     * @param view is the radio button selected for question 7
     */

    public void submitQuestion7Answer(View view) {

        //Declare Radio Button Objects for Question 7 Answer Options

        RadioButton option1Q7 = (RadioButton) findViewById(R.id.streets_san_fran);
        RadioButton option2Q7 = (RadioButton) findViewById(R.id.cagney_and_lacy);
        RadioButton option3Q7 = (RadioButton) findViewById(R.id.ironside);
        RadioButton option4Q7 = (RadioButton) findViewById(R.id.hill_street);

        //Conditional block for answer selected
        if (option1Q7.isChecked()) {
            answerQuestion7 = option1Q7.getText().toString(); // global variable answerQuestion7 assigned text value of answer selected

        } else if (option2Q7.isChecked()) {
            answerQuestion7 = option2Q7.getText().toString(); // global variable answerQuestion7 assigned text value of answer selected

        } else if (option3Q7.isChecked()) {
            answerQuestion7 = option3Q7.getText().toString(); // global variable answerQuestion7 assigned text value of answer selected

        } else if (option4Q7.isChecked()) {
            answerQuestion7 = option4Q7.getText().toString(); // global variable answerQuestion7 assigned text value of answer selected
        }

    }

    /**
     * This method is called when Question 8 is answered
     *
     * @param view is the radio button selected for question 8
     */

    public void submitQuestion8Answer(View view) {

        //Declare Radio Button Objects for Question 8 Answer Options

        RadioButton option1Q8 = (RadioButton) findViewById(R.id.star_gate);
        RadioButton option2Q8 = (RadioButton) findViewById(R.id.star_trek);
        RadioButton option3Q8 = (RadioButton) findViewById(R.id.battlestar);
        RadioButton option4Q8 = (RadioButton) findViewById(R.id.dancing_with_the_stars);

        //Conditional block for answer selected
        if (option1Q8.isChecked()) {
            answerQuestion8 = option1Q8.getText().toString(); // global variable answerQuestion8 assigned text value of answer selected

        } else if (option2Q8.isChecked()) {
            answerQuestion8 = option2Q8.getText().toString(); // global variable answerQuestion8 assigned text value of answer selected

        } else if (option3Q8.isChecked()) {
            answerQuestion8 = option3Q8.getText().toString(); // global variable answerQuestion8 assigned text value of answer selected

        } else if (option4Q8.isChecked()) {
            answerQuestion8 = option4Q8.getText().toString(); // global variable answerQuestion8 assigned text value of answer selected
        }

    }


    /**
     * Method is called when te Submit Answers button is clicked
     *
     * @param v is the Button xml view
     */
    public void submitAllAnswers(View v) {


        setEditTextAnswers(); // answers supplied for answers that were entered as text as (questions 3, 4 and 9)
        setCheckBoxAnswers(); // answers supplied for CheckBox answers (Question 10)


        int correctAnswerTally = calculateCorrectAnswers();

        //toast message to display the number of correct answers

        Context context = getApplicationContext();
        CharSequence toastMessageText = "You score: " + correctAnswerTally + " / 10 correct answers";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, toastMessageText, duration);
        toast.show();


    }


    /**
     * Method used to set answers supplied for EditText text entries for questions 3, 4 and 9 as values of global variables:
     * answerQuestion3, answerQuestion4 and answerQuestion9
     */

    private void setEditTextAnswers() {


        //Create EditText Objects for Questions 3, 4 & 9 Text Entry answers
        EditText answerQ3 = (EditText) findViewById(R.id.question_three_answer);
        EditText answerQ4 = (EditText) findViewById(R.id.question_four_answer);
        EditText answerQ9 = (EditText) findViewById(R.id.question_nine_answer);


        //get the text entered for questions 3, 4 and 9 answers (answers assigned to global scope variables)
        answerQuestion3 = answerQ3.getText().toString().toLowerCase(); // set the entered text to all lowercase so that it allows the user to enter the correct answer in any case
        answerQuestion4 = answerQ4.getText().toString().toLowerCase(); // and can be checked in the calculateCorrectAnswers method
        answerQuestion9 = answerQ9.getText().toString().toLowerCase();

    }

    /**
     * Method used to set answers supplied for Question 10 CheckBoxes as values of global variables:
     * answerQuestion10a, answerQuestion10b, answerQuestion10c, answerQuestion10d;
     */

    private void setCheckBoxAnswers() {

        //Declare CheckBox Objects for Question 10 Answer Options

        CheckBox option1Q10 = (CheckBox) findViewById(R.id.bobs_burgers_1);
        CheckBox option2Q10 = (CheckBox) findViewById(R.id.bobs_burgers_2);
        CheckBox option3Q10 = (CheckBox) findViewById(R.id.bobs_burgers_3);
        CheckBox option4Q10 = (CheckBox) findViewById(R.id.simpsons);

        //get the answers checked  for questions 10 CheckBoxes (answers assigned to global scope variables)


        if (option1Q10.isChecked()) {
            answerQuestion10a = true;

        } else {
            answerQuestion10a = false;
        }

        if (option2Q10.isChecked()) {
            answerQuestion10b = true;

        } else {
            answerQuestion10b = false;
        }

        if (option3Q10.isChecked()) {
            answerQuestion10c = true;

        } else {
            answerQuestion10c = false;
        }

        if (option4Q10.isChecked()) {
            answerQuestion10d = true;

        } else {
            answerQuestion10d = false;
        }


    }


    /**
     * This method calculates the number of correct answers
     *
     * @return the number of correct answers submitted  based of check against the correct answers
     */

    public int calculateCorrectAnswers() {

        int numberOfCorrectAnswers = 0;

        if (answerQuestion1.equals("Star Wars Ep. I")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        } else answerQuestion1 = "Incorrect Answer Provided";


        if (answerQuestion2.equals("Game of Thrones")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        } else answerQuestion2 = "Incorrect Answer Provided";

        if (answerQuestion3.equals("trainspotting")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;

        } else answerQuestion3 = "Incorrect Answer Provided";

        if (answerQuestion4.equals("hawaii five 0")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        } else answerQuestion4 = "Incorrect Answer Provided";

        if (answerQuestion5.equals("KnightRider")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;

        } else answerQuestion5 = "Incorrect Answer Provided";

        if (answerQuestion6.equals("Bergerac")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;

        } else answerQuestion6 = "Incorrect Answer Provided";


        if (answerQuestion7.equals("Ironside")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;

        } else answerQuestion7 = "Incorrect Answer Provided";

        if (answerQuestion8.equals("Star Gate")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;

        } else answerQuestion8 = "Incorrect Answer Provided";

        if (answerQuestion9.equals("the walking dead")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;

        } else answerQuestion9 = "Incorrect Answer Provided";

        if (answerQuestion10a & answerQuestion10b & answerQuestion10c & !answerQuestion10d) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
            righOrWrongAnswerQ10 = "Correct It's Bob's Burgers Season 1, 2 and 3";

        } else righOrWrongAnswerQ10 = "Incorrect Answer Provided";

        return numberOfCorrectAnswers;

    }


    /**
     * Method used to get questions where incorrect answers were provided
     */

    private String CreateAnswerSummary() {

        {


            String summaryMessage;
            summaryMessage = "Answer for Question 1 Given was:\n" + answerQuestion1 + "\n\n";
            summaryMessage = summaryMessage + "Answer for question 2 was:\n" + answerQuestion2 + "\n\n";
            summaryMessage = summaryMessage + "Answer for question 3 was \n" + answerQuestion3 + "\n\n";
            summaryMessage = summaryMessage + "Answer for question 4 was:\n " + answerQuestion4 + "\n\n";
            summaryMessage = summaryMessage + "Answer for question 5 was: \n" + answerQuestion5 + "\n\n";
            summaryMessage = summaryMessage + "Answer for question 6 was: \n" + answerQuestion6 + "\n\n";
            summaryMessage = summaryMessage + "Answer for question 7 was: \n" + answerQuestion7 + "\n\n";
            summaryMessage = summaryMessage + "Answer for question 8 was: \n" + answerQuestion8 + "\n\n";
            summaryMessage = summaryMessage + "Answer for question 9 was: \n" + answerQuestion9 + "\n\n";
            summaryMessage = summaryMessage + "Answer for question 10 was: \n" + righOrWrongAnswerQ10 + "\n\n";

            summaryMessage = summaryMessage + "You Scored: " + calculateCorrectAnswers() + " out of 10\n";


            return summaryMessage;


        }
    }


    /**
     * This method is run when the Answer Summary button is clicked
     */

    public void getAnswerSummary(View v) {

        String summariseAnswers = CreateAnswerSummary();


        TextView ansSummary = (TextView) findViewById(R.id.answer_summary);
        ansSummary.setText(summariseAnswers);
    }


}



