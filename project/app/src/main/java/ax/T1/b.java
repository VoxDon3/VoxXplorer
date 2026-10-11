/*
 * Decompiled with CFR 0.152.
 */
package ax.T1;

import android.text.TextUtils;
import ax.q7.c;
import ax.r7.C;
import ax.r7.F;
import ax.r7.d0;
import java.util.regex.Pattern;

final class b {
    private static final Pattern d = Pattern.compile("\\s+");
    private static final C<String> e = C.A("auto", "none");
    private static final C<String> f = C.B("dot", "sesame", "circle");
    private static final C<String> g = C.A("filled", "open");
    private static final C<String> h = C.B("after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    private b(int n8, int n9, int n10) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
    }

    public static b a(String string) {
        if (string == null) {
            return null;
        }
        if ((string = ax.q7.c.e(string.trim())).isEmpty()) {
            return null;
        }
        return ax.T1.b.b(C.u(TextUtils.split((String)string, (Pattern)d)));
    }

    /*
     * Unable to fully structure code
     */
    private static b b(C<String> var0) {
        block20: {
            block18: {
                block19: {
                    block17: {
                        block16: {
                            block15: {
                                block14: {
                                    block12: {
                                        block13: {
                                            var6_1 = F.d(d0.e(ax.T1.b.h, var0), "outside");
                                            var1_2 = var6_1.hashCode();
                                            var3_3 = 2;
                                            var5_4 = 0;
                                            var4_5 = -1;
                                            if (var1_2 == -1392885889) break block12;
                                            if (var1_2 == -1106037339) break block13;
                                            if (var1_2 != 92734940 || !var6_1.equals("after")) ** GOTO lbl-1000
                                            var1_2 = 0;
                                            break block14;
                                        }
                                        if (!var6_1.equals("outside")) ** GOTO lbl-1000
                                        var1_2 = 1;
                                        break block14;
                                    }
                                    if (var6_1.equals("before")) {
                                        var1_2 = 2;
                                    } else lbl-1000:
                                    // 3 sources

                                    {
                                        var1_2 = -1;
                                    }
                                }
                                var2_6 = var1_2 != 0 ? (var1_2 != 1 ? 1 : -2) : 2;
                                var6_1 = d0.e(ax.T1.b.e, var0);
                                if (!var6_1.isEmpty()) {
                                    var0 = (String)var6_1.iterator().next();
                                    var1_2 = var0.hashCode();
                                    if (var1_2 != 3005871) {
                                        if (var1_2 != 3387192) {
                                            var1_2 = var4_5;
                                        } else {
                                            var1_2 = var4_5;
                                            if (var0.equals("none")) {
                                                var1_2 = 0;
                                            }
                                        }
                                    } else {
                                        var0.equals("auto");
                                        var1_2 = var4_5;
                                    }
                                    return new b(var1_2, 0, var2_6);
                                }
                                var6_1 = d0.e(ax.T1.b.g, var0);
                                var0 = d0.e(ax.T1.b.f, var0);
                                if (var6_1.isEmpty() && var0.isEmpty()) {
                                    return new b(-1, 0, var2_6);
                                }
                                var1_2 = (var6_1 = F.d(var6_1, "filled")).hashCode();
                                if (var1_2 == -1274499742) break block15;
                                if (var1_2 != 3417674 || !var6_1.equals("open")) break block16;
                                var4_5 = 2;
                                break block17;
                            }
                            var6_1.equals("filled");
                        }
                        var4_5 = 1;
                    }
                    var0 = F.d(var0, "circle");
                    var1_2 = var0.hashCode();
                    if (var1_2 == -1360216880) break block18;
                    if (var1_2 == -905816648) break block19;
                    if (var1_2 != 99657 || !var0.equals("dot")) ** GOTO lbl-1000
                    var1_2 = var5_4;
                    break block20;
                }
                if (!var0.equals("sesame")) ** GOTO lbl-1000
                var1_2 = 1;
                break block20;
            }
            if (var0.equals("circle")) {
                var1_2 = 2;
            } else lbl-1000:
            // 3 sources

            {
                var1_2 = -1;
            }
        }
        if (var1_2 != 0) {
            var3_3 = var1_2 != 1 ? 1 : 3;
        }
        return new b(var3_3, var4_5, var2_6);
    }
}

