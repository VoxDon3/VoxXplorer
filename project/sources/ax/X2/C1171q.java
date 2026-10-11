package ax.X2;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import ax.u3.C3184b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ax.X2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1171q {
    private static Method a;
    private static boolean b;

    public static Long a(ParcelFileDescriptor parcelFileDescriptor, long j) throws IOException {
        if (!b) {
            try {
                Method method = ParcelFileDescriptor.class.getMethod("seekTo", Long.TYPE);
                a = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException | SecurityException e) {
                e.printStackTrace();
                C3184b.e("API is not available on api level " + Build.VERSION.SDK_INT);
            }
            b = true;
        }
        Method method2 = a;
        if (method2 == null) {
            throw new IOException("Cannot invoke seekTo via reflection");
        }
        try {
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            e = e2;
        }
        try {
            return (Long) method2.invoke(parcelFileDescriptor, Long.valueOf(j));
        } catch (IllegalAccessException e3) {
            e = e3;
            Log.i("CompatV15", "Failed to invoke seekTo via reflection", e);
            a = null;
            throw new IOException(e);
        } catch (IllegalArgumentException e4) {
            e = e4;
            Log.i("CompatV15", "Failed to invoke seekTo via reflection", e);
            a = null;
            throw new IOException(e);
        }
    }
}
