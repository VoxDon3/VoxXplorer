package ax.b1;

import ax.b1.InterfaceC1471u;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* renamed from: ax.b1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1465n {

    /* renamed from: ax.b1.n$a */
    public static class a extends IOException {
        public final int q;

        public a(Throwable th, int i) {
            super(th);
            this.q = i;
        }
    }

    void a(InterfaceC1471u.a aVar);

    UUID b();

    void c(InterfaceC1471u.a aVar);

    boolean d();

    Map<String, String> e();

    boolean f(String str);

    a g();

    int getState();

    ax.V0.b h();
}
