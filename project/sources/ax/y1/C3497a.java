package ax.y1;

import ax.q1.C2857q;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.M;
import ax.q1.P;
import ax.q1.r;
import java.io.IOException;
import java.util.List;

/* renamed from: ax.y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3497a implements r {
    private final r a;

    public C3497a(int i) {
        if ((i & 1) != 0) {
            this.a = new P(65496, 2, "image/jpeg");
        } else {
            this.a = new C3498b();
        }
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.a.a(interfaceC2859t);
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        this.a.b(j, j2);
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        return this.a.c(interfaceC2858s);
    }

    @Override // ax.q1.r
    public void d() {
        this.a.d();
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        return this.a.f(interfaceC2858s, m);
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }
}
