package com.voxdon.xplorer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import ax.Q2.d;
import ax.c3.C1832u;
import ax.n.ActivityC2561c;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class PickerActivity extends ActivityC2561c {
    private Intent F(Intent intent, String str) {
        Intent intent2 = new Intent(intent);
        if ("com.discord".equals(str) && "android.intent.action.PICK".equals(intent.getAction()) && "image/*".equals(intent.getType())) {
            intent2.setType("*/*");
        }
        return intent2;
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Intent F;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String callingPackage = getCallingPackage();
        String action = intent.getAction();
        try {
            F = F(intent, callingPackage);
        } catch (IllegalArgumentException unused) {
            Toast.makeText(this, R.string.error, 1).show();
        }
        if ("android.intent.action.GET_CONTENT".equals(action)) {
            try {
                C1832u.b0(this, F, callingPackage);
            } catch (SecurityException e) {
                d.c("picker security", e);
                Toast.makeText(this, R.string.error, 1).show();
            }
            finish();
        }
        if ("android.intent.action.OPEN_DOCUMENT".equals(action)) {
            C1832u.b0(this, F, callingPackage);
        } else if ("android.intent.action.PICK".equals(action)) {
            C1832u.b0(this, F, callingPackage);
        } else if (!"android.intent.action.RINGTONE_PICKER".equals(intent.getAction()) && "android.intent.action.CREATE_SHORTCUT".equals(action)) {
            try {
                C1832u.b0(this, F, callingPackage);
            } catch (SecurityException e2) {
                d.c("picker security", e2);
                Toast.makeText(this, R.string.error, 1).show();
            }
        }
        finish();
        Toast.makeText(this, R.string.error, 1).show();
        finish();
    }
}
