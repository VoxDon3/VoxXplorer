package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class d implements DynamiteModule.b {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0546b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0546b c0546b = new DynamiteModule.b.C0546b();
        int a = aVar.a(context, str, true);
        c0546b.b = a;
        if (a != 0) {
            c0546b.c = 1;
            return c0546b;
        }
        int b = aVar.b(context, str);
        c0546b.a = b;
        if (b != 0) {
            c0546b.c = -1;
        }
        return c0546b;
    }
}
