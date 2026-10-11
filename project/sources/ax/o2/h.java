package ax.o2;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import ax.Gb.l;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public interface h extends Closeable {

    public static abstract class a {
        public static final C0393a b = new C0393a(null);
        public final int a;

        /* renamed from: ax.o2.h$a$a, reason: collision with other inner class name */
        public static final class C0393a {
            public /* synthetic */ C0393a(ax.Gb.g gVar) {
                this();
            }

            private C0393a() {
            }
        }

        public a(int i) {
            this.a = i;
        }

        private final void a(String str) {
            if (ax.Ob.h.v(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = l.h(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                C2681b.a(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        public void b(g gVar) {
            l.f(gVar, "db");
        }

        public void c(g gVar) {
            l.f(gVar, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + gVar + ".path");
            if (!gVar.isOpen()) {
                String path = gVar.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = gVar.x();
                } catch (SQLiteException unused) {
                }
                try {
                    gVar.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            } finally {
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        l.e(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String path2 = gVar.getPath();
                    if (path2 != null) {
                        a(path2);
                    }
                }
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i, int i2);

        public void f(g gVar) {
            l.f(gVar, "db");
        }

        public abstract void g(g gVar, int i, int i2);
    }

    public static final class b {
        public static final C0394b f = new C0394b(null);
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;
        public final boolean e;

        public static class a {
            private final Context a;
            private String b;
            private a c;
            private boolean d;
            private boolean e;

            public a(Context context) {
                l.f(context, "context");
                this.a = context;
            }

            public a a(boolean z) {
                this.e = z;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.d && ((str = this.b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.a, this.b, aVar, this.d, this.e);
            }

            public a c(a aVar) {
                l.f(aVar, "callback");
                this.c = aVar;
                return this;
            }

            public a d(String str) {
                this.b = str;
                return this;
            }

            public a e(boolean z) {
                this.d = z;
                return this;
            }
        }

        /* renamed from: ax.o2.h$b$b, reason: collision with other inner class name */
        public static final class C0394b {
            public /* synthetic */ C0394b(ax.Gb.g gVar) {
                this();
            }

            public final a a(Context context) {
                l.f(context, "context");
                return new a(context);
            }

            private C0394b() {
            }
        }

        public b(Context context, String str, a aVar, boolean z, boolean z2) {
            l.f(context, "context");
            l.f(aVar, "callback");
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
            this.e = z2;
        }

        public static final a a(Context context) {
            return f.a(context);
        }
    }

    public interface c {
        h a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    g g0();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
