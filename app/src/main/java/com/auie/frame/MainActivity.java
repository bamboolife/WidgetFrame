package com.auie.frame;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.auie.annotation.UEAnnotation;
import org.auie.base.UEActivity;
import org.auie.base.UENavigationActivity;
import org.auie.ui.UIActionSheetDialog;
import org.auie.ui.UIButton;
import org.auie.ui.UIToast;

@UEAnnotation.UELayout(R.layout.activity_main)
public class MainActivity extends UENavigationActivity {
    @UEAnnotation.UEID
    @UEAnnotation.UEOnClick
    UIButton mbutton;
//    @UEAnnotation.UEID
//    UIFlexListView lv;
    // 初始化布局
    @Override
    protected void initializeFinish() {
        // setContentView(new UILoadingBar(this));
    }

    @Override
    public void onClick(View v) {
        new UIToast(MainActivity.this);
        //UIToast.makeText(MainActivity.this, "sada", Toast.LENGTH_SHORT).show();
        UIToast.show(MainActivity.this, "asdasd");
        UIActionSheetDialog dialog = new UIActionSheetDialog(this);
        dialog.setType(0);
        dialog.setTitle("android Dialog");
        dialog.addSheetItem("ios", Color.RED);
        dialog.addSheetItem("ios1", Color.BLUE);
        dialog.addSheetItem("ios2", Color.DKGRAY);
        dialog.show();
    }
}
