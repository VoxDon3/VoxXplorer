/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import ax.R2.f;
import ax.n.c;

public class RestartActivity
extends c {
    public static /* synthetic */ void F(RestartActivity restartActivity, int n8) {
        Intent intent = restartActivity.getPackageManager().getLaunchIntentForPackage(restartActivity.getPackageName());
        if (intent != null) {
            intent.addFlags(0x10008000);
            restartActivity.startActivity(intent);
        }
        restartActivity.finish();
        Process.killProcess((int)n8);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n8 = this.getIntent().getIntExtra("pid", -1);
        int n9 = Process.myPid();
        if (n8 > 0 && n8 != n9) {
            Process.killProcess((int)n8);
        }
        new Handler(Looper.getMainLooper()).postDelayed((Runnable)new f(this, n9), 150L);
    }
}

