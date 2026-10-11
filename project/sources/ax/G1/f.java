package ax.G1;

import ax.S0.G;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends ax.G1.b {
    public final List<c> a;

    public static final class b {
        public final int a;
        public final long b;

        private b(int i, long j) {
            this.a = i;
            this.b = j;
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

        private c(long j, boolean z, boolean z2, boolean z3, List<b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.a = j;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = DesugarCollections.unmodifiableList(list);
            this.e = j2;
            this.g = z4;
            this.h = j3;
            this.i = i;
            this.j = i2;
            this.k = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(G g) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            long j;
            boolean z3;
            long j2;
            int i;
            int i2;
            int i3;
            boolean z4;
            long j3;
            long O = g.O();
            boolean z5 = (g.M() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                z2 = false;
                j = -9223372036854775807L;
                z3 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                i3 = 0;
            } else {
                int M = g.M();
                boolean z6 = (M & 128) != 0;
                boolean z7 = (M & 64) != 0;
                boolean z8 = (M & 32) != 0;
                long O2 = z7 ? g.O() : -9223372036854775807L;
                if (!z7) {
                    int M2 = g.M();
                    ArrayList arrayList3 = new ArrayList(M2);
                    int i4 = 0;
                    while (i4 < M2) {
                        arrayList3.add(new b(g.M(), g.O()));
                        i4++;
                        M2 = M2;
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long M3 = g.M();
                    boolean z9 = (128 & M3) != 0;
                    j3 = ((((M3 & 1) << 32) | g.O()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int U = g.U();
                int M4 = g.M();
                boolean z10 = z6;
                z3 = z4;
                z = z10;
                i3 = g.M();
                long j4 = O2;
                i = U;
                i2 = M4;
                long j5 = j3;
                arrayList = arrayList2;
                z2 = z7;
                j = j4;
                j2 = j5;
            }
            return new c(O, z5, z, z2, arrayList, j, z3, j2, i, i2, i3);
        }
    }

    private f(List<c> list) {
        this.a = DesugarCollections.unmodifiableList(list);
    }

    static f d(G g) {
        int M = g.M();
        ArrayList arrayList = new ArrayList(M);
        for (int i = 0; i < M; i++) {
            arrayList.add(c.b(g));
        }
        return new f(arrayList);
    }
}
