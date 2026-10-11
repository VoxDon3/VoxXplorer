package ax.Pb;

import ax.Gb.g;
import ax.Gb.l;
import ax.K2.t;
import ax.Ob.h;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public final class a implements Comparable<a> {
    public static final C0172a c0 = new C0172a(null);
    private static final long d0 = n(0);
    private static final long e0;
    private static final long f0;
    private final long q;

    /* renamed from: ax.Pb.a$a, reason: collision with other inner class name */
    public static final class C0172a {
        public /* synthetic */ C0172a(g gVar) {
            this();
        }

        private C0172a() {
        }
    }

    static {
        long e;
        long e2;
        e = c.e(4611686018427387903L);
        e0 = e;
        e2 = c.e(-4611686018427387903L);
        f0 = e2;
    }

    private /* synthetic */ a(long j) {
        this.q = j;
    }

    public static final int A(long j) {
        if (J(j)) {
            return 0;
        }
        return (int) (w(j) % 60);
    }

    public static final int B(long j) {
        if (J(j)) {
            return 0;
        }
        return (int) (H(j) ? c.g(E(j) % 1000) : E(j) % Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
    }

    public static final int C(long j) {
        if (J(j)) {
            return 0;
        }
        return (int) (x(j) % 60);
    }

    private static final d D(long j) {
        return I(j) ? d.c0 : d.e0;
    }

    private static final long E(long j) {
        return j >> 1;
    }

    public static int F(long j) {
        return t.a(j);
    }

    public static final boolean G(long j) {
        return !J(j);
    }

    private static final boolean H(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean I(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean J(long j) {
        return j == e0 || j == f0;
    }

    public static final boolean K(long j) {
        return j < 0;
    }

    public static final boolean L(long j) {
        return j > 0;
    }

    public static final long M(long j, d dVar) {
        l.f(dVar, "unit");
        if (j == e0) {
            return Long.MAX_VALUE;
        }
        if (j == f0) {
            return Long.MIN_VALUE;
        }
        return e.a(E(j), D(j), dVar);
    }

    public static String N(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == e0) {
            return "Infinity";
        }
        if (j == f0) {
            return "-Infinity";
        }
        boolean K = K(j);
        StringBuilder sb = new StringBuilder();
        if (K) {
            sb.append('-');
        }
        long q = q(j);
        long s = s(q);
        int r = r(q);
        int A = A(q);
        int C = C(q);
        int B = B(q);
        int i = 0;
        boolean z = s != 0;
        boolean z2 = r != 0;
        boolean z3 = A != 0;
        boolean z4 = (C == 0 && B == 0) ? false : true;
        if (z) {
            sb.append(s);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(r);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(A);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (C != 0 || z || z2 || z3) {
                d(j, sb, C, B, 9, "s", false);
            } else if (B >= 1000000) {
                d(j, sb, B / 1000000, B % 1000000, 6, "ms", false);
            } else if (B >= 1000) {
                d(j, sb, B / 1000, B % 1000, 3, "us", false);
            } else {
                sb.append(B);
                sb.append("ns");
            }
            i = i4;
        }
        if (K && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long O(long j) {
        long d;
        d = c.d(-E(j), ((int) j) & 1);
        return d;
    }

    private static final void d(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String e02 = h.e0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = e02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (e02.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) e02, 0, ((i4 + 3) / 3) * 3);
                l.e(sb, "append(...)");
            } else {
                sb.append((CharSequence) e02, 0, i6);
                l.e(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ a h(long j) {
        return new a(j);
    }

    public static int l(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return l.i(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return K(j) ? -i : i;
    }

    public static long n(long j) {
        if (!b.a()) {
            return j;
        }
        if (I(j)) {
            long E = E(j);
            if (-4611686018426999999L <= E && E < 4611686018427000000L) {
                return j;
            }
            throw new AssertionError(E(j) + " ns is out of nanoseconds range");
        }
        long E2 = E(j);
        if (-4611686018427387903L > E2 || E2 >= 4611686018427387904L) {
            throw new AssertionError(E(j) + " ms is out of milliseconds range");
        }
        long E3 = E(j);
        if (-4611686018426L > E3) {
            return j;
        }
        if (E3 >= 4611686018427L) {
            return j;
        }
        throw new AssertionError(E(j) + " ms is denormalized");
    }

    public static boolean p(long j, Object obj) {
        return (obj instanceof a) && j == ((a) obj).P();
    }

    public static final long q(long j) {
        return K(j) ? O(j) : j;
    }

    public static final int r(long j) {
        if (J(j)) {
            return 0;
        }
        return (int) (t(j) % 24);
    }

    public static final long s(long j) {
        return M(j, d.i0);
    }

    public static final long t(long j) {
        return M(j, d.h0);
    }

    public static final long u(long j) {
        return (H(j) && G(j)) ? E(j) : M(j, d.e0);
    }

    public static final long w(long j) {
        return M(j, d.g0);
    }

    public static final long x(long j) {
        return M(j, d.f0);
    }

    public final /* synthetic */ long P() {
        return this.q;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a aVar) {
        return j(aVar.P());
    }

    public boolean equals(Object obj) {
        return p(this.q, obj);
    }

    public int hashCode() {
        return F(this.q);
    }

    public int j(long j) {
        return l(this.q, j);
    }

    public String toString() {
        return N(this.q);
    }
}
