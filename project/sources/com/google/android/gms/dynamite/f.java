package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0546b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0546b c0546b = new DynamiteModule.b.C0546b();
        int a = aVar.a(context, str, false);
        c0546b.b = a;
        c0546b.c = a != 0 ? 1 : 0;
        return c0546b;
    }
}
