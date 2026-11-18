/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.activity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import ax.R2.c;
import ax.T.b;

public class PaymentActivity
extends c {
    @Override
    public boolean isContentClipToPadding(boolean bl) {
        return false;
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toast.makeText((Context)this, (int)2131951927, (int)1).show();
        this.finish();
    }
}

