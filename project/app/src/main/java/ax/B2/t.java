/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

import android.os.Build;
import androidx.work.c;
import ax.Gb.g;
import ax.Gb.l;
import ax.K2.v;
import ax.tb.L;
import java.util.Set;
import java.util.UUID;

public abstract class t {
    public static final b d = new b(null);
    private final UUID a;
    private final v b;
    private final Set<String> c;

    public t(UUID uUID, v v8, Set<String> set) {
        l.f(uUID, "id");
        l.f(v8, "workSpec");
        l.f(set, "tags");
        this.a = uUID;
        this.b = v8;
        this.c = set;
    }

    public UUID a() {
        return this.a;
    }

    public final String b() {
        String string = this.a().toString();
        l.e(string, "id.toString()");
        return string;
    }

    public final Set<String> c() {
        return this.c;
    }

    public final v d() {
        return this.b;
    }

    public static abstract class a<B extends a<B, ?>, W extends t> {
        private final Class<? extends c> a;
        private boolean b;
        private UUID c;
        private v d;
        private final Set<String> e;

        public a(Class<? extends c> object) {
            l.f(object, "workerClass");
            this.a = object;
            Object object2 = UUID.randomUUID();
            l.e(object2, "randomUUID()");
            this.c = object2;
            String string = this.c.toString();
            l.e(string, "id.toString()");
            object2 = ((Class)object).getName();
            l.e(object2, "workerClass.name");
            this.d = new v(string, (String)object2);
            object = ((Class)object).getName();
            l.e(object, "workerClass.name");
            this.e = L.e(object);
        }

        public final W a() {
            W w8 = this.b();
            Object object = this.d.j;
            int n8 = Build.VERSION.SDK_INT;
            n8 = !(n8 >= 24 && ((ax.B2.b)object).e() || ((ax.B2.b)object).f() || ((ax.B2.b)object).g() || n8 >= 23 && ((ax.B2.b)object).h()) ? 0 : 1;
            object = this.d;
            if (((v)object).q) {
                if (n8 == 0) {
                    if (((v)object).g > 0L) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
            }
            object = UUID.randomUUID();
            l.e(object, "randomUUID()");
            this.h((UUID)object);
            return w8;
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

        public final B h(UUID object) {
            l.f(object, "id");
            this.c = object;
            object = ((UUID)object).toString();
            l.e(object, "id.toString()");
            this.d = new v((String)object, this.d);
            return this.f();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }
    }
}

