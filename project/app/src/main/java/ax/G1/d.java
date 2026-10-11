/*
 * Decompiled with CFR 0.152.
 */
package ax.G1;

import ax.G1.g;
import ax.S0.G;
import ax.S0.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d
extends ax.G1.b {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final List<b> h;
    public final boolean i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;

    private d(long l8, boolean bl, boolean bl2, boolean bl3, boolean bl4, long l9, long l10, List<b> list, boolean bl5, long l11, int n8, int n9, int n10) {
        this.a = l8;
        this.b = bl;
        this.c = bl2;
        this.d = bl3;
        this.e = bl4;
        this.f = l9;
        this.g = l10;
        this.h = java.util.DesugarCollections.unmodifiableList(list);
        this.i = bl5;
        this.j = l11;
        this.k = n8;
        this.l = n9;
        this.m = n10;
    }

    static d d(G g8, long l8, M m8) {
        boolean bl;
        int n8;
        boolean bl2;
        int n9;
        boolean bl3;
        boolean bl4;
        int n10;
        long l9 = g8.O();
        boolean bl5 = (g8.M() & 0x80) != 0;
        ArrayList<b> arrayList = Collections.EMPTY_LIST;
        long l10 = -9223372036854775807L;
        if (!bl5) {
            n10 = g8.M();
            bl4 = (n10 & 0x80) != 0;
            bl3 = (n10 & 0x40) != 0;
            n9 = (n10 & 0x20) != 0 ? 1 : 0;
            bl2 = (n10 & 0x10) != 0;
            long l11 = bl3 && !bl2 ? ax.G1.g.e(g8, l8) : -9223372036854775807L;
            if (!bl3) {
                n10 = g8.M();
                arrayList = new ArrayList<b>(n10);
                for (n8 = 0; n8 < n10; ++n8) {
                    int n11 = g8.M();
                    long l12 = !bl2 ? ax.G1.g.e(g8, l8) : -9223372036854775807L;
                    arrayList.add(new b(n11, l12, m8.b(l12)));
                }
            }
            if (n9 != 0) {
                l8 = g8.M();
                bl = (0x80L & l8) != 0L;
                l8 = ((l8 & 1L) << 32 | g8.O()) * 1000L / 90L;
            } else {
                bl = false;
                l8 = l10;
            }
            n8 = g8.U();
            n10 = g8.M();
            n9 = g8.M();
            boolean bl6 = bl4;
            bl4 = bl3;
            bl3 = bl6;
            l10 = l11;
        } else {
            l8 = -9223372036854775807L;
            bl3 = false;
            bl4 = false;
            bl2 = false;
            bl = false;
            n8 = 0;
            n10 = 0;
            n9 = 0;
        }
        return new d(l9, bl5, bl3, bl4, bl2, l10, m8.b(l10), (List<b>)arrayList, bl, l8, n8, n10, n9);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SCTE-35 SpliceInsertCommand { programSplicePts=");
        stringBuilder.append(this.f);
        stringBuilder.append(", programSplicePlaybackPositionUs= ");
        stringBuilder.append(this.g);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public static final class b {
        public final int a;
        public final long b;
        public final long c;

        private b(int n8, long l8, long l9) {
            this.a = n8;
            this.b = l8;
            this.c = l9;
        }
    }
}

