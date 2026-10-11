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
import ax.o2.C2682c;
import ax.tb.C3139o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.k2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2373d implements ax.o2.h, InterfaceC2376g, AutoCloseable {
    public final C2372c c0;
    private final a d0;
    private final ax.o2.h q;

    /* renamed from: ax.k2.d$a */
    public static final class a implements ax.o2.g, AutoCloseable {
        private final C2372c q;

        /* renamed from: ax.k2.d$a$a, reason: collision with other inner class name */
        static final class C0347a extends ax.Gb.m implements ax.Fb.l<ax.o2.g, List<? extends Pair<String, String>>> {
            public static final C0347a q = new C0347a();

            C0347a() {
                super(1);
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Pair<String, String>> invoke(ax.o2.g gVar) {
                ax.Gb.l.f(gVar, "obj");
                return gVar.x();
            }
        }

        /* renamed from: ax.k2.d$a$b */
        static final class b extends ax.Gb.m implements ax.Fb.l<ax.o2.g, Object> {
            final /* synthetic */ String q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.q = str;
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ax.o2.g gVar) {
                ax.Gb.l.f(gVar, "db");
                gVar.C(this.q);
                return null;
            }
        }

        /* renamed from: ax.k2.d$a$c */
        static final class c extends ax.Gb.m implements ax.Fb.l<ax.o2.g, Object> {
            final /* synthetic */ Object[] c0;
            final /* synthetic */ String q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.q = str;
                this.c0 = objArr;
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ax.o2.g gVar) {
                ax.Gb.l.f(gVar, "db");
                gVar.Z(this.q, this.c0);
                return null;
            }
        }

        /* renamed from: ax.k2.d$a$d, reason: collision with other inner class name */
        /* synthetic */ class C0348d extends ax.Gb.j implements ax.Fb.l<ax.o2.g, Boolean> {
            public static final C0348d k0 = new C0348d();

            C0348d() {
                super(1, ax.o2.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // ax.Fb.l
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(ax.o2.g gVar) {
                ax.Gb.l.f(gVar, "p0");
                return Boolean.valueOf(gVar.z0());
            }
        }

        /* renamed from: ax.k2.d$a$e */
        static final class e extends ax.Gb.m implements ax.Fb.l<ax.o2.g, Boolean> {
            public static final e q = new e();

            e() {
                super(1);
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(ax.o2.g gVar) {
                ax.Gb.l.f(gVar, "db");
                return Boolean.valueOf(gVar.E0());
            }
        }

        /* renamed from: ax.k2.d$a$f */
        static final class f extends ax.Gb.m implements ax.Fb.l<ax.o2.g, String> {
            public static final f q = new f();

            f() {
                super(1);
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(ax.o2.g gVar) {
                ax.Gb.l.f(gVar, "obj");
                return gVar.getPath();
            }
        }

        /* renamed from: ax.k2.d$a$g */
        static final class g extends ax.Gb.m implements ax.Fb.l<ax.o2.g, Object> {
            public static final g q = new g();

            g() {
                super(1);
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ax.o2.g gVar) {
                ax.Gb.l.f(gVar, "it");
                return null;
            }
        }

        /* renamed from: ax.k2.d$a$h */
        static final class h extends ax.Gb.m implements ax.Fb.l<ax.o2.g, Integer> {
            final /* synthetic */ int c0;
            final /* synthetic */ ContentValues d0;
            final /* synthetic */ String e0;
            final /* synthetic */ Object[] f0;
            final /* synthetic */ String q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.q = str;
                this.c0 = i;
                this.d0 = contentValues;
                this.e0 = str2;
                this.f0 = objArr;
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(ax.o2.g gVar) {
                ax.Gb.l.f(gVar, "db");
                return Integer.valueOf(gVar.b0(this.q, this.c0, this.d0, this.e0, this.f0));
            }
        }

        public a(C2372c c2372c) {
            ax.Gb.l.f(c2372c, "autoCloser");
            this.q = c2372c;
        }

        @Override // ax.o2.g
        public void C(String str) throws SQLException {
            ax.Gb.l.f(str, "sql");
            this.q.g(new b(str));
        }

        @Override // ax.o2.g
        public boolean E0() {
            return ((Boolean) this.q.g(e.q)).booleanValue();
        }

        @Override // ax.o2.g
        public ax.o2.k J(String str) {
            ax.Gb.l.f(str, "sql");
            return new b(str, this.q);
        }

        @Override // ax.o2.g
        public void Y() {
            ax.sb.t tVar;
            ax.o2.g h2 = this.q.h();
            if (h2 != null) {
                h2.Y();
                tVar = ax.sb.t.a;
            } else {
                tVar = null;
            }
            if (tVar == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // ax.o2.g
        public void Z(String str, Object[] objArr) throws SQLException {
            ax.Gb.l.f(str, "sql");
            ax.Gb.l.f(objArr, "bindArgs");
            this.q.g(new c(str, objArr));
        }

        public final void a() {
            this.q.g(g.q);
        }

        @Override // ax.o2.g
        public void a0() {
            try {
                this.q.j().a0();
            } catch (Throwable th) {
                this.q.e();
                throw th;
            }
        }

        @Override // ax.o2.g
        public int b0(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
            ax.Gb.l.f(str, "table");
            ax.Gb.l.f(contentValues, "values");
            return ((Number) this.q.g(new h(str, i, contentValues, str2, objArr))).intValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.q.d();
        }

        @Override // ax.o2.g
        public String getPath() {
            return (String) this.q.g(f.q);
        }

        @Override // ax.o2.g
        public Cursor h0(String str) {
            ax.Gb.l.f(str, "query");
            try {
                return new c(this.q.j().h0(str), this.q);
            } catch (Throwable th) {
                this.q.e();
                throw th;
            }
        }

        @Override // ax.o2.g
        public boolean isOpen() {
            ax.o2.g h2 = this.q.h();
            if (h2 == null) {
                return false;
            }
            return h2.isOpen();
        }

        @Override // ax.o2.g
        public void j0() {
            if (this.q.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                ax.o2.g h2 = this.q.h();
                ax.Gb.l.c(h2);
                h2.j0();
            } finally {
                this.q.e();
            }
        }

        @Override // ax.o2.g
        public Cursor n0(ax.o2.j jVar) {
            ax.Gb.l.f(jVar, "query");
            try {
                return new c(this.q.j().n0(jVar), this.q);
            } catch (Throwable th) {
                this.q.e();
                throw th;
            }
        }

        @Override // ax.o2.g
        public void r() {
            try {
                this.q.j().r();
            } catch (Throwable th) {
                this.q.e();
                throw th;
            }
        }

        @Override // ax.o2.g
        public List<Pair<String, String>> x() {
            return (List) this.q.g(C0347a.q);
        }

        @Override // ax.o2.g
        public Cursor y(ax.o2.j jVar, CancellationSignal cancellationSignal) {
            ax.Gb.l.f(jVar, "query");
            try {
                return new c(this.q.j().y(jVar, cancellationSignal), this.q);
            } catch (Throwable th) {
                this.q.e();
                throw th;
            }
        }

        @Override // ax.o2.g
        public boolean z0() {
            if (this.q.h() == null) {
                return false;
            }
            return ((Boolean) this.q.g(C0348d.k0)).booleanValue();
        }
    }

    /* renamed from: ax.k2.d$c */
    private static final class c implements Cursor, AutoCloseable {
        private final C2372c c0;
        private final Cursor q;

        public c(Cursor cursor, C2372c c2372c) {
            ax.Gb.l.f(cursor, "delegate");
            ax.Gb.l.f(c2372c, "autoCloser");
            this.q = cursor;
            this.c0 = c2372c;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.q.close();
            this.c0.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.q.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.q.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return this.q.getBlob(i);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.q.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.q.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.q.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i) {
            return this.q.getColumnName(i);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.q.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.q.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return this.q.getDouble(i);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.q.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return this.q.getFloat(i);
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return this.q.getInt(i);
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return this.q.getLong(i);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return C2682c.a(this.q);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return ax.o2.f.a(this.q);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.q.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return this.q.getShort(i);
        }

        @Override // android.database.Cursor
        public String getString(int i) {
            return this.q.getString(i);
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return this.q.getType(i);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.q.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.q.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.q.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.q.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.q.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.q.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return this.q.isNull(i);
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return this.q.move(i);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.q.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.q.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.q.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return this.q.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.q.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.q.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.q.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.q.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.q.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            ax.Gb.l.f(bundle, "extras");
            ax.o2.e.a(this.q, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.q.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List<? extends Uri> list) {
            ax.Gb.l.f(contentResolver, "cr");
            ax.Gb.l.f(list, "uris");
            ax.o2.f.b(this.q, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.q.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.q.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C2373d(ax.o2.h hVar, C2372c c2372c) {
        ax.Gb.l.f(hVar, "delegate");
        ax.Gb.l.f(c2372c, "autoCloser");
        this.q = hVar;
        this.c0 = c2372c;
        c2372c.k(a());
        this.d0 = new a(c2372c);
    }

    @Override // ax.k2.InterfaceC2376g
    public ax.o2.h a() {
        return this.q;
    }

    @Override // ax.o2.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d0.close();
    }

    @Override // ax.o2.h
    public ax.o2.g g0() {
        this.d0.a();
        return this.d0;
    }

    @Override // ax.o2.h
    public String getDatabaseName() {
        return this.q.getDatabaseName();
    }

    @Override // ax.o2.h
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.q.setWriteAheadLoggingEnabled(z);
    }

    /* renamed from: ax.k2.d$b */
    private static final class b implements ax.o2.k, AutoCloseable {
        private final C2372c c0;
        private final ArrayList<Object> d0;
        private final String q;

        /* renamed from: ax.k2.d$b$a */
        static final class a extends ax.Gb.m implements ax.Fb.l<ax.o2.k, Long> {
            public static final a q = new a();

            a() {
                super(1);
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(ax.o2.k kVar) {
                ax.Gb.l.f(kVar, "obj");
                return Long.valueOf(kVar.S0());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: ax.k2.d$b$b, reason: collision with other inner class name */
        static final class C0349b<T> extends ax.Gb.m implements ax.Fb.l<ax.o2.g, T> {
            final /* synthetic */ ax.Fb.l<ax.o2.k, T> c0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0349b(ax.Fb.l<? super ax.o2.k, ? extends T> lVar) {
                super(1);
                this.c0 = lVar;
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T invoke(ax.o2.g gVar) {
                ax.Gb.l.f(gVar, "db");
                ax.o2.k J = gVar.J(b.this.q);
                b.this.c(J);
                return this.c0.invoke(J);
            }
        }

        /* renamed from: ax.k2.d$b$c */
        static final class c extends ax.Gb.m implements ax.Fb.l<ax.o2.k, Integer> {
            public static final c q = new c();

            c() {
                super(1);
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(ax.o2.k kVar) {
                ax.Gb.l.f(kVar, "obj");
                return Integer.valueOf(kVar.I());
            }
        }

        public b(String str, C2372c c2372c) {
            ax.Gb.l.f(str, "sql");
            ax.Gb.l.f(c2372c, "autoCloser");
            this.q = str;
            this.c0 = c2372c;
            this.d0 = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(ax.o2.k kVar) {
            ArrayList<Object> arrayList = this.d0;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                arrayList.get(i2);
                i2++;
                int i3 = i + 1;
                if (i < 0) {
                    C3139o.r();
                }
                Object obj = this.d0.get(i);
                if (obj == null) {
                    kVar.t0(i3);
                } else if (obj instanceof Long) {
                    kVar.X(i3, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.N(i3, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.D(i3, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.e0(i3, (byte[]) obj);
                }
                i = i3;
            }
        }

        private final <T> T d(ax.Fb.l<? super ax.o2.k, ? extends T> lVar) {
            return (T) this.c0.g(new C0349b(lVar));
        }

        private final void e(int i, Object obj) {
            int size;
            int i2 = i - 1;
            if (i2 >= this.d0.size() && (size = this.d0.size()) <= i2) {
                while (true) {
                    this.d0.add(null);
                    if (size == i2) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.d0.set(i2, obj);
        }

        @Override // ax.o2.i
        public void D(int i, String str) {
            ax.Gb.l.f(str, "value");
            e(i, str);
        }

        @Override // ax.o2.k
        public int I() {
            return ((Number) d(c.q)).intValue();
        }

        @Override // ax.o2.i
        public void N(int i, double d) {
            e(i, Double.valueOf(d));
        }

        @Override // ax.o2.k
        public long S0() {
            return ((Number) d(a.q)).longValue();
        }

        @Override // ax.o2.i
        public void X(int i, long j) {
            e(i, Long.valueOf(j));
        }

        @Override // ax.o2.i
        public void e0(int i, byte[] bArr) {
            ax.Gb.l.f(bArr, "value");
            e(i, bArr);
        }

        @Override // ax.o2.i
        public void t0(int i) {
            e(i, null);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
