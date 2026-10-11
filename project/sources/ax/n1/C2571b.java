package ax.n1;

import ax.S0.InterfaceC0979l;
import java.util.concurrent.Executor;

/* renamed from: ax.n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2571b {

    /* renamed from: ax.n1.b$a */
    class a implements InterfaceExecutorC2572c {
        final /* synthetic */ InterfaceC0979l c0;
        final /* synthetic */ Executor q;

        a(Executor executor, InterfaceC0979l interfaceC0979l) {
            this.q = executor;
            this.c0 = interfaceC0979l;
        }

        @Override // ax.n1.InterfaceExecutorC2572c
        public void d() {
            this.c0.accept(this.q);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.q.execute(runnable);
        }
    }

    public static <T extends Executor> InterfaceExecutorC2572c a(T t, InterfaceC0979l<T> interfaceC0979l) {
        return new a(t, interfaceC0979l);
    }
}
