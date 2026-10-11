package ax.M5;

import android.content.Context;
import android.content.res.Resources;
import ax.J5.C0754o;

/* renamed from: ax.M5.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0823s {
    private final Resources a;
    private final String b;

    public C0823s(Context context) {
        C0821p.l(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(C0754o.a);
    }

    public String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
