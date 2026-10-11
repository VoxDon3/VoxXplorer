package ax.v5;

import ax.n5.j;
import ax.p5.p;
import ax.p5.u;
import ax.q5.m;
import ax.w5.InterfaceC3370x;
import ax.x5.InterfaceC3444d;
import ax.y5.InterfaceC3507b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: ax.v5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3280c implements InterfaceC3282e {
    private static final Logger f = Logger.getLogger(u.class.getName());
    private final InterfaceC3370x a;
    private final Executor b;
    private final ax.q5.e c;
    private final InterfaceC3444d d;
    private final InterfaceC3507b e;

    public C3280c(Executor executor, ax.q5.e eVar, InterfaceC3370x interfaceC3370x, InterfaceC3444d interfaceC3444d, InterfaceC3507b interfaceC3507b) {
        this.b = executor;
        this.c = eVar;
        this.a = interfaceC3370x;
        this.d = interfaceC3444d;
        this.e = interfaceC3507b;
    }

    public static /* synthetic */ Object b(C3280c c3280c, p pVar, ax.p5.i iVar) {
        c3280c.d.E(pVar, iVar);
        c3280c.a.a(pVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final C3280c c3280c, final p pVar, j jVar, ax.p5.i iVar) {
        c3280c.getClass();
        try {
            m i = c3280c.c.i(pVar.b());
            if (i == null) {
                String format = String.format("Transport backend '%s' is not registered", pVar.b());
                f.warning(format);
                jVar.a(new IllegalArgumentException(format));
            } else {
                final ax.p5.i a = i.a(iVar);
                c3280c.e.a(new InterfaceC3507b.a() { // from class: ax.v5.b
                    @Override // ax.y5.InterfaceC3507b.a
                    public final Object execute() {
                        return C3280c.b(C3280c.this, pVar, a);
                    }
                });
                jVar.a(null);
            }
        } catch (Exception e) {
            f.warning("Error scheduling event " + e.getMessage());
            jVar.a(e);
        }
    }

    @Override // ax.v5.InterfaceC3282e
    public void a(final p pVar, final ax.p5.i iVar, final j jVar) {
        this.b.execute(new Runnable() { // from class: ax.v5.a
            @Override // java.lang.Runnable
            public final void run() {
                C3280c.c(C3280c.this, pVar, jVar, iVar);
            }
        });
    }
}
