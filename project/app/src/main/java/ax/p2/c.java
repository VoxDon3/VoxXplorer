/*
 * Decompiled with CFR 0.152.
 */
package ax.p2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import ax.Fb.r;
import ax.Gb.l;
import ax.o2.i;
import ax.o2.j;
import ax.o2.k;
import ax.p2.b;
import ax.p2.g;
import ax.p2.h;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class c
implements ax.o2.g,
AutoCloseable {
    public static final a d0 = new a(null);
    private static final String[] e0 = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] f0 = new String[0];
    private final List<Pair<String, String>> c0;
    private final SQLiteDatabase q;

    public c(SQLiteDatabase sQLiteDatabase) {
        l.f(sQLiteDatabase, "delegate");
        this.q = sQLiteDatabase;
        this.c0 = sQLiteDatabase.getAttachedDbs();
    }

    public static /* synthetic */ Cursor a(j j8, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String string, SQLiteQuery sQLiteQuery) {
        return c.e(j8, sQLiteDatabase, sQLiteCursorDriver, string, sQLiteQuery);
    }

    public static /* synthetic */ Cursor b(r r8, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String string, SQLiteQuery sQLiteQuery) {
        return c.d(r8, sQLiteDatabase, sQLiteCursorDriver, string, sQLiteQuery);
    }

    private static final Cursor d(r r8, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String string, SQLiteQuery sQLiteQuery) {
        l.f(r8, "$tmp0");
        return (Cursor)r8.i(sQLiteDatabase, sQLiteCursorDriver, string, sQLiteQuery);
    }

    private static final Cursor e(j j8, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String string, SQLiteQuery sQLiteQuery) {
        l.f(j8, "$query");
        l.c(sQLiteQuery);
        j8.a(new g((SQLiteProgram)sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, string, sQLiteQuery);
    }

    @Override
    public void C(String string) throws SQLException {
        l.f(string, "sql");
        this.q.execSQL(string);
    }

    @Override
    public boolean E0() {
        return ax.o2.b.b(this.q);
    }

    @Override
    public k J(String string) {
        l.f(string, "sql");
        string = this.q.compileStatement(string);
        l.e(string, "delegate.compileStatement(sql)");
        return new h((SQLiteStatement)string);
    }

    @Override
    public void Y() {
        this.q.setTransactionSuccessful();
    }

    @Override
    public void Z(String string, Object[] objectArray) throws SQLException {
        l.f(string, "sql");
        l.f(objectArray, "bindArgs");
        this.q.execSQL(string, objectArray);
    }

    @Override
    public void a0() {
        this.q.beginTransactionNonExclusive();
    }

    @Override
    public int b0(String object, int n8, ContentValues contentValues, String string, Object[] objectArray) {
        l.f(object, "table");
        l.f(contentValues, "values");
        if (contentValues.size() != 0) {
            int n9 = contentValues.size();
            int n10 = objectArray == null ? n9 : objectArray.length + n9;
            Object[] objectArray2 = new Object[n10];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("UPDATE ");
            stringBuilder.append(e0[n8]);
            stringBuilder.append((String)object);
            stringBuilder.append(" SET ");
            Iterator iterator = contentValues.keySet().iterator();
            n8 = 0;
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                object = n8 > 0 ? "," : "";
                stringBuilder.append((String)object);
                stringBuilder.append(string2);
                objectArray2[n8] = contentValues.get(string2);
                stringBuilder.append("=?");
                ++n8;
            }
            if (objectArray != null) {
                for (n8 = n9; n8 < n10; ++n8) {
                    objectArray2[n8] = objectArray[n8 - n9];
                }
            }
            if (!TextUtils.isEmpty((CharSequence)string)) {
                stringBuilder.append(" WHERE ");
                stringBuilder.append(string);
            }
            object = stringBuilder.toString();
            l.e(object, "StringBuilder().apply(builderAction).toString()");
            object = this.J((String)object);
            ax.o2.a.d0.b((i)object, objectArray2);
            return object.I();
        }
        throw new IllegalArgumentException("Empty values");
    }

    public final boolean c(SQLiteDatabase sQLiteDatabase) {
        l.f(sQLiteDatabase, "sqLiteDatabase");
        return l.a(this.q, sQLiteDatabase);
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }

    @Override
    public String getPath() {
        return this.q.getPath();
    }

    @Override
    public Cursor h0(String string) {
        l.f(string, "query");
        return this.n0(new ax.o2.a(string));
    }

    @Override
    public boolean isOpen() {
        return this.q.isOpen();
    }

    @Override
    public void j0() {
        this.q.endTransaction();
    }

    @Override
    public Cursor n0(j j8) {
        l.f(j8, "query");
        r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> r8 = new r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor>(j8){
            final j q;
            {
                this.q = j8;
                super(4);
            }

            public final SQLiteCursor a(SQLiteDatabase object, SQLiteCursorDriver sQLiteCursorDriver, String string, SQLiteQuery sQLiteQuery) {
                object = this.q;
                l.c(sQLiteQuery);
                object.a(new g((SQLiteProgram)sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, string, sQLiteQuery);
            }
        };
        j8 = this.q.rawQueryWithFactory((SQLiteDatabase.CursorFactory)new b(r8), j8.b(), f0, null);
        l.e(j8, "delegate.rawQueryWithFac\u2026EMPTY_STRING_ARRAY, null)");
        return j8;
    }

    @Override
    public void r() {
        this.q.beginTransaction();
    }

    @Override
    public List<Pair<String, String>> x() {
        return this.c0;
    }

    @Override
    public Cursor y(j j8, CancellationSignal cancellationSignal) {
        l.f(j8, "query");
        SQLiteDatabase sQLiteDatabase = this.q;
        String string = j8.b();
        String[] stringArray = f0;
        l.c(cancellationSignal);
        return ax.o2.b.c(sQLiteDatabase, string, stringArray, null, cancellationSignal, new ax.p2.a(j8));
    }

    @Override
    public boolean z0() {
        return this.q.inTransaction();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ax.Gb.g g8) {
            this();
        }
    }
}

