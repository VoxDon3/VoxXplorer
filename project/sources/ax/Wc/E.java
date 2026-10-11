package ax.Wc;

import ax.Nd.a;
import java.io.IOException;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public abstract class E extends A implements Iterable {
    static final O d0 = new a(E.class, 17);
    protected final boolean c0;
    protected final InterfaceC1101g[] q;

    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A c(D d) {
            return d.O();
        }
    }

    protected E() {
        this.q = C1103h.d;
        this.c0 = true;
    }

    private static byte[] C(InterfaceC1101g interfaceC1101g) {
        try {
            return interfaceC1101g.g().q("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static E D(J j, boolean z) {
        return (E) d0.e(j, z);
    }

    public static E E(Object obj) {
        if (obj == null || (obj instanceof E)) {
            return (E) obj;
        }
        if (obj instanceof InterfaceC1101g) {
            A g = ((InterfaceC1101g) obj).g();
            if (g instanceof E) {
                return (E) g;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (E) d0.b((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    private static boolean I(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & (-33);
        int i2 = bArr2[0] & (-33);
        if (i != i2) {
            return i < i2;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    private static void J(InterfaceC1101g[] interfaceC1101gArr) {
        int i;
        int length = interfaceC1101gArr.length;
        if (length < 2) {
            return;
        }
        InterfaceC1101g interfaceC1101g = interfaceC1101gArr[0];
        InterfaceC1101g interfaceC1101g2 = interfaceC1101gArr[1];
        byte[] C = C(interfaceC1101g);
        byte[] C2 = C(interfaceC1101g2);
        if (I(C2, C)) {
            interfaceC1101g2 = interfaceC1101g;
            interfaceC1101g = interfaceC1101g2;
            C2 = C;
            C = C2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            InterfaceC1101g interfaceC1101g3 = interfaceC1101gArr[i2];
            byte[] C3 = C(interfaceC1101g3);
            if (I(C2, C3)) {
                interfaceC1101gArr[i2 - 2] = interfaceC1101g;
                interfaceC1101g = interfaceC1101g2;
                C = C2;
                interfaceC1101g2 = interfaceC1101g3;
                C2 = C3;
            } else if (I(C, C3)) {
                interfaceC1101gArr[i2 - 2] = interfaceC1101g;
                interfaceC1101g = interfaceC1101g3;
                C = C3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    InterfaceC1101g interfaceC1101g4 = interfaceC1101gArr[i3 - 2];
                    if (I(C(interfaceC1101g4), C3)) {
                        break;
                    }
                    interfaceC1101gArr[i] = interfaceC1101g4;
                    i3 = i;
                }
                interfaceC1101gArr[i] = interfaceC1101g3;
            }
        }
        interfaceC1101gArr[length - 2] = interfaceC1101g;
        interfaceC1101gArr[length - 1] = interfaceC1101g2;
    }

    @Override // ax.Wc.A
    A A() {
        InterfaceC1101g[] interfaceC1101gArr;
        if (this.c0) {
            interfaceC1101gArr = this.q;
        } else {
            interfaceC1101gArr = (InterfaceC1101g[]) this.q.clone();
            J(interfaceC1101gArr);
        }
        return new C1137y0(true, interfaceC1101gArr);
    }

    @Override // ax.Wc.A
    A B() {
        return new O0(this.c0, this.q);
    }

    public InterfaceC1101g G(int i) {
        return this.q[i];
    }

    public InterfaceC1101g[] K() {
        return C1103h.b(this.q);
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        int length = this.q.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += this.q[length].g().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC1101g> iterator() {
        return new a.C0156a(K());
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        if (!(a2 instanceof E)) {
            return false;
        }
        E e = (E) a2;
        int size = size();
        if (e.size() != size) {
            return false;
        }
        C1137y0 c1137y0 = (C1137y0) A();
        C1137y0 c1137y02 = (C1137y0) e.A();
        for (int i = 0; i < size; i++) {
            A g = c1137y0.q[i].g();
            A g2 = c1137y02.q[i].g();
            if (g != g2 && !g.r(g2)) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return this.q.length;
    }

    @Override // ax.Wc.A
    boolean t() {
        return true;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.q[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    protected E(InterfaceC1101g interfaceC1101g) {
        if (interfaceC1101g == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.q = new InterfaceC1101g[]{interfaceC1101g};
        this.c0 = true;
    }

    protected E(C1103h c1103h, boolean z) {
        InterfaceC1101g[] g;
        if (c1103h == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z || c1103h.f() < 2) {
            g = c1103h.g();
        } else {
            g = c1103h.c();
            J(g);
        }
        this.q = g;
        this.c0 = z || g.length < 2;
    }

    E(boolean z, InterfaceC1101g[] interfaceC1101gArr) {
        this.q = interfaceC1101gArr;
        this.c0 = z || interfaceC1101gArr.length < 2;
    }

    protected E(InterfaceC1101g[] interfaceC1101gArr, boolean z) {
        if (ax.Nd.a.o(interfaceC1101gArr)) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        InterfaceC1101g[] b = C1103h.b(interfaceC1101gArr);
        if (z && b.length >= 2) {
            J(b);
        }
        this.q = b;
        this.c0 = z || b.length < 2;
    }
}
