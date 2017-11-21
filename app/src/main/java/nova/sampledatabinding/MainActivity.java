package nova.sampledatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import nova.sampledatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(this);
        binding.setVariable(nova.sampledatabinding.BR.handlers, new MyHandlers());




    }

    public void onGang(View view){
        Toast.makeText(this, "gang!!", Toast.LENGTH_SHORT).show();
    }

    public class MyHandlers {

        public void onClickRow(View view) {

            Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();

        }

    }













}
