package ax.b6;

/* renamed from: ax.b6.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1586j0 extends AbstractC1628o0 {
    private final String b;
    private final boolean c;
    private final boolean d;
    private final EnumC1644q0 e;

    @Override // ax.b6.AbstractC1628o0
    public final InterfaceC1568h0 a() {
        return null;
    }

    @Override // ax.b6.AbstractC1628o0
    public final InterfaceC1559g0 b() {
        return null;
    }

    @Override // ax.b6.AbstractC1628o0
    public final EnumC1644q0 c() {
        return this.e;
    }

    @Override // ax.b6.AbstractC1628o0
    public final String d() {
        return this.b;
    }

    @Override // ax.b6.AbstractC1628o0
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1628o0) {
            AbstractC1628o0 abstractC1628o0 = (AbstractC1628o0) obj;
            if (this.b.equals(abstractC1628o0.d()) && this.c == abstractC1628o0.e() && this.d == abstractC1628o0.f()) {
                abstractC1628o0.a();
                abstractC1628o0.b();
                if (this.e.equals(abstractC1628o0.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ax.b6.AbstractC1628o0
    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 583896283) ^ this.e.hashCode();
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.b + ", hasDifferentDmaOwner=" + this.c + ", skipChecks=" + this.d + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + String.valueOf(this.e) + "}";
    }

    private C1586j0(String str, boolean z, boolean z2, InterfaceC1568h0 interfaceC1568h0, InterfaceC1559g0 interfaceC1559g0, EnumC1644q0 enumC1644q0) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = enumC1644q0;
    }
}
