/*
 * Decompiled with CFR 0.152.
 */
package ax.ne;

import android.os.IBinder;
import ax.ne.m;

public final class k
implements IBinder.DeathRecipient {
    public final m a;

    public /* synthetic */ k(m m8) {
        this.a = m8;
    }

    public final void binderDied() {
        this.a.T();
    }
}

