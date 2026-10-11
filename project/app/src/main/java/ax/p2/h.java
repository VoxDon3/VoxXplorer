/*
 * Decompiled with CFR 0.152.
 */
package ax.p2;

import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import ax.Gb.l;
import ax.o2.k;
import ax.p2.g;

public final class h
extends g
implements k {
    private final SQLiteStatement c0;

    public h(SQLiteStatement sQLiteStatement) {
        l.f(sQLiteStatement, "delegate");
        super((SQLiteProgram)sQLiteStatement);
        this.c0 = sQLiteStatement;
    }

    @Override
    public int I() {
        return this.c0.executeUpdateDelete();
    }

    @Override
    public long S0() {
        return this.c0.executeInsert();
    }
}

