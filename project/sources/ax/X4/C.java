package ax.X4;

import java.math.BigInteger;
import java.util.Map;

/* loaded from: classes.dex */
class C {
    static BigInteger a(CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        g gVar = new g(k.d(i3));
        int i4 = (i3 & 7) + i;
        int m = i.m(charSequence, i, i4);
        boolean z = m >= 0;
        gVar.a(m);
        while (i4 < i2) {
            int f = i.f(charSequence, i4);
            z &= f >= 0;
            gVar.b(100000000, f);
            i4 += 8;
        }
        if (z) {
            return gVar.c();
        }
        throw new NumberFormatException("illegal syntax");
    }

    static BigInteger b(CharSequence charSequence, int i, int i2, Map<Integer, BigInteger> map) {
        if (i2 - i <= 400) {
            return a(charSequence, i, i2);
        }
        int h = k.h(i, i2);
        return b(charSequence, h, i2, map).add(l.k(b(charSequence, i, h, map), map.get(Integer.valueOf(i2 - h))));
    }
}
