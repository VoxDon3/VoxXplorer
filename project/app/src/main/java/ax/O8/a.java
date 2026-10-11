/*
 * Decompiled with CFR 0.152.
 */
package ax.O8;

import ax.h9.b;
import ax.h9.c;

public class a
implements c {
    private int a;
    private int b;

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public void b(ax.Z8.a<?> a8) {
        throw new UnsupportedOperationException("Receiving SMBv1 messages not supported in SMBJ");
    }

    @Override
    public int c() {
        return this.b;
    }

    public void d(int n8) {
        this.b = n8;
    }

    public void e(b b8) {
        this.a = b8.V();
        b8.o(new byte[]{-1, 83, 77, 66});
        b8.j((byte)114);
        b8.u(0L);
        b8.j((byte)24);
        b8.s(51283);
        b8.s(0);
        b8.w(0L);
        b8.X();
        b8.s(0);
        b8.s(0);
        b8.s(0);
        b8.s(0);
    }
}

