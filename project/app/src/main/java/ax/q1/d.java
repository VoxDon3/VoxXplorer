/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.E;
import ax.S0.G;
import ax.S0.i;
import ax.T0.h;
import java.util.ArrayList;
import java.util.List;

public final class d {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    private d(List<byte[]> list, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, float f8, String string) {
        this.a = list;
        this.b = n8;
        this.c = n9;
        this.d = n10;
        this.e = n11;
        this.f = n12;
        this.g = n13;
        this.h = n14;
        this.i = n15;
        this.j = n16;
        this.k = f8;
        this.l = string;
    }

    private static byte[] a(G g8) {
        int n8 = g8.U();
        int n9 = g8.g();
        g8.c0(n8);
        return ax.S0.i.j(g8.f(), n9, n8);
    }

    /*
     * Unable to fully structure code
     */
    public static d b(G var0) throws E {
        var0.c0(4);
        var10_2 = (var0.M() & 3) + 1;
        if (var10_2 == 3) ** GOTO lbl49
        var11_3 = new ArrayList<byte[]>();
        var3_4 = var0.M() & 31;
        for (var2_5 = 0; var2_5 < var3_4; ++var2_5) {
            var11_3.add(ax.q1.d.a((G)var0));
            continue;
        }
        var4_6 = var0.M();
        for (var2_5 = 0; var2_5 < var4_6; ++var2_5) {
            var11_3.add(ax.q1.d.a((G)var0));
            continue;
        }
        if (var3_4 > 0) {
            var0 = (byte[])var11_3.get(0);
            var0 = ax.T0.h.C((byte[])var11_3.get(0), ax.T0.h.a.length, ((Object)var0).length);
            var2_5 = var0.f;
            var4_6 = var0.g;
            var7_7 = var0.i;
            var8_8 = var0.j;
            var5_9 = var0.q;
            var9_10 = var0.r;
            var3_4 = var0.s;
            var6_11 = var0.t;
            var1_12 = var0.h;
            var0 = ax.S0.i.f(var0.a, var0.b, var0.c);
            var8_8 += 8;
            var7_7 += 8;
        } else {
            var0 = null;
            var2_5 = -1;
            var4_6 = -1;
            var7_7 = -1;
            var8_8 = -1;
            var5_9 = -1;
            var9_10 = -1;
            var3_4 = -1;
            var6_11 = 16;
            var1_12 = 1.0f;
        }
        try {
            return new d(var11_3, var10_2, var2_5, var4_6, var7_7, var8_8, var5_9, var9_10, var3_4, var6_11, var1_12, (String)var0);
lbl49:
            // 1 sources

            var0 = new IllegalStateException();
            throw var0;
        }
        catch (ArrayIndexOutOfBoundsException var0_1) {
            throw E.a("Error parsing AVC config", var0_1);
        }
    }
}

