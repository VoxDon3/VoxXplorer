package ax.P0;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface Z {

    public interface a {
        Z a(Context context, C0901j c0901j, InterfaceC0904m interfaceC0904m, b bVar, Executor executor, long j, boolean z);
    }

    public interface b {
    }

    void a() throws X;

    void d();

    void flush();

    void h();

    boolean i(int i);

    int j(int i);

    void k(List<Object> list);

    void l(int i) throws X;

    Surface m(int i);

    void n(long j);

    void o(M m);

    void p(int i, int i2, C0912v c0912v, List<Object> list, long j);

    void q(W w);
}
