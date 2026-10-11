package ax.p2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import ax.Fb.r;
import ax.Gb.l;
import ax.Gb.m;
import ax.o2.C2680a;
import ax.o2.C2681b;
import ax.o2.j;
import ax.o2.k;
import java.io.IOException;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c implements ax.o2.g, AutoCloseable {
    public static final a d0 = new a(null);
    private static final String[] e0 = {HttpUrl.FRAGMENT_ENCODE_SET, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] f0 = new String[0];
    private final List<Pair<String, String>> c0;
    private final SQLiteDatabase q;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {
        final /* synthetic */ j q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.q = jVar;
        }

        @Override // ax.Fb.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor i(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.q;
            l.c(sQLiteQuery);
            jVar.a(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        l.f(sQLiteDatabase, "delegate");
        this.q = sQLiteDatabase;
        this.c0 = sQLiteDatabase.getAttachedDbs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor d(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        l.f(rVar, "$tmp0");
        return (Cursor) rVar.i(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor e(j jVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        l.f(jVar, "$query");
        l.c(sQLiteQuery);
        jVar.a(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // ax.o2.g
    public void C(String str) throws SQLException {
        l.f(str, "sql");
        this.q.execSQL(str);
    }

    @Override // ax.o2.g
    public boolean E0() {
        return C2681b.b(this.q);
    }

    @Override // ax.o2.g
    public k J(String str) {
        l.f(str, "sql");
        SQLiteStatement compileStatement = this.q.compileStatement(str);
        l.e(compileStatement, "delegate.compileStatement(sql)");
        return new h(compileStatement);
    }

    @Override // ax.o2.g
    public void Y() {
        this.q.setTransactionSuccessful();
    }

    @Override // ax.o2.g
    public void Z(String str, Object[] objArr) throws SQLException {
        l.f(str, "sql");
        l.f(objArr, "bindArgs");
        this.q.execSQL(str, objArr);
    }

    @Override // ax.o2.g
    public void a0() {
        this.q.beginTransactionNonExclusive();
    }

    @Override // ax.o2.g
    public int b0(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        l.f(str, "table");
        l.f(contentValues, "values");
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(e0[i]);
        sb.append(str);
        sb.append(" SET ");
        int i2 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : HttpUrl.FRAGMENT_ENCODE_SET);
            sb.append(str3);
            objArr2[i2] = contentValues.get(str3);
            sb.append("=?");
            i2++;
        }
        if (objArr != null) {
            for (int i3 = size; i3 < length; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        k J = J(sb2);
        C2680a.d0.b(J, objArr2);
        return J.I();
    }

    public final boolean c(SQLiteDatabase sQLiteDatabase) {
        l.f(sQLiteDatabase, "sqLiteDatabase");
        return l.a(this.q, sQLiteDatabase);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    @Override // ax.o2.g
    public String getPath() {
        return this.q.getPath();
    }

    @Override // ax.o2.g
    public Cursor h0(String str) {
        l.f(str, "query");
        return n0(new C2680a(str));
    }

    @Override // ax.o2.g
    public boolean isOpen() {
        return this.q.isOpen();
    }

    @Override // ax.o2.g
    public void j0() {
        this.q.endTransaction();
    }

    @Override // ax.o2.g
    public Cursor n0(j jVar) {
        l.f(jVar, "query");
        final b bVar = new b(jVar);
        Cursor rawQueryWithFactory = this.q.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ax.p2.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor d;
                d = c.d(r.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return d;
            }
        }, jVar.b(), f0, null);
        l.e(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // ax.o2.g
    public void r() {
        this.q.beginTransaction();
    }

    @Override // ax.o2.g
    public List<Pair<String, String>> x() {
        return this.c0;
    }

    @Override // ax.o2.g
    public Cursor y(final j jVar, CancellationSignal cancellationSignal) {
        l.f(jVar, "query");
        SQLiteDatabase sQLiteDatabase = this.q;
        String b2 = jVar.b();
        String[] strArr = f0;
        l.c(cancellationSignal);
        return C2681b.c(sQLiteDatabase, b2, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: ax.p2.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor e;
                e = c.e(j.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return e;
            }
        });
    }

    @Override // ax.o2.g
    public boolean z0() {
        return this.q.inTransaction();
    }
}
