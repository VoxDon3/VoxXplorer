/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import ax.Q2.d;
import ax.c3.u;
import ax.n.c;

public class PickerActivity
extends c {
    private Intent F(Intent intent, String string) {
        Intent intent2 = new Intent(intent);
        if ("com.discord".equals(string) && "android.intent.action.PICK".equals(intent.getAction()) && "image/*".equals(intent.getType())) {
            intent2.setType("*/*");
        }
        return intent2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void onCreate(Bundle object) {
        block10: {
            super.onCreate((Bundle)object);
            Intent intent = this.getIntent();
            object = this.getCallingPackage();
            String string = intent.getAction();
            try {
                Intent intent2 = this.F(intent, (String)object);
                boolean bl = "android.intent.action.GET_CONTENT".equals(string);
                if (bl) {
                    try {
                        u.b0((Context)this, intent2, (String)object);
                    }
                    catch (SecurityException securityException) {
                        d.c("picker security", securityException);
                        Toast.makeText((Context)this, (int)2131951927, (int)1).show();
                    }
                    break block10;
                }
                if ("android.intent.action.OPEN_DOCUMENT".equals(string)) {
                    u.b0((Context)this, intent2, (String)object);
                    break block10;
                }
                if ("android.intent.action.PICK".equals(string)) {
                    u.b0((Context)this, intent2, (String)object);
                    break block10;
                }
                if (!"android.intent.action.RINGTONE_PICKER".equals(intent.getAction()) && (bl = "android.intent.action.CREATE_SHORTCUT".equals(string))) {
                    try {
                        u.b0((Context)this, intent2, (String)object);
                    }
                    catch (SecurityException securityException) {
                        d.c("picker security", securityException);
                        Toast.makeText((Context)this, (int)2131951927, (int)1).show();
                    }
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                Toast.makeText((Context)this, (int)2131951927, (int)1).show();
            }
        }
        this.finish();
    }
}

