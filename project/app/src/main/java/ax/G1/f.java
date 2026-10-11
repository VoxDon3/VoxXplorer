/*
 * Decompiled with CFR 0.152.
 */
package ax.G1;

import ax.S0.G;
import java.util.ArrayList;
import java.util.List;

public final class f
extends ax.G1.b {
    public final List<c> a;

    private f(List<c> list) {
        this.a = java.util.DesugarCollections.unmodifiableList(list);
    }

    static f d(G g8) {
        int n8 = g8.M();
        ArrayList<c> arrayList = new ArrayList<c>(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add(c.b(g8));
        }
        return new f(arrayList);
    }

    public static final class b {
        public final int a;
        public final long b;

        private b(int n8, long l8) {
            this.a = n8;
            this.b = l8;
        }
    }

    public static final class c {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<b> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        private c(long l8, boolean bl, boolean bl2, boolean bl3, List<b> list, long l9, boolean bl4, long l10, int n8, int n9, int n10) {
            this.a = l8;
            this.b = bl;
            this.c = bl2;
            this.d = bl3;
            this.f = java.util.DesugarCollections.unmodifiableList(list);
            this.e = l9;
            this.g = bl4;
            this.h = l10;
            this.i = n8;
            this.j = n9;
            this.k = n10;
        }

        private static c b(G g8) {
            boolean bl;
            long l8;
            int n8;
            int n9;
            long l9;
            boolean bl2;
            boolean bl3;
            long l10 = g8.O();
            int n10 = g8.M();
            boolean bl4 = true;
            if ((n10 & 0x80) == 0) {
                bl4 = false;
            }
            ArrayList<b> arrayList = new ArrayList<b>();
            if (!bl4) {
                n10 = g8.M();
                bl3 = (n10 & 0x80) != 0;
                bl2 = (n10 & 0x40) != 0;
                n10 = (n10 & 0x20) != 0 ? 1 : 0;
                l9 = bl2 ? g8.O() : -9223372036854775807L;
                if (!bl2) {
                    n9 = g8.M();
                    arrayList = new ArrayList(n9);
                    for (n8 = 0; n8 < n9; ++n8) {
                        arrayList.add(new b(g8.M(), g8.O()));
                    }
                }
                if (n10 != 0) {
                    l8 = g8.M();
                    bl = (0x80L & l8) != 0L;
                    l8 = ((l8 & 1L) << 32 | g8.O()) * 1000L / 90L;
                } else {
                    bl = false;
                    l8 = -9223372036854775807L;
                }
                n8 = g8.U();
                n9 = g8.M();
                n10 = g8.M();
            } else {
                bl3 = false;
                bl2 = false;
                l9 = -9223372036854775807L;
                bl = false;
                l8 = -9223372036854775807L;
                n8 = 0;
                n9 = 0;
                n10 = 0;
            }
            return new c(l10, bl4, bl3, bl2, arrayList, l9, bl, l8, n8, n9, n10);
        }
    }
}

