/*
 * Decompiled with CFR 0.152.
 */
package ax.y1;

import java.util.List;

final class c {
    public final long a;
    public final List<a> b;

    public c(long l8, List<a> list) {
        this.a = l8;
        this.b = list;
    }

    public ax.F1.a a(long l8) {
        long l9;
        if (this.b.size() < 2) {
            return null;
        }
        long l10 = l8;
        long l11 = -1L;
        long l12 = l8 = (l9 = -1L);
        boolean bl = false;
        long l13 = l8;
        l8 = l10;
        for (int i8 = this.b.size() - 1; i8 >= 0; --i8) {
            a a8 = this.b.get(i8);
            bl = "video/mp4".equals(a8.a) | bl;
            if (i8 == 0) {
                l10 = l8 - a8.d;
                l8 = 0L;
            } else {
                long l14 = l8 - a8.c;
                l10 = l8;
                l8 = l14;
            }
            if (bl && l8 != l10) {
                l12 = l10 - l8;
                l13 = l8;
                bl = false;
            }
            if (i8 != 0) continue;
            l11 = l8;
            l9 = l10;
        }
        if (l13 != -1L && l12 != -1L && l11 != -1L && l9 != -1L) {
            return new ax.F1.a(l11, l9, this.a, l13, l12);
        }
        return null;
    }

    public static final class a {
        public final String a;
        public final String b;
        public final long c;
        public final long d;

        public a(String string, String string2, long l8, long l9) {
            this.a = string;
            this.b = string2;
            this.c = l8;
            this.d = l9;
        }
    }
}

