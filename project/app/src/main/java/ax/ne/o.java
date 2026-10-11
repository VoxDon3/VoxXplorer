/*
 * Decompiled with CFR 0.152.
 */
package ax.ne;

import android.annotation.SuppressLint;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@SuppressLint(value={"PrivateApi"})
public class o {
    private static final Map<String, IBinder> a = new HashMap<String, IBinder>();
    private static final Map<String, Integer> b = new HashMap<String, Integer>();
    private static Method c;

    static {
        try {
            Class<?> clazz = Class.forName("android.os.ServiceManager");
            c = clazz.getMethod("getService", String.class);
            return;
        }
        catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
            Log.w((String)"SystemServiceHelper", (String)Log.getStackTraceString((Throwable)reflectiveOperationException));
            return;
        }
    }

    public static IBinder a(String string) {
        IBinder iBinder;
        IBinder iBinder2 = iBinder = a.get(string);
        if (iBinder == null) {
            block4: {
                try {
                    iBinder = iBinder2 = (IBinder)c.invoke(null, string);
                    break block4;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalAccessException illegalAccessException) {
                    // empty catch block
                }
                Log.w((String)"SystemServiceHelper", (String)Log.getStackTraceString((Throwable)iBinder2));
            }
            a.put(string, iBinder);
            iBinder2 = iBinder;
        }
        return iBinder2;
    }
}

