package ax.p0;

import android.content.Context;
import ax.Gb.l;
import ax.m0.C2509a;
import java.io.File;

/* renamed from: ax.p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2751b {
    public static final File a(Context context, String str) {
        l.f(context, "<this>");
        l.f(str, "name");
        return C2509a.a(context, l.m(str, ".preferences_pb"));
    }
}
