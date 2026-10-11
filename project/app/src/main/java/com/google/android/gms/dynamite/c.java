/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class c
implements DynamiteModule.b.a {
    c() {
    }

    @Override
    public final int a(Context context, String string, boolean bl) throws DynamiteModule.a {
        return DynamiteModule.f(context, string, bl);
    }

    @Override
    public final int b(Context context, String string) {
        return DynamiteModule.a(context, string);
    }
}

