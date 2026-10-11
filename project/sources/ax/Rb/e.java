package ax.Rb;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ax.Gb.l;
import ax.sb.C3082n;
import ax.sb.C3083o;

/* loaded from: classes3.dex */
public final class e {
    public static final d a;
    private static volatile Choreographer choreographer;

    static {
        Object a2;
        try {
            C3082n.a aVar = C3082n.q;
            a2 = C3082n.a(new c(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            C3082n.a aVar2 = C3082n.q;
            a2 = C3082n.a(C3083o.a(th));
        }
        a = (d) (C3082n.c(a2) ? null : a2);
    }

    public static final Handler a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        l.d(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
