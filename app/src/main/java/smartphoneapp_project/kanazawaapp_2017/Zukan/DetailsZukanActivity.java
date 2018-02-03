package smartphoneapp_project.kanazawaapp_2017.Zukan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import smartphoneapp_project.kanazawaapp_2017.R;

public class DetailsZukanActivity extends Activity implements View.OnClickListener{

    String[] washiname = {"わし"};
    String[] washidescription = {".........."};

    private static int key;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zukan_details);

        ImageView imageview = (ImageView) findViewById(R.id.zukan_image);
        TextView nametext = (TextView) findViewById(R.id.zukan_name);
        TextView descriptiontext = (TextView) findViewById(R.id.zukan_description);
        ImageView backbutton = (ImageView) findViewById(R.id.zukan_back_button);
        backbutton.setOnClickListener(this);
        Intent intent = getIntent();
        key = intent.getIntExtra("key",0);

        switch (key){
            case 1:
                imageview.setImageResource(R.drawable.zukan_hutonegi2);
                nametext.setText(R.string.hutonegi);
                descriptiontext.setText(R.string.hutonegi_description);
                break;

            case 2:
                imageview.setImageResource(R.drawable.zukan_hutokyuuri2);
                nametext.setText(R.string.hutokyuuri);
                descriptiontext.setText(R.string.hutokyuuri_description);
                break;

            case 3:
                imageview.setImageResource(R.drawable.zukan_kinnzisou2);
                nametext.setText(R.string.kinnzisou);
                descriptiontext.setText(R.string.kinnzisou_description);
                break;

            case 4:
                imageview.setImageResource(R.drawable.zukan_rennkonn2);
                nametext.setText(R.string.rennkonn);
                descriptiontext.setText(R.string.rennkonn_description);
                break;

            case 19:
                imageview.setImageResource(R.drawable.zukan_washi1);
                nametext.setText(washiname[0]);
                descriptiontext.setText(washidescription[0]);
                break;
        }
    }

    public void onClick(View v) {
        Intent kagayasaizukan1 = new Intent(DetailsZukanActivity.this, KagayasaiZukan1Activity.class);
        Intent kagayasaizukan2 = new Intent(DetailsZukanActivity.this, KagayasaiZukan2Activity.class);
        Intent washizukan = new Intent(DetailsZukanActivity.this, WashiZukanActivity.class);
        Intent intent = getIntent();
        int i = intent.getIntExtra("key",0);

        if(1 <= i && i <= 9){
            startActivity(kagayasaizukan1);
        }else if(10 <= i && i <= 18){
            startActivity(kagayasaizukan2);
        }else if(19 <= i && i <= 28) {
            startActivity(washizukan);
        }
    }
}
