/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.util.Log;
import ax.S.e;
import ax.T.f;
import ax.Z.k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class h
extends f {
    protected final Class<?> g;
    protected final Constructor<?> h;
    protected final Method i;
    protected final Method j;
    protected final Method k;
    protected final Method l;
    protected final Method m;

    public h() {
        Object object;
        Object object2;
        Object object3;
        Method method;
        Executable executable;
        Constructor<?> constructor;
        Object object4;
        block3: {
            try {
                object4 = this.v();
                constructor = this.w((Class<?>)object4);
                executable = this.s((Class<?>)object4);
                method = this.t((Class<?>)object4);
                object3 = this.x((Class<?>)object4);
                object2 = this.r((Class<?>)object4);
                object = this.u((Class<?>)object4);
                break block3;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("Unable to collect necessary methods for class ");
            ((StringBuilder)object3).append(executable.getClass().getName());
            Log.e((String)"TypefaceCompatApi26Impl", (String)((StringBuilder)object3).toString(), (Throwable)((Object)executable));
            Object var8_10 = null;
            Object var9_11 = null;
            constructor = null;
            executable = constructor;
            object = object4 = (object3 = executable);
            object2 = object4;
            method = executable;
            executable = constructor;
            constructor = var9_11;
            object4 = var8_10;
        }
        this.g = object4;
        this.h = constructor;
        this.i = executable;
        this.j = method;
        this.k = object3;
        this.l = object2;
        this.m = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Object l() {
        Object obj;
        Object var1_1 = null;
        try {
            obj = this.h.newInstance(null);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            return var1_1;
        }
        return obj;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void m(Object object) {
        try {
            this.l.invoke(object, null);
            return;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return;
        }
    }

    private boolean n(Context context, Object object, String string, int n8, int n9, int n10, FontVariationAxis[] fontVariationAxisArray) {
        try {
            boolean bl = (Boolean)this.i.invoke(object, context.getAssets(), string, 0, Boolean.FALSE, n8, n9, n10, fontVariationAxisArray);
            return bl;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return false;
        }
    }

    private boolean o(Object object, ByteBuffer byteBuffer, int n8, int n9, int n10) {
        try {
            boolean bl = (Boolean)this.j.invoke(object, byteBuffer, n8, null, n9, n10);
            return bl;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return false;
        }
    }

    private boolean p(Object object) {
        try {
            boolean bl = (Boolean)this.k.invoke(object, null);
            return bl;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return false;
        }
    }

    private boolean q() {
        if (this.i == null) {
            Log.w((String)"TypefaceCompatApi26Impl", (String)"Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    @Override
    public Typeface a(Context context, e.c dArray, Resources object, int n8) {
        if (!this.q()) {
            return super.a(context, (e.c)dArray, (Resources)object, n8);
        }
        object = this.l();
        if (object == null) {
            return null;
        }
        for (e.d d8 : dArray.a()) {
            if (this.n(context, object, d8.a(), d8.c(), d8.e(), d8.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings((String)d8.d()))) continue;
            this.m(object);
            return null;
        }
        if (!this.p(object)) {
            return null;
        }
        return this.i(object);
    }

    /*
     * Exception decompiling
     */
    @Override
    public Typeface b(Context var1_1, CancellationSignal var2_4, k.b[] var3_6, int var4_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public Typeface d(Context context, Resources object, int n8, String string, int n9) {
        if (!this.q()) {
            return super.d(context, (Resources)object, n8, string, n9);
        }
        object = this.l();
        if (object == null) {
            return null;
        }
        if (!this.n(context, object, string, 0, -1, -1, null)) {
            this.m(object);
            return null;
        }
        if (!this.p(object)) {
            return null;
        }
        return this.i(object);
    }

    protected Typeface i(Object object) {
        try {
            Object object2 = Array.newInstance(this.g, 1);
            Array.set(object2, 0, object);
            object = (Typeface)this.m.invoke(null, object2, -1, -1);
            return object;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    protected Method r(Class<?> clazz) throws NoSuchMethodException {
        return clazz.getMethod("abortCreation", null);
    }

    protected Method s(Class<?> clazz) throws NoSuchMethodException {
        Class<Integer> clazz2 = Integer.TYPE;
        return clazz.getMethod("addFontFromAssetManager", AssetManager.class, String.class, clazz2, Boolean.TYPE, clazz2, clazz2, clazz2, FontVariationAxis[].class);
    }

    protected Method t(Class<?> clazz) throws NoSuchMethodException {
        Class<Integer> clazz2 = Integer.TYPE;
        return clazz.getMethod("addFontFromBuffer", ByteBuffer.class, clazz2, FontVariationAxis[].class, clazz2, clazz2);
    }

    protected Method u(Class<?> genericDeclaration) throws NoSuchMethodException {
        genericDeclaration = Array.newInstance(genericDeclaration, 1).getClass();
        Class<Integer> clazz = Integer.TYPE;
        genericDeclaration = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{genericDeclaration, clazz, clazz});
        ((AccessibleObject)((Object)genericDeclaration)).setAccessible(true);
        return genericDeclaration;
    }

    protected Class<?> v() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> w(Class<?> clazz) throws NoSuchMethodException {
        return clazz.getConstructor(null);
    }

    protected Method x(Class<?> clazz) throws NoSuchMethodException {
        return clazz.getMethod("freeze", null);
    }
}

