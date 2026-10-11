/*
 * Decompiled with CFR 0.152.
 */
package ax.p0;

import android.content.Context;
import ax.Gb.l;
import ax.m0.a;
import java.io.File;

public final class b {
    public static final File a(Context context, String string) {
        l.f(context, "<this>");
        l.f(string, "name");
        return a.a(context, l.m(string, ".preferences_pb"));
    }
}

