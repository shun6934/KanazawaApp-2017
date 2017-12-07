package smartphoneapp_project.kanazawaapp_2017;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static smartphoneapp_project.kanazawaapp_2017.Kaga2Test.a;

//正解画面
public class Kaga2Activity extends Activity {
    String kotae;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaga2);
        ImageView yasai_syasinn=(ImageView)findViewById(R.id.yasai);
        TextView textView=(TextView)findViewById(R.id.yasai_name);
        TextView textView_description=(TextView)findViewById(R.id.description);
        Button button=(Button)findViewById(R.id.next_button);
        final Intent intent=getIntent();
        kotae=intent.getStringExtra("kotae");
        switch (kotae){
            case "かがふときゅうり":
                textView_description.setText(R.string.hutokyuuri_description);
                break;

            case "かなざわいっぽんふとねぎ":
                textView_description.setText(R.string.hutonegi_description);
                break;

            case "かがれんこん":
                textView_description.setText(R.string.rennkonn_description);
                break;

            case "きんじそう":
                textView_description.setText(R.string.kinnzisou_description);
                break;
        }
        textView.setText(kotae);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//            intent.putExtra("nextQ","nimonme");
                a++;

                intent.putExtra("nextQ",a);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

}
