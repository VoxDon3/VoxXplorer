package ax.W5;

import ax.W5.H0;
import ax.W5.J0;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class J0<MessageType extends J0<MessageType, BuilderType>, BuilderType extends H0<MessageType, BuilderType>> extends AbstractC1022d0<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected O1 zzc = O1.a();

    static J0 b(Class cls) {
        Map map = zzb;
        J0 j0 = (J0) map.get(cls);
        if (j0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                j0 = (J0) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (j0 != null) {
            return j0;
        }
        J0 j02 = (J0) ((J0) X1.e(cls)).o(6, null, null);
        if (j02 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, j02);
        return j02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static ax.W5.J0 d(ax.W5.J0 r3, byte[] r4) throws ax.W5.P0 {
        /*
            int r0 = r4.length
            ax.W5.z0 r1 = ax.W5.C1087z0.b
            r2 = 0
            ax.W5.J0 r3 = p(r3, r4, r2, r0, r1)
            if (r3 == 0) goto L44
            r4 = 1
            r0 = 0
            java.lang.Object r1 = r3.o(r4, r0, r0)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 != r4) goto L19
            goto L44
        L19:
            if (r1 == 0) goto L37
            java.lang.Class r1 = r3.getClass()
            ax.W5.s1 r2 = ax.W5.C1067s1.a()
            ax.W5.v1 r1 = r2.b(r1)
            boolean r1 = r1.g(r3)
            if (r4 == r1) goto L2f
            r4 = r0
            goto L30
        L2f:
            r4 = r3
        L30:
            r2 = 2
            r3.o(r2, r4, r0)
            if (r1 == 0) goto L37
            goto L44
        L37:
            ax.W5.L1 r4 = new ax.W5.L1
            r4.<init>(r3)
            ax.W5.P0 r4 = r4.a()
            r4.e(r3)
            throw r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.W5.J0.d(ax.W5.J0, byte[]):ax.W5.J0");
    }

    protected static M0 g() {
        return C1070t1.g();
    }

    static Object h(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object i(InterfaceC1041j1 interfaceC1041j1, String str, Object[] objArr) {
        return new C1073u1(interfaceC1041j1, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    protected static void l(Class cls, J0 j0) {
        j0.k();
        zzb.put(cls, j0);
    }

    private static J0 p(J0 j0, byte[] bArr, int i, int i2, C1087z0 c1087z0) throws P0 {
        J0 c = j0.c();
        try {
            InterfaceC1076v1 b = C1067s1.a().b(c.getClass());
            b.d(c, bArr, 0, i2, new C1031g0(c1087z0));
            b.c(c);
            return c;
        } catch (L1 e) {
            P0 a = e.a();
            a.e(c);
            throw a;
        } catch (P0 e2) {
            e2.e(c);
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof P0) {
                throw ((P0) e3.getCause());
            }
            P0 p0 = new P0(e3);
            p0.e(c);
            throw p0;
        } catch (IndexOutOfBoundsException unused) {
            P0 f = P0.f();
            f.e(c);
            throw f;
        }
    }

    final int a() {
        return C1067s1.a().b(getClass()).b(this);
    }

    final J0 c() {
        return (J0) o(4, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C1067s1.a().b(getClass()).h(this, (J0) obj);
    }

    @Override // ax.W5.InterfaceC1044k1
    public final /* synthetic */ InterfaceC1041j1 f() {
        return (J0) o(6, null, null);
    }

    public final int hashCode() {
        if (n()) {
            return a();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int a = a();
        this.zza = a;
        return a;
    }

    protected final void j() {
        C1067s1.a().b(getClass()).c(this);
        k();
    }

    final void k() {
        this.zzd &= SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    final void m(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    final boolean n() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object o(int i, Object obj, Object obj2);

    public final String toString() {
        return C1047l1.a(this, super.toString());
    }
}
