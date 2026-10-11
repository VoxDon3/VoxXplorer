package ax.Wc;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.Wc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1093c extends A implements G, InterfaceC1095d {
    static final O c0 = new a(AbstractC1093c.class, 3);
    private static final char[] d0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] q;

    /* renamed from: ax.Wc.c$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A c(D d) {
            return d.K();
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return AbstractC1093c.C(c1127t0.G());
        }
    }

    AbstractC1093c(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.q = ax.Nd.a.p(bArr, (byte) i);
    }

    static AbstractC1093c C(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i = bArr[0] & 255;
        if (i > 0) {
            if (i > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b = bArr[length - 1];
            if (b != ((byte) ((255 << i) & b))) {
                return new H0(bArr, false);
            }
        }
        return new C1110k0(bArr, false);
    }

    protected static byte[] E(int i) {
        if (i == 0) {
            return new byte[0];
        }
        int i2 = 4;
        for (int i3 = 3; i3 >= 1 && ((255 << (i3 * 8)) & i) == 0; i3--) {
            i2--;
        }
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i >> (i4 * 8)) & 255);
        }
        return bArr;
    }

    public static AbstractC1093c G(J j, boolean z) {
        return (AbstractC1093c) c0.e(j, z);
    }

    public static AbstractC1093c I(Object obj) {
        if (obj == null || (obj instanceof AbstractC1093c)) {
            return (AbstractC1093c) obj;
        }
        if (obj instanceof InterfaceC1101g) {
            A g = ((InterfaceC1101g) obj).g();
            if (g instanceof AbstractC1093c) {
                return (AbstractC1093c) g;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC1093c) c0.b((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    protected static int J(int i) {
        int i2;
        int i3 = 3;
        while (true) {
            if (i3 < 0) {
                i2 = 0;
                break;
            }
            if (i3 != 0) {
                int i4 = i >> (i3 * 8);
                if (i4 != 0) {
                    i2 = i4 & 255;
                    break;
                }
                i3--;
            } else {
                if (i != 0) {
                    i2 = i & 255;
                    break;
                }
                i3--;
            }
        }
        if (i2 == 0) {
            return 0;
        }
        int i5 = 1;
        while (true) {
            i2 <<= 1;
            if ((i2 & 255) == 0) {
                return 8 - i5;
            }
            i5++;
        }
    }

    @Override // ax.Wc.A
    A A() {
        return new C1110k0(this.q, false);
    }

    @Override // ax.Wc.A
    A B() {
        return new H0(this.q, false);
    }

    public byte[] D() {
        byte[] bArr = this.q;
        if (bArr.length == 1) {
            return AbstractC1132w.d0;
        }
        int i = bArr[0] & 255;
        byte[] f = ax.Nd.a.f(bArr, 1, bArr.length);
        int length = f.length - 1;
        f[length] = (byte) (((byte) (255 << i)) & f[length]);
        return f;
    }

    @Override // ax.Wc.G
    public String h() {
        try {
            byte[] p = p();
            StringBuffer stringBuffer = new StringBuffer((p.length * 2) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != p.length; i++) {
                byte b = p[i];
                char[] cArr = d0;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new C1138z("Internal error encoding BitString: " + e.getMessage(), e);
        }
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        byte[] bArr = this.q;
        if (bArr.length < 2) {
            return 1;
        }
        int i = bArr[0] & 255;
        int length = bArr.length - 1;
        return (ax.Nd.a.m(bArr, 0, length) * 257) ^ ((byte) ((255 << i) & bArr[length]));
    }

    @Override // ax.Wc.InterfaceC1095d
    public InputStream i() throws IOException {
        byte[] bArr = this.q;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // ax.Wc.InterfaceC1095d
    public int k() {
        return this.q[0] & 255;
    }

    @Override // ax.Wc.U0
    public A l() {
        return g();
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        if (!(a2 instanceof AbstractC1093c)) {
            return false;
        }
        byte[] bArr = this.q;
        byte[] bArr2 = ((AbstractC1093c) a2).q;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i] & i3)) == ((byte) (bArr2[i] & i3));
    }

    public String toString() {
        return h();
    }

    AbstractC1093c(byte[] bArr, boolean z) {
        if (z) {
            if (bArr == null) {
                throw new NullPointerException("'contents' cannot be null");
            }
            if (bArr.length < 1) {
                throw new IllegalArgumentException("'contents' cannot be empty");
            }
            int i = bArr[0] & 255;
            if (i > 0) {
                if (bArr.length < 2) {
                    throw new IllegalArgumentException("zero length data with non-zero pad bits");
                }
                if (i > 7) {
                    throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                }
            }
        }
        this.q = bArr;
    }
}
