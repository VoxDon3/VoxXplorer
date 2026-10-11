package ax.B2;

import android.os.Build;
import ax.K2.v;
import ax.tb.C3121L;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class t {
    public static final b d = new b(null);
    private final UUID a;
    private final v b;
    private final Set<String> c;

    public static abstract class a<B extends a<B, ?>, W extends t> {
        private final Class<? extends androidx.work.c> a;
        private boolean b;
        private UUID c;
        private v d;
        private final Set<String> e;

        public a(Class<? extends androidx.work.c> cls) {
            ax.Gb.l.f(cls, "workerClass");
            this.a = cls;
            UUID randomUUID = UUID.randomUUID();
            ax.Gb.l.e(randomUUID, "randomUUID()");
            this.c = randomUUID;
            String uuid = this.c.toString();
            ax.Gb.l.e(uuid, "id.toString()");
            String name = cls.getName();
            ax.Gb.l.e(name, "workerClass.name");
            this.d = new v(uuid, name);
            String name2 = cls.getName();
            ax.Gb.l.e(name2, "workerClass.name");
            this.e = C3121L.e(name2);
        }

        public final W a() {
            W b = b();
            ax.B2.b bVar = this.d.j;
            int i = Build.VERSION.SDK_INT;
            boolean z = (i >= 24 && bVar.e()) || bVar.f() || bVar.g() || (i >= 23 && bVar.h());
            v vVar = this.d;
            if (vVar.q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (vVar.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID randomUUID = UUID.randomUUID();
            ax.Gb.l.e(randomUUID, "randomUUID()");
            h(randomUUID);
            return b;
        }

        public abstract W b();

        public final boolean c() {
            return this.b;
        }

        public final UUID d() {
            return this.c;
        }

        public final Set<String> e() {
            return this.e;
        }

        public abstract B f();

        public final v g() {
            return this.d;
        }

        public final B h(UUID uuid) {
            ax.Gb.l.f(uuid, "id");
            this.c = uuid;
            String uuid2 = uuid.toString();
            ax.Gb.l.e(uuid2, "id.toString()");
            this.d = new v(uuid2, this.d);
            return f();
        }
    }

    public static final class b {
        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        private b() {
        }
    }

    public t(UUID uuid, v vVar, Set<String> set) {
        ax.Gb.l.f(uuid, "id");
        ax.Gb.l.f(vVar, "workSpec");
        ax.Gb.l.f(set, "tags");
        this.a = uuid;
        this.b = vVar;
        this.c = set;
    }

    public UUID a() {
        return this.a;
    }

    public final String b() {
        String uuid = a().toString();
        ax.Gb.l.e(uuid, "id.toString()");
        return uuid;
    }

    public final Set<String> c() {
        return this.c;
    }

    public final v d() {
        return this.b;
    }
}
