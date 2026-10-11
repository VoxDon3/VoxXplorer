/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.g1;
import ax.W5.j1;

final class u1
implements g1 {
    private final j1 a;
    private final String b;
    private final Object[] c;
    private final int d;

    u1(j1 j12, String string, Object[] objectArray) {
        char c8;
        this.a = j12;
        this.b = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
        this.c = objectArray;
        int n8 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (n8 < 55296) {
            this.d = n8;
            return;
        }
        int n9 = n8 & 0x1FFF;
        int n10 = 1;
        n8 = 13;
        while ((c8 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(n10)) >= '\ud800') {
            n9 |= (c8 & 0x1FFF) << n8;
            n8 += 13;
            ++n10;
        }
        this.d = c8 << n8 | n9;
    }

    @Override
    public final j1 a() {
        return this.a;
    }

    @Override
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override
    public final int c() {
        if ((this.d & 1) != 0) {
            return 1;
        }
        return 2;
    }

    final String d() {
        return this.b;
    }

    final Object[] e() {
        return this.c;
    }
}

