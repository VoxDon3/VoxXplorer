package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class g implements DynamiteModule.b {
    g() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0546b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0546b c0546b = new DynamiteModule.b.C0546b();
        c0546b.a = aVar.b(context, str);
        int i = 1;
        int a = aVar.a(context, str, true);
        c0546b.b = a;
        int i2 = c0546b.a;
        if (i2 == 0) {
            i2 = 0;
            if (a == 0) {
                i = 0;
                c0546b.c = i;
                return c0546b;
            }
        }
        if (i2 >= a) {
            i = -1;
        }
        c0546b.c = i;
        return c0546b;
    }
}
