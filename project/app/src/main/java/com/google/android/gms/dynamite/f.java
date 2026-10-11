/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class f
implements DynamiteModule.b {
    f() {
    }

    @Override
    public final DynamiteModule.b.b a(Context context, String string, DynamiteModule.b.a a8) throws DynamiteModule.a {
        int n8;
        DynamiteModule.b.b b8 = new DynamiteModule.b.b();
        int n9 = 0;
        b8.b = n8 = a8.a(context, string, false);
        if (n8 != 0) {
            n9 = 1;
        }
        b8.c = n9;
        return b8;
    }
}

