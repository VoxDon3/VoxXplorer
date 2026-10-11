/*
 * Decompiled with CFR 0.152.
 */
package ax.e7;

import ax.e7.a;
import ax.i7.o;
import ax.i7.s;
import ax.i7.t;
import ax.l7.c;
import ax.l7.i;
import ax.m7.A;
import ax.m7.v;
import ax.m7.z;
import java.io.IOException;

public class b
extends t {
    private final transient a g0;

    public b(t.a a8, a a9) {
        super(a8);
        this.g0 = a9;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b d(c var0, s var1_1) {
        block33: {
            block28: {
                block29: {
                    block35: {
                        block34: {
                            block30: {
                                block32: {
                                    block31: {
                                        var6_2 = new t.a(var1_1.h(), var1_1.i(), var1_1.f());
                                        v.d(var0);
                                        var4_3 = null;
                                        var3_5 /* !! */  = null;
                                        var2_12 = null;
                                        try {
                                            if (!var1_1.l() && o.c("application/json; charset=UTF-8", var1_1.e()) && (var5_16 = var1_1.c()) != null) {
                                            }
                                            ** GOTO lbl-1000
                                        }
                                        catch (IOException var3_11) {
                                            var0 = null;
                                            var2_12 = var4_3;
                                            break block28;
                                        }
                                        try {
                                            var5_16 = var0.b(var1_1.c());
                                        }
                                        catch (Throwable var2_15) {
                                            var4_3 = null;
                                            var0 = null;
                                            break block29;
                                        }
                                        catch (IOException var3_9) {
                                            var2_12 = null;
                                            var0 = null;
                                            break block30;
                                        }
                                        try {
                                            var0 = var3_5 /* !! */  = var5_16.e();
                                            if (var3_5 /* !! */  != null) break block31;
                                            var0 = var5_16.v();
                                        }
                                        catch (Throwable var2_13) {
                                            var0 = null;
                                            var4_3 = var5_16;
                                            break block29;
                                        }
                                        catch (IOException var3_6) {
                                            var0 = null;
                                            var2_12 = var5_16;
                                            break block30;
                                        }
                                    }
                                    if (var0 == null) ** GOTO lbl58
                                    var5_16.D0("error");
                                    if (var5_16.e() == i.g0) {
                                        var0 = var5_16.u();
                                    } else {
                                        if (var5_16.e() == i.d0) {
                                            var0 = var5_16.W(a.class);
                                            try {
                                                var3_5 /* !! */  = var0.l();
                                                var2_12 = var0;
                                                var0 = var3_5 /* !! */ ;
                                                break block32;
                                            }
                                            catch (Throwable var2_14) {
                                                var4_3 = var5_16;
                                                break block29;
                                            }
                                            catch (IOException var3_7) {
                                                var2_12 = var5_16;
                                                break block30;
                                            }
                                        }
lbl58:
                                        // 3 sources

                                        var0 = null;
                                    }
                                }
                                var3_5 /* !! */  = var2_12;
                                var4_3 = var0;
                                if (var2_12 == null) {
                                    try {
                                        var5_16.close();
                                        var3_5 /* !! */  = var2_12;
                                        var4_3 = var0;
                                        break block33;
                                    }
                                    catch (IOException var3_8) {
                                        break block28;
                                    }
                                }
                                break block33;
                            }
                            var3_5 /* !! */ .printStackTrace();
                            if (var2_12 != null) break block34;
                            var3_5 /* !! */  = var0;
                            {
                                catch (Throwable var3_10) {
                                    var4_3 = var2_12;
                                    var2_12 = var3_10;
                                    break block29;
                                }
                                ** try [egrp 6[TRYBLOCK] [15 : 245->317)] { 
lbl82:
                                // 1 sources

                                var1_1.k();
                                break block35;
                            }
lbl84:
                            // 1 sources

                            catch (IOException var4_4) {
                                var0 = null;
                                var2_12 = var3_5 /* !! */ ;
                                var3_5 /* !! */  = var4_4;
                                break block28;
                            }
                        }
                        if (var0 == null) {
                            var3_5 /* !! */  = var0;
                            var2_12.close();
                        }
                    }
                    var4_3 = null;
                    var3_5 /* !! */  = var0;
                    break block33;
                }
                if (var4_3 != null) {
                    if (var0 == null) {
                        var3_5 /* !! */  = var0;
                        var4_3.close();
                    }
                } else {
                    var3_5 /* !! */  = var0;
                    var1_1.k();
                }
                var3_5 /* !! */  = var0;
                throw var2_12;
lbl-1000:
                // 1 sources

                {
                    var4_3 = var0 = var1_1.n();
                    break block33;
                }
            }
            var3_5 /* !! */ .printStackTrace();
            var4_3 = var0;
            var3_5 /* !! */  = var2_12;
        }
        var0 = t.a(var1_1);
        if (!A.a((String)var4_3)) {
            var0.append(z.a);
            var0.append((String)var4_3);
            var6_2.c((String)var4_3);
        }
        var6_2.e(var0.toString());
        return new b(var6_2, (a)var3_5 /* !! */ );
    }

    public final a e() {
        return this.g0;
    }
}

