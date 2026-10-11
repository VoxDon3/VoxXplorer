package ax.T;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import ax.S.e;
import ax.Z.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class f extends k {
    private static Class<?> b = null;
    private static Constructor<?> c = null;
    private static Method d = null;
    private static Method e = null;
    private static boolean f = false;

    f() {
    }

    private static boolean h(Object obj, String str, int i, boolean z) {
        k();
        try {
            try {
                return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e3) {
            e = e3;
        }
    }

    private static Typeface i(Object obj) {
        k();
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            try {
                return (Typeface) e.invoke(null, newInstance);
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e3) {
            e = e3;
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f) {
            return;
        }
        f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        d = method2;
        e = method;
    }

    private static Object l() {
        k();
        try {
            return c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // ax.T.k
    public Typeface a(Context context, e.c cVar, Resources resources, int i) {
        Object l = l();
        for (e.d dVar : cVar.a()) {
            File e2 = m.e(context);
            if (e2 == null) {
                return null;
            }
            try {
                if (!m.c(e2, resources, dVar.b())) {
                    return null;
                }
                if (!h(l, e2.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                e2.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e2.delete();
            }
        }
        return i(l);
    }

    @Override // ax.T.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i) {
        FileInputStream fileInputStream;
        Typeface c2;
        if (bVarArr.length < 1) {
            return null;
        }
        k.b g = g(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File j = j(openFileDescriptor);
                try {
                    if (j != null && j.canRead()) {
                        c2 = Typeface.createFromFile(j);
                        openFileDescriptor.close();
                        return c2;
                    }
                    c2 = super.c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c2;
                } finally {
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
