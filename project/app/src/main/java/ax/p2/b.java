/*
 * Decompiled with CFR 0.152.
 */
package ax.p2;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import ax.Fb.r;
import ax.p2.c;

public final class b
implements SQLiteDatabase.CursorFactory {
    public final r a;

    public /* synthetic */ b(r r8) {
        this.a = r8;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String string, SQLiteQuery sQLiteQuery) {
        return c.b(this.a, sQLiteDatabase, sQLiteCursorDriver, string, sQLiteQuery);
    }
}

