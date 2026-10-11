/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.F0;
import ax.b6.H7;
import ax.b6.Z2;
import ax.b6.a;
import ax.b6.b;
import ax.b6.d;
import ax.b6.e;
import ax.b6.e0;
import ax.b6.k;
import ax.b6.l;
import ax.b6.n;
import ax.b6.p2;
import ax.b6.q2;
import ax.b6.r;
import ax.b6.r2;
import ax.b6.s;
import ax.b6.u1;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;

public final class C {
    private final u1 a;
    private Z2 b;
    d c;
    private final b d;

    public C() {
        this(new u1());
    }

    private C(u1 u12) {
        this.a = u12;
        this.b = u12.b.d();
        this.c = new d();
        this.d = new b();
        u12.b("internal.registerCallback", new a(this));
        u12.b("internal.eventLogger", new F0(this));
    }

    public final d a() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(q2 object) throws e0 {
        Object object2;
        Object object3;
        try {
            this.b = this.a.b.d();
            object3 = ((q2)object).K();
            if (this.a.a(this.b, object3.toArray(new r2[0])) instanceof l) {
                object = new IllegalStateException("Program loading failed");
                throw object;
            }
            object2 = ((q2)object).I().K().iterator();
        }
        catch (Throwable throwable) {
            throw new e0(throwable);
        }
        block2: while (object2.hasNext()) {
            object3 = object2.next();
            object = ((p2)object3).K();
            object3 = ((p2)object3).J();
            Iterator<r2> iterator = object.iterator();
            while (true) {
                if (!iterator.hasNext()) continue block2;
                object = iterator.next();
                s s8 = this.a.a(this.b, new r2[]{object});
                if (!(s8 instanceof r)) {
                    object = new IllegalArgumentException("Invalid rule definition");
                    throw object;
                }
                object = this.b;
                if (!((Z2)object).g((String)object3)) {
                    object = null;
                } else {
                    if (!((object = ((Z2)object).c((String)object3)) instanceof n)) {
                        object = new StringBuilder("Invalid function name: ");
                        ((StringBuilder)object).append((String)object3);
                        object2 = new IllegalStateException(((StringBuilder)object).toString());
                        throw object2;
                    }
                    object = (n)object;
                }
                if (object == null) {
                    object = new StringBuilder("Rule function is undefined: ");
                    ((StringBuilder)object).append((String)object3);
                    object2 = new IllegalStateException(((StringBuilder)object).toString());
                    throw object2;
                }
                ((n)object).a(this.b, Collections.singletonList(s8));
            }
            break;
        }
        return;
    }

    public final void c(String string, Callable<? extends n> callable) {
        this.a.b(string, callable);
    }

    public final boolean d(e object) throws e0 {
        Throwable throwable2;
        block3: {
            try {
                boolean bl;
                this.c.b((e)object);
                object = this.a.c;
                k k8 = new k(0.0);
                ((Z2)object).h("runtime.counter", k8);
                this.d.b(this.b.d(), this.c);
                if (!this.g() && !(bl = this.f())) {
                    return false;
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            return true;
        }
        throw new e0(throwable2);
    }

    final /* synthetic */ n e() throws Exception {
        return new H7(this.d);
    }

    public final boolean f() {
        return !this.c.f().isEmpty();
    }

    public final boolean g() {
        return !this.c.d().equals(this.c.a());
    }
}

