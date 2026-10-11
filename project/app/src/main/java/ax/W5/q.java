/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.database.ContentObserver;
import android.os.Handler;
import ax.W5.r;

final class q
extends ContentObserver {
    final r a;

    q(r r8, Handler handler) {
        this.a = r8;
        super(null);
    }

    public final void onChange(boolean bl) {
        this.a.e();
    }
}

