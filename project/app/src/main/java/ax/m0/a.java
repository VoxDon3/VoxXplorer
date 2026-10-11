/*
 * Decompiled with CFR 0.152.
 */
package ax.m0;

import android.content.Context;
import ax.Gb.l;
import java.io.File;

public final class a {
    public static final File a(Context context, String string) {
        l.f(context, "<this>");
        l.f(string, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), l.m("datastore/", string));
    }
}

