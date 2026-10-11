package ax.T;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import ax.S.e;
import ax.Z.k;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends f {
    protected final Class<?> g;
    protected final Constructor<?> h;
    protected final Method i;
    protected final Method j;
    protected final Method k;
    protected final Method l;
    protected final Method m;

    public h() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = v();
            constructor = w(cls);
            method = s(cls);
            method2 = t(cls);
            method3 = x(cls);
            method4 = r(cls);
            method5 = u(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method;
        this.j = method2;
        this.k = method3;
        this.l = method4;
        this.m = method5;
    }

    private Object l() {
        try {
            return this.h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) {
        try {
            this.l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    @Override // ax.T.f, ax.T.k
    public Typeface a(Context context, e.c cVar, Resources resources, int i) {
        if (!q()) {
            return super.a(context, cVar, resources, i);
        }
        Object l = l();
        if (l == null) {
            return null;
        }
        e.d[] a = cVar.a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            e.d dVar = a[i2];
            String a2 = dVar.a();
            int c = dVar.c();
            int e = dVar.e();
            boolean f = dVar.f();
            Context context2 = context;
            if (!n(context2, l, a2, c, e, f ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                m(l);
                return null;
            }
            i2++;
            context = context2;
        }
        if (p(l)) {
            return i(l);
        }
        return null;
    }

    @Override // ax.T.f, ax.T.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i) {
        Typeface i2;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (q()) {
            Map<Uri, ByteBuffer> h = m.h(context, bVarArr, cancellationSignal);
            Object l = l();
            if (l == null) {
                return null;
            }
            int length = bVarArr.length;
            int i3 = 0;
            boolean z = false;
            while (i3 < length) {
                k.b bVar = bVarArr[i3];
                ByteBuffer byteBuffer = h.get(bVar.d());
                if (byteBuffer == null) {
                    obj = l;
                } else {
                    boolean o = o(l, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0);
                    obj = l;
                    if (!o) {
                        m(obj);
                        return null;
                    }
                    z = true;
                }
                i3++;
                l = obj;
            }
            Object obj2 = l;
            if (!z) {
                m(obj2);
                return null;
            }
            if (p(obj2) && (i2 = i(obj2)) != null) {
                return Typeface.create(i2, i);
            }
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
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g.e()).setItalic(g.f()).build();
                openFileDescriptor.close();
                return build;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // ax.T.k
    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        if (!q()) {
            return super.d(context, resources, i, str, i2);
        }
        Object l = l();
        if (l == null) {
            return null;
        }
        if (!n(context, l, str, 0, -1, -1, null)) {
            m(l);
            return null;
        }
        if (p(l)) {
            return i(l);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method r(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", null);
    }

    protected Method s(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method t(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method u(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> v() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> w(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    protected Method x(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", null);
    }
}
