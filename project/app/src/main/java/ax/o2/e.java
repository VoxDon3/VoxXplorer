/*
 * Decompiled with CFR 0.152.
 */
package ax.o2;

import android.database.Cursor;
import android.os.Bundle;
import ax.Gb.l;

public final class e {
    public static final e a = new e();

    private e() {
    }

    public static final void a(Cursor cursor, Bundle bundle) {
        l.f(cursor, "cursor");
        l.f(bundle, "extras");
        cursor.setExtras(bundle);
    }
}

