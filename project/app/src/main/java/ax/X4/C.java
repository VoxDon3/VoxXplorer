/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

import ax.X4.g;
import ax.X4.i;
import ax.X4.k;
import ax.X4.l;
import java.math.BigInteger;
import java.util.Map;

class C {
    static BigInteger a(CharSequence charSequence, int n8, int n9) {
        int n10 = n9 - n8;
        g g8 = new g(k.d(n10));
        int n11 = (n10 & 7) + n8;
        n8 = (n10 = i.m(charSequence, n8, n11)) >= 0 ? 1 : 0;
        g8.a(n10);
        n10 = n8;
        for (n8 = n11; n8 < n9; n8 += 8) {
            int n12 = i.f(charSequence, n8);
            n11 = n12 >= 0 ? 1 : 0;
            n10 &= n11;
            g8.b(100000000, n12);
        }
        if (n10 != 0) {
            return g8.c();
        }
        throw new NumberFormatException("illegal syntax");
    }

    static BigInteger b(CharSequence charSequence, int n8, int n9, Map<Integer, BigInteger> map) {
        if (n9 - n8 <= 400) {
            return C.a(charSequence, n8, n9);
        }
        int n10 = k.h(n8, n9);
        BigInteger bigInteger = C.b(charSequence, n8, n10, map);
        return C.b(charSequence, n10, n9, map).add(l.k(bigInteger, map.get(n9 - n10)));
    }
}

