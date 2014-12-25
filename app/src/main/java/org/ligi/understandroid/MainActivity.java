package org.ligi.understandroid;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import com.google.zxing.BarcodeFormat;

import org.ligi.axt.AXT;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends ActionBarActivity {

    @InjectView(R.id.barcodeImage)
    ImageView barcodeImage;

    @OnClick(R.id.fixABug)
    void fixABug() {
        // this will crash - the log you can access via ADB will tell you what's wrong
        // the internet can tell you how to fix this ( common ) bug
        AXT.at(this).startCommonIntent().activityFromClass(FixABugActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);

        final int width = getWindowManager().getDefaultDisplay().getWidth();
        barcodeImage.setImageBitmap(BarcodeHelper.generateBarCodeBitmap("https://platform.toto.io/game/31C3#{\"t\":\"Task\",\"k\":\"qOpQc6Osa0sMQeM\",\"a\":\"Solve\",\"s\":\"TsltTX74rPWowQ5\"}", BarcodeFormat.QR_CODE, width));
    }
}
