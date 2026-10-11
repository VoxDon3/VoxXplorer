/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.net.Uri;
import ax.P0.y;
import ax.S0.d0;
import java.util.Arrays;

public final class b {
    public static final b g = new b(null, new a[0], 0L, -9223372036854775807L, 0);
    private static final a h = new a(0L).h(0);
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

    private b(Object object, a[] aArray, long l8, long l9, int n8) {
        this.a = object;
        this.c = l8;
        this.d = l9;
        this.b = aArray.length + n8;
        this.f = aArray;
        this.e = n8;
    }

    private boolean e(long l8, long l9, int n8) {
        if (l8 == Long.MIN_VALUE) {
            return false;
        }
        a a8 = this.a(n8);
        long l10 = a8.a;
        if (l10 == Long.MIN_VALUE) {
            return l9 == -9223372036854775807L || a8.f() || l8 < l9;
            {
            }
        }
        return l8 < l10;
    }

    public a a(int n8) {
        int n9 = this.e;
        if (n8 < n9) {
            return h;
        }
        return this.f[n8 - n9];
    }

    public int b(long l8, long l9) {
        long l10;
        long l11;
        if (l8 != Long.MIN_VALUE && ((l11 = (l10 = l9 - -9223372036854775807L) == 0L ? 0 : (l10 < 0L ? -1 : 1)) == false || l8 < l9)) {
            int n8;
            for (n8 = this.e; n8 < this.b && (this.a((int)n8).a != Long.MIN_VALUE && this.a((int)n8).a <= l8 || !this.a(n8).g()); ++n8) {
            }
            if (n8 < this.b && (l11 == false || this.a((int)n8).a <= l9)) {
                return n8;
            }
        }
        return -1;
    }

    public int c(long l8, long l9) {
        int n8 = this.b - 1;
        n8 -= this.d(n8);
        while (n8 >= 0 && this.e(l8, l9, n8)) {
            --n8;
        }
        if (n8 >= 0 && this.a(n8).e()) {
            return n8;
        }
        return -1;
    }

