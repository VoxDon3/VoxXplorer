/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.viewer;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import ax.Ha.b;
import ax.Ha.c;

public class ImageViewer
extends ax.n.c {
    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        b b8 = c.h().f().b("IMAGE VIEWER ACTIVITY LAUNCHED");
        object = new StringBuilder();
        ((StringBuilder)object).append("data : ");
        ((StringBuilder)object).append(this.getIntent().getData());
        b8.g(((StringBuilder)object).toString()).h();
        Toast.makeText((Context)this, (int)2131951927, (int)1).show();
        this.finish();
    }
}

