package net.mk786110.karwan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onClickKarwans(View view)
    {
        Intent mintent=new Intent(HomeActivity.this,KarwansActivity.class);
        startActivity(mintent);
    }
}
