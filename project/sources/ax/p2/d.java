package ax.p2;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import ax.Gb.l;
import ax.Gb.m;
import ax.o2.C2681b;
import ax.o2.C2683d;
import ax.o2.h;
import ax.p2.d;
import ax.q2.C2865a;
import ax.sb.C3077i;
import ax.sb.InterfaceC3076h;
import java.io.File;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d implements ax.o2.h, AutoCloseable {
    public static final a i0 = new a(null);
    private final String c0;
    private final h.a d0;
    private final boolean e0;
    private final boolean f0;
    private final InterfaceC3076h<c> g0;
    private boolean h0;
    private final Context q;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
        private ax.p2.c a;

        public b(ax.p2.c cVar) {
            this.a = cVar;
        }

        public final ax.p2.c a() {
            return this.a;
        }

        public final void b(ax.p2.c cVar) {
            this.a = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends SQLiteOpenHelper implements AutoCloseable {
        public static final C0412c i0 = new C0412c(null);
        private final b c0;
        private final h.a d0;
        private final boolean e0;
        private boolean f0;
        private final C2865a g0;
        private boolean h0;
        private final Context q;

        private static final class a extends RuntimeException {
            private final Throwable c0;
            private final b q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Throwable th) {
                super(th);
                l.f(bVar, "callbackName");
                l.f(th, "cause");
                this.q = bVar;
                this.c0 = th;
            }

            public final b a() {
                return this.q;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.c0;
            }
        }

        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: ax.p2.d$c$c, reason: collision with other inner class name */
        public static final class C0412c {
            public /* synthetic */ C0412c(ax.Gb.g gVar) {
                this();
            }

            public final ax.p2.c a(b bVar, SQLiteDatabase sQLiteDatabase) {
                l.f(bVar, "refHolder");
                l.f(sQLiteDatabase, "sqLiteDatabase");
                ax.p2.c a = bVar.a();
                if (a != null && a.c(sQLiteDatabase)) {
                    return a;
                }
                ax.p2.c cVar = new ax.p2.c(sQLiteDatabase);
                bVar.b(cVar);
                return cVar;
            }

            private C0412c() {
            }
        }

        /* renamed from: ax.p2.d$c$d, reason: collision with other inner class name */
        public /* synthetic */ class C0413d {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b bVar, final h.a aVar, boolean z) {
            super(context, str, null, aVar.a, new DatabaseErrorHandler() { // from class: ax.p2.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.b(h.a.this, bVar, sQLiteDatabase);
                }
            });
            String str2;
            l.f(context, "context");
            l.f(bVar, "dbRef");
            l.f(aVar, "callback");
            this.q = context;
            this.c0 = bVar;
            this.d0 = aVar;
            this.e0 = z;
            if (str == null) {
                str2 = UUID.randomUUID().toString();
                l.e(str2, "randomUUID().toString()");
            } else {
                str2 = str;
            }
            File cacheDir = context.getCacheDir();
            l.e(cacheDir, "context.cacheDir");
            this.g0 = new C2865a(str2, cacheDir, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(h.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            l.f(aVar, "$callback");
            l.f(bVar, "$dbRef");
            C0412c c0412c = i0;
            l.e(sQLiteDatabase, "dbObj");
            aVar.c(c0412c.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase e(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                l.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            l.e(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase f(boolean z) {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.q.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return e(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return e(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i = C0413d.a[aVar.a().ordinal()];
                        if (i == 1) {
                            throw cause;
                        }
                        if (i == 2) {
                            throw cause;
                        }
                        if (i == 3) {
                            throw cause;
                        }
                        if (i == 4) {
                            throw cause;
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else {
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                        if (databaseName == null || !this.e0) {
                            throw th;
                        }
                    }
                    this.q.deleteDatabase(databaseName);
                    try {
                        return e(z);
                    } catch (a e) {
                        throw e.getCause();
                    }
                }
            }
        }

        public final ax.o2.g c(boolean z) {
            ax.o2.g d;
            try {
                this.g0.b((this.h0 || getDatabaseName() == null) ? false : true);
                this.f0 = false;
                SQLiteDatabase f = f(z);
                if (this.f0) {
                    close();
                    d = c(z);
                } else {
                    d = d(f);
                }
                this.g0.d();
                return d;
            } catch (Throwable th) {
                this.g0.d();
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C2865a.c(this.g0, false, 1, null);
                super.close();
                this.c0.b(null);
                this.h0 = false;
            } finally {
                this.g0.d();
            }
        }

        public final ax.p2.c d(SQLiteDatabase sQLiteDatabase) {
            l.f(sQLiteDatabase, "sqLiteDatabase");
            return i0.a(this.c0, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            l.f(sQLiteDatabase, "db");
            try {
                this.d0.b(d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            l.f(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.d0.d(d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            l.f(sQLiteDatabase, "db");
            this.f0 = true;
            try {
                this.d0.e(d(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            l.f(sQLiteDatabase, "db");
            if (!this.f0) {
                try {
                    this.d0.f(d(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.h0 = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            l.f(sQLiteDatabase, "sqLiteDatabase");
            this.f0 = true;
            try {
                this.d0.g(d(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* renamed from: ax.p2.d$d, reason: collision with other inner class name */
    static final class C0414d extends m implements ax.Fb.a<c> {
        C0414d() {
            super(0);
        }

        @Override // ax.Fb.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (Build.VERSION.SDK_INT < 23 || d.this.c0 == null || !d.this.e0) {
                cVar = new c(d.this.q, d.this.c0, new b(null), d.this.d0, d.this.f0);
            } else {
                cVar = new c(d.this.q, new File(C2683d.a(d.this.q), d.this.c0).getAbsolutePath(), new b(null), d.this.d0, d.this.f0);
            }
            C2681b.d(cVar, d.this.h0);
            return cVar;
        }
    }

    public d(Context context, String str, h.a aVar, boolean z, boolean z2) {
        l.f(context, "context");
        l.f(aVar, "callback");
        this.q = context;
        this.c0 = str;
        this.d0 = aVar;
        this.e0 = z;
        this.f0 = z2;
        this.g0 = C3077i.a(new C0414d());
    }

    private final c g() {
        return this.g0.getValue();
    }

    @Override // ax.o2.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.g0.b()) {
            g().close();
        }
    }

    @Override // ax.o2.h
    public ax.o2.g g0() {
        return g().c(true);
    }

    @Override // ax.o2.h
    public String getDatabaseName() {
        return this.c0;
    }

    @Override // ax.o2.h
    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.g0.b()) {
            C2681b.d(g(), z);
        }
        this.h0 = z;
    }
}
