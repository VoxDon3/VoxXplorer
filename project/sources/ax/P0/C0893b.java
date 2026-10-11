package ax.P0;

import android.net.Uri;
import ax.P0.C0915y;
import ax.S0.C0968a;
import ax.S0.d0;
import j$.util.Objects;
import java.util.Arrays;

/* renamed from: ax.P0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0893b {
    public static final C0893b g = new C0893b(null, new a[0], 0, -9223372036854775807L, 0);
    private static final a h = new a(0).h(0);
    private static final String i = d0.G0(1);
    private static final String j = d0.G0(2);
    private static final String k = d0.G0(3);
    private static final String l = d0.G0(4);
    public final Object a;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    private final a[] f;

    /* renamed from: ax.P0.b$a */
    public static final class a {
        private static final String l = d0.G0(0);
        private static final String m = d0.G0(1);
        private static final String n = d0.G0(2);
        private static final String o = d0.G0(3);
        private static final String p = d0.G0(4);
        private static final String q = d0.G0(5);
        private static final String r = d0.G0(6);
        private static final String s = d0.G0(7);
        static final String t = d0.G0(8);
        static final String u = d0.G0(9);
        static final String v = d0.G0(10);
        public final long a;
        public final int b;
        public final int c;

        @Deprecated
        public final Uri[] d;
        public final C0915y[] e;
        public final int[] f;
        public final long[] g;
        public final String[] h;
        public final long i;
        public final boolean j;
        public final boolean k;

        public a(long j) {
            this(j, -1, -1, new int[0], new C0915y[0], new long[0], 0L, false, new String[0], false);
        }

        private static long[] a(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static int[] b(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public int c() {
            return d(-1);
        }

        public int d(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f;
                if (i3 >= iArr.length || this.j || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean e() {
            if (this.b == -1) {
                return true;
            }
            for (int i = 0; i < this.b; i++) {
                int i2 = this.f[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f) && Arrays.equals(this.g, aVar.g) && this.i == aVar.i && this.j == aVar.j && Arrays.equals(this.h, aVar.h) && this.k == aVar.k) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.k && this.a == Long.MIN_VALUE && this.b == -1;
        }

        public boolean g() {
            return this.b == -1 || c() < this.b;
        }

        public a h(int i) {
            int[] b = b(this.f, i);
            long[] a = a(this.g, i);
            return new a(this.a, i, this.c, b, (C0915y[]) Arrays.copyOf(this.e, i), a, this.i, this.j, (String[]) Arrays.copyOf(this.h, i), this.k);
        }

        public int hashCode() {
            int i = ((this.b * 31) + this.c) * 31;
            long j = this.a;
            int hashCode = (((((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f)) * 31) + Arrays.hashCode(this.g)) * 31;
            long j2 = this.i;
            return ((((((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.j ? 1 : 0)) * 31) + Arrays.hashCode(this.h)) * 31) + (this.k ? 1 : 0);
        }

        private a(long j, int i, int i2, int[] iArr, C0915y[] c0915yArr, long[] jArr, long j2, boolean z, String[] strArr, boolean z2) {
            int i3 = 0;
            C0968a.a(iArr.length == c0915yArr.length);
            this.a = j;
            this.b = i;
            this.c = i2;
            this.f = iArr;
            this.e = c0915yArr;
            this.g = jArr;
            this.i = j2;
            this.j = z;
            this.d = new Uri[c0915yArr.length];
            while (true) {
                Uri[] uriArr = this.d;
                if (i3 >= uriArr.length) {
                    this.h = strArr;
                    this.k = z2;
                    return;
                } else {
                    C0915y c0915y = c0915yArr[i3];
                    uriArr[i3] = c0915y == null ? null : ((C0915y.h) C0968a.e(c0915y.b)).a;
                    i3++;
                }
            }
        }
    }

    private C0893b(Object obj, a[] aVarArr, long j2, long j3, int i2) {
        this.a = obj;
        this.c = j2;
        this.d = j3;
        this.b = aVarArr.length + i2;
        this.f = aVarArr;
        this.e = i2;
    }

    private boolean e(long j2, long j3, int i2) {
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        a a2 = a(i2);
        long j4 = a2.a;
        return j4 == Long.MIN_VALUE ? j3 == -9223372036854775807L || a2.f() || j2 < j3 : j2 < j4;
    }

    public a a(int i2) {
        int i3 = this.e;
        return i2 < i3 ? h : this.f[i2 - i3];
    }

    public int b(long j2, long j3) {
        if (j2 != Long.MIN_VALUE && (j3 == -9223372036854775807L || j2 < j3)) {
            int i2 = this.e;
            while (i2 < this.b && ((a(i2).a != Long.MIN_VALUE && a(i2).a <= j2) || !a(i2).g())) {
                i2++;
            }
            if (i2 < this.b && (j3 == -9223372036854775807L || a(i2).a <= j3)) {
                return i2;
            }
        }
        return -1;
    }

    public int c(long j2, long j3) {
        int i2 = this.b - 1;
        int i3 = i2 - (d(i2) ? 1 : 0);
        while (i3 >= 0) {
            long j4 = j2;
            long j5 = j3;
            if (!e(j4, j5, i3)) {
                break;
            }
            i3--;
            j2 = j4;
            j3 = j5;
        }
        if (i3 < 0 || !a(i3).e()) {
            return -1;
        }
        return i3;
    }

    public boolean d(int i2) {
        return i2 == this.b - 1 && a(i2).f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0893b.class == obj.getClass()) {
            C0893b c0893b = (C0893b) obj;
            if (Objects.equals(this.a, c0893b.a) && this.b == c0893b.b && this.c == c0893b.c && this.d == c0893b.d && this.e == c0893b.e && Arrays.equals(this.f, c0893b.f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.b * 31;
        Object obj = this.a;
        return ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31) + Arrays.hashCode(this.f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.a);
        sb.append(", adResumePositionUs=");
        sb.append(this.c);
        sb.append(", adGroups=[");
        for (int i2 = 0; i2 < this.f.length; i2++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f[i2].a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < this.f[i2].f.length; i3++) {
                sb.append("ad(state=");
                int i4 = this.f[i2].f[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f[i2].g[i3]);
                sb.append(')');
                if (i3 < this.f[i2].f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < this.f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
