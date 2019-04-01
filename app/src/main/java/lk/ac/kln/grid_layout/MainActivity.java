package lk.ac.kln.grid_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GetUserInput(View view){
        EditText userWeight = findViewById(R.id.userWeight);
        EditText userheight = findViewById(R.id.userHeight);
        TextView result = findViewById(R.id.userBMI);
        //Get user height and convert it to a double

        double weight = Double.parseDouble(userWeight.getText().toString());
        double Height = Double.parseDouble(userheight.getText().toString());

        double UserBMI = calculateBMI(weight,Height);
        String bmistring = Double.toString(UserBMI);
        result.setText(bmistring);

        //Display BMI in toast

        Toast toast = Toast.makeText(this,bmistring,Toast.LENGTH_LONG);
        toast.show();

    }

    private double calculateBMI(double weight,double Height) {

        double BMI = weight / Math.pow(Height,2);
        return BMI;
    }
}
