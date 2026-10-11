/*
 * Decompiled with CFR 0.152.
 */
package ax.Y1;

import android.util.Pair;
import ax.P0.E;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.u;
import ax.Y1.c;
import ax.q1.s;
import java.io.IOException;
import java.util.Arrays;

final class d {
    private static final byte[] a = new byte[]{0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] b = new byte[]{0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(s object) throws IOException {
        G g8 = new G(8);
        int n8 = ax.Y1.d$a.a((s)object, (G)g8).a;
        if (n8 != 1380533830 && n8 != 1380333108) {
            return false;
        }
        object.p(g8.f(), 0, 4);
        g8.b0(0);
        n8 = g8.v();
        if (n8 != 1463899717) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Unsupported form type: ");
            ((StringBuilder)object).append(n8);
            u.c("WavHeaderReader", ((StringBuilder)object).toString());
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static c b(s object) throws IOException {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        Object object2;
        block7: {
            int n14;
            block6: {
                Object object3 = new G(16);
                object2 = d.d(1718449184, (s)object, (G)object3);
                boolean bl = ((a)object2).b >= 16L;
                ax.S0.a.g(bl);
                object.p(((G)object3).f(), 0, 16);
                ((G)object3).b0(0);
                n14 = ((G)object3).E();
                n13 = ((G)object3).E();
                n12 = ((G)object3).D();
                n11 = ((G)object3).D();
                n10 = ((G)object3).E();
                n9 = ((G)object3).E();
                int n15 = (int)((a)object2).b - 16;
                if (n15 <= 0) break block6;
                object3 = new byte[n15];
                object.p((byte[])object3, 0, n15);
                object2 = object3;
                n8 = n14;
                if (n14 != 65534) break block7;
                object2 = object3;
                n8 = n14;
                if (n15 == 24) {
                    object2 = new G((byte[])object3);
                    ((G)object2).E();
                    n8 = ((G)object2).E();
                    if (n8 != 0 && n8 != n9) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("validBits ( ");
                        ((StringBuilder)object).append(n8);
                        ((StringBuilder)object).append(")  != bitsPerSample( ");
                        ((StringBuilder)object).append(n9);
                        ((StringBuilder)object).append(") are not supported");
                        throw E.d(((StringBuilder)object).toString());
                    }
                    n8 = ((G)object2).D();
                    if (n8 >> 18 != 0) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("invalid channel mask ");
                        ((StringBuilder)object).append(n8);
                        throw E.d(((StringBuilder)object).toString());
                    }
                    if (n8 != 0 && Integer.bitCount(n8) != n13) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("invalid number of channels (");
                        ((StringBuilder)object).append(Integer.bitCount(n8));
                        ((StringBuilder)object).append(") in channel mask ");
                        ((StringBuilder)object).append(n8);
                        throw E.d(((StringBuilder)object).toString());
                    }
                    n14 = ((G)object2).E();
                    byte[] byArray = new byte[14];
                    ((G)object2).q(byArray, 0, 14);
                    object2 = object3;
                    n8 = n14;
                    if (!Arrays.equals(byArray, a)) {
                        if (!Arrays.equals(byArray, b)) {
                            throw E.d("invalid wav format extension guid");
                        }
                        object2 = object3;
                        n8 = n14;
                    }
                }
                break block7;
            }
            object2 = d0.f;
            n8 = n14;
        }
        object.n((int)(object.i() - object.getPosition()));
        return new c(n8, n13, n12, n11, n10, n9, (byte[])object2);
    }

    public static long c(s s8) throws IOException {
        G g8 = new G(8);
        a a8 = ax.Y1.d$a.a(s8, g8);
        if (a8.a != 1685272116) {
            s8.m();
            return -1L;
        }
        s8.j(8);
        g8.b0(0);
        s8.p(g8.f(), 0, 8);
        long l8 = g8.A();
        s8.n((int)a8.b + 8);
        return l8;
    }

    private static a d(int n8, s object, G g8) throws IOException {
        a a8 = ax.Y1.d$a.a((s)object, g8);
        while (a8.a != n8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring unknown WAV chunk: ");
            stringBuilder.append(a8.a);
            u.h("WavHeaderReader", stringBuilder.toString());
            long l8 = a8.b;
            long l9 = 8L + l8;
            if (l8 % 2L != 0L) {
                l9 = 9L + l8;
            }
            if (l9 <= Integer.MAX_VALUE) {
                object.n((int)l9);
                a8 = ax.Y1.d$a.a((s)object, g8);
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Chunk is too large (~2GB+) to skip; id: ");
            ((StringBuilder)object).append(a8.a);
            throw E.d(((StringBuilder)object).toString());
        }
        return a8;
    }

    public static Pair<Long, Long> e(s s8) throws IOException {
        s8.m();
        a a8 = d.d(1684108385, s8, new G(8));
        s8.n(8);
        return Pair.create((Object)s8.getPosition(), (Object)a8.b);
    }

    private static final class a {
        public final int a;
        public final long b;

        private a(int n8, long l8) {
            this.a = n8;
            this.b = l8;
        }

        public static a a(s s8, G g8) throws IOException {
            s8.p(g8.f(), 0, 8);
            g8.b0(0);
            return new a(g8.v(), g8.C());
        }
    }
}

