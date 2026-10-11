/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.database.ContentObserver;
import android.os.Handler;
import ax.b6.J2;

final class L2
extends ContentObserver {
    private final J2 a;

    L2(J2 j22, Handler handler) {
        this.a = j22;
        super(null);
    }

    public final void onChange(boolean bl) {
        this.a.e();
    }
}

