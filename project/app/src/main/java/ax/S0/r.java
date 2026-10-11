/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.os.Handler;
import android.os.Message;
import ax.S0.t;

public final class r
implements Handler.Callback {
    public final t q;

    public /* synthetic */ r(t t8) {
        this.q = t8;
    }

    public final boolean handleMessage(Message message) {
        return t.b(this.q, message);
    }
}

