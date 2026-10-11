package ax.l1;

import android.util.Pair;
import androidx.media3.exoplayer.C0622s;
import androidx.media3.exoplayer.N0;
import ax.P0.N;
import ax.P0.P;
import ax.S0.d0;
import ax.Y0.V;
import ax.Y0.W;
import ax.i1.InterfaceC2209F;
import ax.i1.q0;
import j$.util.Objects;
import java.util.Arrays;

/* renamed from: ax.l1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2448G extends AbstractC2451J {
    private a c;

    /* renamed from: ax.l1.G$a */
    public static final class a {
        private final int a;
        private final String[] b;
        private final int[] c;
        private final q0[] d;
        private final int[] e;
        private final int[][][] f;
        private final q0 g;

        a(String[] strArr, int[] iArr, q0[] q0VarArr, int[] iArr2, int[][][] iArr3, q0 q0Var) {
            this.b = strArr;
            this.c = iArr;
            this.d = q0VarArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = q0Var;
            this.a = iArr.length;
        }

        public int a(int i, int i2, boolean z) {
            int i3 = this.d[i].c(i2).a;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int h = h(i, i2, i5);
                if (h == 4 || (z && h == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return b(i, i2, Arrays.copyOf(iArr, i4));
        }

        public int b(int i, int i2, int[] iArr) {
            int i3 = 0;
            String str = null;
            boolean z = false;
            int i4 = 0;
            int i5 = 16;
            while (i3 < iArr.length) {
                String str2 = this.d[i].c(i2).b(iArr[i3]).o;
                int i6 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !Objects.equals(str, str2);
                }
                i5 = Math.min(i5, V.f(this.f[i][i2][i3]));
                i3++;
                i4 = i6;
            }
            return z ? Math.min(i5, this.e[i]) : i5;
        }

        public int c(int i, int i2, int i3) {
            return this.f[i][i2][i3];
        }

        public int d() {
            return this.a;
        }

        public int e(int i) {
            int i2 = 0;
            for (int[] iArr : this.f[i]) {
                for (int i3 : iArr) {
                    int i4 = V.i(i3);
                    int i5 = 1;
                    if (i4 != 0 && i4 != 1 && i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                return 3;
                            }
                            throw new IllegalStateException();
                        }
                        i5 = 2;
                    }
                    i2 = Math.max(i2, i5);
                }
            }
            return i2;
        }

        public int f(int i) {
            return this.c[i];
        }

        public q0 g(int i) {
            return this.d[i];
        }

        public int h(int i, int i2, int i3) {
            return V.i(c(i, i2, i3));
        }

        public int i(int i) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                if (this.c[i3] == i) {
                    i2 = Math.max(i2, e(i3));
                }
            }
            return i2;
        }

        public q0 j() {
            return this.g;
        }
    }

    private static int n(N0[] n0Arr, P p, int[] iArr, boolean z) throws C0622s {
        int length = n0Arr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < n0Arr.length; i2++) {
            N0 n0 = n0Arr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < p.a; i4++) {
                i3 = Math.max(i3, V.i(n0.b(p.b(i4))));
            }
            boolean z3 = iArr[i2] == 0;
            if (i3 > i || (i3 == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = i3;
            }
        }
        return length;
    }

    private static int[] p(N0 n0, P p) throws C0622s {
        int[] iArr = new int[p.a];
        for (int i = 0; i < p.a; i++) {
            iArr[i] = n0.b(p.b(i));
        }
        return iArr;
    }

    private static int[] q(N0[] n0Arr) throws C0622s {
        int length = n0Arr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = n0Arr[i].A();
        }
        return iArr;
    }

    @Override // ax.l1.AbstractC2451J
    public final void i(Object obj) {
        this.c = (a) obj;
    }

    @Override // ax.l1.AbstractC2451J
    public final K k(N0[] n0Arr, q0 q0Var, InterfaceC2209F.b bVar, N n) throws C0622s {
        int[] iArr = new int[n0Arr.length + 1];
        int length = n0Arr.length + 1;
        P[][] pArr = new P[length][];
        int[][][] iArr2 = new int[n0Arr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = q0Var.a;
            pArr[i] = new P[i2];
            iArr2[i] = new int[i2][];
        }
        int[] q = q(n0Arr);
        for (int i3 = 0; i3 < q0Var.a; i3++) {
            P c = q0Var.c(i3);
            int n2 = n(n0Arr, c, iArr, c.c == 5);
            int[] p = n2 == n0Arr.length ? new int[c.a] : p(n0Arr[n2], c);
            int i4 = iArr[n2];
            pArr[n2][i4] = c;
            iArr2[n2][i4] = p;
            iArr[n2] = i4 + 1;
        }
        q0[] q0VarArr = new q0[n0Arr.length];
        String[] strArr = new String[n0Arr.length];
        int[] iArr3 = new int[n0Arr.length];
        for (int i5 = 0; i5 < n0Arr.length; i5++) {
            int i6 = iArr[i5];
            q0VarArr[i5] = new q0((P[]) d0.g1(pArr[i5], i6));
            iArr2[i5] = (int[][]) d0.g1(iArr2[i5], i6);
            strArr[i5] = n0Arr[i5].getName();
            iArr3[i5] = n0Arr[i5].k();
        }
        a aVar = new a(strArr, iArr3, q0VarArr, q, iArr2, new q0((P[]) d0.g1(pArr[n0Arr.length], iArr[n0Arr.length])));
        Pair<W[], InterfaceC2445D[]> r = r(aVar, iArr2, q, bVar, n);
        return new K((W[]) r.first, (InterfaceC2445D[]) r.second, C2450I.a(aVar, (InterfaceC2449H[]) r.second), aVar);
    }

    public final a o() {
        return this.c;
    }

    protected abstract Pair<W[], InterfaceC2445D[]> r(a aVar, int[][][] iArr, int[] iArr2, InterfaceC2209F.b bVar, N n) throws C0622s;
}
