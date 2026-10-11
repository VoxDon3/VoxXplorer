package ax.a6;

/* renamed from: ax.a6.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1403i implements InterfaceC1422v {
    private final C1399g a;
    private C1379I b;

    @Override // ax.a6.InterfaceC1422v
    public final /* bridge */ /* synthetic */ InterfaceC1422v a(C1379I c1379i) {
        this.b = c1379i;
        return this;
    }

    @Override // ax.a6.InterfaceC1422v
    public final InterfaceC1423w b() {
        A0.b(this.b, C1379I.class);
        return new C1405j(this.a, this.b);
    }
}
