/*
 * Decompiled with CFR 0.152.
 */
package ax.o2;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import ax.Gb.l;
import ax.o2.g;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;

public interface h
extends Closeable {
    @Override
    public void close();

    public g g0();

    public String getDatabaseName();

    public void setWriteAheadLoggingEnabled(boolean var1);

    public static abstract class ax.o2.h$a {
        public static final a b = new a(null);
        public final int a;

        public ax.o2.h$a(int n8) {
            this.a = n8;
        }

        private final void a(String string) {
            if (!ax.Ob.h.v(string, ":memory:", true)) {
                int n8 = string.length() - 1;
                int n9 = 0;
                boolean bl = false;
                while (n9 <= n8) {
                    int n10 = !bl ? n9 : n8;
                    n10 = l.h(string.charAt(n10), 32) <= 0 ? 1 : 0;
                    if (!bl) {
                        if (n10 == 0) {
                            bl = true;
                            continue;
                        }
                        ++n9;
                        continue;
                    }
                    if (n10 == 0) break;
                    --n8;
                }
                if (((Object)string.subSequence(n9, n8 + 1)).toString().length() == 0) {
                    return;
                }
                Comparable<StringBuilder> comparable = new StringBuilder();
                comparable.append("deleting the database file: ");
                comparable.append(string);
                Log.w((String)"SupportSQLite", (String)comparable.toString());
                try {
                    comparable = new File(string);
                    ax.o2.b.a((File)comparable);
                    return;
                }
                catch (Exception exception) {
                    Log.w((String)"SupportSQLite", (String)"delete failed: ", (Throwable)exception);
                }
            }
        }

        public void b(g g8) {
            l.f(g8, "db");
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void c(g object) {
            Throwable throwable2;
            Object object3;
            block14: {
                l.f(object, "db");
                Object object2 = new StringBuilder();
                ((StringBuilder)object2).append("Corruption reported by sqlite on database: ");
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(".path");
                Log.e((String)"SupportSQLite", (String)((StringBuilder)object2).toString());
                if (!object.isOpen()) {
                    if ((object = object.getPath()) == null) return;
                    this.a((String)object);
                    return;
                }
                object2 = null;
                object3 = null;
                try {
                    try {
                        List<Pair<String, String>> list = object.x();
                        object2 = list;
                    }
                    catch (SQLiteException sQLiteException) {}
                    object3 = object2;
                    try {
                        object.close();
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                    if (object2 == null) break block14;
                    object = ((Iterable)object2).iterator();
                }
                catch (Throwable throwable2) {}
                while (object.hasNext()) {
                    object2 = ((Pair)object.next()).second;
                    l.e(object2, "p.second");
                    this.a((String)object2);
                }
                return;
            }
            if ((object = object.getPath()) == null) return;
            this.a((String)object);
            return;
            if (object3 != null) {
                object3 = ((Iterable)object3).iterator();
                while (object3.hasNext()) {
                    object = ((Pair)object3.next()).second;
                    l.e(object, "p.second");
                    this.a((String)object);
                }
                throw throwable2;
            } else {
                if ((object = object.getPath()) == null) throw throwable2;
                this.a((String)object);
            }
            throw throwable2;
        }

        public abstract void d(g var1);

        public abstract void e(g var1, int var2, int var3);

        public void f(g g8) {
            l.f(g8, "db");
        }

        public abstract void g(g var1, int var2, int var3);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(ax.Gb.g g8) {
                this();
            }
        }
    }

    public static final class ax.o2.h$b {
        public static final b f = new b(null);
        public final Context a;
        public final String b;
        public final ax.o2.h$a c;
        public final boolean d;
        public final boolean e;

        public ax.o2.h$b(Context context, String string, ax.o2.h$a a8, boolean bl, boolean bl2) {
            l.f(context, "context");
            l.f(a8, "callback");
            this.a = context;
            this.b = string;
            this.c = a8;
            this.d = bl;
            this.e = bl2;
        }

        public static final a a(Context context) {
            return f.a(context);
        }

        public static class a {
            private final Context a;
            private String b;
            private ax.o2.h$a c;
            private boolean d;
            private boolean e;

            public a(Context context) {
                l.f(context, "context");
                this.a = context;
            }

            public a a(boolean bl) {
                this.e = bl;
                return this;
            }

            public ax.o2.h$b b() {
                ax.o2.h$a a8 = this.c;
                if (a8 != null) {
                    String string;
                    if (this.d && ((string = this.b) == null || string.length() == 0)) {
                        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                    }
                    return new ax.o2.h$b(this.a, this.b, a8, this.d, this.e);
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a c(ax.o2.h$a a8) {
                l.f(a8, "callback");
                this.c = a8;
                return this;
            }

            public a d(String string) {
                this.b = string;
                return this;
            }

            public a e(boolean bl) {
                this.d = bl;
                return this;
            }
        }

        public static final class b {
            private b() {
            }

            public /* synthetic */ b(ax.Gb.g g8) {
                this();
            }

            public final a a(Context context) {
                l.f(context, "context");
                return new a(context);
            }
        }
    }

    public static interface c {
        public h a(b var1);
    }
}

