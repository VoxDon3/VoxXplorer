package ax.G1;

import ax.S0.G;
import ax.S0.M;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends ax.G1.b {
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

    public static final class b {
        public final int a;
        public final long b;
        public final long c;

        private b(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    private d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j2;
        this.g = j3;
        this.h = DesugarCollections.unmodifiableList(list);
        this.i = z5;
        this.j = j4;
        this.k = i;
        this.l = i2;
        this.m = i3;
    }

    static d d(G g, long j, M m) {
        List list;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        boolean z5;
        int i4;
        long j3;
        long O = g.O();
        boolean z6 = (g.M() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long j4 = -9223372036854775807L;
        if (z6) {
            list = list2;
            j2 = -9223372036854775807L;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            int M = g.M();
            boolean z7 = (M & 128) != 0;
            boolean z8 = (M & 64) != 0;
            boolean z9 = (M & 32) != 0;
            boolean z10 = (M & 16) != 0;
            long e = (!z8 || z10) ? -9223372036854775807L : g.e(g, j);
            if (!z8) {
                int M2 = g.M();
                ArrayList arrayList = new ArrayList(M2);
                int i5 = 0;
                while (i5 < M2) {
                    int M3 = g.M();
                    if (z10) {
                        i4 = M2;
                        j3 = -9223372036854775807L;
                    } else {
                        i4 = M2;
                        j3 = g.e(g, j);
                    }
                    arrayList.add(new b(M3, j3, m.b(j3)));
                    i5++;
                    M2 = i4;
                }
                list2 = arrayList;
            }
            if (z9) {
                long M4 = g.M();
                boolean z11 = (128 & M4) != 0;
                j4 = ((((M4 & 1) << 32) | g.O()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
            }
            int U = g.U();
            long j5 = e;
            j2 = j4;
            j4 = j5;
            i2 = g.M();
            i3 = g.M();
            i = U;
            z4 = z5;
            z = z7;
            z2 = z8;
            list = list2;
            z3 = z10;
        }
        return new d(O, z6, z, z2, z3, j4, m.b(j4), list, z4, j2, i, i2, i3);
    }

    @Override // ax.G1.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f + ", programSplicePlaybackPositionUs= " + this.g + " }";
    }
}
