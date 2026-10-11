package com.voxdon.xplorer.activity;

import android.os.Bundle;
import android.widget.Toast;
import ax.R2.c;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class PaymentActivity extends c {
    @Override // ax.d3.x0.a
    public boolean isContentClipToPadding(boolean z) {
        return false;
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toast.makeText(this, R.string.error, 1).show();
        finish();
    }

    @Override // ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
    }
}
