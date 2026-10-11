/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.M0;
import ax.Wc.O0;
import ax.Wc.h;

class K0 {
    static final M0 a = new M0();
    static final O0 b = new O0();

    static M0 a(h h8) {
        if (h8.f() < 1) {
            return a;
        }
        return new M0(h8);
    }

    static O0 b(h h8) {
        if (h8.f() < 1) {
            return b;
        }
        return new O0(h8);
    }
}

