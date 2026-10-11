package ax.J7;

import ax.o8.InterfaceC2733b;

/* renamed from: ax.J7.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0768m implements InterfaceC2733b {
    private final C0778x a;
    private final C0767l b;

    public C0768m(C0778x c0778x, ax.O7.g gVar) {
        this.a = c0778x;
        this.b = new C0767l(gVar);
    }

    @Override // ax.o8.InterfaceC2733b
    public boolean a() {
        return this.a.d();
    }

    @Override // ax.o8.InterfaceC2733b
    public InterfaceC2733b.a b() {
        return InterfaceC2733b.a.CRASHLYTICS;
    }

    @Override // ax.o8.InterfaceC2733b
    public void c(InterfaceC2733b.C0407b c0407b) {
        ax.G7.g.f().b("App Quality Sessions session changed: " + c0407b);
        this.b.f(c0407b.a());
    }

    public String d(String str) {
        return this.b.c(str);
    }

    public void e(String str) {
        this.b.g(str);
    }
}
