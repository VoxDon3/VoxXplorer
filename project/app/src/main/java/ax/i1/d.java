/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.net.Uri;
import ax.J1.f;
import ax.S0.a;
import ax.i1.T;
import ax.i1.c;
import ax.i1.r0;
import ax.q1.M;
import ax.q1.k;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.q1.x;
import ax.q7.g;
import ax.r7.I;
import ax.r7.z;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class d
implements T {
    private final x a;
    private r b;
    private s c;

    public d(x x8) {
        this.a = x8;
    }

    public static /* synthetic */ String a(r r8) {
        return r8.e().getClass().getSimpleName();
    }

    @Override
    public void b(long l8, long l9) {
        ax.S0.a.e(this.b).b(l8, l9);
    }

    @Override
    public int c(M m8) throws IOException {
        return ax.S0.a.e(this.b).f(ax.S0.a.e(this.c), m8);
    }

    @Override
    public void d() {
        r r8 = this.b;
        if (r8 != null) {
            r8.d();
            this.b = null;
        }
        this.c = null;
    }

    @Override
    public long e() {
        s s8 = this.c;
        if (s8 != null) {
            return s8.getPosition();
        }
        return -1L;
    }

    @Override
    public void f() {
        r r8 = this.b;
        if (r8 != null && (r8 = r8.e()) instanceof f) {
            ((f)r8).m();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void g(ax.P0.k var1_1, Uri var2_2, Map<String, List<String>> var3_4, long var4_5, long var6_6, t var8_7) throws IOException {
        block19: {
            block18: {
                var1_1 = new k((ax.P0.k)var1_1, var4_5, var6_6);
                this.c = var1_1;
                if (this.b != null) {
                    return;
                }
                var3_4 = this.a.e(var2_2, (Map<String, List<String>>)var3_4);
                var13_8 = z.s(var3_4.length);
                var9_9 = var3_4.length;
                var12_10 = false;
                if (var9_9 != 1) break block18;
                this.b = var3_4[0];
                break block19;
            }
            var10_11 = var3_4.length;
            block4: for (var9_9 = 0; var9_9 < var10_11; ++var9_9) {
                block16: {
                    block21: {
                        block20: {
                            block15: {
                                block17: {
                                    var14_13 = var3_4[var9_9];
                                    try {
                                        if (var14_13.c((s)var1_1)) {
                                            this.b = var14_13;
                                        }
                                        ** GOTO lbl-1000
                                    }
                                    catch (Throwable var2_3) {
                                        break block15;
                                    }
                                    catch (EOFException var14_14) {
                                        break block16;
                                    }
                                    ax.S0.a.g(true);
                                    var1_1.m();
                                    break;
lbl-1000:
                                    // 1 sources

                                    {
                                        var13_8.j(var14_13.k());
                                        if (this.b != null || var1_1.getPosition() == var4_5) break block17;
                                    }
                                    while (true) {
                                        var11_12 = false;
                                        ** GOTO lbl37
                                        break;
                                    }
                                }
lbl35:
                                // 2 sources

                                while (true) {
                                    var11_12 = true;
lbl37:
                                    // 2 sources

                                    ax.S0.a.g(var11_12);
                                    var1_1.m();
                                    continue block4;
                                    break;
                                }
                            }
                            if (this.b != null) break block20;
                            var11_12 = var12_10;
                            if (var1_1.getPosition() != var4_5) break block21;
                        }
                        var11_12 = true;
                    }
                    ax.S0.a.g(var11_12);
                    var1_1.m();
                    throw var2_3;
                }
                if (this.b == null && var1_1.getPosition() != var4_5) ** continue;
                ** continue;
            }
            if (this.b == null) {
                var1_1 = new StringBuilder();
                var1_1.append("None of the available extractors (");
                var1_1.append(g.g(", ").d(I.i(z.w(var3_4), new c())));
                var1_1.append(") could read the stream.");
                throw new r0(var1_1.toString(), ax.S0.a.e(var2_2), var13_8.k());
            }
        }
        this.b.a(var8_7);
    }
}

