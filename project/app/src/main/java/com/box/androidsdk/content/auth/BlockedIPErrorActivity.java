/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.auth;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import ax.I3.b;
import ax.I3.c;

public class BlockedIPErrorActivity
extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(c.a);
        this.findViewById(b.n).setOnClickListener(new View.OnClickListener(this){
            final BlockedIPErrorActivity a;
            {
                this.a = blockedIPErrorActivity;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
    }
}

