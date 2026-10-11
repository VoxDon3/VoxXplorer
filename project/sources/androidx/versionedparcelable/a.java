package androidx.versionedparcelable;

import android.os.Parcelable;
import ax.x2.InterfaceC3404b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {
    protected final ax.B.a<String, Method> a;
    protected final ax.B.a<String, Method> b;
    protected final ax.B.a<String, Class> c;

    public a(ax.B.a<String, Method> aVar, ax.B.a<String, Method> aVar2, ax.B.a<String, Class> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(InterfaceC3404b interfaceC3404b) {
        try {
            I(c(interfaceC3404b.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(interfaceC3404b.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    private Class c(Class<? extends InterfaceC3404b> cls) throws ClassNotFoundException {
        Class cls2 = this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", cls, a.class);
        this.b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i) {
        w(i);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i) {
        w(i);
        C(charSequence);
    }

    protected abstract void E(int i);

    public void F(int i, int i2) {
        w(i2);
        E(i);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i) {
        w(i);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i) {
        w(i);
        I(str);
    }

    protected <T extends InterfaceC3404b> void K(T t, a aVar) {
        try {
            e(t.getClass()).invoke(null, t, aVar);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    protected void L(InterfaceC3404b interfaceC3404b) {
        if (interfaceC3404b == null) {
            I(null);
            return;
        }
        N(interfaceC3404b);
        a b = b();
        K(interfaceC3404b, b);
        b.a();
    }

    public void M(InterfaceC3404b interfaceC3404b, int i) {
        w(i);
        L(interfaceC3404b);
    }

    protected abstract void a();

    protected abstract a b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z, int i) {
        return !m(i) ? z : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i) {
        return !m(i) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i) {
        return !m(i) ? charSequence : k();
    }

    protected abstract boolean m(int i);

    protected <T extends InterfaceC3404b> T n(String str, a aVar) {
        try {
            return (T) d(str).invoke(null, aVar);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    protected abstract int o();

    public int p(int i, int i2) {
        return !m(i2) ? i : o();
    }

    protected abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t, int i) {
        return !m(i) ? t : (T) q();
    }

    protected abstract String s();

    public String t(String str, int i) {
        return !m(i) ? str : s();
    }

    protected <T extends InterfaceC3404b> T u() {
        String s = s();
        if (s == null) {
            return null;
        }
        return (T) n(s, b());
    }

    public <T extends InterfaceC3404b> T v(T t, int i) {
        return !m(i) ? t : (T) u();
    }

    protected abstract void w(int i);

    public void x(boolean z, boolean z2) {
    }

    protected abstract void y(boolean z);

    public void z(boolean z, int i) {
        w(i);
        y(z);
    }
}
