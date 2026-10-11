/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class j
implements DynamiteModule.b {
    j() {
    }

    @Override
    public final DynamiteModule.b.b a(Context context, String string, DynamiteModule.b.a a8) throws DynamiteModule.a {
        int n8;
        DynamiteModule.b.b b8;
        block2: {
            int n9;
            int n10;
            block1: {
                int n11;
                block0: {
                    b8 = new DynamiteModule.b.b();
                    b8.a = n8 = a8.b(context, string);
                    n10 = 1;
                    n9 = 0;
                    b8.b = n8 != 0 ? (n8 = a8.a(context, string, false)) : (n8 = a8.a(context, string, true));
                    n11 = b8.a;
                    if (n11 != 0) break block0;
                    if (n8 != 0) break block1;
                    n8 = 0;
                    break block2;
                }
                n9 = n11;
            }
            n8 = n8 >= n9 ? n10 : -1;
        }
        b8.c = n8;
        return b8;
    }
}

