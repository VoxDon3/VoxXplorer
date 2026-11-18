package com.voxdon.xplorer.activity;

import android.content.ActivityNotFoundException;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import ax.Q2.d;
import ax.X2.J;
import ax.c3.C1832u;
import ax.n.ActivityC2561c;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class UsbAttachActivity extends ActivityC2561c {
    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (J.u(this) || SystemClock.elapsedRealtime() < 300000) {
            finish();
            return;
        }
        try {
            C1832u.e0(this);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, R.string.no_application, 1).show();
            d.b(e);
        }
        finish();
    }
}