    public boolean d(int n8) {
        return n8 == this.b - 1 && this.a(n8).f();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && b.class == object.getClass()) {
            object = (b)object;
            if (j.Objects.equals((Object)this.a, (Object)((b)object).a) && this.b == ((b)object).b && this.c == ((b)object).c && this.d == ((b)object).d && this.e == ((b)object).e && Arrays.equals(this.f, ((b)object).f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.b;
        Object object = this.a;
        int n9 = object == null ? 0 : object.hashCode();
        return ((((n8 * 31 + n9) * 31 + (int)this.c) * 31 + (int)this.d) * 31 + this.e) * 31 + Arrays.hashCode(this.f);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdPlaybackState(adsId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", adResumePositionUs=");
        stringBuilder.append(this.c);
        stringBuilder.append(", adGroups=[");
        for (int i8 = 0; i8 < this.f.length; ++i8) {
            stringBuilder.append("adGroup(timeUs=");
            stringBuilder.append(this.f[i8].a);
            stringBuilder.append(", ads=[");
            for (int i9 = 0; i9 < this.f[i8].f.length; ++i9) {
                stringBuilder.append("ad(state=");
                int n8 = this.f[i8].f[i9];
                if (n8 != 0) {
                    if (n8 != 1) {
                        if (n8 != 2) {
                            if (n8 != 3) {
                                if (n8 != 4) {
                                    stringBuilder.append('?');
                                } else {
                                    stringBuilder.append('!');
                                }
                            } else {
                                stringBuilder.append('P');
                            }
                        } else {
                            stringBuilder.append('S');
                        }
                    } else {
                        stringBuilder.append('R');
                    }
                } else {
                    stringBuilder.append('_');
                }
                stringBuilder.append(", durationUs=");
                stringBuilder.append(this.f[i8].g[i9]);
                stringBuilder.append(')');
                if (i9 >= this.f[i8].f.length - 1) continue;
                stringBuilder.append(", ");
            }
            stringBuilder.append("])");
            if (i8 >= this.f.length - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("])");
        return stringBuilder.toString();
    }

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
        public final y[] e;
        public final int[] f;
        public final long[] g;
        public final String[] h;
        public final long i;
        public final boolean j;
        public final boolean k;

        public a(long l8) {
            this(l8, -1, -1, new int[0], new y[0], new long[0], 0L, false, new String[0], false);
        }

        private a(long l8, int n8, int n9, int[] object, y[] yArray, long[] objectArray, long l9, boolean bl, String[] stringArray, boolean bl2) {
            int n10 = ((int[])object).length;
            int n11 = yArray.length;
            int n12 = 0;
            boolean bl3 = n10 == n11;
            ax.S0.a.a(bl3);
            this.a = l8;
            this.b = n8;
            this.c = n9;
            this.f = object;
            this.e = yArray;
            this.g = objectArray;
            this.i = l9;
            this.j = bl;
            this.d = new Uri[yArray.length];
            for (n8 = n12; n8 < (objectArray = (Object[])this.d).length; ++n8) {
                object = yArray[n8];
                object = object == null ? null : (Object)ax.S0.a.e(object.b).a;
                objectArray[n8] = (long)object;
            }
            this.h = stringArray;
            this.k = bl2;
        }

        private static long[] a(long[] lArray, int n8) {
            int n9 = lArray.length;
            n8 = Math.max(n8, n9);
            lArray = Arrays.copyOf(lArray, n8);
            Arrays.fill(lArray, n9, n8, -9223372036854775807L);
            return lArray;
        }

        private static int[] b(int[] nArray, int n8) {
            int n9 = nArray.length;
            n8 = Math.max(n8, n9);
            nArray = Arrays.copyOf(nArray, n8);
            Arrays.fill(nArray, n9, n8, 0);
            return nArray;
        }

        public int c() {
            return this.d(-1);
        }

        public int d(int n8) {
            int n9;
            int[] nArray;
            ++n8;
            while (n8 < (nArray = this.f).length && !this.j && (n9 = nArray[n8]) != 0 && n9 != 1) {
                ++n8;
            }
            return n8;
        }

        public boolean e() {
            if (this.b == -1) {
                return true;
            }
            for (int i8 = 0; i8 < this.b; ++i8) {
                int n8 = this.f[i8];
                if (n8 != 0 && n8 != 1) {
                    continue;
                }
                return true;
            }
            return false;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && a.class == object.getClass()) {
                object = (a)object;
                if (this.a == ((a)object).a && this.b == ((a)object).b && this.c == ((a)object).c && Arrays.equals(this.e, ((a)object).e) && Arrays.equals(this.f, ((a)object).f) && Arrays.equals(this.g, ((a)object).g) && this.i == ((a)object).i && this.j == ((a)object).j && Arrays.equals(this.h, ((a)object).h) && this.k == ((a)object).k) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.k && this.a == Long.MIN_VALUE && this.b == -1;
        }

        public boolean g() {
            return this.b == -1 || this.c() < this.b;
            {
            }
        }

        public a h(int n8) {
            int[] nArray = ax.P0.b$a.b(this.f, n8);
            long[] lArray = ax.P0.b$a.a(this.g, n8);
            y[] yArray = Arrays.copyOf(this.e, n8);
            String[] stringArray = Arrays.copyOf(this.h, n8);
            return new a(this.a, n8, this.c, nArray, yArray, lArray, this.i, this.j, stringArray, this.k);
        }

        public int hashCode() {
            int n8 = this.b;
            int n9 = this.c;
            long l8 = this.a;
            int n10 = (int)(l8 ^ l8 >>> 32);
            int n11 = Arrays.hashCode(this.e);
            int n12 = Arrays.hashCode(this.f);
            int n13 = Arrays.hashCode(this.g);
            l8 = this.i;
            return ((((((((n8 * 31 + n9) * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + (int)(l8 ^ l8 >>> 32)) * 31 + this.j) * 31 + Arrays.hashCode(this.h)) * 31 + this.k;
        }
    }
}

