/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import ax.Gb.l;
import ax.k2.g;
import ax.o2.e;
import ax.o2.f;
import ax.o2.h;
import ax.o2.j;
import ax.o2.k;
import ax.sb.t;
import ax.tb.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class d
implements h,
g,
AutoCloseable {
    public final ax.k2.c c0;
    private final a d0;
    private final h q;

    public d(h h8, ax.k2.c c8) {
        l.f(h8, "delegate");
        l.f(c8, "autoCloser");
        this.q = h8;
        this.c0 = c8;
        c8.k(this.a());
        this.d0 = new a(c8);
    }

    @Override
    public h a() {
        return this.q;
    }

    @Override
    public void close() {
        this.d0.close();
    }

    @Override
    public ax.o2.g g0() {
        this.d0.a();
        return this.d0;
    }

    @Override
    public String getDatabaseName() {
        return this.q.getDatabaseName();
    }

    @Override
    public void setWriteAheadLoggingEnabled(boolean bl) {
        this.q.setWriteAheadLoggingEnabled(bl);
    }

    public static final class ax.k2.d$a
    implements ax.o2.g,
    AutoCloseable {
        private final ax.k2.c q;

        public ax.k2.d$a(ax.k2.c c8) {
            l.f(c8, "autoCloser");
            this.q = c8;
        }

        @Override
        public void C(String string) throws SQLException {
            l.f(string, "sql");
            this.q.g(new ax.Fb.l<ax.o2.g, Object>(string){
                final String q;
                {
                    this.q = string;
                    super(1);
                }

                public final Object a(ax.o2.g g8) {
                    l.f(g8, "db");
                    g8.C(this.q);
                    return null;
                }
            });
        }

        @Override
        public boolean E0() {
            return this.q.g(e.q);
        }

        @Override
        public k J(String string) {
            l.f(string, "sql");
            return new b(string, this.q);
        }

        @Override
        public void Y() {
            Object object = this.q.h();
            if (object != null) {
                object.Y();
                object = t.a;
            } else {
                object = null;
            }
            if (object != null) {
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }

        @Override
        public void Z(String string, Object[] objectArray) throws SQLException {
            l.f(string, "sql");
            l.f(objectArray, "bindArgs");
            this.q.g(new ax.Fb.l<ax.o2.g, Object>(string, objectArray){
                final Object[] c0;
                final String q;
                {
                    this.q = string;
                    this.c0 = objectArray;
                    super(1);
                }

                public final Object a(ax.o2.g g8) {
                    l.f(g8, "db");
                    g8.Z(this.q, this.c0);
                    return null;
                }
            });
        }

        public final void a() {
            this.q.g(g.q);
        }

        @Override
        public void a0() {
            ax.o2.g g8 = this.q.j();
            try {
                g8.a0();
                return;
            }
            catch (Throwable throwable) {
                this.q.e();
                throw throwable;
            }
        }

        @Override
        public int b0(String string, int n8, ContentValues contentValues, String string2, Object[] objectArray) {
            l.f(string, "table");
            l.f(contentValues, "values");
            return ((Number)this.q.g(new ax.Fb.l<ax.o2.g, Integer>(string, n8, contentValues, string2, objectArray){
                final int c0;
                final ContentValues d0;
                final String e0;
                final Object[] f0;
                final String q;
                {
                    this.q = string;
                    this.c0 = n8;
                    this.d0 = contentValues;
                    this.e0 = string2;
                    this.f0 = objectArray;
                    super(1);
                }

                public final Integer a(ax.o2.g g8) {
                    l.f(g8, "db");
                    return g8.b0(this.q, this.c0, this.d0, this.e0, this.f0);
                }
            })).intValue();
        }

        @Override
        public void close() throws IOException {
            this.q.d();
        }

        @Override
        public String getPath() {
            return this.q.g(f.q);
        }

        @Override
        public Cursor h0(String string) {
            l.f(string, "query");
            try {
                string = this.q.j().h0(string);
                return new c((Cursor)string, this.q);
            }
            catch (Throwable throwable) {
                this.q.e();
                throw throwable;
            }
        }

        @Override
        public boolean isOpen() {
            ax.o2.g g8 = this.q.h();
            if (g8 == null) {
                return false;
            }
            return g8.isOpen();
        }

        @Override
        public void j0() {
            if (this.q.h() != null) {
                try {
                    ax.o2.g g8 = this.q.h();
                    l.c(g8);
                    g8.j0();
                    return;
                }
                finally {
                    this.q.e();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null");
        }

        @Override
        public Cursor n0(j j8) {
            l.f(j8, "query");
            try {
                j8 = this.q.j().n0(j8);
                return new c((Cursor)j8, this.q);
            }
            catch (Throwable throwable) {
                this.q.e();
                throw throwable;
            }
        }

        @Override
        public void r() {
            ax.o2.g g8 = this.q.j();
            try {
                g8.r();
                return;
            }
            catch (Throwable throwable) {
                this.q.e();
                throw throwable;
            }
        }

        @Override
        public List<Pair<String, String>> x() {
            return this.q.g(a.q);
        }

        @Override
        public Cursor y(j j8, CancellationSignal cancellationSignal) {
            l.f(j8, "query");
            try {
                j8 = this.q.j().y(j8, cancellationSignal);
                return new c((Cursor)j8, this.q);
            }
            catch (Throwable throwable) {
                this.q.e();
                throw throwable;
            }
        }

        @Override
        public boolean z0() {
            if (this.q.h() == null) {
                return false;
            }
            return this.q.g(d.k0);
        }
    }

    private static final class b
    implements k,
    AutoCloseable {
        private final ax.k2.c c0;
        private final ArrayList<Object> d0;
        private final String q;

        public b(String string, ax.k2.c c8) {
            l.f(string, "sql");
            l.f(c8, "autoCloser");
            this.q = string;
            this.c0 = c8;
            this.d0 = new ArrayList();
        }

        private final void c(k k8) {
            ArrayList<Object> arrayList = this.d0;
            int n8 = arrayList.size();
            int n9 = 0;
            int n10 = 0;
            while (n10 < n8) {
                Object object;
                arrayList.get(n10);
                ++n10;
                int n11 = n9 + 1;
                if (n9 < 0) {
                    o.r();
                }
                if ((object = this.d0.get(n9)) == null) {
                    k8.t0(n11);
                } else if (object instanceof Long) {
                    k8.X(n11, ((Number)object).longValue());
                } else if (object instanceof Double) {
                    k8.N(n11, ((Number)object).doubleValue());
                } else if (object instanceof String) {
                    k8.D(n11, (String)object);
                } else if (object instanceof byte[]) {
                    k8.e0(n11, (byte[])object);
                }
                n9 = n11;
            }
        }

        private final <T> T d(ax.Fb.l<? super k, ? extends T> l8) {
            return (T)this.c0.g(new ax.Fb.l<ax.o2.g, T>(this, l8){
                final ax.Fb.l<k, T> c0;
                final b q;
                {
                    this.q = b8;
                    this.c0 = l8;
                    super(1);
                }

                public final T a(ax.o2.g closeable) {
                    l.f(closeable, "db");
                    closeable = closeable.J(this.q.q);
                    this.q.c((k)closeable);
                    return this.c0.invoke((k)closeable);
                }
            });
        }

        private final void e(int n8, Object object) {
            int n9 = n8 - 1;
            if (n9 >= this.d0.size() && (n8 = this.d0.size()) <= n9) {
                while (true) {
                    this.d0.add(null);
                    if (n8 == n9) break;
                    ++n8;
                }
            }
            this.d0.set(n9, object);
        }

        @Override
        public void D(int n8, String string) {
            l.f(string, "value");
            this.e(n8, string);
        }

        @Override
        public int I() {
            return ((Number)this.d(c.q)).intValue();
        }

        @Override
        public void N(int n8, double d8) {
            this.e(n8, d8);
        }

        @Override
        public long S0() {
            return ((Number)this.d(a.q)).longValue();
        }

        @Override
        public void X(int n8, long l8) {
            this.e(n8, l8);
        }

        @Override
        public void close() throws IOException {
        }

        @Override
        public void e0(int n8, byte[] byArray) {
            l.f(byArray, "value");
            this.e(n8, byArray);
        }

        @Override
        public void t0(int n8) {
            this.e(n8, null);
        }
    }

    private static final class c
    implements Cursor,
    AutoCloseable {
        private final ax.k2.c c0;
        private final Cursor q;

        public c(Cursor cursor, ax.k2.c c8) {
            l.f(cursor, "delegate");
            l.f(c8, "autoCloser");
            this.q = cursor;
            this.c0 = c8;
        }

        @Override
        public void close() {
            this.q.close();
            this.c0.e();
        }

        public void copyStringToBuffer(int n8, CharArrayBuffer charArrayBuffer) {
            this.q.copyStringToBuffer(n8, charArrayBuffer);
        }

        public void deactivate() {
            this.q.deactivate();
        }

        public byte[] getBlob(int n8) {
            return this.q.getBlob(n8);
        }

        public int getColumnCount() {
            return this.q.getColumnCount();
        }

        public int getColumnIndex(String string) {
            return this.q.getColumnIndex(string);
        }

        public int getColumnIndexOrThrow(String string) {
            return this.q.getColumnIndexOrThrow(string);
        }

        public String getColumnName(int n8) {
            return this.q.getColumnName(n8);
        }

        public String[] getColumnNames() {
            return this.q.getColumnNames();
        }

        public int getCount() {
            return this.q.getCount();
        }

        public double getDouble(int n8) {
            return this.q.getDouble(n8);
        }

        public Bundle getExtras() {
            return this.q.getExtras();
        }

        public float getFloat(int n8) {
            return this.q.getFloat(n8);
        }

        public int getInt(int n8) {
            return this.q.getInt(n8);
        }

        public long getLong(int n8) {
            return this.q.getLong(n8);
        }

        public Uri getNotificationUri() {
            return ax.o2.c.a(this.q);
        }

        public List<Uri> getNotificationUris() {
            return f.a(this.q);
        }

        public int getPosition() {
            return this.q.getPosition();
        }

        public short getShort(int n8) {
            return this.q.getShort(n8);
        }

        public String getString(int n8) {
            return this.q.getString(n8);
        }

        public int getType(int n8) {
            return this.q.getType(n8);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.q.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.q.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.q.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.q.isClosed();
        }

        public boolean isFirst() {
            return this.q.isFirst();
        }

        public boolean isLast() {
            return this.q.isLast();
        }

        public boolean isNull(int n8) {
            return this.q.isNull(n8);
        }

        public boolean move(int n8) {
            return this.q.move(n8);
        }

        public boolean moveToFirst() {
            return this.q.moveToFirst();
        }

        public boolean moveToLast() {
            return this.q.moveToLast();
        }

        public boolean moveToNext() {
            return this.q.moveToNext();
        }

        public boolean moveToPosition(int n8) {
            return this.q.moveToPosition(n8);
        }

        public boolean moveToPrevious() {
            return this.q.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.q.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.q.registerDataSetObserver(dataSetObserver);
        }

        public boolean requery() {
            return this.q.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.q.respond(bundle);
        }

        public void setExtras(Bundle bundle) {
            l.f(bundle, "extras");
            e.a(this.q, bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.q.setNotificationUri(contentResolver, uri);
        }

        public void setNotificationUris(ContentResolver contentResolver, List<? extends Uri> list) {
            l.f(contentResolver, "cr");
            l.f(list, "uris");
            f.b(this.q, contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.q.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.q.unregisterDataSetObserver(dataSetObserver);
        }
    }
}

