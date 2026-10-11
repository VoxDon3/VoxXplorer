/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.database.ContentObserver;
import android.os.Handler;
import ax.W5.l;

final class k
extends ContentObserver {
    k(Handler handler) {
        super(null);
    }

    public final void onChange(boolean bl) {
        l.b().set(true);
    }
}

