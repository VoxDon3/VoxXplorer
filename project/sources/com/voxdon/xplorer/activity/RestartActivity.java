package com.voxdon.xplorer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import ax.n.ActivityC2561c;
import com.voxdon.xplorer.activity.RestartActivity;

/* loaded from: classes.dex */
public class RestartActivity extends ActivityC2561c {
    public static /* synthetic */ void F(RestartActivity restartActivity, int i) {
        Intent launchIntentForPackage = restartActivity.getPackageManager().getLaunchIntentForPackage(restartActivity.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            restartActivity.startActivity(launchIntentForPackage);
        }
        restartActivity.finish();
        Process.killProcess(i);
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("pid", -1);
        final int myPid = Process.myPid();
        if (intExtra > 0 && intExtra != myPid) {
            Process.killProcess(intExtra);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ax.R2.f
            @Override // java.lang.Runnable
            public final void run() {
                RestartActivity.F(RestartActivity.this, myPid);
            }
        }, 150L);
    }
}
