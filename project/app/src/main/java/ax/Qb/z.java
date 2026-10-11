/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Gb.g;
import ax.Qb.N;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class z {
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_handled");
    private volatile int _handled;
    public final Throwable a;

    public z(Throwable throwable, boolean bl) {
        this.a = throwable;
        this._handled = bl ? 1 : 0;
    }

    public /* synthetic */ z(Throwable throwable, boolean bl, int n8, g g8) {
        if ((n8 & 2) != 0) {
            bl = false;
        }
        this(throwable, bl);
    }

    public final boolean a() {
        return b.get(this) != 0;
    }

    public final boolean b() {
        return b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(N.a(this));
        stringBuilder.append('[');
        stringBuilder.append(this.a);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

