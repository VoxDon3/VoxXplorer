package ax.k2;

import ax.sb.C3077i;
import ax.sb.InterfaceC3076h;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ax.k2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2367A {
    private final AbstractC2390u a;
    private final AtomicBoolean b;
    private final InterfaceC3076h c;

    /* renamed from: ax.k2.A$a */
    static final class a extends ax.Gb.m implements ax.Fb.a<ax.o2.k> {
        a() {
            super(0);
        }

        @Override // ax.Fb.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ax.o2.k invoke() {
            return AbstractC2367A.this.d();
        }
    }

    public AbstractC2367A(AbstractC2390u abstractC2390u) {
        ax.Gb.l.f(abstractC2390u, "database");
        this.a = abstractC2390u;
        this.b = new AtomicBoolean(false);
        this.c = C3077i.a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ax.o2.k d() {
        return this.a.f(e());
    }

    private final ax.o2.k f() {
        return (ax.o2.k) this.c.getValue();
    }

    private final ax.o2.k g(boolean z) {
        return z ? f() : d();
    }

    public ax.o2.k b() {
        c();
        return g(this.b.compareAndSet(false, true));
    }

    protected void c() {
        this.a.c();
    }

    protected abstract String e();

    public void h(ax.o2.k kVar) {
        ax.Gb.l.f(kVar, "statement");
        if (kVar == f()) {
            this.b.set(false);
        }
    }
}
