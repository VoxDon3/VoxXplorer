package ax.wa;

import ax.c.C1750a;
import ax.qa.EnumC2891a;
import ax.qa.InterfaceC2892b;
import ax.wa.f;
import java.io.IOException;

/* renamed from: ax.wa.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3378b<T extends f> implements InterfaceC2892b {
    private T a;

    /* renamed from: ax.wa.b$a */
    public static class a extends AbstractC3378b<f.a> {
        @Override // ax.wa.AbstractC3378b
        public EnumC3377a e() {
            return EnumC3377a.SHARE_INFO_1_CONTAINER;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.wa.AbstractC3378b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public f.a d() {
            return new f.a();
        }
    }

    @Override // ax.qa.InterfaceC2892b
    public void a(ax.pa.c cVar) throws IOException {
        if (f() != null) {
            cVar.k(f());
        }
    }

    @Override // ax.qa.InterfaceC2892b
    public void c(ax.pa.c cVar) throws IOException {
        cVar.a(EnumC2891a.FOUR);
        int f = cVar.f();
        if (f != e().h()) {
            throw new C1750a(String.format("Expected info level %d, got: %d", Integer.valueOf(e().h()), Integer.valueOf(f)));
        }
        int f2 = cVar.f();
        if (f2 != f) {
            throw new C1750a(String.format("Expected info level %d to match enum level, got: %d", Integer.valueOf(f), Integer.valueOf(f2)));
        }
        if (cVar.j() != 0) {
            this.a = d();
        } else {
            this.a = null;
        }
    }

    abstract T d();

    public abstract EnumC3377a e();

    public T f() {
        return this.a;
    }

    @Override // ax.qa.InterfaceC2892b
    public void b(ax.pa.c cVar) throws IOException {
    }
}
