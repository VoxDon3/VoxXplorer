package ax.f6;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import ax.J5.C0754o;
import ax.M5.C0821p;

/* renamed from: ax.f6.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2065m {
    private final Resources a;
    private final String b;

    public C2065m(Context context, String str) {
        C0821p.l(context);
        this.a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.b = a(context);
        } else {
            this.b = str;
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C0754o.a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
