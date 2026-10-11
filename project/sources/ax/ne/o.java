package ax.ne;

import android.annotation.SuppressLint;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"PrivateApi"})
/* loaded from: classes3.dex */
public class o {
    private static final Map<String, IBinder> a = new HashMap();
    private static final Map<String, Integer> b = new HashMap();
    private static Method c;

    static {
        try {
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e = e;
        }
        try {
            c = Class.forName("android.os.ServiceManager").getMethod("getService", String.class);
        } catch (NoSuchMethodException e2) {
            e = e2;
            Log.w("SystemServiceHelper", Log.getStackTraceString(e));
        }
    }

    public static IBinder a(String str) {
        IBinder iBinder = a.get(str);
        if (iBinder == null) {
            try {
                iBinder = (IBinder) c.invoke(null, str);
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("SystemServiceHelper", Log.getStackTraceString(e));
            }
            a.put(str, iBinder);
        }
        return iBinder;
    }
}
