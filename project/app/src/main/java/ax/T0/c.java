/*
 * Decompiled with CFR 0.152.
 */
package ax.T0;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.S0.d0;
import ax.T0.b;
import ax.q7.g;
import ax.u7.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class c
implements C.a {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public c(String string, byte[] byArray, int n8, int n9) {
        ax.T0.c.f(string, byArray, n9);
        this.a = string;
        this.b = byArray;
        this.c = n8;
        this.d = n9;
    }

    private static String e(List<Integer> list) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("track types = ");
        g.f(',').b(stringBuilder, list);
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static void f(String var0, byte[] var1_1, int var2_2) {
        var0.getClass();
        var5_3 = false;
        var7_4 = false;
        var6_5 = false;
        var4_6 = false;
        var3_7 = -1;
        switch (var0.hashCode()) {
            default: {
                break;
            }
            case 2002123038: {
                if (!var0.equals("auxiliary.tracks.map")) break;
                var3_7 = 4;
                break;
            }
            case 1098277265: {
                if (!var0.equals("auxiliary.tracks.offset")) break;
                var3_7 = 3;
                break;
            }
            case 1011693540: {
                if (!var0.equals("auxiliary.tracks.length")) break;
                var3_7 = 2;
                break;
            }
            case -269399509: {
                if (!var0.equals("auxiliary.tracks.interleaved")) break;
                var3_7 = 1;
                break;
            }
            case -1949883051: {
                if (!var0.equals("com.android.capture.fps")) break;
                var3_7 = 0;
            }
        }
        switch (var3_7) {
            default: {
                return;
            }
            case 4: {
                if (var2_2 == 0) {
                    var4_6 = true;
                }
                ax.S0.a.a(var4_6);
                return;
            }
            case 2: 
            case 3: {
                var4_6 = var5_3;
                if (var2_2 == 78) {
                    var4_6 = var5_3;
                    if (var1_1.length == 8) {
                        var4_6 = true;
                    }
                }
                ax.S0.a.a(var4_6);
                return;
            }
            case 1: {
                var4_6 = var7_4;
                if (var2_2 != 75) ** GOTO lbl56
                var4_6 = var7_4;
                if (var1_1.length != 1) ** GOTO lbl56
                var2_2 = var1_1[0];
                if (var2_2 == 0) ** GOTO lbl55
                var4_6 = var7_4;
                if (var2_2 != 1) ** GOTO lbl56
lbl55:
                // 2 sources

                var4_6 = true;
lbl56:
                // 4 sources

                ax.S0.a.a(var4_6);
                return;
            }
            case 0: 
        }
        var4_6 = var6_5;
        if (var2_2 == 23) {
            var4_6 = var6_5;
            if (var1_1.length == 4) {
                var4_6 = true;
            }
        }
        ax.S0.a.a(var4_6);
    }

    @Override
    public /* synthetic */ v a() {
        return B.b(this);
    }

    @Override
    public /* synthetic */ void b(A.b b8) {
        B.c(this, b8);
    }

    @Override
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public List<Integer> d() {
        ax.S0.a.h(this.a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        int n8 = this.b[1];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add(Integer.valueOf(this.b[i8 + 2]));
        }
        return arrayList;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            if (this.a.equals(((c)object).a) && Arrays.equals(this.b, ((c)object).b) && this.c == ((c)object).c && this.d == ((c)object).d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((527 + this.a.hashCode()) * 31 + Arrays.hashCode(this.b)) * 31 + this.c) * 31 + this.d;
    }

    /*
     * Unable to fully structure code
     */
    public String toString() {
        block7: {
            block2: {
                block3: {
                    block4: {
                        block5: {
                            block6: {
                                var1_1 = this.d;
                                if (var1_1 == 0) break block2;
                                if (var1_1 == 1) break block3;
                                if (var1_1 == 23) break block4;
                                if (var1_1 == 67) break block5;
                                if (var1_1 == 75) break block6;
                                if (var1_1 != 78) ** GOTO lbl-1000
                                var2_2 = String.valueOf(new G(this.b).T());
                                break block7;
                            }
                            var2_2 = String.valueOf(ax.T0.b.a(this.b[0]));
                            break block7;
                        }
                        var2_2 = String.valueOf(f.h(this.b));
                        break block7;
                    }
                    var2_2 = String.valueOf(Float.intBitsToFloat(f.h(this.b)));
                    break block7;
                }
                var2_2 = d0.H(this.b);
                break block7;
            }
            if (this.a.equals("auxiliary.tracks.map")) {
                var2_2 = ax.T0.c.e(this.d());
            } else lbl-1000:
            // 2 sources

            {
                var2_2 = d0.B1(this.b);
            }
        }
        var3_3 = new StringBuilder();
        var3_3.append("mdta: key=");
        var3_3.append(this.a);
        var3_3.append(", value=");
        var3_3.append(var2_2);
        return var3_3.toString();
    }
}

