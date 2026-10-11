/*
 * Decompiled with CFR 0.152.
 */
package ax.wd;

import ax.Nd.f;
import ax.Nd.h;
import ax.vd.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public abstract class d
implements j,
f {
    static final long[] o = ax.wd.d.$d2j$hex$e73cc014$decode_J("22ae28d7982f8a42cd65ef23914437712f3b4deccffbc0b5bcdb8981a5dbb5e938b548f35bc2563919d005b6f111f1599b4f19afa4823f9218816ddad55e1cab420203a398aa07d8be6f7045015b83128cb2e44ebe853124e2b4ffd5c37d0c556f897bf2745dbe72b196163bfeb1de803512c725a706dc9b942669cf74f19bc1d24af19ec1699be4e3254f388647beefb5d58c8bc69dc10f659cac77cca10c2475022b596f2ce92d83e4a66eaa84744ad4fb41bddca9b05cb5531183da88f976abdf66ee52513e981032b42d6dc631a83f21fb98c82703b0e40eefbec77f59bfc28fa83df30be0c625a70a934791a7d56f8203e05163ca06706e0e0a67292914fc2fd246850ab72726c9265c38211b2eed2ac45afc6d2c4ddfb3959d130d3853de63af8b54730a65a8b2773cbb0a6a76e6aeed472ec9c2813b358214852c72926403f14ca1e8bfa2013042bc4b661aa89197f8d0708b4bc230be5406a3516cc71852efd619e892d110a96555240699d62a20715785350ef4b8d1bb3270a06a10c8d0d2b816c1a41953ab4151086c371e99eb8edf4c774827a8489be1b5bcb034635ac9c5b30c1c39cb8a41e34aaad84e73e363774fca9c5ba3b8b2d6f36f2e68fcb2ef5dee828f74602f17436f63a57872abf0a11478c884ec39641a0802c78c281e6323faffbe90e9bd82deeb6c50a41579c6b2f7a3f9be2b5372e3f27871c69c6126eace3e27ca07c2c021c7b886d11eebe0cdd67ddaea78d16eee7f4f7df5ba6f1772aa67f006a698c8a2c57d630aae0df9be04983f111b471c13350b711b847d0423f577db289324c7407babca32bcbec9150abe9e3c4c0d109cc4671d43b6423ecbbed4c54c2a7e65fc9c297f59ecfad63aab6fcb5f1758474a8c19446c");
    private byte[] a = new byte[8];
    private int b;
    private long c;
    private long d;
    protected long e;
    protected long f;
    protected long g;
    protected long h;
    protected long i;
    protected long j;
    protected long k;
    protected long l;
    private long[] m = new long[80];
    private int n;

    protected d() {
        this.b = 0;
        this.a();
    }

    protected d(d d8) {
        this.r(d8);
    }

    private long k(long l8, long l9, long l10) {
        return (l8 ^ 0xFFFFFFFFFFFFFFFFL) & l10 ^ l9 & l8;
    }

    private long l(long l8, long l9, long l10) {
        return l8 & l10 ^ l8 & l9 ^ l9 & l10;
    }

    private long m(long l8) {
        return l8 >>> 7 ^ ((l8 << 63 | l8 >>> 1) ^ (l8 << 56 | l8 >>> 8));
    }

    private long n(long l8) {
        return l8 >>> 6 ^ ((l8 << 45 | l8 >>> 19) ^ (l8 << 3 | l8 >>> 61));
    }

    private long o(long l8) {
        return (l8 >>> 39 | l8 << 25) ^ ((l8 << 36 | l8 >>> 28) ^ (l8 << 30 | l8 >>> 34));
    }

    private long p(long l8) {
        return (l8 >>> 41 | l8 << 23) ^ ((l8 << 50 | l8 >>> 14) ^ (l8 << 46 | l8 >>> 18));
    }

    private void q() {
        long l8 = this.c;
        if (l8 > 0x1FFFFFFFFFFFFFFFL) {
            this.d += l8 >>> 61;
            this.c = l8 & 0x1FFFFFFFFFFFFFFFL;
        }
    }

    @Override
    public void a() {
        Object[] objectArray;
        int n8;
        this.c = 0L;
        this.d = 0L;
        int n9 = 0;
        this.b = 0;
        for (n8 = 0; n8 < (objectArray = this.a).length; ++n8) {
            objectArray[n8] = 0;
        }
        this.n = 0;
        for (n8 = n9; n8 != (objectArray = (Object[])this.m).length; ++n8) {
            objectArray[n8] = (byte)0L;
        }
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        int n10 = n9;
        int n11 = n8;
        while (true) {
            n8 = n11;
            n9 = n10;
            if (this.b == 0) break;
            n8 = n11;
            n9 = n10;
            if (n10 <= 0) break;
            this.d(byArray[n11]);
            ++n11;
            --n10;
        }
        while (true) {
            n10 = n8;
            if (n9 <= this.a.length) break;
            this.v(byArray, n8);
            byte[] byArray2 = this.a;
            n8 += byArray2.length;
            n9 -= byArray2.length;
            this.c += (long)byArray2.length;
        }
        for (n11 = n9; n11 > 0; --n11) {
            this.d(byArray[n10]);
            ++n10;
        }
    }

    @Override
    public void d(byte by) {
        int n8;
        byte[] byArray = this.a;
        int n9 = this.b;
        this.b = n8 = n9 + 1;
        byArray[n9] = by;
        if (n8 == byArray.length) {
            this.v(byArray, 0);
            this.b = 0;
        }
        ++this.c;
    }

    @Override
    public int h() {
        return 128;
    }

    protected void r(d d8) {
        Object[] objectArray = d8.a;
        System.arraycopy(objectArray, 0, this.a, 0, objectArray.length);
        this.b = d8.b;
        this.c = d8.c;
        this.d = d8.d;
        this.e = d8.e;
        this.f = d8.f;
        this.g = d8.g;
        this.h = d8.h;
        this.i = d8.i;
        this.j = d8.j;
        this.k = d8.k;
        this.l = d8.l;
        objectArray = d8.m;
        System.arraycopy(objectArray, 0, this.m, 0, objectArray.length);
        this.n = d8.n;
    }

    public void s() {
        this.q();
        long l8 = this.c;
        long l9 = this.d;
        byte by = -128;
        while (true) {
            this.d(by);
            if (this.b == 0) break;
            by = 0;
        }
        this.u(l8 << 3, l9);
        this.t();
    }

    protected void t() {
        long[] lArray;
        long l8;
        long[] lArray2;
        int n8;
        this.q();
        for (n8 = 16; n8 <= 79; ++n8) {
            lArray2 = this.m;
            l8 = this.n(lArray2[n8 - 2]);
            lArray = this.m;
            lArray2[n8] = l8 + lArray[n8 - 7] + this.m(lArray[n8 - 15]) + this.m[n8 - 16];
        }
        l8 = this.e;
        long l9 = this.f;
        long l10 = this.g;
        long l11 = this.h;
        long l12 = this.i;
        long l13 = this.j;
        long l14 = this.k;
        long l15 = this.l;
        n8 = 0;
        int n9 = 0;
        while (n8 < 10) {
            long l16 = this.p(l12);
            long l17 = this.k(l12, l13, l14);
            lArray2 = o;
            long l18 = lArray2[n9];
            lArray = this.m;
            int n10 = n9 + 1;
            l11 += (l15 += l16 + l17 + l18 + lArray[n9]);
            l15 += this.o(l8) + this.l(l8, l9, l10);
            l17 = this.p(l11);
            l16 = this.k(l11, l12, l13);
            l18 = lArray2[n10];
            lArray = this.m;
            int n11 = n9 + 2;
            l10 += (l14 += l17 + l16 + l18 + lArray[n10]);
            l14 += this.o(l15) + this.l(l15, l8, l9);
            l16 = this.p(l10);
            l18 = this.k(l10, l11, l12);
            l17 = lArray2[n11];
            lArray = this.m;
            n10 = n9 + 3;
            l9 += (l13 += l16 + l18 + l17 + lArray[n11]);
            l13 += this.o(l14) + this.l(l14, l15, l8);
            l18 = this.p(l9);
            l17 = this.k(l9, l10, l11);
            l16 = lArray2[n10];
            lArray = this.m;
            n11 = n9 + 4;
            l8 += (l12 += l18 + l17 + l16 + lArray[n10]);
            l12 += this.o(l13) + this.l(l13, l14, l15);
            l16 = this.p(l8);
            l17 = this.k(l8, l9, l10);
            l18 = lArray2[n11];
            lArray = this.m;
            n10 = n9 + 5;
            l15 += (l11 += l16 + l17 + l18 + lArray[n11]);
            l11 += this.o(l12) + this.l(l12, l13, l14);
            l17 = this.p(l15);
            l18 = this.k(l15, l8, l9);
            l16 = lArray2[n10];
            lArray = this.m;
            int n12 = n9 + 6;
            l14 += (l10 += l17 + l18 + l16 + lArray[n10]);
            l10 += this.o(l11) + this.l(l11, l12, l13);
            l16 = this.p(l14);
            l17 = this.k(l14, l15, l8);
            l18 = lArray2[n12];
            lArray = this.m;
            n11 = n9 + 7;
            l13 += (l9 += l16 + l17 + l18 + lArray[n12]);
            l9 += this.o(l10) + this.l(l10, l11, l12);
            l16 = this.p(l13);
            l17 = this.k(l13, l14, l15);
            l18 = lArray2[n11];
            lArray2 = this.m;
            n9 += 8;
            l16 = l8 + (l16 + l17 + l18 + lArray2[n11]);
            l8 = l16 + (this.o(l9) + this.l(l9, l10, l11));
            ++n8;
            l12 += l16;
        }
        this.e += l8;
        this.f += l9;
        this.g += l10;
        this.h += l11;
        this.i += l12;
        this.j += l13;
        this.k += l14;
        this.l += l15;
        this.n = 0;
        for (n8 = 0; n8 < 16; ++n8) {
            this.m[n8] = 0L;
        }
    }

    protected void u(long l8, long l9) {
        if (this.n > 14) {
            this.t();
        }
        long[] lArray = this.m;
        lArray[14] = l9;
        lArray[15] = l8;
    }

    protected void v(byte[] byArray, int n8) {
        this.m[this.n] = ax.Nd.h.b(byArray, n8);
        this.n = n8 = this.n + 1;
        if (n8 == 16) {
            this.t();
        }
    }

    private static long[] $d2j$hex$e73cc014$decode_J(String src) {
        byte[] d8 = ax.wd.d.$d2j$hex$e73cc014$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s8 = b8.asLongBuffer();
        long[] data = new long[d8.length / 8];
        s8.get(data);
        return data;
    }

    private static int[] $d2j$hex$e73cc014$decode_I(String src) {
        byte[] d8 = ax.wd.d.$d2j$hex$e73cc014$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s8 = b8.asIntBuffer();
        int[] data = new int[d8.length / 4];
        s8.get(data);
        return data;
    }

    private static short[] $d2j$hex$e73cc014$decode_S(String src) {
        byte[] d8 = ax.wd.d.$d2j$hex$e73cc014$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s8 = b8.asShortBuffer();
        short[] data = new short[d8.length / 2];
        s8.get(data);
        return data;
    }

    private static byte[] $d2j$hex$e73cc014$decode_B(String src) {
        char[] d8 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i8 = 0; i8 < ret.length; ++i8) {
            int ll;
            int hh;
            char h8 = d8[2 * i8];
            char l8 = d8[2 * i8 + 1];
            if (h8 >= '0' && h8 <= '9') {
                hh = h8 - 48;
            } else if (h8 >= 'a' && h8 <= 'f') {
                hh = h8 - 97 + 10;
            } else if (h8 >= 'A' && h8 <= 'F') {
                hh = h8 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            if (l8 >= '0' && l8 <= '9') {
                ll = l8 - 48;
            } else if (l8 >= 'a' && l8 <= 'f') {
                ll = l8 - 97 + 10;
            } else if (l8 >= 'A' && l8 <= 'F') {
                ll = l8 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            ret[i8] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}

