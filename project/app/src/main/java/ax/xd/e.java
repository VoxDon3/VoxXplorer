/*
 * Decompiled with CFR 0.152.
 */
package ax.xd;

import ax.Dd.k;
import ax.Dd.l;
import ax.Nd.d;
import ax.Nd.h;
import ax.Nd.j;
import ax.vd.f;
import ax.vd.m;
import ax.vd.n;
import ax.vd.t;

public class e
implements t {
    private static final int[] j = ax.Nd.h.k(ax.Nd.j.e("expand 16-byte kexpand 32-byte k"), 0, 8);
    protected static final byte[] k = ax.Nd.j.e("expand 32-byte k");
    protected static final byte[] l = ax.Nd.j.e("expand 16-byte k");
    protected int a;
    private int b = 0;
    protected int[] c = new int[16];
    protected int[] d = new int[16];
    private byte[] e = new byte[64];
    private boolean f = false;
    private int g;
    private int h;
    private int i;

    public e() {
        this(20);
    }

    public e(int n8) {
        if (n8 > 0 && (n8 & 1) == 0) {
            this.a = n8;
            return;
        }
        throw new IllegalArgumentException("'rounds' must be a positive, even number");
    }

    private boolean h(int n8) {
        int n9;
        this.g = n9 = this.g + n8;
        if (n9 < n8 && n9 >= 0) {
            this.h = n8 = this.h + 1;
            if (n8 == 0) {
                this.i = n8 = this.i + 1;
                if ((n8 & 0x20) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void k() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public static void l(int n8, int[] nArray, int[] nArray2) {
        if (nArray.length == 16) {
            if (nArray2.length == 16) {
                if (n8 % 2 == 0) {
                    int n9 = nArray[0];
                    int n10 = nArray[1];
                    int n11 = nArray[2];
                    int n12 = nArray[3];
                    int n13 = nArray[4];
                    int n14 = nArray[5];
                    int n15 = nArray[6];
                    int n16 = nArray[7];
                    int n17 = nArray[8];
                    int n18 = nArray[9];
                    int n19 = nArray[10];
                    int n20 = nArray[11];
                    int n21 = nArray[12];
                    int n22 = nArray[13];
                    int n23 = nArray[14];
                    int n24 = nArray[15];
                    int n25 = n13;
                    n13 = n12;
                    n12 = n9;
                    while (n8 > 0) {
                        n25 = ax.Nd.d.c(n12 + n21, 7) ^ n25;
                        n21 ^= ax.Nd.d.c((n17 ^= ax.Nd.d.c(n25 + n12, 9)) + n25, 13);
                        n12 ^= ax.Nd.d.c(n21 + n17, 18);
                        n22 ^= ax.Nd.d.c((n18 ^= ax.Nd.d.c(n14 + n10, 7)) + n14, 9);
                        n10 = ax.Nd.d.c(n22 + n18, 13) ^ n10;
                        n14 = ax.Nd.d.c(n10 + n22, 18) ^ n14;
                        n11 ^= ax.Nd.d.c((n23 ^= ax.Nd.d.c(n19 + n15, 7)) + n19, 9);
                        n19 ^= ax.Nd.d.c((n15 ^= ax.Nd.d.c(n11 + n23, 13)) + n11, 18);
                        n16 ^= ax.Nd.d.c((n13 ^= ax.Nd.d.c(n24 + n20, 7)) + n24, 9);
                        n24 ^= ax.Nd.d.c((n20 ^= ax.Nd.d.c(n16 + n13, 13)) + n16, 18);
                        n11 = ax.Nd.d.c((n10 ^= ax.Nd.d.c(n12 + n13, 7)) + n12, 9) ^ n11;
                        n12 ^= ax.Nd.d.c((n13 ^= ax.Nd.d.c(n11 + n10, 13)) + n11, 18);
                        n15 = ax.Nd.d.c(n14 + n25, 7) ^ n15;
                        n16 = ax.Nd.d.c(n15 + n14, 9) ^ n16;
                        n14 ^= ax.Nd.d.c((n25 ^= ax.Nd.d.c(n16 + n15, 13)) + n16, 18);
                        n17 = ax.Nd.d.c((n20 ^= ax.Nd.d.c(n19 + n18, 7)) + n19, 9) ^ n17;
                        n18 = ax.Nd.d.c(n17 + n20, 13) ^ n18;
                        n19 ^= ax.Nd.d.c(n18 + n17, 18);
                        n22 ^= ax.Nd.d.c((n21 ^= ax.Nd.d.c(n24 + n23, 7)) + n24, 9);
                        n24 ^= ax.Nd.d.c((n23 ^= ax.Nd.d.c(n22 + n21, 13)) + n22, 18);
                        n8 -= 2;
                    }
                    nArray2[0] = n12 + nArray[0];
                    nArray2[1] = n10 + nArray[1];
                    nArray2[2] = n11 + nArray[2];
                    nArray2[3] = n13 + nArray[3];
                    nArray2[4] = n25 + nArray[4];
                    nArray2[5] = n14 + nArray[5];
                    nArray2[6] = n15 + nArray[6];
                    nArray2[7] = n16 + nArray[7];
                    nArray2[8] = n17 + nArray[8];
                    nArray2[9] = n18 + nArray[9];
                    nArray2[10] = n19 + nArray[10];
                    nArray2[11] = n20 + nArray[11];
                    nArray2[12] = n21 + nArray[12];
                    nArray2[13] = n22 + nArray[13];
                    nArray2[14] = n23 + nArray[14];
                    nArray2[15] = n24 + nArray[15];
                    return;
                }
                throw new IllegalArgumentException("Number of rounds must be even");
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void a() {
        this.b = 0;
        this.k();
        this.j();
        this.c(this.e);
    }

    protected void b() {
        throw null;
    }

    protected void c(byte[] byArray) {
        throw null;
    }

    public String d() {
        throw null;
    }

    @Override
    public void e(boolean bl, ax.vd.d object) {
        block2: {
            block3: {
                block7: {
                    block6: {
                        ax.vd.d d8;
                        block4: {
                            block5: {
                                if (!(object instanceof l)) break block2;
                                d8 = (l)object;
                                if ((object = (Object)d8.a()) == null || ((Object)object).length != this.f()) break block3;
                                if ((d8 = d8.b()) != null) break block4;
                                if (!this.f) break block5;
                                this.m(null, (byte[])object);
                                break block6;
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append(this.d());
                            ((StringBuilder)object).append(" KeyParameter can not be null for first initialisation");
                            throw new IllegalStateException(((StringBuilder)object).toString());
                        }
                        if (!(d8 instanceof k)) break block7;
                        this.m(((k)d8).a(), (byte[])object);
                    }
                    this.a();
                    this.f = true;
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(this.d());
                ((StringBuilder)object).append(" Init parameters must contain a KeyParameter (or null for re-init)");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(this.d());
            ((StringBuilder)object).append(" requires exactly ");
            ((StringBuilder)object).append(this.f());
            ((StringBuilder)object).append(" bytes of IV");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(this.d());
        ((StringBuilder)object).append(" Init parameters must include an IV");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    protected int f() {
        return 8;
    }

    @Override
    public int g(byte[] object, int n8, int n9, byte[] byArray, int n10) {
        if (this.f) {
            if (n8 + n9 <= ((byte[])object).length) {
                if (n10 + n9 <= byArray.length) {
                    if (!this.h(n9)) {
                        for (int i8 = 0; i8 < n9; ++i8) {
                            byte[] byArray2 = this.e;
                            int n11 = this.b;
                            byArray[i8 + n10] = (byte)(byArray2[n11] ^ object[i8 + n8]);
                            this.b = n11 = n11 + 1 & 0x3F;
                            if (n11 != 0) continue;
                            this.b();
                            this.c(this.e);
                        }
                        return n9;
                    }
                    throw new m("2^70 byte limit per IV would be exceeded; Change IV");
                }
                throw new n("output buffer too short");
            }
            throw new f("input buffer too short");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(this.d());
        ((StringBuilder)object).append(" not initialised");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    protected void i(int n8, int[] nArray, int n9) {
        n8 = (n8 - 16) / 4;
        int[] nArray2 = j;
        nArray[n9] = nArray2[n8];
        nArray[n9 + 1] = nArray2[n8 + 1];
        nArray[n9 + 2] = nArray2[n8 + 2];
        nArray[n9 + 3] = nArray2[n8 + 3];
    }

    protected void j() {
        throw null;
    }

    protected void m(byte[] byArray, byte[] byArray2) {
        throw null;
    }
}

