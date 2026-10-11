/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import ax.Fb.a;
import ax.Gb.l;
import ax.k2.u;
import ax.o2.k;
import ax.sb.h;
import ax.sb.i;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class A {
    private final u a;
    private final AtomicBoolean b;
    private final h c;

    public A(u u8) {
        l.f(u8, "database");
        this.a = u8;
        this.b = new AtomicBoolean(false);
        this.c = i.a(new a<k>(this){
            final A q;
            {
                this.q = a8;
                super(0);
            }

            public final k a() {
                return this.q.d();
            }
        });
    }

    private final k d() {
        String string = this.e();
        return this.a.f(string);
    }

    private final k f() {
        return (k)this.c.getValue();
    }

    private final k g(boolean bl) {
        if (bl) {
            return this.f();
        }
        return this.d();
    }

    public k b() {
        this.c();
        return this.g(this.b.compareAndSet(false, true));
    }

    protected void c() {
        this.a.c();
    }

    protected abstract String e();

    public void h(k k8) {
        l.f(k8, "statement");
        if (k8 == this.f()) {
            this.b.set(false);
        }
    }
}

