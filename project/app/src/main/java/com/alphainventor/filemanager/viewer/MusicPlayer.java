/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.viewer;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import ax.Ha.b;
import ax.Ha.c;

public class MusicPlayer
extends ax.n.c {
    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = c.h().f().b("MUSIC PLAYER ACTIVITY LAUNCHED");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("data : ");
        stringBuilder.append(this.getIntent().getData());
        ((b)object).g(stringBuilder.toString()).h();
        Toast.makeText((Context)this, (int)2131951927, (int)1).show();
        this.finish();
    }
}

