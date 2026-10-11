/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import android.database.Cursor;
import ax.Gb.g;
import ax.Gb.l;
import ax.k2.f;
import ax.k2.v;
import ax.o2.h;
import java.io.Closeable;

public class w
extends h.a {
    public static final a g = new a(null);
    private f c;
    private final b d;
    private final String e;
    private final String f;

    public w(f f8, b b8, String string, String string2) {
        l.f(f8, "configuration");
        l.f(b8, "delegate");
        l.f(string, "identityHash");
        l.f(string2, "legacyHash");
        super(b8.a);
        this.c = f8;
        this.d = b8;
        this.e = string;
        this.f = string2;
    }

    private final void h(ax.o2.g object) {
        if (g.b((ax.o2.g)object)) {
            Throwable throwable2;
            Object object2;
            block7: {
                object2 = object.n0(new ax.o2.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    object = object2.moveToFirst() ? object2.getString(0) : null;
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                ax.Db.a.a((Closeable)object2, null);
                if (!l.a(this.e, object) && !l.a(this.f, object)) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ");
                    ((StringBuilder)object2).append(this.e);
                    ((StringBuilder)object2).append(", found: ");
                    ((StringBuilder)object2).append((String)object);
                    throw new IllegalStateException(((StringBuilder)object2).toString());
                }
                return;
            }
            try {
                throw throwable2;
            }
            catch (Throwable throwable3) {
                ax.Db.a.a((Closeable)object2, throwable2);
                throw throwable3;
            }
        }
        c c8 = this.d.g((ax.o2.g)object);
        if (c8.a) {
            this.d.e((ax.o2.g)object);
            this.j((ax.o2.g)object);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Pre-packaged database has an invalid schema: ");
        ((StringBuilder)object).append(c8.b);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private final void i(ax.o2.g g8) {
        g8.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(ax.o2.g g8) {
        this.i(g8);
        g8.C(v.a(this.e));
    }

    @Override
    public void b(ax.o2.g g8) {
        l.f(g8, "db");
        super.b(g8);
    }

    @Override
    public void d(ax.o2.g object) {
        l.f(object, "db");
        boolean bl = g.a((ax.o2.g)object);
        this.d.a((ax.o2.g)object);
        if (!bl) {
            c c8 = this.d.g((ax.o2.g)object);
            if (!c8.a) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Pre-packaged database has an invalid schema: ");
                ((StringBuilder)object).append(c8.b);
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
        }
        this.j((ax.o2.g)object);
        this.d.c((ax.o2.g)object);
    }

    @Override
    public void e(ax.o2.g g8, int n8, int n9) {
        l.f(g8, "db");
        this.g(g8, n8, n9);
    }

    @Override
    public void f(ax.o2.g g8) {
        l.f(g8, "db");
        super.f(g8);
        this.h(g8);
        this.d.d(g8);
        this.c = null;
    }

    @Override
    public void g(ax.o2.g object, int n8, int n9) {
        l.f(object, "db");
        Object object2 = this.c;
        if (object2 != null && (object2 = ((f)object2).d.d(n8, n9)) != null) {
            this.d.f((ax.o2.g)object);
            object2 = ((Iterable)object2).iterator();
            while (object2.hasNext()) {
                ((ax.l2.b)object2.next()).a((ax.o2.g)object);
            }
            object2 = this.d.g((ax.o2.g)object);
            if (((c)object2).a) {
                this.d.e((ax.o2.g)object);
                this.j((ax.o2.g)object);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Migration didn't properly handle: ");
            ((StringBuilder)object).append(((c)object2).b);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        object2 = this.c;
        if (object2 != null && !((f)object2).a(n8, n9)) {
            this.d.b((ax.o2.g)object);
            this.d.a((ax.o2.g)object);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("A migration from ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" to ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final boolean a(ax.o2.g g8) {
            Throwable throwable2;
            Cursor cursor;
            block6: {
                boolean bl;
                block5: {
                    boolean bl2;
                    l.f(g8, "db");
                    cursor = g8.h0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
                    try {
                        boolean bl3 = cursor.moveToFirst();
                        bl = bl2 = false;
                        if (!bl3) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    int n8 = cursor.getInt(0);
                    bl = bl2;
                    if (n8 != 0) break block5;
                    bl = true;
                }
                ax.Db.a.a((Closeable)cursor, null);
                return bl;
            }
            try {
                throw throwable2;
            }
            catch (Throwable throwable3) {
                ax.Db.a.a((Closeable)cursor, throwable2);
                throw throwable3;
            }
        }

        public final boolean b(ax.o2.g g8) {
            Throwable throwable2;
            Cursor cursor;
            block6: {
                boolean bl;
                block5: {
                    boolean bl2;
                    l.f(g8, "db");
                    cursor = g8.h0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
                    try {
                        boolean bl3 = cursor.moveToFirst();
                        bl = bl2 = false;
                        if (!bl3) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    int n8 = cursor.getInt(0);
                    bl = bl2;
                    if (n8 == 0) break block5;
                    bl = true;
                }
                ax.Db.a.a((Closeable)cursor, null);
                return bl;
            }
            try {
                throw throwable2;
            }
            catch (Throwable throwable3) {
                ax.Db.a.a((Closeable)cursor, throwable2);
                throw throwable3;
            }
        }
    }

    public static abstract class b {
        public final int a;

        public b(int n8) {
            this.a = n8;
        }

        public abstract void a(ax.o2.g var1);

        public abstract void b(ax.o2.g var1);

        public abstract void c(ax.o2.g var1);

        public abstract void d(ax.o2.g var1);

        public abstract void e(ax.o2.g var1);

        public abstract void f(ax.o2.g var1);

        public abstract c g(ax.o2.g var1);
    }

    public static class c {
        public final boolean a;
        public final String b;

        public c(boolean bl, String string) {
            this.a = bl;
            this.b = string;
        }
    }
}

