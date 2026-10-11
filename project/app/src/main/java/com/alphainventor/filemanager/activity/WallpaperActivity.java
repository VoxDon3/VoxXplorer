/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.activity;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import ax.n.c;

public class WallpaperActivity
extends c {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = this.getIntent();
        try {
            bundle = WallpaperManager.getInstance((Context)this);
            if (bundle != null && intent.getData() != null) {
                this.startActivity(bundle.getCropAndSetWallpaperIntent(intent.getData()));
            } else {
                Toast.makeText((Context)this, (int)2131951927, (int)1).show();
            }
        }
        catch (Exception exception) {
            Toast.makeText((Context)this, (int)2131951927, (int)1).show();
        }
        this.finish();
    }
}

