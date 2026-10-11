/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.database.ContentObserver;
import android.os.Handler;
import ax.b6.x2;

final class A2
extends ContentObserver {
    private final x2 a;

    A2(x2 x22, Handler handler) {
        this.a = x22;
        super(null);
    }

    public final void onChange(boolean bl) {
        x2.b(this.a).set(true);
    }
}

