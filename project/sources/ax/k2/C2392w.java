package ax.k2;

import android.database.Cursor;
import ax.l2.AbstractC2464b;
import ax.o2.C2680a;
import ax.o2.h;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.k2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2392w extends h.a {
    public static final a g = new a(null);
    private C2375f c;
    private final b d;
    private final String e;
    private final String f;

    /* renamed from: ax.k2.w$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        public final boolean a(ax.o2.g gVar) {
            ax.Gb.l.f(gVar, "db");
            Cursor h0 = gVar.h0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (h0.moveToFirst()) {
                    if (h0.getInt(0) == 0) {
                        z = true;
                    }
                }
                ax.Db.a.a(h0, null);
                return z;
            } finally {
            }
        }

        public final boolean b(ax.o2.g gVar) {
            ax.Gb.l.f(gVar, "db");
            Cursor h0 = gVar.h0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z = false;
                if (h0.moveToFirst()) {
                    if (h0.getInt(0) != 0) {
                        z = true;
                    }
                }
                ax.Db.a.a(h0, null);
                return z;
            } finally {
            }
        }

        private a() {
        }
    }

    /* renamed from: ax.k2.w$b */
    public static abstract class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public abstract void a(ax.o2.g gVar);

        public abstract void b(ax.o2.g gVar);

        public abstract void c(ax.o2.g gVar);

        public abstract void d(ax.o2.g gVar);

        public abstract void e(ax.o2.g gVar);

        public abstract void f(ax.o2.g gVar);

        public abstract c g(ax.o2.g gVar);
    }

    /* renamed from: ax.k2.w$c */
    public static class c {
        public final boolean a;
        public final String b;

        public c(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2392w(C2375f c2375f, b bVar, String str, String str2) {
        super(bVar.a);
        ax.Gb.l.f(c2375f, "configuration");
        ax.Gb.l.f(bVar, "delegate");
        ax.Gb.l.f(str, "identityHash");
        ax.Gb.l.f(str2, "legacyHash");
        this.c = c2375f;
        this.d = bVar;
        this.e = str;
        this.f = str2;
    }

    private final void h(ax.o2.g gVar) {
        if (!g.b(gVar)) {
            c g2 = this.d.g(gVar);
            if (g2.a) {
                this.d.e(gVar);
                j(gVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g2.b);
            }
        }
        Cursor n0 = gVar.n0(new C2680a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = n0.moveToFirst() ? n0.getString(0) : null;
            ax.Db.a.a(n0, null);
            if (ax.Gb.l.a(this.e, string) || ax.Gb.l.a(this.f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.e + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ax.Db.a.a(n0, th);
                throw th2;
            }
        }
    }

    private final void i(ax.o2.g gVar) {
        gVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(ax.o2.g gVar) {
        i(gVar);
        gVar.C(C2391v.a(this.e));
    }

    @Override // ax.o2.h.a
    public void b(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        super.b(gVar);
    }

    @Override // ax.o2.h.a
    public void d(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        boolean a2 = g.a(gVar);
        this.d.a(gVar);
        if (!a2) {
            c g2 = this.d.g(gVar);
            if (!g2.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g2.b);
            }
        }
        j(gVar);
        this.d.c(gVar);
    }

    @Override // ax.o2.h.a
    public void e(ax.o2.g gVar, int i, int i2) {
        ax.Gb.l.f(gVar, "db");
        g(gVar, i, i2);
    }

    @Override // ax.o2.h.a
    public void f(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        super.f(gVar);
        h(gVar);
        this.d.d(gVar);
        this.c = null;
    }

    @Override // ax.o2.h.a
    public void g(ax.o2.g gVar, int i, int i2) {
        List<AbstractC2464b> d;
        ax.Gb.l.f(gVar, "db");
        C2375f c2375f = this.c;
        if (c2375f == null || (d = c2375f.d.d(i, i2)) == null) {
            C2375f c2375f2 = this.c;
            if (c2375f2 != null && !c2375f2.a(i, i2)) {
                this.d.b(gVar);
                this.d.a(gVar);
                return;
            }
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.d.f(gVar);
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            ((AbstractC2464b) it.next()).a(gVar);
        }
        c g2 = this.d.g(gVar);
        if (g2.a) {
            this.d.e(gVar);
            j(gVar);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + g2.b);
        }
    }
}
