package ax.r0;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;

/* renamed from: ax.r0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2921h implements Iterable<Byte>, Serializable {
    public static final AbstractC2921h c0 = new j(C2904A.c);
    private static final f d0;
    private static final Comparator<AbstractC2921h> e0;
    private int q = 0;

    /* renamed from: ax.r0.h$a */
    class a extends c {
        private final int c0;
        private int q = 0;

        a() {
            this.c0 = AbstractC2921h.this.size();
        }

        @Override // ax.r0.AbstractC2921h.g
        public byte d() {
            int i = this.q;
            if (i >= this.c0) {
                throw new NoSuchElementException();
            }
            this.q = i + 1;
            return AbstractC2921h.this.q(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.q < this.c0;
        }
    }

    /* renamed from: ax.r0.h$b */
    static class b implements Comparator<AbstractC2921h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC2921h abstractC2921h, AbstractC2921h abstractC2921h2) {
            g it = abstractC2921h.iterator();
            g it2 = abstractC2921h2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(AbstractC2921h.A(it.d()), AbstractC2921h.A(it2.d()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(abstractC2921h.size(), abstractC2921h2.size());
        }
    }

    /* renamed from: ax.r0.h$c */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(d());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ax.r0.h$d */
    private static final class d implements f {
        private d() {
        }

        @Override // ax.r0.AbstractC2921h.f
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: ax.r0.h$e */
    private static final class e extends j {
        private final int g0;
        private final int h0;

        e(byte[] bArr, int i, int i2) {
            super(bArr);
            AbstractC2921h.i(i, i + i2, bArr.length);
            this.g0 = i;
            this.h0 = i2;
        }

        @Override // ax.r0.AbstractC2921h.j
        protected int K() {
            return this.g0;
        }

        @Override // ax.r0.AbstractC2921h.j, ax.r0.AbstractC2921h
        public byte g(int i) {
            AbstractC2921h.h(i, size());
            return this.f0[this.g0 + i];
        }

        @Override // ax.r0.AbstractC2921h.j, ax.r0.AbstractC2921h
        protected void p(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f0, K() + i, bArr, i2, i3);
        }

        @Override // ax.r0.AbstractC2921h.j, ax.r0.AbstractC2921h
        byte q(int i) {
            return this.f0[this.g0 + i];
        }

        @Override // ax.r0.AbstractC2921h.j, ax.r0.AbstractC2921h
        public int size() {
            return this.h0;
        }
    }

    /* renamed from: ax.r0.h$f */
    private interface f {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* renamed from: ax.r0.h$g */
    public interface g extends Iterator<Byte> {
        byte d();
    }

    /* renamed from: ax.r0.h$h, reason: collision with other inner class name */
    static final class C0433h {
        private final AbstractC2924k a;
        private final byte[] b;

        /* synthetic */ C0433h(int i, a aVar) {
            this(i);
        }

        public AbstractC2921h a() {
            this.a.c();
            return new j(this.b);
        }

        public AbstractC2924k b() {
            return this.a;
        }

        private C0433h(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            this.a = AbstractC2924k.g0(bArr);
        }
    }

    /* renamed from: ax.r0.h$i */
    static abstract class i extends AbstractC2921h {
        i() {
        }

        @Override // ax.r0.AbstractC2921h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* renamed from: ax.r0.h$j */
    private static class j extends i {
        protected final byte[] f0;

        j(byte[] bArr) {
            bArr.getClass();
            this.f0 = bArr;
        }

        @Override // ax.r0.AbstractC2921h
        protected final String C(Charset charset) {
            return new String(this.f0, K(), size(), charset);
        }

        @Override // ax.r0.AbstractC2921h
        final void I(AbstractC2920g abstractC2920g) throws IOException {
            abstractC2920g.a(this.f0, K(), size());
        }

        final boolean J(AbstractC2921h abstractC2921h, int i, int i2) {
            if (i2 > abstractC2921h.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > abstractC2921h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + abstractC2921h.size());
            }
            if (!(abstractC2921h instanceof j)) {
                return abstractC2921h.y(i, i3).equals(y(0, i2));
            }
            j jVar = (j) abstractC2921h;
            byte[] bArr = this.f0;
            byte[] bArr2 = jVar.f0;
            int K = K() + i2;
            int K2 = K();
            int K3 = jVar.K() + i;
            while (K2 < K) {
                if (bArr[K2] != bArr2[K3]) {
                    return false;
                }
                K2++;
                K3++;
            }
            return true;
        }

        protected int K() {
            return 0;
        }

        @Override // ax.r0.AbstractC2921h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC2921h) || size() != ((AbstractC2921h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int x = x();
            int x2 = jVar.x();
            if (x == 0 || x2 == 0 || x == x2) {
                return J(jVar, 0, size());
            }
            return false;
        }

        @Override // ax.r0.AbstractC2921h
        public byte g(int i) {
            return this.f0[i];
        }

        @Override // ax.r0.AbstractC2921h
        protected void p(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f0, i, bArr, i2, i3);
        }

        @Override // ax.r0.AbstractC2921h
        byte q(int i) {
            return this.f0[i];
        }

        @Override // ax.r0.AbstractC2921h
        public final boolean r() {
            int K = K();
            return t0.n(this.f0, K, size() + K);
        }

        @Override // ax.r0.AbstractC2921h
        public int size() {
            return this.f0.length;
        }

        @Override // ax.r0.AbstractC2921h
        public final AbstractC2922i u() {
            return AbstractC2922i.j(this.f0, K(), size(), true);
        }

        @Override // ax.r0.AbstractC2921h
        protected final int w(int i, int i2, int i3) {
            return C2904A.i(i, this.f0, K() + i2, i3);
        }

        @Override // ax.r0.AbstractC2921h
        public final AbstractC2921h y(int i, int i2) {
            int i3 = AbstractC2921h.i(i, i2, size());
            return i3 == 0 ? AbstractC2921h.c0 : new e(this.f0, K() + i, i3);
        }
    }

    /* renamed from: ax.r0.h$k */
    private static final class k implements f {
        private k() {
        }

        @Override // ax.r0.AbstractC2921h.f
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        d0 = C2917d.c() ? new k(aVar) : new d(aVar);
        e0 = new b();
    }

    AbstractC2921h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int A(byte b2) {
        return b2 & 255;
    }

    static AbstractC2921h E(byte[] bArr) {
        return new j(bArr);
    }

    static AbstractC2921h G(byte[] bArr, int i2, int i3) {
        return new e(bArr, i2, i3);
    }

    static void h(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }
    }

    static int i(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public static AbstractC2921h k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    public static AbstractC2921h l(byte[] bArr, int i2, int i3) {
        i(i2, i2 + i3, bArr.length);
        return new j(d0.a(bArr, i2, i3));
    }

    public static AbstractC2921h n(String str) {
        return new j(str.getBytes(C2904A.a));
    }

    static C0433h t(int i2) {
        return new C0433h(i2, null);
    }

    public final String B(Charset charset) {
        return size() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : C(charset);
    }

    protected abstract String C(Charset charset);

    public final String D() {
        return B(C2904A.a);
    }

    abstract void I(AbstractC2920g abstractC2920g) throws IOException;

    public abstract boolean equals(Object obj);

    public abstract byte g(int i2);

    public final int hashCode() {
        int i2 = this.q;
        if (i2 == 0) {
            int size = size();
            i2 = w(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.q = i2;
        }
        return i2;
    }

    protected abstract void p(byte[] bArr, int i2, int i3, int i4);

    abstract byte q(int i2);

    public abstract boolean r();

    @Override // java.lang.Iterable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract AbstractC2922i u();

    protected abstract int w(int i2, int i3, int i4);

    protected final int x() {
        return this.q;
    }

    public abstract AbstractC2921h y(int i2, int i3);

    public final byte[] z() {
        int size = size();
        if (size == 0) {
            return C2904A.c;
        }
        byte[] bArr = new byte[size];
        p(bArr, 0, 0, size);
        return bArr;
    }
}
