/*
 * Decompiled with CFR 0.152.
 */
package ax.p2;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import ax.o2.h;
import ax.p2.d;

public final class e
implements DatabaseErrorHandler {
    public final h.a a;
    public final d.b b;

    public /* synthetic */ e(h.a a8, d.b b8) {
        this.a = a8;
        this.b = b8;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        d.c.a(this.a, this.b, sQLiteDatabase);
    }
}

