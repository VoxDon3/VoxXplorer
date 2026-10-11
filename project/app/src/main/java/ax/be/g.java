/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.D;
import ax.be.F;
import ax.be.L;
import ax.be.c;
import ax.be.d;
import ax.be.e;
import ax.be.i;
import ax.be.j;
import ax.be.l;
import ax.be.q;
import ax.be.v;
import ax.be.x;
import ax.de.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

class g
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private final j c0;
    private InputStream d0;
    private final ax.ce.c e0;
    private final boolean f0;
    private long g0;
    private long h0;
    private long i0;
    private final int j0;
    private long k0;
    private boolean l0;
    private final byte[] m0;
    private final DataInputStream q;

    /*
     * Unable to fully structure code
     */
    public g(InputStream var1_1, ax.ce.c var2_3, boolean var3_4, int var4_5, long var5_6, long var7_7, c var9_8) throws IOException, v {
        block27: {
            block28: {
                block29: {
                    block32: {
                        block30: {
                            super();
                            this.g0 = -1L;
                            this.h0 = -1L;
                            this.k0 = 0L;
                            this.l0 = false;
                            this.m0 = new byte[1];
                            this.e0 = var2_3;
                            this.f0 = var3_4;
                            var16_9 = new DataInputStream((InputStream)var1_1);
                            this.q = var16_9;
                            var11_10 = var16_9.readUnsignedByte();
                            if (var11_10 == 0) break block27;
                            this.j0 = var10_11 = (var11_10 + 1) * 4;
                            var18_12 = new byte[var10_11];
                            var18_12[0] = (byte)var11_10;
                            var16_9.readFully(var18_12, 1, var10_11 - 1);
                            if (!a.g(var18_12, 0, var10_11 - 4, var10_11 - 4)) break block28;
                            var11_10 = var18_12[1];
                            if ((var11_10 & 60) != 0) break block29;
                            var12_13 = var11_10 & 3;
                            var13_14 = var12_13 + 1;
                            var16_9 = new long[var13_14];
                            var17_15 = new byte[var13_14][];
                            var19_16 = new ByteArrayInputStream(var18_12, 2, var10_11 - 6);
                            var14_17 = var10_11;
                            this.i0 = 0x7FFFFFFFFFFFFFFCL - var14_17 - (long)var2_3.d();
                            if ((var18_12[1] & 64) == 0) break block30;
                            this.h0 = var14_17 = a.f(var19_16);
                            if (var14_17 == 0L) ** GOTO lbl34
                            try {
                                block31: {
                                    if (var14_17 <= this.i0) break block31;
lbl34:
                                    // 2 sources

                                    var1_1 = new i();
                                    throw var1_1;
                                }
                                this.i0 = var14_17;
                            }
                            catch (IOException var1_2) {
                                throw new i("XZ Block Header is corrupt");
                            }
                        }
                        if ((var18_12[1] & 128) != 0) {
                            this.g0 = a.f(var19_16);
                        }
                        for (var10_11 = 0; var10_11 < var13_14; ++var10_11) {
                            block26: {
                                var16_9[var10_11] = a.f(var19_16);
                                var14_17 = a.f(var19_16);
                                if (var14_17 > (long)var19_16.available()) break block26;
                                var18_12 = new byte[(int)var14_17];
                                var17_15[var10_11] = var18_12;
                                var19_16.read(var18_12);
                                continue;
                            }
                            var1_1 = new i();
                            throw var1_1;
                        }
                        for (var10_11 = var19_16.available(); var10_11 > 0; --var10_11) {
                            if (var19_16.read() == 0) {
                                continue;
                            }
                            throw new L("Unsupported options in XZ Block Header");
                        }
                        if (var5_6 == -1L) break block32;
                        var14_17 = this.j0 + var2_3.d();
                        if (var14_17 >= var5_6) ** GOTO lbl73
                        if ((var5_6 -= var14_17) <= this.i0 && ((var14_17 = this.h0) == -1L || var14_17 == var5_6)) {
                            var14_17 = this.g0;
                            if (var14_17 != -1L && var14_17 != var7_7) {
                                throw new i("XZ Index does not match a Block Header");
                            }
                            this.i0 = var5_6;
                            this.h0 = var5_6;
                            this.g0 = var7_7;
                        } else {
                            throw new i("XZ Index does not match a Block Header");
lbl73:
                            // 1 sources

                            throw new i("XZ Index does not match a Block Header");
                        }
                    }
                    var2_3 = new q[var13_14];
                    for (var10_11 = 0; var10_11 < var13_14; ++var10_11) {
                        var5_6 = (long)var16_9[var10_11];
                        if (var5_6 == 33L) {
                            var2_3[var10_11] = new x(var17_15[var10_11]);
                            continue;
                        }
                        if (var5_6 == 3L) {
                            var2_3[var10_11] = new l(var17_15[var10_11]);
                            continue;
                        }
                        if (d.f(var5_6)) {
                            var2_3[var10_11] = new e((long)var16_9[var10_11], var17_15[var10_11]);
                            continue;
                        }
                        var1_1 = new StringBuilder();
                        var1_1.append("Unknown Filter ID ");
                        var1_1.append((long)var16_9[var10_11]);
                        throw new L(var1_1.toString());
                    }
                    F.a(var2_3);
                    if (var4_5 >= 0) {
                        var11_10 = 0;
                        for (var10_11 = 0; var10_11 < var13_14; ++var10_11) {
                            var11_10 += var2_3[var10_11].d();
                        }
                        if (var11_10 > var4_5) {
                            throw new D(var11_10, var4_5);
                        }
                    }
                    this.c0 = var1_1 = new j((InputStream)var1_1);
                    this.d0 = var1_1;
                    for (var4_5 = var12_13; var4_5 >= 0; --var4_5) {
                        this.d0 = var2_3[var4_5].b(this.d0, var9_8);
                    }
                    return;
                }
                throw new L("Unsupported options in XZ Block Header");
            }
            throw new i("XZ Block Header is corrupt");
        }
        throw new v();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void c() throws IOException {
        long l8 = this.c0.a();
        long l9 = this.h0;
        if (l9 != -1L && l9 != l8) throw new i();
        long l10 = this.g0;
        l9 = l8;
        if (l10 != -1L) {
            if (l10 != this.k0) throw new i();
            l9 = l8;
        }
        while ((l9 & 3L) != 0L) {
            if (this.q.readUnsignedByte() != 0) throw new i();
            l9 = 1L + l9;
        }
        Object object = new byte[this.e0.d()];
        this.q.readFully((byte[])object);
        if (!this.f0 || Arrays.equals(this.e0.a(), (byte[])object)) return;
        object = new StringBuilder();
        ((StringBuilder)object).append("Integrity check (");
        ((StringBuilder)object).append(this.e0.c());
        ((StringBuilder)object).append(") does not match");
        throw new i(((StringBuilder)object).toString());
    }

    public long a() {
        return this.k0;
    }

    @Override
    public int available() throws IOException {
        return this.d0.available();
    }

    public long b() {
        return (long)this.j0 + this.c0.a() + (long)this.e0.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() {
        try {
            this.d0.close();
        }
        catch (IOException iOException) {}
        this.d0 = null;
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.m0, 0, 1) == -1) {
            return -1;
        }
        return this.m0[0] & 0xFF;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        block9: {
            block10: {
                block7: {
                    block8: {
                        long l8;
                        if (this.l0) {
                            return -1;
                        }
                        n10 = this.d0.read(byArray, n8, n9);
                        if (n10 <= 0) break block7;
                        if (this.f0) {
                            this.e0.f(byArray, n8, n10);
                        }
                        this.k0 += (long)n10;
                        long l9 = this.c0.a();
                        if (l9 < 0L || l9 > this.i0 || (l9 = this.k0) < 0L || (l8 = this.g0) != -1L && l9 > l8) break block8;
                        if (n10 >= n9 && l9 != l8) break block9;
                        if (this.d0.read() != -1) {
                            throw new i();
                        }
                        break block10;
                    }
                    throw new i();
                }
                if (n10 != -1) break block9;
            }
            this.c();
            this.l0 = true;
            return n10;
        }
        return n10;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

