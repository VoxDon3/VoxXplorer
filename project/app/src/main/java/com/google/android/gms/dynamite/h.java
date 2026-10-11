/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class h
implements DynamiteModule.b {
    h() {
    }

    @Override
    public final DynamiteModule.b.b a(Context context, String string, DynamiteModule.b.a a8) throws DynamiteModule.a {
        int n8;
        DynamiteModule.b.b b8;
        block3: {
            int n9;
            int n10;
            block2: {
                int n11;
                block1: {
                    b8 = new DynamiteModule.b.b();
                    b8.a = n10 = a8.b(context, string);
                    n8 = 1;
                    n9 = 0;
                    b8.b = n10 != 0 ? (n10 = a8.a(context, string, false)) : (n10 = a8.a(context, string, true));
                    n11 = b8.a;
                    if (n11 != 0) break block1;
                    if (n10 != 0) break block2;
                    n8 = 0;
                    break block3;
                }
                n9 = n11;
            }
            if (n9 >= n10) {
                n8 = -1;
            }
        }
        b8.c = n8;
        return b8;
    }
}

