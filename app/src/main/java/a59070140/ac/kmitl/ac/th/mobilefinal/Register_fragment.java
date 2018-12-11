package a59070140.ac.kmitl.ac.th.mobilefinal;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register_fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_fragment);
        SQLiteDatabase myDB = openOrCreateDatabase("my.db", MODE_PRIVATE, null);
        myDB.execSQL("CREATE TABLE IF NOT EXISTS account (id INTEGER PRIMARY KEY AUTOINCREMENT, username VARCHAR(200), password VARCHAR(200))");
        final EditText user_id = (EditText)findViewById(R.id.register_username);
        EditText name = (EditText)findViewById(R.id.register_name);
        EditText age = (EditText)findViewById(R.id.register_age);
        EditText password = (EditText)findViewById(R.id.register_password);
        Button register_btn = (Button)findViewById(R.id.register_btn);
        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user_id.equals(null)){
                    Toast.makeText(getBaseContext(),"Please fill out this" ,Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}
