/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.database.sqlite.SQLiteDatabase;
import ax.p5.p;
import ax.x5.M;

public final class o
implements M.b {
    public final long a;
    public final p b;

    public /* synthetic */ o(long l8, p p8) {
        this.a = l8;
        this.b = p8;
    }

    public final Object apply(Object object) {
        return M.u(this.a, this.b, (SQLiteDatabase)object);
    }
}

