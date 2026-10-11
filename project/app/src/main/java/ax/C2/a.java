/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.content.Context;
import ax.Gb.l;
import java.io.File;

public final class a {
    public static final a a = new a();

    private a() {
    }

    public final File a(Context object) {
        l.f(object, "context");
        object = object.getNoBackupFilesDir();
        l.e(object, "context.noBackupFilesDir");
        return object;
    }
}

