/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import ax.u3.b;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class q {
    private static Method a;
    private static boolean b;

    public static Long a(ParcelFileDescriptor object, long l8) throws IOException {
        Object object2;
        if (!b) {
            block7: {
                try {
                    a = object2 = ParcelFileDescriptor.class.getMethod("seekTo", Long.TYPE);
                    ((AccessibleObject)object2).setAccessible(true);
                    break block7;
                }
                catch (SecurityException securityException) {
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    // empty catch block
                }
                ((Throwable)object2).printStackTrace();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("API is not available on api level ");
                ((StringBuilder)object2).append(Build.VERSION.SDK_INT);
                ax.u3.b.e(((StringBuilder)object2).toString());
            }
            b = true;
        }
        if ((object2 = a) != null) {
            try {
                object = (Long)((Method)object2).invoke(object, l8);
                return object;
            }
            catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
                Log.i((String)"CompatV15", (String)"Failed to invoke seekTo via reflection", (Throwable)exception);
                a = null;
                throw new IOException(exception);
            }
        }
        throw new IOException("Cannot invoke seekTo via reflection");
    }
}

