/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.H0;
import ax.W5.L1;
import ax.W5.M0;
import ax.W5.O1;
import ax.W5.P0;
import ax.W5.X1;
import ax.W5.d0;
import ax.W5.g0;
import ax.W5.j1;
import ax.W5.l1;
import ax.W5.s1;
import ax.W5.t1;
import ax.W5.u1;
import ax.W5.v1;
import ax.W5.z0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public abstract class J0<MessageType extends J0<MessageType, BuilderType>, BuilderType extends H0<MessageType, BuilderType>>
extends d0<MessageType, BuilderType> {
    private static final Map zzb = new j.ConcurrentHashMap();
    protected O1 zzc = O1.a();
    private int zzd = -1;

    static J0 b(Class clazz) {
        J0 j02;
        Map map = zzb;
        J0 j03 = j02 = (J0)map.get(clazz);
        if (j02 == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
            }
            j03 = (J0)map.get(clazz);
        }
        if (j03 == null) {
            j03 = (J0)((J0)X1.e(clazz)).o(6, null, null);
            if (j03 != null) {
                map.put(clazz, j03);
                return j03;
            }
            throw new IllegalStateException();
        }
        return j03;
    }

    protected static J0 d(J0 object, byte[] object2) throws P0 {
        block2: {
            block3: {
                byte by;
                if ((object2 = (Object)J0.p((J0)object, (byte[])object2, 0, ((byte[])object2).length, z0.b)) == null || (by = ((Byte)((J0)object2).o(1, null, null)).byteValue()) == 1) break block2;
                if (by == 0) break block3;
                object = object2.getClass();
                boolean bl = s1.a().b((Class)object).g(object2);
                object = true != bl ? null : object2;
                ((J0)object2).o(2, object, null);
                if (bl) break block2;
            }
            object = new L1((j1)object2).a();
            ((P0)object).e((j1)object2);
            throw object;
        }
        return object2;
    }

    protected static M0 g() {
        return t1.g();
    }

    static Object h(Method object, Object object2, Object ... objectArray) {
        try {
            object = ((Method)object).invoke(object2, objectArray);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (!(throwable instanceof RuntimeException)) {
                if (throwable instanceof Error) {
                    throw (Error)throwable;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable);
            }
            throw (RuntimeException)throwable;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
        }
    }

    protected static Object i(j1 j12, String string, Object[] objectArray) {
        return new u1(j12, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objectArray);
    }

    protected static void l(Class clazz, J0 j02) {
        j02.k();
        zzb.put(clazz, j02);
    }

    private static J0 p(J0 j02, byte[] byArray, int n8, int n9, z0 z02) throws P0 {
        P0 p022;
        block7: {
            L1 l122;
            block6: {
                j02 = j02.c();
                try {
                    v1 v12 = s1.a().b(j02.getClass());
                    g0 g02 = new g0(z02);
                    v12.d(j02, byArray, 0, n9, g02);
                    v12.c(j02);
                    return j02;
                }
                catch (IOException iOException) {
                }
                catch (L1 l122) {
                    break block6;
                }
                catch (P0 p022) {
                    break block7;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    P0 p03 = P0.f();
                    p03.e(j02);
                    throw p03;
                }
                if (iOException.getCause() instanceof P0) {
                    throw (P0)iOException.getCause();
                }
                P0 p04 = new P0(iOException);
                p04.e(j02);
                throw p04;
            }
            P0 p05 = l122.a();
            p05.e(j02);
            throw p05;
        }
        p022.e(j02);
        throw p022;
    }

    final int a() {
        return s1.a().b(this.getClass()).b(this);
    }

    final J0 c() {
        return (J0)this.o(4, null, null);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Class<?> clazz = this.getClass();
        return s1.a().b(clazz).h(this, (J0)object);
    }

    @Override
    public final /* synthetic */ j1 f() {
        return (J0)this.o(6, null, null);
    }

    public final int hashCode() {
        if (!this.n()) {
            int n8;
            int n9 = n8 = this.zza;
            if (n8 == 0) {
                this.zza = n9 = this.a();
            }
            return n9;
        }
        return this.a();
    }

    protected final void j() {
        s1.a().b(this.getClass()).c(this);
        this.k();
    }

    final void k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void m(int n8) {
        this.zzd = this.zzd & Integer.MIN_VALUE | Integer.MAX_VALUE;
    }

    final boolean n() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object o(int var1, Object var2, Object var3);

    public final String toString() {
        return l1.a(this, super.toString());
    }
}

