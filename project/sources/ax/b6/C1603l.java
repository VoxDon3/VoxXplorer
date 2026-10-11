package ax.b6;

import java.util.Iterator;
import java.util.List;

/* renamed from: ax.b6.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1603l implements InterfaceC1658s {
    private final String c0;
    private final InterfaceC1658s q;

    public C1603l() {
        this.q = InterfaceC1658s.f;
        this.c0 = "return";
    }

    public final InterfaceC1658s a() {
        return this.q;
    }

    public final String b() {
        return this.c0;
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s c() {
        return new C1603l(this.c0, this.q.c());
    }

    @Override // ax.b6.InterfaceC1658s
    public final Boolean e() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1603l)) {
            return false;
        }
        C1603l c1603l = (C1603l) obj;
        return this.c0.equals(c1603l.c0) && this.q.equals(c1603l.q);
    }

    @Override // ax.b6.InterfaceC1658s
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // ax.b6.InterfaceC1658s
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return (this.c0.hashCode() * 31) + this.q.hashCode();
    }

    @Override // ax.b6.InterfaceC1658s
    public final Iterator<InterfaceC1658s> i() {
        return null;
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s k(String str, Z2 z2, List<InterfaceC1658s> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C1603l(String str) {
        this.q = InterfaceC1658s.f;
        this.c0 = str;
    }

    public C1603l(String str, InterfaceC1658s interfaceC1658s) {
        this.q = interfaceC1658s;
        this.c0 = str;
    }
}
