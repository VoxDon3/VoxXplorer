/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import ax.S.e;
import ax.T.k;
import ax.T.m;
import ax.Z.k;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class g
extends k {
    private static final Class<?> b;
    private static final Constructor<?> c;
    private static final Method d;
    private static final Method e;

    static {
        GenericDeclaration genericDeclaration;
        Constructor<?> constructor;
        Class<?> clazz;
        Method method;
        block3: {
            method = null;
            try {
                Method method2;
                clazz = Class.forName("android.graphics.FontFamily");
                constructor = clazz.getConstructor(null);
                genericDeclaration = Integer.TYPE;
                genericDeclaration = clazz.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, genericDeclaration, List.class, genericDeclaration, Boolean.TYPE});
                method = method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(clazz, 1).getClass());
                break block3;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            Log.e((String)"TypefaceCompatApi24Impl", (String)constructor.getClass().getName(), constructor);
            Method method3 = null;
            clazz = null;
            genericDeclaration = clazz;
            constructor = method;
            method = method3;
        }
        c = constructor;
        b = clazz;
        d = genericDeclaration;
        e = method;
    }

    g() {
    }

    private static boolean h(Object object, ByteBuffer byteBuffer, int n8, int n9, boolean bl) {
        try {
            bl = (Boolean)d.invoke(object, byteBuffer, n8, null, n9, bl);
            return bl;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return false;
        }
    }

    private static Typeface i(Object object) {
        try {
            Object object2 = Array.newInstance(b, 1);
            Array.set(object2, 0, object);
            object = (Typeface)e.invoke(null, object2);
            return object;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    public static boolean j() {
        Method method = d;
        if (method == null) {
            Log.w((String)"TypefaceCompatApi24Impl", (String)"Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Object k() {
        Object obj;
        Object var0 = null;
        try {
            obj = c.newInstance(null);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            return var0;
        }
        return obj;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Typeface a(Context context, e.c object3, Resources resources, int n8) {
        Object object = g.k();
        if (object == null) {
            return null;
        }
        for (e.d d8 : ((e.c)object3).a()) {
            Resources var3_5;
            ByteBuffer byteBuffer = m.b(context, (Resources)var3_5, d8.b());
            if (byteBuffer == null) {
                return null;
            }
            if (g.h(object, byteBuffer, d8.c(), d8.e(), d8.f())) continue;
            return null;
        }
        return g.i(object);
    }

    @Override
    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bArray, int n8) {
        Object object = g.k();
        if (object == null) {
            return null;
        }
        ax.B.k<Uri, ByteBuffer> k8 = new ax.B.k<Uri, ByteBuffer>();
        for (k.b b8 : bArray) {
            ByteBuffer byteBuffer;
            Uri uri = b8.d();
            ByteBuffer byteBuffer2 = byteBuffer = (ByteBuffer)k8.get(uri);
            if (byteBuffer == null) {
                byteBuffer2 = m.f(context, cancellationSignal, uri);
                k8.put(uri, byteBuffer2);
            }
            if (byteBuffer2 == null) {
                return null;
            }
            if (g.h(object, byteBuffer2, b8.c(), b8.e(), b8.f())) continue;
            return null;
        }
        context = g.i(object);
        if (context == null) {
            return null;
        }
        return Typeface.create((Typeface)context, (int)n8);
    }
}

