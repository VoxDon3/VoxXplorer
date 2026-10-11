package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import ax.M5.C0821p;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes3.dex */
public class UserRecoverableAuthException extends ax.D5.a {
    private final PendingIntent c0;
    private final b d0;
    private final Intent q;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, null, b.LEGACY);
    }

    public static UserRecoverableAuthException b(String str, Intent intent, PendingIntent pendingIntent) {
        C0821p.l(intent);
        C0821p.l(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, b.AUTH_INSTANTIATION);
    }

    public Intent a() {
        Intent intent = this.q;
        if (intent != null) {
            return new Intent(intent);
        }
        int ordinal = this.d0.ordinal();
        if (ordinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (ordinal == 1) {
            Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            return null;
        }
        if (ordinal != 2) {
            return null;
        }
        Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
        return null;
    }

    private UserRecoverableAuthException(String str, Intent intent, PendingIntent pendingIntent, b bVar) {
        super(str);
        this.c0 = pendingIntent;
        this.q = intent;
        this.d0 = (b) C0821p.l(bVar);
    }
}
