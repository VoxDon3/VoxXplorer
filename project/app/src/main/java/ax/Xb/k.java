/*
 * Decompiled with CFR 0.152.
 */
package ax.Xb;

import ax.Qb.N;
import ax.Xb.h;
import ax.Xb.i;

public final class k
extends h {
    public final Runnable d0;

    public k(Runnable runnable2, long l8, i i8) {
        super(l8, i8);
        this.d0 = runnable2;
    }

    @Override
    public void run() {
        try {
            this.d0.run();
            return;
        }
        finally {
            this.c0.a();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Task[");
        stringBuilder.append(N.a(this.d0));
        stringBuilder.append('@');
        stringBuilder.append(N.b(this.d0));
        stringBuilder.append(", ");
        stringBuilder.append(this.q);
        stringBuilder.append(", ");
        stringBuilder.append(this.c0);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

