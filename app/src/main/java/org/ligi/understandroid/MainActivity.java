package org.ligi.understandroid;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Display;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends ActionBarActivity {


    @InjectView(R.id.barcodeImage)
    ImageView barcodeImage;

    @OnClick(R.id.fixABug)
    void fixABug() {

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
