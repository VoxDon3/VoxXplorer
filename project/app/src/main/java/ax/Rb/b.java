/*
 * Decompiled with CFR 0.152.
 */
package ax.Rb;

import android.os.Build;
import ax.Qb.H;
import ax.wb.a;
import ax.wb.i;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class b
extends a
implements H {
    private volatile Object _preHandler = this;

    public b() {
        super(H.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Method b() {
        Object object;
        block4: {
            object = this._preHandler;
            if (object != this) {
                return (Method)object;
            }
            Object var3_3 = null;
            try {
                Method method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                object = var3_3;
                if (!Modifier.isPublic(method.getModifiers())) break block4;
                boolean bl = Modifier.isStatic(method.getModifiers());
                object = var3_3;
                if (bl) {
                    object = method;
                }
            }
            catch (Throwable throwable) {
                object = var3_3;
            }
        }
        this._preHandler = object;
        return object;
    }

    @Override
    public void d0(i object, Throwable throwable) {
        int n8 = Build.VERSION.SDK_INT;
        if (26 <= n8 && n8 < 28) {
            object = this.b();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if ((object = object != null ? ((Method)object).invoke(null, null) : null) instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler)object;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), throwable);
            }
        }
    }
}

