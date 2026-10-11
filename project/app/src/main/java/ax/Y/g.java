/*
 * Decompiled with CFR 0.152.
 */
package ax.Y;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

public final class g {
    /*
     * WARNING - void declaration
     */
    public static Handler a(Looper looper) {
        Throwable var1_7;
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(looper);
        }
        try {
            Handler handler = (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            return handler;
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (!(throwable instanceof RuntimeException)) {
                if (throwable instanceof Error) {
                    throw (Error)throwable;
                }
                throw new RuntimeException(throwable);
            }
            throw (RuntimeException)throwable;
        }
        Log.w((String)"HandlerCompat", (String)"Unable to invoke Handler(Looper, Callback, boolean) constructor", (Throwable)var1_7);
        return new Handler(looper);
    }

    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync((Looper)looper);
        }
    }
}

