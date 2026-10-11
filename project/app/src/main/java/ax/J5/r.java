/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ax.J5.h;
import ax.Y5.k;

@SuppressLint(value={"HandlerLeak"})
final class r
extends k {
    private final Context b;
    final h c;

    public r(h h8, Context context) {
        this.c = h8;
        h8 = Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper();
        super((Looper)h8);
        this.b = context.getApplicationContext();
    }

    public final void handleMessage(Message object) {
        int n8 = ((Message)object).what;
        if (n8 != 1) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Don't know how to handle this message: ");
            ((StringBuilder)object).append(n8);
            Log.w((String)"GoogleApiAvailability", (String)((StringBuilder)object).toString());
            return;
        }
        object = this.c;
        n8 = ((h)object).g(this.b);
        if (((h)object).j(n8)) {
            this.c.q(this.b, n8);
        }
    }
}

