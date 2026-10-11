/*
 * Decompiled with CFR 0.152.
 */
package ax.o2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import ax.Gb.l;
import java.io.File;

public final class b {
    public static final b a = new b();

    private b() {
    }

    public static final boolean a(File file) {
        l.f(file, "file");
        return SQLiteDatabase.deleteDatabase((File)file);
    }

    public static final boolean b(SQLiteDatabase sQLiteDatabase) {
        l.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public static final Cursor c(SQLiteDatabase sQLiteDatabase, String string, String[] stringArray, String string2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        l.f(sQLiteDatabase, "sQLiteDatabase");
        l.f(string, "sql");
        l.f(stringArray, "selectionArgs");
        l.f(cancellationSignal, "cancellationSignal");
        l.f(cursorFactory, "cursorFactory");
        sQLiteDatabase = sQLiteDatabase.rawQueryWithFactory(cursorFactory, string, stringArray, string2, cancellationSignal);
        l.e(sQLiteDatabase, "sQLiteDatabase.rawQueryW\u2026ationSignal\n            )");
        return sQLiteDatabase;
    }

    public static final void d(SQLiteOpenHelper sQLiteOpenHelper, boolean bl) {
        l.f(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(bl);
    }
}

