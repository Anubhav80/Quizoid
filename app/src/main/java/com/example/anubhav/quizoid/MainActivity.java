package com.example.androidl.quizoid;

import android.support.annotation.Px;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.R.attr.x;


public class MainActivity extends AppCompatActivity {


    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     ** This method is called when the end test button is clicked.
     */
    public void end_Test(View view)  {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        question_1();
        question_2();
        question_3();
        question_4();
        question_5();
        question_6();
        question_7();
        question_8();
        question_9();
        question_10();

        // Display the test result on the screen
        String test_result = createTestResult(name, score);
        displayResult(test_result);

        // Disabled "End Test" button after clicking on it.
        Button endTestButton = (Button) findViewById(R.id.end_test_button);
        endTestButton.setEnabled(false);
    }



    private String createTestResult(String name, int score) {
        String test_result = getString(R.string.test_result_name) + name;
        test_result += "\n" + getString(R.string.test_result_score) + score;
        return test_result;
    }


    public void question_1() {

        CheckBox CheckBox_3 = (CheckBox) findViewById(R.id.checkbox_3);
        boolean hasCheckBox = CheckBox_3.isChecked();

        if (hasCheckBox) {
            increment_score();
        }

    }

    public void question_2() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_2);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_2_1_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_1_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_3_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_4_radiobutton);
        }
    }


    public void question_3() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_3);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.A3_3_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.A3_3_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.A3_1_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.A3_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.A3_3_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.A3_4_radiobutton);
        }
    }

    public void question_4() {
        CheckBox A4_2_checkbox = (CheckBox) findViewById(R.id.A4_2_checkbox);
        boolean hasCheckBox = A4_2_checkbox.isChecked();

        if (hasCheckBox) {
            increment_score();
        }


    }


    public void question_5() {

        CheckBox Answer_5_3_CheckBox = (CheckBox) findViewById(R.id.answer_5_3_checkbox);
        boolean hasAnswer_5_3_CheckBox = Answer_5_3_CheckBox.isChecked();

        if (hasAnswer_5_3_CheckBox) {
            increment_score();
        }


    }


    public void question_6() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_6);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.A6_2_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.A6_2_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.A6_1_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.A6_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.A6_3_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.A6_4_radiobutton);
        }
    }


    public void question_7() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_7);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.A7_1_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.A7_1_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.A7_1_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.A7_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.A7_3_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.A7_4_radiobutton);
        }
    }


    public void question_8() {


        CheckBox Answer8_3_CheckBox = (CheckBox) findViewById(R.id.A8_3_checkbox);
        boolean hasCheckBox = Answer8_3_CheckBox.isChecked();

        if (hasCheckBox) {
            increment_score();
        }

    }

    public void question_9() {


        CheckBox PasswordAttackCheckBox = (CheckBox) findViewById(R.id.A9_2_checkbox);
        boolean hasPasswordAttackCheckBox = PasswordAttackCheckBox.isChecked();

        if (hasPasswordAttackCheckBox) {
            increment_score();
        }


    }


    public void question_10() {
        CheckBox A10_1_CheckBox = (CheckBox) findViewById(R.id.A10_1_checkBox);
        boolean hasCheckBox = A10_1_CheckBox.isChecked();

        if (hasCheckBox) {
            increment_score();
        }


    }

    /*
      This method displays the given text on the screen.
     */
    private void displayResult(String result) {
        TextView testResultTextView = (TextView) findViewById(R.id.test_result_text_view);
        testResultTextView.setText(result);
    }

    /*
      This method is called when user selected the correct answer.
      Added +1 to score for each correct answer
     */
    private int increment_score() {
        score = ++score;
        return score;
    }
}
