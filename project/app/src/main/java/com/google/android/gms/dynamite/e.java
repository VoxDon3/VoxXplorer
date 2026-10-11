/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class e
implements DynamiteModule.b {
    e() {
    }

    @Override
    public final DynamiteModule.b.b a(Context context, String string, DynamiteModule.b.a a8) throws DynamiteModule.a {
        int n8;
        DynamiteModule.b.b b8 = new DynamiteModule.b.b();
        b8.a = n8 = a8.b(context, string);
        if (n8 != 0) {
            b8.c = -1;
            return b8;
        }
        b8.b = n8 = a8.a(context, string, true);
        if (n8 != 0) {
            b8.c = 1;
        }
        return b8;
    }
}

