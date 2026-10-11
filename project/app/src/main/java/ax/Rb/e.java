/*
 * Decompiled with CFR 0.152.
 */
package ax.Rb;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ax.Gb.l;
import ax.Rb.c;
import ax.Rb.d;
import ax.sb.n;
import ax.sb.o;
import java.lang.reflect.Constructor;

public final class e {
    public static final d a;
    private static volatile Choreographer choreographer;

    static {
        Object object;
        Object var1 = null;
        try {
            object = n.q;
            object = new c(e.a(Looper.getMainLooper(), true), null, 2, null);
            object = n.a(object);
        }
        catch (Throwable throwable) {
            n.a a8 = n.q;
            object = n.a(o.a(throwable));
        }
        if (n.c(object)) {
            object = var1;
        }
        a = (d)object;
    }

    public static final Handler a(Looper object, boolean bl) {
        if (bl) {
            Constructor constructor;
            if (Build.VERSION.SDK_INT >= 28) {
                object = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, object);
                l.d(object, "null cannot be cast to non-null type android.os.Handler");
                return (Handler)object;
            }
            try {
                constructor = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                return new Handler(object);
            }
            return (Handler)constructor.newInstance(object, null, Boolean.TRUE);
        }
        return new Handler(object);
    }
}

