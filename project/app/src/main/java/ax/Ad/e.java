/*
 * Decompiled with CFR 0.152.
 */
package ax.Ad;

import ax.Ad.a;
import ax.Bd.b;
import ax.Bd.c;
import ax.Bd.d;
import ax.Dd.l;
import ax.Nd.h;
import ax.vd.f;
import ax.vd.k;
import ax.vd.n;

public class e
implements a {
    private ax.vd.a a;
    private c b;
    private b c;
    private boolean d;
    private boolean e;
    private int f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;
    private byte[] q;
    private int r;
    private int s;
    private long t;
    private byte[] u;
    private int v;
    private long w;
    private long x;

    public e(ax.vd.a a8) {
        this(a8, null);
    }

    public e(ax.vd.a a8, c c8) {
        if (a8.d() == 16) {
            c c9 = c8;
            if (c8 == null) {
                c9 = new ax.Bd.e();
            }
            this.a = a8;
            this.b = c9;
            return;
        }
        throw new IllegalArgumentException("cipher required with a block size of 16.");
    }

    private void a() {
        if (!this.e) {
            if (this.d) {
                throw new IllegalStateException("GCM cipher cannot be reused for encryption");
            }
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
    }

    private void b(byte[] byArray, byte[] byArray2, int n8) {
        for (int i8 = 0; i8 < n8; i8 += 16) {
            this.k(byArray, byArray2, i8, Math.min(n8 - i8, 16));
        }
    }

    private void d(byte[] byArray, byte[] byArray2) {
        ax.Bd.d.p(byArray, byArray2);
        this.b.b(byArray);
    }

    private void f(byte[] byArray, byte[] byArray2, int n8) {
        ax.Bd.d.q(byArray, byArray2, n8);
        this.b.b(byArray);
    }

    private void k(byte[] byArray, byte[] byArray2, int n8, int n9) {
        ax.Bd.d.r(byArray, byArray2, n8, n9);
        this.b.b(byArray);
    }

    private void l(byte[] byArray) {
        int n8 = this.r;
        if (n8 != 0) {
            this.r = n8 - 1;
            byte[] byArray2 = this.q;
            n8 = (byArray2[15] & 0xFF) + 1;
            byArray2[15] = (byte)n8;
            n8 = (n8 >>> 8) + (byArray2[14] & 0xFF);
            byArray2[14] = (byte)n8;
            n8 = (n8 >>> 8) + (byArray2[13] & 0xFF);
            byArray2[13] = (byte)n8;
            byArray2[12] = (byte)((n8 >>> 8) + (byArray2[12] & 0xFF));
            this.a.h(byArray2, 0, byArray, 0);
            return;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    private void m() {
        int n8;
        if (this.w > 0L) {
            System.arraycopy(this.o, 0, this.p, 0, 16);
            this.x = this.w;
        }
        if ((n8 = this.v) > 0) {
            this.k(this.p, this.u, 0, n8);
            this.x += (long)this.v;
        }
        if (this.x > 0L) {
            System.arraycopy(this.p, 0, this.n, 0, 16);
        }
    }

    private void n(byte[] byArray, int n8, byte[] byArray2, int n9) {
        if (byArray2.length - n9 >= 16) {
            if (this.t == 0L) {
                this.m();
            }
            byte[] byArray3 = new byte[16];
            this.l(byArray3);
            if (this.d) {
                ax.Bd.d.q(byArray3, byArray, n8);
                this.d(this.n, byArray3);
                System.arraycopy(byArray3, 0, byArray2, n9, 16);
            } else {
                this.f(this.n, byArray, n8);
                ax.Bd.d.o(byArray3, 0, byArray, n8, byArray2, n9);
            }
            this.t += 16L;
            return;
        }
        throw new n("Output buffer too short");
    }

    private void o(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) {
        byte[] byArray3 = new byte[16];
        this.l(byArray3);
        if (this.d) {
            ax.Bd.d.n(byArray, n8, byArray3, 0, n9);
            this.k(this.n, byArray, n8, n9);
        } else {
            this.k(this.n, byArray, n8, n9);
            ax.Bd.d.n(byArray, n8, byArray3, 0, n9);
        }
        System.arraycopy(byArray, n8, byArray2, n10, n9);
        this.t += (long)n9;
    }

    private void p(boolean bl) {
        this.a.a();
        this.n = new byte[16];
        this.o = new byte[16];
        this.p = new byte[16];
        this.u = new byte[16];
        this.v = 0;
        this.w = 0L;
        this.x = 0L;
        this.q = ax.Nd.a.d(this.k);
        this.r = -2;
        this.s = 0;
        this.t = 0L;
        byte[] byArray = this.l;
        if (byArray != null) {
            ax.Nd.a.g(byArray, (byte)0);
        }
        if (bl) {
            this.m = null;
        }
        if (this.d) {
            this.e = false;
            return;
        }
        byArray = this.i;
        if (byArray != null) {
            this.j(byArray, 0, byArray.length);
        }
    }

    @Override
    public int c(byte[] byArray, int n8) throws IllegalStateException, k {
        block13: {
            block14: {
                block17: {
                    int n9;
                    block16: {
                        block15: {
                            Object object;
                            byte[] byArray2;
                            int n10;
                            block12: {
                                block11: {
                                    this.a();
                                    if (this.t == 0L) {
                                        this.m();
                                    }
                                    n9 = this.s;
                                    if (!this.d) break block11;
                                    if (byArray.length - n8 < this.f + n9) {
                                        throw new n("Output buffer too short");
                                    }
                                    break block12;
                                }
                                n10 = this.f;
                                if (n9 < n10) break block13;
                                if (byArray.length - n8 < (n9 -= n10)) break block14;
                            }
                            if (n9 > 0) {
                                this.o(this.l, 0, n9, byArray, n8);
                            }
                            long l8 = this.w;
                            n10 = this.v;
                            this.w = l8 += (long)n10;
                            if (l8 > this.x) {
                                if (n10 > 0) {
                                    this.k(this.o, this.u, 0, n10);
                                }
                                if (this.x > 0L) {
                                    ax.Bd.d.p(this.o, this.p);
                                }
                                l8 = this.t;
                                byArray2 = new byte[16];
                                if (this.c == null) {
                                    object = new ax.Bd.a();
                                    this.c = object;
                                    object.a(this.j);
                                }
                                this.c.b(l8 * 8L + 127L >>> 7, byArray2);
                                ax.Bd.d.i(this.o, byArray2);
                                ax.Bd.d.p(this.n, this.o);
                            }
                            object = new byte[16];
                            ax.Nd.h.n(this.w * 8L, (byte[])object, 0);
                            ax.Nd.h.n(this.t * 8L, (byte[])object, 8);
                            this.d(this.n, (byte[])object);
                            object = new byte[16];
                            this.a.h(this.k, 0, (byte[])object, 0);
                            ax.Bd.d.p((byte[])object, this.n);
                            n10 = this.f;
                            byArray2 = new byte[n10];
                            this.m = byArray2;
                            System.arraycopy(object, 0, byArray2, 0, n10);
                            if (!this.d) break block15;
                            System.arraycopy(this.m, 0, byArray, n8 + this.s, this.f);
                            n9 += this.f;
                            break block16;
                        }
                        n8 = this.f;
                        byArray = new byte[n8];
                        System.arraycopy(this.l, n9, byArray, 0, n8);
                        if (!ax.Nd.a.e(this.m, byArray)) break block17;
                    }
                    this.p(false);
                    return n9;
                }
                throw new k("mac check in GCM failed");
            }
            throw new n("Output buffer too short");
        }
        throw new k("data too short");
    }

    @Override
    public void e(boolean bl, ax.vd.d object) throws IllegalArgumentException {
        block15: {
            block16: {
                block19: {
                    byte[] byArray;
                    block18: {
                        block17: {
                            byte[] byArray2;
                            int n8;
                            block14: {
                                block12: {
                                    block13: {
                                        this.d = bl;
                                        this.m = null;
                                        this.e = true;
                                        if (!(object instanceof ax.Dd.a)) break block12;
                                        object = (ax.Dd.a)object;
                                        byArray = ((ax.Dd.a)object).d();
                                        this.i = ((ax.Dd.a)object).a();
                                        n8 = ((ax.Dd.a)object).c();
                                        if (n8 < 32 || n8 > 128 || n8 % 8 != 0) break block13;
                                        this.f = n8 / 8;
                                        object = ((ax.Dd.a)object).b();
                                        break block14;
                                    }
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("Invalid value for MAC size: ");
                                    ((StringBuilder)object).append(n8);
                                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                                }
                                if (!(object instanceof l)) break block15;
                                object = (l)object;
                                byArray = ((l)object).a();
                                this.i = null;
                                this.f = 16;
                                object = (ax.Dd.k)((l)object).b();
                            }
                            n8 = bl ? 16 : this.f + 16;
                            this.l = new byte[n8];
                            if (byArray == null || byArray.length < 1) break block16;
                            if (bl && (byArray2 = this.h) != null && ax.Nd.a.b(byArray2, byArray)) {
                                if (object != null) {
                                    byArray2 = this.g;
                                    if (byArray2 != null && ax.Nd.a.b(byArray2, ((ax.Dd.k)object).a())) {
                                        throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                                    }
                                } else {
                                    throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                                }
                            }
                            this.h = byArray;
                            if (object != null) {
                                this.g = ((ax.Dd.k)object).a();
                            }
                            if (object == null) break block17;
                            this.a.e(true, (ax.vd.d)object);
                            object = new byte[16];
                            this.j = (byte[])object;
                            this.a.h((byte[])object, 0, (byte[])object, 0);
                            this.b.a(this.j);
                            this.c = null;
                            break block18;
                        }
                        if (this.j == null) break block19;
                    }
                    byArray = new byte[16];
                    this.k = byArray;
                    object = this.h;
                    if (((Object)object).length == 12) {
                        System.arraycopy(object, 0, byArray, 0, ((Object)object).length);
                        this.k[15] = 1;
                    } else {
                        this.b(byArray, (byte[])object, ((Object)object).length);
                        object = new byte[16];
                        ax.Nd.h.n((long)this.h.length * 8L, (byte[])object, 8);
                        this.d(this.k, (byte[])object);
                    }
                    this.n = new byte[16];
                    this.o = new byte[16];
                    this.p = new byte[16];
                    this.u = new byte[16];
                    this.v = 0;
                    this.w = 0L;
                    this.x = 0L;
                    this.q = ax.Nd.a.d(this.k);
                    this.r = -2;
                    this.s = 0;
                    this.t = 0L;
                    object = this.i;
                    if (object != null) {
                        this.j((byte[])object, 0, ((Object)object).length);
                    }
                    return;
                }
                throw new IllegalArgumentException("Key must be specified in initial init");
            }
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        throw new IllegalArgumentException("invalid parameters passed to GCM");
    }

    @Override
    public int g(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) throws f {
        this.a();
        if (byArray.length - n8 >= n9) {
            if (this.d) {
                int n11;
                int n12;
                block9: {
                    n12 = n8;
                    n11 = n9;
                    if (this.s != 0) {
                        while (true) {
                            n12 = n8;
                            n11 = n9;
                            if (n9 <= 0) break;
                            --n9;
                            byte[] byArray3 = this.l;
                            n11 = this.s;
                            n12 = n8 + 1;
                            byArray3[n11] = byArray[n8];
                            this.s = n8 = n11 + 1;
                            if (n8 == 16) {
                                this.n(byArray3, 0, byArray2, n10);
                                this.s = 0;
                                n8 = 16;
                                n11 = n9;
                                break block9;
                            }
                            n8 = n12;
                        }
                    }
                    n8 = 0;
                }
                while (n11 >= 16) {
                    this.n(byArray, n12, byArray2, n10 + n8);
                    n12 += 16;
                    n11 -= 16;
                    n8 += 16;
                }
                if (n11 > 0) {
                    System.arraycopy(byArray, n12, this.l, 0, n11);
                    this.s = n11;
                }
                return n8;
            }
            int n13 = 0;
            for (int i8 = 0; i8 < n9; ++i8) {
                int n14;
                byte[] byArray4 = this.l;
                int n15 = this.s;
                byArray4[n15] = byArray[n8 + i8];
                this.s = n14 = n15 + 1;
                n15 = n13;
                if (n14 == byArray4.length) {
                    this.n(byArray4, 0, byArray2, n10 + n13);
                    byArray4 = this.l;
                    System.arraycopy(byArray4, 16, byArray4, 0, this.f);
                    this.s = this.f;
                    n15 = n13 + 16;
                }
                n13 = n15;
            }
            return n13;
        }
        throw new f("Input buffer too short");
    }

    @Override
    public int h(int n8) {
        int n9;
        n8 = n9 = n8 + this.s;
        if (!this.d) {
            n8 = this.f;
            if (n9 < n8) {
                return 0;
            }
            n8 = n9 - n8;
        }
        return n8 - n8 % 16;
    }

    @Override
    public int i(int n8) {
        int n9 = n8 + this.s;
        if (this.d) {
            return n9 + this.f;
        }
        n8 = this.f;
        if (n9 < n8) {
            return 0;
        }
        return n9 - n8;
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) {
        this.a();
        for (int i8 = 0; i8 < n9; ++i8) {
            byte[] byArray2 = this.u;
            int n10 = this.v;
            byArray2[n10] = byArray[n8 + i8];
            this.v = ++n10;
            if (n10 != 16) continue;
            this.d(this.o, byArray2);
            this.v = 0;
            this.w += 16L;
        }
    }
}

