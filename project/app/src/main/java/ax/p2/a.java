/*
 * Decompiled with CFR 0.152.
 */
package ax.p2;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import ax.o2.j;
import ax.p2.c;

public final class a
implements SQLiteDatabase.CursorFactory {
    public final j a;

    public /* synthetic */ a(j j8) {
        this.a = j8;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String string, SQLiteQuery sQLiteQuery) {
        return c.a(this.a, sQLiteDatabase, sQLiteCursorDriver, string, sQLiteQuery);
    }
}

