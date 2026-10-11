package ax.wa;

import ax.qa.EnumC2891a;
import ax.qa.InterfaceC2892b;
import ax.xa.AbstractC3477a;
import j$.util.Objects;
import java.io.IOException;

/* loaded from: classes3.dex */
public class e implements InterfaceC2892b {
    private AbstractC3477a.C0498a a;

    @Override // ax.qa.InterfaceC2892b
    public void a(ax.pa.c cVar) throws IOException {
        AbstractC3477a.C0498a c0498a = this.a;
        if (c0498a != null) {
            cVar.k(c0498a);
        }
    }

    @Override // ax.qa.InterfaceC2892b
    public void c(ax.pa.c cVar) throws IOException {
        cVar.a(EnumC2891a.FOUR);
        if (cVar.j() != 0) {
            this.a = new AbstractC3477a.C0498a();
        } else {
            this.a = null;
        }
    }

    public AbstractC3477a.C0498a d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return Objects.equals(this.a, ((e) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a);
    }

    @Override // ax.qa.InterfaceC2892b
    public void b(ax.pa.c cVar) throws IOException {
    }
}
