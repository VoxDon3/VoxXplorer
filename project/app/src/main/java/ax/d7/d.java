/*
 * Decompiled with CFR 0.152.
 */
package ax.d7;

import android.content.Intent;
import ax.d7.b;
import com.google.android.gms.auth.UserRecoverableAuthException;

public class d
extends b {
    public d(UserRecoverableAuthException userRecoverableAuthException) {
        super(userRecoverableAuthException);
    }

    public UserRecoverableAuthException b() {
        return (UserRecoverableAuthException)super.a();
    }

    public final Intent c() {
        return this.b().a();
    }
}

