/*
 * Decompiled with CFR 0.152.
 */
package ax.y1;

import ax.S0.a;
import ax.q1.C;
import ax.q1.s;

final class d
extends C {
    private final long b;

    public d(s s8, long l8) {
        super(s8);
        boolean bl = s8.getPosition() >= l8;
        a.a(bl);
        this.b = l8;
    }

    @Override
    public long getLength() {
        return super.getLength() - this.b;
    }

    @Override
    public long getPosition() {
        return super.getPosition() - this.b;
    }

    @Override
    public long i() {
        return super.i() - this.b;
    }
}

