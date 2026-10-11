package ax.p5;

import ax.r5.C2960d;
import ax.r5.InterfaceC2958b;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements InterfaceC2958b<Executor> {

    private static final class a {
        private static final k a = new k();
    }

    public static k a() {
        return a.a;
    }

    public static Executor b() {
        return (Executor) C2960d.d(j.a());
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
