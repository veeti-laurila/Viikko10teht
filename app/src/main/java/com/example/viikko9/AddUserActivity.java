package com.example.viikko9;

import android.content.Context;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AddUserActivity extends AppCompatActivity {
    private Context context;
    private EditText firstName;
    private EditText lastName;
    private EditText emailAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        firstName = findViewById(R.id.editTextFirstName);
        lastName = findViewById(R.id.editTextLastName);
        emailAddress = findViewById(R.id.editTextEmailAddress);
        context = this;
    }

    public String getFirstName() {
        String nameFirst = firstName.getText().toString();
        return nameFirst;
    }

    public String getLastName() {
        String nameLast = lastName.getText().toString();
        return nameLast;
    }

    public String getEmailAddress() {
        String email = emailAddress.getText().toString();
        return email;
    }

    public String getDegrees() {
        CheckBox cb1 = findViewById(R.id.checkBox1);
        CheckBox cb2 = findViewById(R.id.checkBox2);
        CheckBox cb3 = findViewById(R.id.checkBox3);
        CheckBox cb4 = findViewById(R.id.checkBox4);
        String degrees = "";
        if (cb1.isChecked()) {
            degrees = degrees + "-Kandidaatin tutkinto\n";
        }
        if (cb2.isChecked()) {
            degrees = degrees + "-Diplomi-insinöörin tutkinto\n";
        }
        if (cb3.isChecked()) {
            degrees = degrees + "-Tekniikan tohtorin tutkinto\n";
        }
        if (cb4.isChecked()) {
            degrees = degrees + "-Uimamaisteri\n";
        }
        return degrees;
    }

    public void addUser(View view) {
        RadioGroup rgDegreeProgram = findViewById(R.id.radioGroupDegreeProgram);
        RadioGroup rgPicture = findViewById(R.id.radioGroupPicture);
        String degrees = "";

        switch (rgDegreeProgram.getCheckedRadioButtonId()) {
            case R.id.radioButton1:
                switch (rgPicture.getCheckedRadioButtonId()) {
                    case R.id.radioButtonPicture1:
                        degrees = getDegrees();
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Tietotekniikka", R.drawable.emoji1, degrees));
                        break;
                    case R.id.radioButtonPicture2:
                        degrees = getDegrees();
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Tietotekniikka", R.drawable.emoji2, degrees));
                        break;
                }
                break;
            case R.id.radioButton2:
                switch (rgPicture.getCheckedRadioButtonId()) {
                    case R.id.radioButtonPicture1:
                        degrees = getDegrees();
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Tuotantotalous", R.drawable.emoji1, degrees));
                        break;
                    case R.id.radioButtonPicture2:
                        degrees = getDegrees();
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Tuotantotalous", R.drawable.emoji2, degrees));
                        break;
                }
                break;
            case R.id.radioButton3:
                switch (rgPicture.getCheckedRadioButtonId()) {
                    case R.id.radioButtonPicture1:
                        degrees = getDegrees();
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Laskennallinen tekniikka", R.drawable.emoji1, degrees));
                        break;
                    case R.id.radioButtonPicture2:
                        degrees = getDegrees();
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Laskennallinen tekniikka", R.drawable.emoji2, degrees));
                        break;
                }
                break;
            case R.id.radioButton4:
                switch (rgPicture.getCheckedRadioButtonId()) {
                    case R.id.radioButtonPicture1:
                        degrees = getDegrees();
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Sähkötekniikka", R.drawable.emoji1, degrees));
                        break;
                    case R.id.radioButtonPicture2:
                        degrees = getDegrees();
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Sähkötekniikka", R.drawable.emoji2, degrees));
                        break;
                }
                break;
        }

        firstName.getText().clear();
        lastName.getText().clear();
        emailAddress.getText().clear();

        UserStorage.getInstance().saveUsers(context);
    }
}
