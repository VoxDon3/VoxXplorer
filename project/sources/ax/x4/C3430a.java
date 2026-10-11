package ax.x4;

import ax.p4.C2773j;
import ax.p4.C2774k;
import ax.p4.m;
import ax.p4.n;
import ax.s4.AbstractC3046a;
import ax.u4.C3206a;
import java.util.List;

/* renamed from: ax.x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3430a extends C3431b {

    /* renamed from: ax.x4.a$a, reason: collision with other inner class name */
    private static final class C0494a extends AbstractC3433d {
        private final C3206a g;

        C0494a(m mVar, C3206a c3206a, C2774k c2774k, String str, ax.C4.a aVar) {
            super(mVar, c2774k, str, aVar);
            if (c3206a == null) {
                throw new NullPointerException("credential");
            }
            this.g = c3206a;
        }

        @Override // ax.x4.AbstractC3433d
        protected void b(List<AbstractC3046a.C0448a> list) {
            n.v(list);
            n.a(list, this.g.g());
        }

        @Override // ax.x4.AbstractC3433d
        public boolean c() {
            return this.g.i() != null;
        }

        @Override // ax.x4.AbstractC3433d
        public boolean k() {
            return c() && this.g.a();
        }

        @Override // ax.x4.AbstractC3433d
        public ax.u4.d l() throws C2773j {
            this.g.j(h());
            return new ax.u4.d(this.g.g(), (this.g.h().longValue() - System.currentTimeMillis()) / 1000);
        }

        @Override // ax.x4.AbstractC3433d
        protected AbstractC3433d q(ax.C4.a aVar) {
            return new C0494a(h(), this.g, g(), i(), aVar);
        }
    }

    public C3430a(m mVar, String str) {
        this(mVar, str, C2774k.e, null);
    }

    public ax.u4.d c() throws C2773j {
        return this.a.l();
    }

    public C3430a d(ax.C4.a aVar) {
        if (aVar != null) {
            return new C3430a(this.a.q(aVar));
        }
        throw new IllegalArgumentException("'pathRoot' should not be null");
    }

    public C3430a(m mVar, C3206a c3206a) {
        this(mVar, c3206a, C2774k.e, null, null);
    }

    public C3430a(m mVar, String str, C2774k c2774k, String str2) {
        this(mVar, new C3206a(str), c2774k, str2, null);
    }

    private C3430a(m mVar, C3206a c3206a, C2774k c2774k, String str, ax.C4.a aVar) {
        super(new C0494a(mVar, c3206a, c2774k, str, aVar));
    }

    C3430a(AbstractC3433d abstractC3433d) {
        super(abstractC3433d);
    }
}
