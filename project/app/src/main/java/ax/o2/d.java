/*
 * Decompiled with CFR 0.152.
 */
package ax.o2;

import android.content.Context;
import ax.Gb.l;
import java.io.File;

public final class d {
    public static final d a = new d();

    private d() {
    }

    public static final File a(Context object) {
        l.f(object, "context");
        object = object.getNoBackupFilesDir();
        l.e(object, "context.noBackupFilesDir");
        return object;
    }
}

