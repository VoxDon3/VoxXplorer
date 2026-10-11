package ax.Wc;

import ax.Nd.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public abstract class D extends A implements Iterable {
    static final O c0 = new a(D.class, 16);
    InterfaceC1101g[] q;

    class b implements Enumeration {
        private int q = 0;

        b() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.q < D.this.q.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i = this.q;
            InterfaceC1101g[] interfaceC1101gArr = D.this.q;
            if (i >= interfaceC1101gArr.length) {
                throw new NoSuchElementException();
            }
            this.q = i + 1;
            return interfaceC1101gArr[i];
        }
    }

    protected D() {
        this.q = C1103h.d;
    }

    public static D E(J j, boolean z) {
        return (D) c0.e(j, z);
    }

    public static D G(Object obj) {
        if (obj == null || (obj instanceof D)) {
            return (D) obj;
        }
        if (obj instanceof InterfaceC1101g) {
            A g = ((InterfaceC1101g) obj).g();
            if (g instanceof D) {
                return (D) g;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (D) c0.b((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    @Override // ax.Wc.A
    A A() {
        return new C1135x0(this.q, false);
    }

    @Override // ax.Wc.A
    A B() {
        return new M0(this.q, false);
    }

    AbstractC1093c[] C() {
        int size = size();
        AbstractC1093c[] abstractC1093cArr = new AbstractC1093c[size];
        for (int i = 0; i < size; i++) {
            abstractC1093cArr[i] = AbstractC1093c.I(this.q[i]);
        }
        return abstractC1093cArr;
    }

    AbstractC1132w[] D() {
        int size = size();
        AbstractC1132w[] abstractC1132wArr = new AbstractC1132w[size];
        for (int i = 0; i < size; i++) {
            abstractC1132wArr[i] = AbstractC1132w.E(this.q[i]);
        }
        return abstractC1132wArr;
    }

    public InterfaceC1101g I(int i) {
        return this.q[i];
    }

    public Enumeration J() {
        return new b();
    }

    abstract AbstractC1093c K();

    abstract AbstractC1109k M();

    abstract AbstractC1132w N();

    abstract E O();

    InterfaceC1101g[] P() {
        return this.q;
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
            i = (i * 257) ^ this.q[length].g().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC1101g> iterator() {
        return new a.C0156a(this.q);
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        if (!(a2 instanceof D)) {
            return false;
        }
        D d = (D) a2;
        int size = size();
        if (d.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            A g = this.q[i].g();
            A g2 = d.q[i].g();
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

    protected D(InterfaceC1101g interfaceC1101g) {
        if (interfaceC1101g == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.q = new InterfaceC1101g[]{interfaceC1101g};
    }

    protected D(C1103h c1103h) {
        if (c1103h == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.q = c1103h.g();
    }

    protected D(InterfaceC1101g[] interfaceC1101gArr) {
        if (ax.Nd.a.o(interfaceC1101gArr)) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        this.q = C1103h.b(interfaceC1101gArr);
    }

    D(InterfaceC1101g[] interfaceC1101gArr, boolean z) {
        this.q = z ? C1103h.b(interfaceC1101gArr) : interfaceC1101gArr;
    }

    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A c(D d) {
            return d;
        }
    }
}
