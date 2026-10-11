/*
 * Decompiled with CFR 0.152.
 */
package androidx.versionedparcelable;

import android.os.Parcelable;
import ax.x2.b;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {
    protected final ax.B.a<String, Method> a;
    protected final ax.B.a<String, Method> b;
    protected final ax.B.a<String, Class> c;

    public a(ax.B.a<String, Method> a8, ax.B.a<String, Method> a9, ax.B.a<String, Class> a10) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
    }

    private void N(b b8) {
        try {
            Class clazz = this.c(b8.getClass());
            this.I(clazz.getName());
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b8.getClass().getSimpleName());
            stringBuilder.append(" does not have a Parcelizer");
            throw new RuntimeException(stringBuilder.toString(), classNotFoundException);
        }
    }

    private Class c(Class<? extends b> clazz) throws ClassNotFoundException {
        Class<?> clazz2 = this.c.get((Object)clazz.getName());
        if (clazz2 == null) {
            clazz2 = Class.forName(String.format("%s.%sParcelizer", clazz.getPackage().getName(), clazz.getSimpleName()), false, clazz.getClassLoader());
            this.c.put(clazz.getName(), clazz2);
            return clazz2;
        }
        return clazz2;
    }

    private Method d(String string) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.a.get((Object)string);
        if (method == null) {
            System.currentTimeMillis();
            method = Class.forName(string, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            this.a.put(string, method);
            return method;
        }
        return method;
    }

    private Method e(Class clazz) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.b.get((Object)clazz.getName());
        GenericDeclaration genericDeclaration = method;
        if (method == null) {
            genericDeclaration = this.c(clazz);
            System.currentTimeMillis();
            genericDeclaration = ((Class)genericDeclaration).getDeclaredMethod("write", clazz, a.class);
            this.b.put(clazz.getName(), (Method)genericDeclaration);
        }
        return genericDeclaration;
    }

    protected abstract void A(byte[] var1);

    public void B(byte[] byArray, int n8) {
        this.w(n8);
        this.A(byArray);
    }

    protected abstract void C(CharSequence var1);

    public void D(CharSequence charSequence, int n8) {
        this.w(n8);
        this.C(charSequence);
    }

    protected abstract void E(int var1);

    public void F(int n8, int n9) {
        this.w(n9);
        this.E(n8);
    }

    protected abstract void G(Parcelable var1);

    public void H(Parcelable parcelable, int n8) {
        this.w(n8);
        this.G(parcelable);
    }

    protected abstract void I(String var1);

    public void J(String string, int n8) {
        this.w(n8);
        this.I(string);
    }

    protected <T extends b> void K(T t8, a a8) {
        IllegalAccessException illegalAccessException2;
        block8: {
            InvocationTargetException invocationTargetException2;
            block7: {
                NoSuchMethodException noSuchMethodException2;
                block6: {
                    try {
                        this.e(t8.getClass()).invoke(null, t8, a8);
                        return;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                    }
                    catch (NoSuchMethodException noSuchMethodException2) {
                        break block6;
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block7;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block8;
                    }
                    throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
                }
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException2);
            }
            if (invocationTargetException2.getCause() instanceof RuntimeException) {
                throw (RuntimeException)invocationTargetException2.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException2);
        }
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException2);
    }

    protected void L(b b8) {
        if (b8 == null) {
            this.I(null);
            return;
        }
        this.N(b8);
        a a8 = this.b();
        this.K(b8, a8);
        a8.a();
    }

    public void M(b b8, int n8) {
        this.w(n8);
        this.L(b8);
    }

    protected abstract void a();

    protected abstract a b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean bl, int n8) {
        if (!this.m(n8)) {
            return bl;
        }
        return this.g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] byArray, int n8) {
        if (!this.m(n8)) {
            return byArray;
        }
        return this.i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int n8) {
        if (!this.m(n8)) {
            return charSequence;
        }
        return this.k();
    }

    protected abstract boolean m(int var1);

    protected <T extends b> T n(String object, a a8) {
        IllegalAccessException illegalAccessException2;
        block8: {
            InvocationTargetException invocationTargetException2;
            block7: {
                NoSuchMethodException noSuchMethodException2;
                block6: {
                    try {
                        object = (b)this.d((String)object).invoke(null, a8);
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                    }
                    catch (NoSuchMethodException noSuchMethodException2) {
                        break block6;
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block7;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block8;
                    }
                    return (T)object;
                    throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
                }
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException2);
            }
            if (invocationTargetException2.getCause() instanceof RuntimeException) {
                throw (RuntimeException)invocationTargetException2.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException2);
        }
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException2);
    }

    protected abstract int o();

    public int p(int n8, int n9) {
        if (!this.m(n9)) {
            return n8;
        }
        return this.o();
    }

    protected abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t8, int n8) {
        if (!this.m(n8)) {
            return t8;
        }
        return this.q();
    }

    protected abstract String s();

    public String t(String string, int n8) {
        if (!this.m(n8)) {
            return string;
        }
        return this.s();
    }

    protected <T extends b> T u() {
        String string = this.s();
        if (string == null) {
            return null;
        }
        return this.n(string, this.b());
    }

    public <T extends b> T v(T t8, int n8) {
        if (!this.m(n8)) {
            return t8;
        }
        return this.u();
    }

    protected abstract void w(int var1);

    public void x(boolean bl, boolean bl2) {
    }

    protected abstract void y(boolean var1);

    public void z(boolean bl, int n8) {
        this.w(n8);
        this.y(bl);
    }
}

