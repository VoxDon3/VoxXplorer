/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import ax.Q2.d;
import ax.X2.J;
import ax.c3.u;
import ax.n.c;

public class UsbAttachActivity
extends c {
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!J.u((Context)this) && SystemClock.elapsedRealtime() >= 300000L) {
            try {
                u.e0((Context)this);
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                Toast.makeText((Context)this, (int)2131952448, (int)1).show();
                d.b(activityNotFoundException);
            }
            this.finish();
            return;
        }
        this.finish();
    }
}

