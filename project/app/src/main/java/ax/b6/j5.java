/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.S4;
import ax.b6.U4;
import ax.b6.f5;

final class j5
implements S4 {
    private final U4 a;
    private final String b;
    private final Object[] c;
    private final int d;

    j5(U4 u42, String string, Object[] objectArray) {
        char c8;
        this.a = u42;
        this.b = string;
        this.c = objectArray;
        int n8 = string.charAt(0);
        if (n8 < 55296) {
            this.d = n8;
            return;
        }
        int n9 = n8 & 0x1FFF;
        int n10 = 13;
        n8 = 1;
        while ((c8 = string.charAt(n8)) >= '\ud800') {
            n9 |= (c8 & 0x1FFF) << n10;
            n10 += 13;
            ++n8;
        }
        this.d = n9 | c8 << n10;
    }

    @Override
    public final U4 a() {
        return this.a;
    }

    @Override
    public final f5 b() {
        int n8 = this.d;
        if ((n8 & 1) != 0) {
            return f5.q;
        }
        if ((n8 & 4) == 4) {
            return f5.d0;
        }
        return f5.c0;
    }

    @Override
    public final boolean c() {
        return (this.d & 2) == 2;
    }

    final String d() {
        return this.b;
    }

    final Object[] e() {
        return this.c;
    }
}

