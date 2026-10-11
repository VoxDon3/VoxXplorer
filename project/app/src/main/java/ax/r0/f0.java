/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.P;
import ax.r0.S;
import ax.r0.c0;

final class f0
implements P {
    private final S a;
    private final String b;
    private final Object[] c;
    private final int d;

    f0(S s8, String string, Object[] objectArray) {
        char c8;
        this.a = s8;
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
    public boolean a() {
        return (this.d & 2) == 2;
    }

    @Override
    public S b() {
        return this.a;
    }

    @Override
    public c0 c() {
        if ((this.d & 1) == 1) {
            return c0.q;
        }
        return c0.c0;
    }

    Object[] d() {
        return this.c;
    }

    String e() {
        return this.b;
    }
}

