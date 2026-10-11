package ax.m0;

import android.content.Context;
import ax.Gb.l;
import java.io.File;

/* renamed from: ax.m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2509a {
    public static final File a(Context context, String str) {
        l.f(context, "<this>");
        l.f(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), l.m("datastore/", str));
    }
}
