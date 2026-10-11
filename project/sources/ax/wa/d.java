package ax.wa;

import ax.xa.AbstractC3477a;
import j$.util.Objects;
import java.io.IOException;

/* loaded from: classes3.dex */
public class d extends C3379c {
    private int b;
    private AbstractC3477a.C0498a c;

    @Override // ax.wa.e, ax.qa.InterfaceC2892b
    public void a(ax.pa.c cVar) throws IOException {
        super.a(cVar);
        AbstractC3477a.C0498a c0498a = this.c;
        if (c0498a != null) {
            cVar.k(c0498a);
        }
    }

    @Override // ax.wa.e, ax.qa.InterfaceC2892b
    public void c(ax.pa.c cVar) throws IOException {
        super.c(cVar);
        this.b = (int) cVar.h();
        if (cVar.j() != 0) {
            this.c = new AbstractC3477a.C0498a();
        } else {
            this.c = null;
        }
    }

    public AbstractC3477a.C0498a e() {
        return this.c;
    }

    @Override // ax.wa.e
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return super.equals(obj) && this.b == dVar.b && Objects.equals(e(), dVar.e());
    }

    public int f() {
        return this.b;
    }

    @Override // ax.wa.e
    public int hashCode() {
        return (super.hashCode() * 31) + Objects.hash(Integer.valueOf(f()), e());
    }

    public String toString() {
        return String.format("SHARE_INFO_1{shi1_netname: %s, shi1_type: %d, shi1_remark: %s}", d(), Integer.valueOf(f()), e());
    }
}
