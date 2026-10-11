package ax.w5;

import ax.x5.InterfaceC3444d;
import ax.y5.InterfaceC3507b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: ax.w5.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3368v {
    private final Executor a;
    private final InterfaceC3444d b;
    private final InterfaceC3370x c;
    private final InterfaceC3507b d;

    C3368v(Executor executor, InterfaceC3444d interfaceC3444d, InterfaceC3370x interfaceC3370x, InterfaceC3507b interfaceC3507b) {
        this.a = executor;
        this.b = interfaceC3444d;
        this.c = interfaceC3370x;
        this.d = interfaceC3507b;
    }

    public static /* synthetic */ Object a(C3368v c3368v) {
        Iterator<ax.p5.p> it = c3368v.b.Q().iterator();
        while (it.hasNext()) {
            c3368v.c.a(it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.a.execute(new Runnable() { // from class: ax.w5.t
            @Override // java.lang.Runnable
            public final void run() {
                r0.d.a(new InterfaceC3507b.a() { // from class: ax.w5.u
                    @Override // ax.y5.InterfaceC3507b.a
                    public final Object execute() {
                        return C3368v.a(C3368v.this);
                    }
                });
            }
        });
    }
}
