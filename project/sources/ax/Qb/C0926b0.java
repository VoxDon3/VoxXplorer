package ax.Qb;

/* renamed from: ax.Qb.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0926b0 implements InterfaceC0950n0 {
    private final boolean q;

    public C0926b0(boolean z) {
        this.q = z;
    }

    @Override // ax.Qb.InterfaceC0950n0
    public E0 a() {
        return null;
    }

    @Override // ax.Qb.InterfaceC0950n0
    public boolean e() {
        return this.q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(e() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
