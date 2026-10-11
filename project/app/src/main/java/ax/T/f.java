/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import android.content.ContentResolver;
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
import ax.T.k;
import ax.T.m;
import ax.Z.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class f
extends k {
    private static Class<?> b;
    private static Constructor<?> c;
    private static Method d;
    private static Method e;
    private static boolean f = false;

    f() {
    }

    private static boolean h(Object object, String string, int n8, boolean bl) {
        ax.T.f.k();
        try {
            Method method = d;
            bl = (Boolean)method.invoke(object, string, n8, bl);
            return bl;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    private static Typeface i(Object object) {
        ax.T.f.k();
        try {
            Object object2 = Array.newInstance(b, 1);
            Array.set(object2, 0, object);
            object = e;
            object = (Typeface)((Method)object).invoke(null, object2);
            return object;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private File j(ParcelFileDescriptor object) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/proc/self/fd/");
            stringBuilder.append(object.getFd());
            String string = Os.readlink((String)stringBuilder.toString());
            if (!OsConstants.S_ISREG((int)Os.stat((String)string).st_mode)) return null;
            return new File(string);
        }
        catch (ErrnoException errnoException) {
            return null;
        }
    }

    private static void k() {
        Method method;
        GenericDeclaration genericDeclaration;
        Class<?> clazz;
        Constructor<?> constructor;
        block4: {
            if (f) {
                return;
            }
            f = true;
            constructor = null;
            try {
                clazz = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = clazz.getConstructor(null);
                genericDeclaration = clazz.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(clazz, 1).getClass());
                constructor = constructor2;
                break block4;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            Log.e((String)"TypefaceCompatApi21Impl", (String)method.getClass().getName(), (Throwable)((Object)method));
            method = null;
            genericDeclaration = clazz = null;
        }
        c = constructor;
        b = clazz;
        d = genericDeclaration;
        e = method;
    }

    private static Object l() {
        ax.T.f.k();
        try {
            Object obj = c.newInstance(null);
            return obj;
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    @Override
    public Typeface a(Context context, e.c object, Resources resources, int n8) {
        Object object2 = ax.T.f.l();
        for (e.d d8 : ((e.c)object).a()) {
            block7: {
                boolean bl;
                block6: {
                    object = m.e(context);
                    if (object == null) {
                        return null;
                    }
                    bl = m.c((File)object, resources, d8.b());
                    if (bl) break block6;
                    ((File)object).delete();
                    return null;
                }
                try {
                    bl = ax.T.f.h(object2, ((File)object).getPath(), d8.e(), d8.f());
                    if (bl) break block7;
                }
                catch (Throwable throwable) {
                    ((File)object).delete();
                    throw throwable;
                }
                catch (RuntimeException runtimeException) {
                    ((File)object).delete();
                    return null;
                }
                ((File)object).delete();
                return null;
            }
            ((File)object).delete();
        }
        return ax.T.f.i(object2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] object, int n8) {
        Throwable throwable422222;
        block18: {
            block17: {
                if (((Object)object).length < 1) {
                    return null;
                }
                object = this.g((k.b[])object, n8);
                ContentResolver contentResolver = context.getContentResolver();
                cancellationSignal = contentResolver.openFileDescriptor(((k.b)object).d(), "r", cancellationSignal);
                if (cancellationSignal != null) break block17;
                if (cancellationSignal == null) return null;
                cancellationSignal.close();
                return null;
                {
                    catch (IOException iOException) {
                        return null;
                    }
                }
            }
            object = this.j((ParcelFileDescriptor)cancellationSignal);
            if (object != null && ((File)object).canRead()) {
                context = Typeface.createFromFile((File)object);
                break block18;
            }
            object = new FileInputStream(cancellationSignal.getFileDescriptor());
            context = super.c(context, (InputStream)object);
            ((FileInputStream)object).close();
        }
        cancellationSignal.close();
        return context;
        catch (Throwable throwable2) {
            try {
                ((FileInputStream)object).close();
                throw throwable2;
            }
            catch (Throwable throwable3) {
                try {
                    throwable2.addSuppressed(throwable3);
                    throw throwable2;
                }
                catch (Throwable throwable422222) {}
            }
        }
        try {
            cancellationSignal.close();
            throw throwable422222;
        }
        catch (Throwable throwable5) {
            throwable422222.addSuppressed(throwable5);
            throw throwable422222;
        }
    }
}

