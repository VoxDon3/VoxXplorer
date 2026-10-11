/*
 * Decompiled with CFR 0.152.
 */
package ax.I1;

import ax.S0.G;
import ax.q1.s;
import java.io.IOException;

final class f {
    private final G a = new G(8);
    private int b;

    private long a(s object) throws IOException {
        byte[] byArray = this.a.f();
        int n8 = 0;
        object.p(byArray, 0, 1);
        int n9 = this.a.f()[0] & 0xFF;
        if (n9 == 0) {
            return Long.MIN_VALUE;
        }
        int n10 = 128;
        int n11 = 0;
        while ((n9 & n10) == 0) {
            n10 >>= 1;
            ++n11;
        }
        n9 &= ~n10;
        object.p(this.a.f(), 1, n11);
        n10 = n8;
        n8 = n9;
        while (n10 < n11) {
            object = this.a.f();
            n8 = (object[++n10] & 0xFF) + (n8 << 8);
        }
        this.b += n11 + 1;
        return n8;
    }

    public boolean b(s s8) throws IOException {
        long l8 = s8.getLength();
        long l9 = 1024L;
        long l10 = l8 - -1L;
        long l11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
        long l12 = l9;
        if (l11 != false) {
            l12 = l8 > 1024L ? l9 : l8;
        }
        int n8 = (int)l12;
        s8.p(this.a.f(), 0, 4);
        l12 = this.a.O();
        this.b = 4;
        while (l12 != 440786851L) {
            int n9;
            this.b = n9 = this.b + 1;
            if (n9 == n8) {
                return false;
            }
            s8.p(this.a.f(), 0, 1);
            l12 = l12 << 8 & 0xFFFFFFFFFFFFFF00L | (long)(this.a.f()[0] & 0xFF);
        }
        l12 = this.a(s8);
        l9 = this.b;
        if (l12 != Long.MIN_VALUE && (l11 == false || l9 + l12 < l8)) {
            long l13;
            while ((l8 = (long)(l11 = (long)this.b)) < (l13 = l9 + l12)) {
                if (this.a(s8) == Long.MIN_VALUE) {
                    return false;
                }
                l8 = this.a(s8);
                long l14 = l8 - 0L;
                l11 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (l11 >= 0 && l8 <= Integer.MAX_VALUE) {
                    if (l11 == false) continue;
                    l11 = (int)l8;
                    s8.j((int)l11);
                    this.b += l11;
                    continue;
                }
                return false;
            }
            if ((long)l11 == l13) {
                return true;
            }
        }
        return false;
    }
}

