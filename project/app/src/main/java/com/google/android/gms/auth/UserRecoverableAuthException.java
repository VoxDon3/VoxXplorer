/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import ax.D5.a;
import ax.M5.p;
import com.google.android.gms.auth.b;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class UserRecoverableAuthException
extends a {
    private final PendingIntent c0;
    private final b d0;
    private final Intent q;

    public UserRecoverableAuthException(String string, Intent intent) {
        this(string, intent, null, b.q);
    }

    private UserRecoverableAuthException(String string, Intent intent, PendingIntent pendingIntent, b b8) {
        super(string);
        this.c0 = pendingIntent;
        this.q = intent;
        this.d0 = p.l(b8);
    }

    public static UserRecoverableAuthException b(String string, Intent intent, PendingIntent pendingIntent) {
        p.l(intent);
        p.l(pendingIntent);
        return new UserRecoverableAuthException(string, intent, pendingIntent, b.c0);
    }

    public Intent a() {
        Intent intent = this.q;
        if (intent == null) {
            int n8 = this.d0.ordinal();
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 == 2) {
                        Log.e((String)"Auth", (String)"this instantiation of UserRecoverableAuthException doesn't support an Intent.");
                    }
                } else {
                    Log.e((String)"Auth", (String)"This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
                }
            } else {
                Log.w((String)"Auth", (String)"Make sure that an intent was provided to class instantiation.");
            }
            return null;
        }
        return new Intent(intent);
    }
}

