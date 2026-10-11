/*
 * Decompiled with CFR 0.152.
 */
package ax.Z;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import ax.Z.e;

public final class d {
    public static e.a a(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT < 24) {
            return new e.b(context, uri);
        }
        return new e.c(context, uri);
    }
}

