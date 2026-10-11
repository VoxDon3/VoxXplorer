/*
 * Decompiled with CFR 0.152.
 */
package ax.D5;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

public class c
extends UserRecoverableAuthException {
    private final int e0;

    c(int n8, String string, Intent intent) {
        super(string, intent);
        this.e0 = n8;
    }
}

