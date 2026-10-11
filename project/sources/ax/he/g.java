package ax.he;

/* loaded from: classes3.dex */
final class g {
    private int a;

    g() {
    }

    int a() {
        return this.a;
    }

    boolean b() {
        return this.a < 7;
    }

    void c() {
        this.a = 0;
    }

    void d(g gVar) {
        this.a = gVar.a;
    }

    void e() {
        int i = this.a;
        this.a = i <= 3 ? 0 : i <= 9 ? i - 3 : i - 6;
    }

    void f() {
        this.a = this.a < 7 ? 8 : 11;
    }

    void g() {
        this.a = this.a >= 7 ? 10 : 7;
    }

    void h() {
        this.a = this.a < 7 ? 9 : 11;
    }
}
