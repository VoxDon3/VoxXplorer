/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import android.database.sqlite.SQLiteDatabase;
import ax.s5.c;
import ax.x5.M;

public final class q
implements M.b {
    public final String a;
    public final c.b b;
    public final long c;

    public /* synthetic */ q(String string, c.b b8, long l8) {
        this.a = string;
        this.b = b8;
        this.c = l8;
    }

    public final Object apply(Object object) {
        return M.s0(this.a, this.b, this.c, (SQLiteDatabase)object);
    }
}

