/*
 * Decompiled with CFR 0.152.
 */
package ax.kb;

import ax.kb.a;
import ax.kb.b;
import ax.kb.c;
import ax.kb.e;
import ax.kb.g;
import ax.kb.h;
import ax.pb.r;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

public abstract class f
implements c {
    private static int f = 1;
    protected b b;
    protected int c = 4280;
    protected int d = 4280;
    protected int e = 0;

    public static f e(String string, r serializable) throws UnknownHostException, MalformedURLException, e {
        if (string.startsWith("ncacn_np:")) {
            return new h(string, (r)serializable);
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("DCERPC transport not supported: ");
        ((StringBuilder)serializable).append(string);
        throw new e(((StringBuilder)serializable).toString());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected static b f(String var0) throws e {
        var14_1 = var0.toCharArray();
        var3_2 = 0;
        var11_3 = null;
        var10_4 = null;
        var8_5 = var10_4;
        var4_6 = 0;
        var5_7 = 0;
        do {
            block9: {
                block10: {
                    block12: {
                        block11: {
                            block14: {
                                block13: {
                                    var7_11 = var14_1[var3_2];
                                    if (var4_6 == 0) break block10;
                                    if (var4_6 == true) break block11;
                                    var1_8 = var4_6;
                                    if (var4_6 == 2) break block12;
                                    if (var4_6 == 5) break block13;
                                    var6_10 = var14_1.length;
                                    var1_8 = var4_6;
                                    var2_9 = var5_7;
                                    var12_13 = var11_3;
                                    var13_14 = var10_4;
                                    var9_12 /* !! */  = var8_5;
                                    break block9;
                                }
                                if (var7_11 == '=') {
                                    var8_5 = var0.substring(var5_7, var3_2).trim();
                                    while (true) {
                                        var2_9 = var3_2 + 1;
                                        var6_10 = var3_2;
                                        var1_8 = var4_6;
                                        var12_13 = var11_3;
                                        var13_14 = var10_4;
                                        var9_12 /* !! */  = var8_5;
                                        break block9;
                                        break;
                                    }
                                }
                                if (var7_11 == ',') break block14;
                                var6_10 = var3_2;
                                var1_8 = var4_6;
                                var2_9 = var5_7;
                                var12_13 = var11_3;
                                var13_14 = var10_4;
                                var9_12 /* !! */  = var8_5;
                                if (var7_11 != ']') break block9;
                            }
                            var12_13 = var0.substring(var5_7, var3_2).trim();
                            var9_12 /* !! */  = var8_5;
                            if (var8_5 == null) {
                                var9_12 /* !! */  = "endpoint";
                            }
                            var10_4.b(var9_12 /* !! */ , var12_13);
                            var9_12 /* !! */  = null;
                            var6_10 = var3_2;
                            var1_8 = var4_6;
                            var2_9 = var5_7;
                            var12_13 = var11_3;
                            var13_14 = var10_4;
                            break block9;
                        }
                        if (var7_11 == '\\') ** continue;
                        var1_8 = 2;
                    }
                    var6_10 = var3_2;
                    var2_9 = var5_7;
                    var12_13 = var11_3;
                    var13_14 = var10_4;
                    var9_12 /* !! */  = var8_5;
                    if (var7_11 == '[') {
                        var0.substring(var5_7, var3_2).trim().length();
                        var13_14 = new b(var11_3, var0.substring(var5_7, var3_2));
                        var2_9 = var3_2 + 1;
                        var1_8 = 5;
                        var6_10 = var3_2;
                        var12_13 = var11_3;
                        var9_12 /* !! */  = var8_5;
                    }
                    break block9;
                }
                var6_10 = var3_2;
                var1_8 = var4_6;
                var2_9 = var5_7;
                var12_13 = var11_3;
                var13_14 = var10_4;
                var9_12 /* !! */  = var8_5;
                if (var7_11 == ':') {
                    var12_13 = var0.substring(var5_7, var3_2);
                    var2_9 = var3_2 + 1;
                    var1_8 = 1;
                    var9_12 /* !! */  = var8_5;
                    var13_14 = var10_4;
                    var6_10 = var3_2;
                }
            }
            var3_2 = ++var6_10;
            var4_6 = var1_8;
            var5_7 = var2_9;
            var11_3 = var12_13;
            var10_4 = var13_14;
            var8_5 = var9_12 /* !! */ ;
        } while (var6_10 < var14_1.length);
        if (var13_14 != null && var13_14.c != null) {
            return var13_14;
        }
        var8_5 = new StringBuilder();
        var8_5.append("Invalid binding URL: ");
        var8_5.append(var0);
        throw new e(var8_5.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() throws e, IOException {
        synchronized (this) {
            try {
                try {
                    this.e = 1;
                    a a8 = new a(this.b, this);
                    this.g(a8);
                    return;
                }
                catch (IOException iOException) {
                    this.e = 0;
                    throw iOException;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public abstract void b() throws IOException;

    protected abstract void c(byte[] var1, boolean var2) throws IOException;

    protected abstract void d(byte[] var1, int var2, int var3, boolean var4) throws IOException;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(g var1_1) throws e, IOException {
        block16: {
            if (this.e == 0) {
                this.a();
            }
            var7_4 /* !! */  = var8_3 /* !! */  = ax.pb.c.a();
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var9_5 = new ax.mb.a(var8_3 /* !! */ , 0);
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var1_1.c = 3;
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var2_6 = ax.kb.f.f;
            var7_4 /* !! */  = var8_3 /* !! */ ;
            ax.kb.f.f = var2_6 + 1;
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var1_1.e = var2_6;
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var1_1.b((ax.mb.a)var9_5);
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var4_7 = var9_5.o() - 24;
            var6_8 = true;
            for (var2_6 = 0; var2_6 < var4_7; var2_6 += var3_9) {
                block15: {
                    var3_9 = var4_7 - var2_6;
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    try {
                        var5_10 = this.c;
                        if (var3_9 + 24 > var5_10) {
                            var7_4 /* !! */  = var8_3 /* !! */ ;
                            var1_1.c &= -3;
                            var3_9 = var5_10 - 24;
                            break block15;
                        }
                        var7_4 /* !! */  = var8_3 /* !! */ ;
                    }
                    catch (Throwable var1_2) {}
                    var1_1.c |= 2;
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    var1_1.f = var3_9;
                    var6_8 = false;
                    break block16;
                }
                var7_4 /* !! */  = var8_3 /* !! */ ;
                var1_1.d = var3_9 + 24;
                if (var2_6 > 0) {
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    var1_1.c &= -2;
                }
                var7_4 /* !! */  = var8_3 /* !! */ ;
                if ((var1_1.c & 3) != 3) {
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    var9_5.d = var2_6;
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    var9_5.p();
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    var1_1.e((ax.mb.a)var9_5);
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    var9_5.h(var1_1.f);
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    var9_5.j(0);
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    var9_5.j(var1_1.g());
                }
                var7_4 /* !! */  = var8_3 /* !! */ ;
                this.d(var8_3 /* !! */ , var2_6, var1_1.d, var6_8);
            }
            var7_4 /* !! */  = var8_3 /* !! */ ;
            this.c(var8_3 /* !! */ , var6_8);
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var9_5.p();
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var9_5.q(8);
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var9_5.r(var9_5.d());
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var9_5.q(0);
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var1_1.c((ax.mb.a)var9_5);
            var7_4 /* !! */  = var8_3 /* !! */ ;
            if (var1_1.b != 2) ** GOTO lbl-1000
            var7_4 /* !! */  = var8_3 /* !! */ ;
            if (!var1_1.i(2)) {
                var7_4 /* !! */  = var8_3 /* !! */ ;
                var2_6 = var1_1.d;
            } else lbl-1000:
            // 2 sources

            {
                var2_6 = 24;
            }
            var9_5 = null;
            var10_11 = null;
            while (true) {
                var7_4 /* !! */  = var8_3 /* !! */ ;
                if (var1_1.i(2)) break;
                var11_12 = var9_5;
                if (var9_5 == null) {
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    var11_12 = new byte[this.d];
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    var10_11 = new ax.mb.a((byte[])var11_12, 0);
                }
                var7_4 /* !! */  = var8_3 /* !! */ ;
                this.c((byte[])var11_12, var6_8);
                var7_4 /* !! */  = var8_3 /* !! */ ;
                var10_11.p();
                var7_4 /* !! */  = var8_3 /* !! */ ;
                var10_11.q(8);
                var7_4 /* !! */  = var8_3 /* !! */ ;
                var10_11.r(var10_11.d());
                var7_4 /* !! */  = var8_3 /* !! */ ;
                var10_11.p();
                var7_4 /* !! */  = var8_3 /* !! */ ;
                var1_1.c(var10_11);
                var7_4 /* !! */  = var8_3 /* !! */ ;
                var4_7 = var1_1.d - 24;
                var3_9 = var2_6 + var4_7;
                var7_4 /* !! */  = var8_3 /* !! */ ;
                var9_5 = var8_3 /* !! */ ;
                if (var3_9 > var8_3 /* !! */ .length) {
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    var9_5 = new byte[var3_9];
                    var7_4 /* !! */  = var8_3 /* !! */ ;
                    System.arraycopy(var8_3 /* !! */ , 0, var9_5, 0, var2_6);
                }
                var7_4 /* !! */  = (byte[])var9_5;
                System.arraycopy(var11_12, 24, var9_5, var2_6, var4_7);
                var2_6 = var3_9;
                var8_3 /* !! */  = (byte[])var9_5;
                var9_5 = var11_12;
            }
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var9_5 = new ax.mb.a(var8_3 /* !! */ , 0);
            var7_4 /* !! */  = var8_3 /* !! */ ;
            var1_1.a((ax.mb.a)var9_5);
            ax.pb.c.c(var8_3 /* !! */ );
            var1_1 = var1_1.h();
            if (var1_1 == null) {
                return;
            }
            throw var1_1;
        }
        ax.pb.c.c(var7_4 /* !! */ );
        throw var1_2;
    }

    public String toString() {
        return this.b.toString();
    }
}

