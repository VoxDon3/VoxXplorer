/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.util.Log;
import ax.Y6.e;

public final class F0
extends Exception {
    private final int q;

    public F0(int n8, String string) {
        super(string);
        this.q = n8;
    }

    public final e a() {
        if (this.getCause() == null) {
            Log.w((String)"UserMessagingPlatform", (String)super.getMessage());
        } else {
            Log.w((String)"UserMessagingPlatform", (String)super.getMessage(), (Throwable)this.getCause());
        }
        return new e(this.q, super.getMessage());
    }

    @Override
    public final String getMessage() {
        return super.getMessage();
    }
}

