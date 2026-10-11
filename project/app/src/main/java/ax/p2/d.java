/*
 * Decompiled with CFR 0.152.
 */
package ax.p2;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import ax.Gb.g;
import ax.Gb.l;
import ax.o2.h;
import ax.p2.e;
import ax.sb.h;
import ax.sb.i;
import java.io.File;
import java.util.UUID;

public final class d
implements ax.o2.h,
AutoCloseable {
    public static final a i0 = new a(null);
    private final String c0;
    private final h.a d0;
    private final boolean e0;
    private final boolean f0;
    private final h<c> g0;
    private boolean h0;
    private final Context q;

    public d(Context context, String string, h.a a8, boolean bl, boolean bl2) {
        l.f(context, "context");
        l.f(a8, "callback");
        this.q = context;
        this.c0 = string;
        this.d0 = a8;
        this.e0 = bl;
        this.f0 = bl2;
        this.g0 = i.a(new ax.Fb.a<c>(this){
            final d q;
            {
                this.q = d8;
                super(0);
            }

            public final c a() {
                Object object;
                if (Build.VERSION.SDK_INT >= 23 && this.q.c0 != null && this.q.e0) {
                    object = new File(ax.o2.d.a(this.q.q), this.q.c0);
                    object = new c(this.q.q, ((File)object).getAbsolutePath(), new b(null), this.q.d0, this.q.f0);
                } else {
                    object = new c(this.q.q, this.q.c0, new b(null), this.q.d0, this.q.f0);
                }
                ax.o2.b.d((SQLiteOpenHelper)object, this.q.h0);
                return object;
            }
        });
    }

    private final c g() {
        return this.g0.getValue();
    }

    @Override
    public void close() {
        if (this.g0.b()) {
            this.g().close();
        }
    }

    @Override
    public ax.o2.g g0() {
        return this.g().c(true);
    }

    @Override
    public String getDatabaseName() {
        return this.c0;
    }

    @Override
    public void setWriteAheadLoggingEnabled(boolean bl) {
        if (this.g0.b()) {
            ax.o2.b.d(this.g(), bl);
        }
        this.h0 = bl;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    private static final class b {
        private ax.p2.c a;

        public b(ax.p2.c c8) {
            this.a = c8;
        }

        public final ax.p2.c a() {
            return this.a;
        }

        public final void b(ax.p2.c c8) {
            this.a = c8;
        }
    }

    private static final class ax.p2.d$c
    extends SQLiteOpenHelper
    implements AutoCloseable {
        public static final c i0 = new c(null);
        private final ax.p2.d$b c0;
        private final h.a d0;
        private final boolean e0;
        private boolean f0;
        private final ax.q2.a g0;
        private boolean h0;
        private final Context q;

        public ax.p2.d$c(Context object, String string, ax.p2.d$b b8, h.a a8, boolean bl) {
            l.f(object, "context");
            l.f(b8, "dbRef");
            l.f(a8, "callback");
            super(object, string, null, a8.a, (DatabaseErrorHandler)new e(a8, b8));
            this.q = object;
            this.c0 = b8;
            this.d0 = a8;
            this.e0 = bl;
            if (string == null) {
                string = UUID.randomUUID().toString();
                l.e(string, "randomUUID().toString()");
            }
            object = object.getCacheDir();
            l.e(object, "context.cacheDir");
            this.g0 = new ax.q2.a(string, (File)object, false);
        }

        public static /* synthetic */ void a(h.a a8, ax.p2.d$b b8, SQLiteDatabase sQLiteDatabase) {
            ax.p2.d$c.b(a8, b8, sQLiteDatabase);
        }

        private static final void b(h.a a8, ax.p2.d$b b8, SQLiteDatabase sQLiteDatabase) {
            l.f(a8, "$callback");
            l.f(b8, "$dbRef");
            c c8 = i0;
            l.e(sQLiteDatabase, "dbObj");
            a8.c(c8.a(b8, sQLiteDatabase));
        }

        private final SQLiteDatabase e(boolean bl) {
            if (bl) {
                SQLiteDatabase sQLiteDatabase = super.getWritableDatabase();
                l.e(sQLiteDatabase, "{\n                super.\u2026eDatabase()\n            }");
                return sQLiteDatabase;
            }
            SQLiteDatabase sQLiteDatabase = super.getReadableDatabase();
            l.e(sQLiteDatabase, "{\n                super.\u2026eDatabase()\n            }");
            return sQLiteDatabase;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final SQLiteDatabase f(boolean bl) {
            Object object;
            String string = this.getDatabaseName();
            if (string != null && (object = this.q.getDatabasePath(string).getParentFile()) != null) {
                ((File)object).mkdirs();
                if (!((File)object).isDirectory()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid database parent file, not a directory: ");
                    stringBuilder.append(object);
                    Log.w((String)"SupportSQLite", (String)stringBuilder.toString());
                }
            }
            try {
                return this.e(bl);
            }
            catch (Throwable throwable) {
                super.close();
                try {
                    Thread.sleep(500L);
                }
                catch (InterruptedException interruptedException) {}
                try {
                    return this.e(bl);
                }
                catch (Throwable throwable2) {
                    super.close();
                    if (throwable2 instanceof a) {
                        object = (a)throwable2;
                        Throwable throwable3 = ((a)object).getCause();
                        int n8 = d.a[((Enum)(object = ((a)object).a())).ordinal()];
                        if (n8 == 1) throw throwable3;
                        if (n8 == 2) throw throwable3;
                        if (n8 == 3) throw throwable3;
                        if (n8 == 4) throw throwable3;
                        if (!(throwable3 instanceof SQLiteException)) {
                            throw throwable3;
                        }
                    } else {
                        if (!(throwable2 instanceof SQLiteException)) {
                            throw throwable2;
                        }
                        if (string == null) throw throwable2;
                        if (!this.e0) throw throwable2;
                    }
                    this.q.deleteDatabase(string);
                    try {
                        return this.e(bl);
                    }
                    catch (a a8) {
                        throw a8.getCause();
                    }
                }
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final ax.o2.g c(boolean bl) {
            Throwable throwable2;
            block6: {
                Object object;
                try {
                    object = this.g0;
                    boolean bl2 = !this.h0 && this.getDatabaseName() != null;
                    ((ax.q2.a)object).b(bl2);
                    this.f0 = false;
                    object = this.f(bl);
                    if (this.f0) {
                        this.close();
                        object = this.c(bl);
                    } else {
                        object = this.d((SQLiteDatabase)object);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.g0.d();
                return object;
            }
            this.g0.d();
            throw throwable2;
        }

        @Override
        public void close() {
            try {
                ax.q2.a.c(this.g0, false, 1, null);
                super.close();
                this.c0.b(null);
                this.h0 = false;
                return;
            }
            finally {
                this.g0.d();
            }
        }

        public final ax.p2.c d(SQLiteDatabase sQLiteDatabase) {
            l.f(sQLiteDatabase, "sqLiteDatabase");
            return i0.a(this.c0, sQLiteDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            l.f(sQLiteDatabase, "db");
            try {
                this.d0.b(this.d(sQLiteDatabase));
                return;
            }
            catch (Throwable throwable) {
                throw new a(b.q, throwable);
            }
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            l.f(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.d0.d(this.d(sQLiteDatabase));
                return;
            }
            catch (Throwable throwable) {
                throw new a(b.c0, throwable);
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
            l.f(sQLiteDatabase, "db");
            this.f0 = true;
            try {
                this.d0.e(this.d(sQLiteDatabase), n8, n9);
                return;
            }
            catch (Throwable throwable) {
                throw new a(b.e0, throwable);
            }
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            l.f(sQLiteDatabase, "db");
            if (!this.f0) {
                try {
                    this.d0.f(this.d(sQLiteDatabase));
                }
                catch (Throwable throwable) {
                    throw new a(b.f0, throwable);
                }
            }
            this.h0 = true;
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
            l.f(sQLiteDatabase, "sqLiteDatabase");
            this.f0 = true;
            try {
                this.d0.g(this.d(sQLiteDatabase), n8, n9);
                return;
            }
            catch (Throwable throwable) {
                throw new a(b.d0, throwable);
            }
        }

        private static final class a
        extends RuntimeException {
            private final Throwable c0;
            private final b q;

            public a(b b8, Throwable throwable) {
                l.f((Object)b8, "callbackName");
                l.f(throwable, "cause");
                super(throwable);
                this.q = b8;
                this.c0 = throwable;
            }

            public final b a() {
                return this.q;
            }

            @Override
            public Throwable getCause() {
                return this.c0;
            }
        }

        public static final class b
        extends Enum<b> {
            public static final /* enum */ b c0;
            public static final /* enum */ b d0;
            public static final /* enum */ b e0;
            public static final /* enum */ b f0;
            private static final b[] g0;
            public static final /* enum */ b q;

            static {
                q = new b();
                c0 = new b();
                d0 = new b();
                e0 = new b();
                f0 = new b();
                g0 = b.d();
            }

            private static final /* synthetic */ b[] d() {
                return new b[]{q, c0, d0, e0, f0};
            }

            public static b valueOf(String string) {
                return Enum.valueOf(b.class, string);
            }

            public static b[] values() {
                return (b[])g0.clone();
            }
        }

        public static final class c {
            private c() {
            }

            public /* synthetic */ c(g g8) {
                this();
            }

            public final ax.p2.c a(ax.p2.d$b b8, SQLiteDatabase object) {
                l.f(b8, "refHolder");
                l.f(object, "sqLiteDatabase");
                ax.p2.c c8 = b8.a();
                if (c8 != null && c8.c((SQLiteDatabase)object)) {
                    return c8;
                }
                object = new ax.p2.c((SQLiteDatabase)object);
                b8.b((ax.p2.c)object);
                return object;
            }
        }

        public final class d {
            public static final int[] a;

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            static {
                int[] nArray = new int[b.values().length];
                try {
                    nArray[b.q.ordinal()] = 1;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                try {
                    nArray[b.c0.ordinal()] = 2;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                try {
                    nArray[b.d0.ordinal()] = 3;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                try {
                    nArray[b.e0.ordinal()] = 4;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                try {
                    nArray[b.f0.ordinal()] = 5;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                a = nArray;
            }
        }
    }
}

