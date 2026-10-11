/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class i
implements DynamiteModule.b {
    i() {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final DynamiteModule.b.b a(Context var1_1, String var2_2, DynamiteModule.b.a var3_3) throws DynamiteModule.a {
        var8_4 = new DynamiteModule.b.b();
        var8_4.a = var3_3.b(var1_1, var2_2);
        var5_5 = 1;
        var8_4.b = var7_6 = var3_3.a(var1_1, var2_2, true);
        var4_8 = var6_7 = var8_4.a;
        if (var6_7 != 0) ** GOTO lbl-1000
        var4_8 = 0;
        if (var7_6 == 0) {
            var4_8 = 0;
        } else lbl-1000:
        // 2 sources

        {
            var4_8 = var7_6 >= var4_8 ? var5_5 : -1;
        }
        var8_4.c = var4_8;
        return var8_4;
    }
}

