/*
 * Decompiled with CFR 0.152.
 */
package ax.nb;

import ax.Rd.c;
import ax.nb.b;
import ax.nb.f;
import ax.nb.g;
import java.io.UnsupportedEncodingException;

class j
extends f {
    private int A;
    private byte[] B;
    private byte[] C;
    g[] D;
    private g z;

    j(g g8) {
        this.z = g8;
        this.r = new b();
        this.B = new byte[6];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int o(byte[] var1_1, int var2_3) {
        this.D = new g[this.A];
        var16_4 = this.z.a.b;
        var3_5 = var2_3;
        var4_6 = 0;
        var5_7 = false;
        while (true) {
            if (var4_6 >= this.A) return var3_5 - var2_3;
            var6_8 = var3_5 + 14;
            while (var1_1[var6_8] == 32) {
                --var6_8;
            }
            var14_16 /* !! */  = ax.nb.b.f;
            break;
        }
        catch (UnsupportedEncodingException var1_2) {
            return var3_5 - var2_3;
        }
        {
            try {
                var15_17 = new c(null);
                var15_17.d(var1_1, var3_5, var6_8 - var3_5 + 1);
                var15_17.a();
                var15_17 = var15_17.c();
                if (var15_17 != null) {
                    var14_16 /* !! */  = var15_17;
                }
            }
            catch (Exception var15_18) {}
            var15_17 = new String(var1_1, var3_5, var6_8 - var3_5 + 1, (String)var14_16 /* !! */ );
            var6_8 = var1_1[var3_5 + 15] & 255;
            var7_9 = var1_1[var3_5 + 16];
            var9_11 = (var7_9 & 128) == 128;
            var8_10 = (var7_9 & 96) >> 5;
            var10_12 = (var7_9 & 16) == 16;
            var11_13 = (var7_9 & 8) == 8;
            var12_14 = (var7_9 & 4) == 4;
            var13_15 = (var7_9 & 2) == 2;
            if (var5_7) ** GOTO lbl-1000
            var14_16 /* !! */  = this.z.a;
            if (var14_16 /* !! */ .c != var6_8) ** GOTO lbl-1000
            var17_19 = ax.nb.g.r;
            if (var14_16 /* !! */  == var17_19) ** GOTO lbl-1000
            if (var14_16 /* !! */ .a.equals(var15_17)) lbl-1000:
            // 2 sources

            {
                var14_16 /* !! */  = this.z;
                if (var14_16 /* !! */ .a == var17_19) {
                    var14_16 /* !! */ .a = var17_19 = new b((String)var15_17, var6_8, var16_4);
                }
                var14_16 /* !! */  = this.z;
                var14_16 /* !! */ .d = var9_11;
                var14_16 /* !! */ .c = var8_10;
                var14_16 /* !! */ .e = var10_12;
                var14_16 /* !! */ .f = var11_13;
                var14_16 /* !! */ .g = var12_14;
                var14_16 /* !! */ .h = var13_15;
                var14_16 /* !! */ .j = this.B;
                var14_16 /* !! */ .i = true;
                this.D[var4_6] = var14_16 /* !! */ ;
                var5_7 = true;
            } else lbl-1000:
            // 3 sources

            {
                var14_16 /* !! */  = this.D;
                var17_19 = new b((String)var15_17, var6_8, var16_4);
                var14_16 /* !! */ [var4_6] = new g(var17_19, this.z.b, var9_11, var8_10, var10_12, var11_13, var12_14, var13_15, this.B);
            }
            var3_5 += 18;
            ++var4_6;
            continue;
        }
    }

    @Override
    int a(byte[] byArray, int n8) {
        return this.h(byArray, n8);
    }

    @Override
    int g(byte[] byArray, int n8) {
        int n9;
        int n10 = byArray[n8];
        this.A = n9 = n10 & 0xFF;
        int n11 = n9 * 18;
        n9 = this.x - n11 - 1;
        int n12 = n8 + 1;
        this.A = n10 & 0xFF;
        System.arraycopy(byArray, n11 + n12, this.B, 0, 6);
        n10 = n12 + this.o(byArray, n12);
        byte[] byArray2 = new byte[n9];
        this.C = byArray2;
        System.arraycopy(byArray, n10, byArray2, 0, n9);
        return n10 + n9 - n8;
    }

    @Override
    int j(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NodeStatusResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

