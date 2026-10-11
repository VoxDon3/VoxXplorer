/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.database.sqlite.SQLiteDatabase;
import ax.x5.M;

public final class I
implements M.b {
    public final M a;
    public final long b;

    public /* synthetic */ I(M m8, long l8) {
        this.a = m8;
        this.b = l8;
    }

    public final Object apply(Object object) {
        return M.A0(this.a, this.b, (SQLiteDatabase)object);
    }
}

