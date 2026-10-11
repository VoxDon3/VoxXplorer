/*
 * Decompiled with CFR 0.152.
 */
package ax.wd;

import ax.Nd.e;
import ax.Nd.h;
import ax.vd.j;

public class a
implements j {
    private static final long[] m = new long[]{7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};
    private static final byte[][] n;
    private static int o;
    private int a = 64;
    private int b = 0;
    private byte[] c = null;
    private byte[] d = null;
    private byte[] e = null;
    private byte[] f = null;
    private int g = 0;
    private long[] h = new long[16];
    private long[] i = null;
    private long j = 0L;
    private long k = 0L;
    private long l = 0L;

    static {
        byte[] byArray = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        byte[] byArray2 = new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8};
        byte[] byArray3 = new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13};
        byte[] byArray4 = new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9};
        byte[] byArray5 = new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10};
        byte[] byArray6 = new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5};
        byte[] byArray7 = new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0};
        byte[] byArray8 = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        n = new byte[][]{byArray, {14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, {11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, byArray2, byArray3, byArray4, {12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, byArray5, byArray6, byArray7, byArray8, {14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};
        o = 12;
    }

    public a(int n8) {
        if (n8 >= 8 && n8 <= 512 && n8 % 8 == 0) {
            this.f = new byte[128];
            this.b = 0;
            this.a = n8 / 8;
            this.k();
            return;
        }
        throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
    }

    private void g(long l8, long l9, int n8, int n9, int n10, int n11) {
        long[] lArray = this.h;
        lArray[n8] = l8 = lArray[n8] + lArray[n9] + l8;
        lArray[n11] = ax.Nd.e.b(lArray[n11] ^ l8, 32);
        lArray = this.h;
        lArray[n10] = l8 = lArray[n10] + lArray[n11];
        lArray[n9] = ax.Nd.e.b(l8 ^ lArray[n9], 24);
        lArray = this.h;
        lArray[n8] = l8 = lArray[n8] + lArray[n9] + l9;
        lArray[n11] = ax.Nd.e.b(lArray[n11] ^ l8, 16);
        lArray = this.h;
        lArray[n10] = l8 = lArray[n10] + lArray[n11];
        lArray[n9] = ax.Nd.e.b(l8 ^ lArray[n9], 63);
    }

    private void j(byte[] object, int n8) {
        int n9;
        this.l();
        long[] lArray = new long[16];
        int n10 = 0;
        for (n9 = 0; n9 < 16; ++n9) {
            lArray[n9] = ax.Nd.h.l(object, n9 * 8 + n8);
        }
        n9 = 0;
        while (true) {
            if (n9 >= o) break;
            object = n;
            byte by = object[n9];
            this.g(lArray[by[0]], lArray[by[1]], 0, 4, 8, 12);
            by = object[n9];
            this.g(lArray[by[2]], lArray[by[3]], 1, 5, 9, 13);
            by = object[n9];
            this.g(lArray[by[4]], lArray[by[5]], 2, 6, 10, 14);
            by = object[n9];
            this.g(lArray[by[6]], lArray[by[7]], 3, 7, 11, 15);
            by = object[n9];
            this.g(lArray[by[8]], lArray[by[9]], 0, 5, 10, 15);
            by = object[n9];
            this.g(lArray[by[10]], lArray[by[11]], 1, 6, 11, 12);
            by = object[n9];
            this.g(lArray[by[12]], lArray[by[13]], 2, 7, 8, 13);
            object = object[n9];
            this.g(lArray[object[14]], lArray[object[15]], 3, 4, 9, 14);
            ++n9;
        }
        for (n8 = n10; n8 < ((byte[])(object = (Object)this.i)).length; ++n8) {
            byte by = object[n8];
            lArray = this.h;
            object[n8] = by ^ lArray[n8] ^ lArray[n8 + 8];
        }
    }

    private void k() {
        if (this.i == null) {
            long l8;
            long[] lArray = new long[8];
            this.i = lArray;
            Object[] objectArray = m;
            lArray[0] = objectArray[0] ^ (long)(this.a | this.b << 8 | 0x1010000);
            lArray[1] = objectArray[1];
            lArray[2] = objectArray[2];
            lArray[3] = objectArray[3];
            lArray[4] = l8 = objectArray[4];
            lArray[5] = objectArray[5];
            Object[] objectArray2 = this.c;
            if (objectArray2 != null) {
                lArray[4] = l8 ^ ax.Nd.h.l(objectArray2, 0);
                objectArray2 = this.i;
                objectArray2[5] = objectArray2[5] ^ ax.Nd.h.l(this.c, 8);
            }
            objectArray2 = this.i;
            l8 = objectArray[6];
            objectArray2[6] = (byte)l8;
            objectArray2[7] = (byte)objectArray[7];
            objectArray = this.d;
            if (objectArray != null) {
                objectArray2[6] = (byte)(ax.Nd.h.l((byte[])objectArray, 0) ^ l8);
                objectArray = this.i;
                objectArray[7] = objectArray[7] ^ ax.Nd.h.l(this.d, 8);
            }
        }
    }

    private void l() {
        long[] lArray = this.i;
        System.arraycopy(lArray, 0, this.h, 0, lArray.length);
        lArray = m;
        System.arraycopy(lArray, 0, this.h, this.i.length, 4);
        long[] lArray2 = this.h;
        lArray2[12] = this.j ^ lArray[4];
        lArray2[13] = this.k ^ lArray[5];
        lArray2[14] = this.l ^ lArray[6];
        lArray2[15] = lArray[7];
    }

    @Override
    public void a() {
        this.g = 0;
        this.l = 0L;
        this.j = 0L;
        this.k = 0L;
        this.i = null;
        ax.Nd.a.g(this.f, (byte)0);
        byte[] byArray = this.e;
        if (byArray != null) {
            System.arraycopy(byArray, 0, this.f, 0, byArray.length);
            this.g = 128;
        }
        this.k();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void b(byte[] byArray, int n8, int n9) {
        block7: {
            long l8;
            int n10;
            block6: {
                block4: {
                    int n11;
                    block5: {
                        if (byArray == null) return;
                        if (n9 == 0) {
                            return;
                        }
                        n11 = this.g;
                        if (n11 == 0) break block4;
                        n10 = 128 - n11;
                        if (n10 >= n9) break block5;
                        System.arraycopy(byArray, n8, this.f, n11, n10);
                        this.j = l8 = this.j + 128L;
                        if (l8 == 0L) {
                            ++this.k;
                        }
                        this.j(this.f, 0);
                        this.g = 0;
                        ax.Nd.a.g(this.f, (byte)0);
                        break block6;
                    }
                    System.arraycopy(byArray, n8, this.f, n11, n9);
                    break block7;
                }
                n10 = 0;
            }
            n9 += n8;
            n8 += n10;
            while (n8 < n9 - 128) {
                this.j = l8 = this.j + 128L;
                if (l8 == 0L) {
                    ++this.k;
                }
                this.j(byArray, n8);
                n8 += 128;
            }
            byte[] byArray2 = this.f;
            System.arraycopy(byArray, n8, byArray2, 0, n9 -= n8);
        }
        this.g += n9;
    }

    @Override
    public int c(byte[] byArray, int n8) {
        int n9;
        Object[] objectArray;
        this.l = -1L;
        long l8 = this.j;
        int n10 = this.g;
        this.j = l8 += (long)n10;
        if (n10 > 0 && l8 == 0L) {
            ++this.k;
        }
        this.j(this.f, 0);
        ax.Nd.a.g(this.f, (byte)0);
        ax.Nd.a.j(this.h, 0L);
        for (n10 = 0; n10 < (objectArray = this.i).length && (n9 = n10 * 8) < this.a; ++n10) {
            objectArray = ax.Nd.h.s(objectArray[n10]);
            int n11 = this.a;
            if (n9 < n11 - 8) {
                System.arraycopy(objectArray, 0, byArray, n9 + n8, 8);
                continue;
            }
            System.arraycopy(objectArray, 0, byArray, n8 + n9, n11 - n9);
        }
        ax.Nd.a.j(objectArray, 0L);
        this.a();
        return this.a;
    }

    @Override
    public void d(byte by) {
        int n8 = this.g;
        if (128 - n8 == 0) {
            long l8;
            this.j = l8 = this.j + 128L;
            if (l8 == 0L) {
                ++this.k;
            }
            this.j(this.f, 0);
            ax.Nd.a.g(this.f, (byte)0);
            this.f[0] = by;
            this.g = 1;
            return;
        }
        this.f[n8] = by;
        this.g = n8 + 1;
    }

    @Override
    public String f() {
        return "BLAKE2b";
    }

    @Override
    public int h() {
        return 128;
    }

    @Override
    public int i() {
        return this.a;
    }
}

