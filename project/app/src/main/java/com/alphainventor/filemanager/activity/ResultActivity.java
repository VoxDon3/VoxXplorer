/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import ax.W2.h;
import ax.a3.k;
import ax.n.c;
import ax.s3.u;
import ax.u3.B;

public class ResultActivity
extends c
implements DialogInterface.OnDismissListener {
    public static String a = "COMMAND_RESULT";
    public static String b = "MESSAGE";
    public static String c = "SUB_MESSAGE";
    public static String d = "RESULT_INFO";

    private void F(Intent object) {
        if ("com.filemanager.BRING_TO_FRONT".equals(object.getAction()) || (h.b)((Object)object.getSerializableExtra(a)) != h.b.d0) {
            return;
        }
        object = k.i3(2131951894, object.getStringExtra(b), object.getStringExtra(c), object.getStringArrayListExtra(d));
        B.d0(this.getSupportFragmentManager(), (e)object, "result", false);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getIntent();
        if (this.getIntent() == null) {
            this.finish();
            return;
        }
        if ((h.b)((Object)bundle.getSerializableExtra(a)) != h.b.d0) {
            this.finish();
            return;
        }
        this.F((Intent)bundle);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.finish();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.F(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        u.j((Context)this).a(104);
    }
}

