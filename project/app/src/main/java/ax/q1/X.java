/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import android.util.Base64;
import ax.P0.C;
import ax.P0.E;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.u;
import ax.q1.W;
import ax.r7.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class X {
    public static int[] a(int n8) {
        if (n8 != 3) {
            if (n8 != 5) {
                if (n8 != 6) {
                    if (n8 != 7) {
                        if (n8 != 8) {
                            return null;
                        }
                        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                    }
                    return new int[]{0, 2, 1, 6, 5, 3, 4};
                }
                return new int[]{0, 2, 1, 5, 3, 4};
            }
            return new int[]{0, 2, 1, 3, 4};
        }
        return new int[]{0, 2, 1};
    }

    public static int b(int n8) {
        int n9 = 0;
        while (n8 > 0) {
            ++n9;
            n8 >>>= 1;
        }
        return n9;
    }

    private static long c(long l8, long l9) {
        return (long)Math.floor(Math.pow(l8, 1.0 / (double)l9));
    }

    public static C d(List<String> object) {
        ArrayList<C.a> arrayList = new ArrayList<C.a>();
        for (int i8 = 0; i8 < object.size(); ++i8) {
            Object object2 = object.get(i8);
            Object object3 = d0.y1((String)object2, "=");
            if (((String[])object3).length != 2) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("Failed to parse Vorbis comment: ");
                ((StringBuilder)object3).append((String)object2);
                u.h("VorbisUtil", ((StringBuilder)object3).toString());
                continue;
            }
            if (object3[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    object2 = Base64.decode((String)object3[1], (int)0);
                    object3 = new G((byte[])object2);
                    arrayList.add(ax.C1.a.d((G)object3));
                }
                catch (RuntimeException runtimeException) {
                    u.i("VorbisUtil", "Failed to parse vorbis picture", runtimeException);
                }
                continue;
            }
            arrayList.add(new ax.H1.a((String)object3[0], (String)object3[1]));
        }
        object = arrayList.isEmpty() ? null : new C(arrayList);
        return object;
    }

    public static z<byte[]> e(byte[] byArray) {
        Object object = new G(byArray);
        ((G)object).c0(1);
        int n8 = 0;
        while (((G)object).a() > 0 && ((G)object).n() == 255) {
            n8 += 255;
            ((G)object).c0(1);
        }
        int n9 = n8 + ((G)object).M();
        n8 = 0;
        while (((G)object).a() > 0 && ((G)object).n() == 255) {
            n8 += 255;
            ((G)object).c0(1);
        }
        int n10 = ((G)object).M();
        byte[] byArray2 = new byte[n9];
        int n11 = ((G)object).g();
        System.arraycopy(byArray, n11, byArray2, 0, n9);
        n9 = n11 + n9 + (n8 + n10);
        n8 = byArray.length - n9;
        object = new byte[n8];
        System.arraycopy(byArray, n9, object, 0, n8);
        return z.B(byArray2, object);
    }

    private static void f(W object) throws E {
        int n8 = ((W)object).d(6);
        for (int i8 = 0; i8 < n8 + 1; ++i8) {
            int n9;
            int n10 = ((W)object).d(16);
            if (n10 != 0) {
                if (n10 == 1) {
                    int n11;
                    int n12;
                    int n13 = ((W)object).d(5);
                    int[] nArray = new int[n13];
                    n9 = -1;
                    for (n10 = 0; n10 < n13; ++n10) {
                        nArray[n10] = n12 = ((W)object).d(4);
                        n11 = n9;
                        if (n12 > n9) {
                            n11 = n12;
                        }
                        n9 = n11;
                    }
                    n11 = n9 + 1;
                    int[] nArray2 = new int[n11];
                    for (n10 = 0; n10 < n11; ++n10) {
                        nArray2[n10] = ((W)object).d(3) + 1;
                        n12 = ((W)object).d(2);
                        if (n12 > 0) {
                            ((W)object).e(8);
                        }
                        for (n9 = 0; n9 < 1 << n12; ++n9) {
                            ((W)object).e(8);
                        }
                    }
                    ((W)object).e(2);
                    n12 = ((W)object).d(4);
                    n11 = 0;
                    n10 = 0;
                    for (n9 = 0; n9 < n13; ++n9) {
                        n11 += nArray2[nArray[n9]];
                        while (n10 < n11) {
                            ((W)object).e(n12);
                            ++n10;
                        }
                    }
                    continue;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("floor type greater than 1 not decodable: ");
                ((StringBuilder)object).append(n10);
                throw E.a(((StringBuilder)object).toString(), null);
            }
            ((W)object).e(8);
            ((W)object).e(16);
            ((W)object).e(16);
            ((W)object).e(6);
            ((W)object).e(8);
            n9 = ((W)object).d(4);
            for (n10 = 0; n10 < n9 + 1; ++n10) {
                ((W)object).e(8);
            }
        }
    }

    private static void g(int n8, W w8) throws E {
        int n9 = w8.d(6);
        for (int i8 = 0; i8 < n9 + 1; ++i8) {
            int n10;
            int n11 = w8.d(16);
            if (n11 != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("mapping type other than 0 not supported: ");
                stringBuilder.append(n11);
                u.c("VorbisUtil", stringBuilder.toString());
                continue;
            }
            n11 = w8.c() ? w8.d(4) + 1 : 1;
            if (w8.c()) {
                int n12 = w8.d(8);
                for (n10 = 0; n10 < n12 + 1; ++n10) {
                    int n13 = n8 - 1;
                    w8.e(X.b(n13));
                    w8.e(X.b(n13));
                }
            }
            if (w8.d(2) == 0) {
                if (n11 > 1) {
                    for (n10 = 0; n10 < n8; ++n10) {
                        w8.e(4);
                    }
                }
                for (n10 = 0; n10 < n11; ++n10) {
                    w8.e(8);
                    w8.e(8);
                    w8.e(8);
                }
                continue;
            }
            throw E.a("to reserved bits must be zero after mapping coupling steps", null);
        }
    }

    private static b[] h(W w8) {
        int n8 = w8.d(6) + 1;
        b[] bArray = new b[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            bArray[i8] = new b(w8.c(), w8.d(16), w8.d(16), w8.d(8));
        }
        return bArray;
    }

    private static void i(W w8) throws E {
        int n8 = w8.d(6);
        for (int i8 = 0; i8 < n8 + 1; ++i8) {
            if (w8.d(16) <= 2) {
                int n9;
                int n10;
                w8.e(24);
                w8.e(24);
                w8.e(24);
                int n11 = w8.d(6) + 1;
                w8.e(8);
                int[] nArray = new int[n11];
                for (n10 = 0; n10 < n11; ++n10) {
                    int n12 = w8.d(3);
                    n9 = w8.c() ? w8.d(5) : 0;
                    nArray[n10] = n9 * 8 + n12;
                }
                for (n10 = 0; n10 < n11; ++n10) {
                    for (n9 = 0; n9 < 8; ++n9) {
                        if ((nArray[n10] & 1 << n9) == 0) continue;
                        w8.e(8);
                    }
                }
                continue;
            }
            throw E.a("residueType greater than 2 is not decodable", null);
        }
    }

    public static a j(G g8) throws E {
        return X.k(g8, true, true);
    }

    public static a k(G g8, boolean bl, boolean bl2) throws E {
        int n8 = 0;
        if (bl) {
            X.o(3, g8, false);
        }
        String string = g8.J((int)g8.C());
        int n9 = string.length();
        long l8 = g8.C();
        String[] stringArray = new String[(int)l8];
        n9 += 15;
        while ((long)n8 < l8) {
            String string2;
            stringArray[n8] = string2 = g8.J((int)g8.C());
            n9 = n9 + 4 + string2.length();
            ++n8;
        }
        if (bl2 && (g8.M() & 1) == 0) {
            throw E.a("framing bit expected to be set", null);
        }
        return new a(string, stringArray, n9 + 1);
    }

    public static c l(G g8) throws E {
        int n8;
        int n9;
        int n10;
        X.o(1, g8, false);
        int n11 = g8.D();
        int n12 = g8.M();
        int n13 = g8.D();
        int n14 = n10 = g8.z();
        if (n10 <= 0) {
            n14 = -1;
        }
        n10 = n9 = g8.z();
        if (n9 <= 0) {
            n10 = -1;
        }
        n9 = n8 = g8.z();
        if (n8 <= 0) {
            n9 = -1;
        }
        int n15 = g8.M();
        n8 = (int)Math.pow(2.0, n15 & 0xF);
        n15 = (int)Math.pow(2.0, (n15 & 0xF0) >> 4);
        boolean bl = (g8.M() & 1) > 0;
        return new c(n11, n12, n13, n14, n10, n9, n8, n15, bl, Arrays.copyOf(g8.f(), g8.j()));
    }

    public static b[] m(G bArray, int n8) throws E {
        int n9;
        int n10 = 0;
        X.o(5, (G)bArray, false);
        int n11 = bArray.M();
        W w8 = new W(bArray.f());
        w8.e(bArray.g() * 8);
        for (n9 = 0; n9 < n11 + 1; ++n9) {
            X.n(w8);
        }
        n11 = w8.d(6);
        for (n9 = n10; n9 < n11 + 1; ++n9) {
            if (w8.d(16) == 0) {
                continue;
            }
            throw E.a("placeholder of time domain transforms not zeroed out", null);
        }
        X.f(w8);
        X.i(w8);
        X.g(n8, w8);
        bArray = X.h(w8);
        if (w8.c()) {
            return bArray;
        }
        throw E.a("framing bit after modes not set as expected", null);
    }

    private static void n(W object) throws E {
        if (((W)object).d(24) == 5653314) {
            int n8;
            int n9 = ((W)object).d(16);
            int n10 = ((W)object).d(24);
            boolean bl = ((W)object).c();
            int n11 = 0;
            if (!bl) {
                bl = ((W)object).c();
                for (n8 = n11; n8 < n10; ++n8) {
                    if (bl) {
                        if (!((W)object).c()) continue;
                        ((W)object).e(5);
                        continue;
                    }
                    ((W)object).e(5);
                }
            } else {
                ((W)object).e(5);
                for (n8 = 0; n8 < n10; n8 += ((W)object).d(X.b(n10 - n8))) {
                }
            }
            if ((n11 = ((W)object).d(4)) <= 2) {
                long l8;
                if (n11 != 1 && n11 != 2) {
                    return;
                }
                ((W)object).e(32);
                ((W)object).e(32);
                n8 = ((W)object).d(4);
                ((W)object).e(1);
                if (n11 == 1) {
                    l8 = n9 != 0 ? X.c(n10, n9) : 0L;
                } else {
                    l8 = n10;
                    l8 = (long)n9 * l8;
                }
                ((W)object).e((int)(l8 * (long)(n8 + 1)));
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("lookup type greater than 2 not decodable: ");
            ((StringBuilder)object).append(n11);
            throw E.a(((StringBuilder)object).toString(), null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected code book to start with [0x56, 0x43, 0x42] at ");
        stringBuilder.append(((W)object).b());
        throw E.a(stringBuilder.toString(), null);
    }

    public static boolean o(int n8, G object, boolean bl) throws E {
        if (((G)object).a() < 7) {
            if (bl) {
                return false;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("too short header: ");
            stringBuilder.append(((G)object).a());
            throw E.a(stringBuilder.toString(), null);
        }
        if (((G)object).M() != n8) {
            if (bl) {
                return false;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("expected header type ");
            ((StringBuilder)object).append(Integer.toHexString(n8));
            throw E.a(((StringBuilder)object).toString(), null);
        }
        if (((G)object).M() == 118 && ((G)object).M() == 111 && ((G)object).M() == 114 && ((G)object).M() == 98 && ((G)object).M() == 105 && ((G)object).M() == 115) {
            return true;
        }
        if (bl) {
            return false;
        }
        throw E.a("expected characters 'vorbis'", null);
    }

    public static final class a {
        public final String a;
        public final String[] b;
        public final int c;

        public a(String string, String[] stringArray, int n8) {
            this.a = string;
            this.b = stringArray;
            this.c = n8;
        }
    }

    public static final class b {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;

        public b(boolean bl, int n8, int n9, int n10) {
            this.a = bl;
            this.b = n8;
            this.c = n9;
            this.d = n10;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public c(int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, boolean bl, byte[] byArray) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = n13;
            this.g = n14;
            this.h = n15;
            this.i = bl;
            this.j = byArray;
        }
    }
}

