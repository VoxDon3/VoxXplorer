package ax.r0;

import ax.r0.C2905B;
import ax.r0.K;
import ax.r0.u0;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: ax.r0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2918e implements g0 {

    /* renamed from: ax.r0.e$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u0.b.values().length];
            a = iArr;
            try {
                iArr[u0.b.k0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u0.b.o0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u0.b.d0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u0.b.q0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u0.b.j0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u0.b.i0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u0.b.e0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u0.b.h0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u0.b.f0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[u0.b.n0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[u0.b.r0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[u0.b.s0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[u0.b.t0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[u0.b.u0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[u0.b.l0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[u0.b.p0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[u0.b.g0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* renamed from: ax.r0.e$b */
    private static final class b extends AbstractC2918e {
        private final boolean a;
        private final byte[] b;
        private int c;
        private final int d;
        private int e;
        private int f;
        private int g;

        public b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.a = z;
            this.b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.c = arrayOffset;
            this.d = arrayOffset;
            this.e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            return this.c == this.e;
        }

        private byte S() throws IOException {
            int i = this.c;
            if (i == this.e) {
                throw C2905B.k();
            }
            byte[] bArr = this.b;
            this.c = i + 1;
            return bArr[i];
        }

        private Object T(u0.b bVar, Class<?> cls, C2929p c2929p) throws IOException {
            switch (a.a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(m());
                case 2:
                    return G();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(w());
                case 5:
                    return Integer.valueOf(k());
                case 6:
                    return Long.valueOf(e());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(I());
                case 9:
                    return Long.valueOf(N());
                case 10:
                    return x(cls, c2929p);
                case 11:
                    return Integer.valueOf(K());
                case 12:
                    return Long.valueOf(n());
                case 13:
                    return Integer.valueOf(z());
                case 14:
                    return Long.valueOf(A());
                case 15:
                    return O();
                case 16:
                    return Integer.valueOf(p());
                case 17:
                    return Long.valueOf(d());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T U(h0<T> h0Var, C2929p c2929p) throws IOException {
            int i = this.g;
            this.g = u0.c(u0.a(this.f), 4);
            try {
                T g = h0Var.g();
                h0Var.h(g, this, c2929p);
                h0Var.b(g);
                if (this.f == this.g) {
                    return g;
                }
                throw C2905B.g();
            } finally {
                this.g = i;
            }
        }

        private int V() throws IOException {
            f0(4);
            return W();
        }

        private int W() {
            int i = this.c;
            byte[] bArr = this.b;
            this.c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long X() throws IOException {
            f0(8);
            return Y();
        }

        private long Y() {
            int i = this.c;
            byte[] bArr = this.b;
            this.c = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        private <T> T Z(h0<T> h0Var, C2929p c2929p) throws IOException {
            int c0 = c0();
            f0(c0);
            int i = this.e;
            int i2 = this.c + c0;
            this.e = i2;
            try {
                T g = h0Var.g();
                h0Var.h(g, this, c2929p);
                h0Var.b(g);
                if (this.c == i2) {
                    return g;
                }
                throw C2905B.g();
            } finally {
                this.e = i;
            }
        }

        private int c0() throws IOException {
            int i;
            int i2 = this.c;
            int i3 = this.e;
            if (i3 == i2) {
                throw C2905B.k();
            }
            byte[] bArr = this.b;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.c = i4;
                return b;
            }
            if (i3 - i4 < 9) {
                return (int) e0();
            }
            int i5 = i2 + 2;
            int i6 = (bArr[i4] << 7) ^ b;
            if (i6 < 0) {
                i = i6 ^ (-128);
            } else {
                int i7 = i2 + 3;
                int i8 = (bArr[i5] << 14) ^ i6;
                if (i8 >= 0) {
                    i = i8 ^ 16256;
                } else {
                    int i9 = i2 + 4;
                    int i10 = i8 ^ (bArr[i7] << 21);
                    if (i10 < 0) {
                        i = (-2080896) ^ i10;
                    } else {
                        i7 = i2 + 5;
                        byte b2 = bArr[i9];
                        int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                        if (b2 < 0) {
                            i9 = i2 + 6;
                            if (bArr[i7] < 0) {
                                i7 = i2 + 7;
                                if (bArr[i9] < 0) {
                                    i9 = i2 + 8;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 9;
                                        if (bArr[i9] < 0) {
                                            int i12 = i2 + 10;
                                            if (bArr[i7] < 0) {
                                                throw C2905B.e();
                                            }
                                            i5 = i12;
                                            i = i11;
                                        }
                                    }
                                }
                            }
                            i = i11;
                        }
                        i = i11;
                    }
                    i5 = i9;
                }
                i5 = i7;
            }
            this.c = i5;
            return i;
        }

        private long e0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((S() & 128) == 0) {
                    return j;
                }
            }
            throw C2905B.e();
        }

        private void f0(int i) throws IOException {
            if (i < 0 || i > this.e - this.c) {
                throw C2905B.k();
            }
        }

        private void g0(int i) throws IOException {
            if (this.c != i) {
                throw C2905B.k();
            }
        }

        private void h0(int i) throws IOException {
            if (u0.b(this.f) != i) {
                throw C2905B.d();
            }
        }

        private void i0(int i) throws IOException {
            f0(i);
            this.c += i;
        }

        private void j0() throws IOException {
            int i = this.g;
            this.g = u0.c(u0.a(this.f), 4);
            while (D() != Integer.MAX_VALUE && J()) {
            }
            if (this.f != this.g) {
                throw C2905B.g();
            }
            this.g = i;
        }

        private void k0() throws IOException {
            int i = this.e;
            int i2 = this.c;
            if (i - i2 >= 10) {
                byte[] bArr = this.b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            l0();
        }

        private void l0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw C2905B.e();
        }

        private void m0(int i) throws IOException {
            f0(i);
            if ((i & 3) != 0) {
                throw C2905B.g();
            }
        }

        private void n0(int i) throws IOException {
            f0(i);
            if ((i & 7) != 0) {
                throw C2905B.g();
            }
        }

        @Override // ax.r0.g0
        public long A() throws IOException {
            h0(0);
            return AbstractC2922i.c(d0());
        }

        @Override // ax.r0.g0
        public void B(List<Boolean> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2919f)) {
                int b = u0.b(this.f);
                if (b != 0) {
                    if (b != 2) {
                        throw C2905B.d();
                    }
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        list.add(Boolean.valueOf(c0() != 0));
                    }
                    g0(c0);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(m()));
                    if (R()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (c0() == this.f);
                this.c = i;
                return;
            }
            C2919f c2919f = (C2919f) list;
            int b2 = u0.b(this.f);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw C2905B.d();
                }
                int c02 = this.c + c0();
                while (this.c < c02) {
                    c2919f.k(c0() != 0);
                }
                g0(c02);
                return;
            }
            do {
                c2919f.k(m());
                if (R()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (c0() == this.f);
            this.c = i2;
        }

        @Override // ax.r0.g0
        public String C() throws IOException {
            return a0(false);
        }

        @Override // ax.r0.g0
        public int D() throws IOException {
            if (R()) {
                return SubsamplingScaleImageView.TILE_SIZE_AUTO;
            }
            int c0 = c0();
            this.f = c0;
            return c0 == this.g ? SubsamplingScaleImageView.TILE_SIZE_AUTO : u0.a(c0);
        }

        @Override // ax.r0.g0
        public void E(List<String> list) throws IOException {
            b0(list, false);
        }

        @Override // ax.r0.g0
        public void F(List<String> list) throws IOException {
            b0(list, true);
        }

        @Override // ax.r0.g0
        public AbstractC2921h G() throws IOException {
            h0(2);
            int c0 = c0();
            if (c0 == 0) {
                return AbstractC2921h.c0;
            }
            f0(c0);
            AbstractC2921h G = this.a ? AbstractC2921h.G(this.b, this.c, c0) : AbstractC2921h.l(this.b, this.c, c0);
            this.c += c0;
            return G;
        }

        @Override // ax.r0.g0
        public void H(List<Float> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2935w)) {
                int b = u0.b(this.f);
                if (b == 2) {
                    int c0 = c0();
                    m0(c0);
                    int i3 = this.c + c0;
                    while (this.c < i3) {
                        list.add(Float.valueOf(Float.intBitsToFloat(W())));
                    }
                    return;
                }
                if (b != 5) {
                    throw C2905B.d();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (R()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (c0() == this.f);
                this.c = i;
                return;
            }
            C2935w c2935w = (C2935w) list;
            int b2 = u0.b(this.f);
            if (b2 == 2) {
                int c02 = c0();
                m0(c02);
                int i4 = this.c + c02;
                while (this.c < i4) {
                    c2935w.i(Float.intBitsToFloat(W()));
                }
                return;
            }
            if (b2 != 5) {
                throw C2905B.d();
            }
            do {
                c2935w.i(readFloat());
                if (R()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (c0() == this.f);
            this.c = i2;
        }

        @Override // ax.r0.g0
        public int I() throws IOException {
            h0(0);
            return c0();
        }

        @Override // ax.r0.g0
        public boolean J() throws IOException {
            int i;
            if (R() || (i = this.f) == this.g) {
                return false;
            }
            int b = u0.b(i);
            if (b == 0) {
                k0();
                return true;
            }
            if (b == 1) {
                i0(8);
                return true;
            }
            if (b == 2) {
                i0(c0());
                return true;
            }
            if (b == 3) {
                j0();
                return true;
            }
            if (b != 5) {
                throw C2905B.d();
            }
            i0(4);
            return true;
        }

        @Override // ax.r0.g0
        public int K() throws IOException {
            h0(5);
            return V();
        }

        @Override // ax.r0.g0
        public void L(List<AbstractC2921h> list) throws IOException {
            int i;
            if (u0.b(this.f) != 2) {
                throw C2905B.d();
            }
            do {
                list.add(G());
                if (R()) {
                    return;
                } else {
                    i = this.c;
                }
            } while (c0() == this.f);
            this.c = i;
        }

        @Override // ax.r0.g0
        public void M(List<Double> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2926m)) {
                int b = u0.b(this.f);
                if (b == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (R()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (c0() == this.f);
                    this.c = i;
                    return;
                }
                if (b != 2) {
                    throw C2905B.d();
                }
                int c0 = c0();
                n0(c0);
                int i3 = this.c + c0;
                while (this.c < i3) {
                    list.add(Double.valueOf(Double.longBitsToDouble(Y())));
                }
                return;
            }
            C2926m c2926m = (C2926m) list;
            int b2 = u0.b(this.f);
            if (b2 == 1) {
                do {
                    c2926m.i(readDouble());
                    if (R()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            if (b2 != 2) {
                throw C2905B.d();
            }
            int c02 = c0();
            n0(c02);
            int i4 = this.c + c02;
            while (this.c < i4) {
                c2926m.i(Double.longBitsToDouble(Y()));
            }
        }

        @Override // ax.r0.g0
        public long N() throws IOException {
            h0(0);
            return d0();
        }

        @Override // ax.r0.g0
        public String O() throws IOException {
            return a0(true);
        }

        @Override // ax.r0.g0
        public void P(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2912I)) {
                int b = u0.b(this.f);
                if (b == 1) {
                    do {
                        list.add(Long.valueOf(e()));
                        if (R()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (c0() == this.f);
                    this.c = i;
                    return;
                }
                if (b != 2) {
                    throw C2905B.d();
                }
                int c0 = c0();
                n0(c0);
                int i3 = this.c + c0;
                while (this.c < i3) {
                    list.add(Long.valueOf(Y()));
                }
                return;
            }
            C2912I c2912i = (C2912I) list;
            int b2 = u0.b(this.f);
            if (b2 == 1) {
                do {
                    c2912i.k(e());
                    if (R()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            if (b2 != 2) {
                throw C2905B.d();
            }
            int c02 = c0();
            n0(c02);
            int i4 = this.c + c02;
            while (this.c < i4) {
                c2912i.k(Y());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ax.r0.g0
        public <K, V> void a(Map<K, V> map, K.a<K, V> aVar, C2929p c2929p) throws IOException {
            h0(2);
            int c0 = c0();
            f0(c0);
            int i = this.e;
            this.e = this.c + c0;
            try {
                Object obj = aVar.b;
                Object obj2 = aVar.d;
                while (true) {
                    int D = D();
                    if (D == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    }
                    if (D == 1) {
                        obj = T(aVar.a, null, null);
                    } else if (D != 2) {
                        try {
                            if (!J()) {
                                throw new C2905B("Unable to parse map entry.");
                            }
                        } catch (C2905B.a unused) {
                            if (!J()) {
                                throw new C2905B("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = T(aVar.c, aVar.d.getClass(), c2929p);
                    }
                }
            } finally {
                this.e = i;
            }
        }

        public String a0(boolean z) throws IOException {
            h0(2);
            int c0 = c0();
            if (c0 == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            f0(c0);
            if (z) {
                byte[] bArr = this.b;
                int i = this.c;
                if (!t0.n(bArr, i, i + c0)) {
                    throw C2905B.c();
                }
            }
            String str = new String(this.b, this.c, c0, C2904A.a);
            this.c += c0;
            return str;
        }

        @Override // ax.r0.g0
        public <T> T b(h0<T> h0Var, C2929p c2929p) throws IOException {
            h0(3);
            return (T) U(h0Var, c2929p);
        }

        public void b0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (u0.b(this.f) != 2) {
                throw C2905B.d();
            }
            if (!(list instanceof InterfaceC2910G) || z) {
                do {
                    list.add(a0(z));
                    if (R()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (c0() == this.f);
                this.c = i;
                return;
            }
            InterfaceC2910G interfaceC2910G = (InterfaceC2910G) list;
            do {
                interfaceC2910G.C0(G());
                if (R()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (c0() == this.f);
            this.c = i2;
        }

        @Override // ax.r0.g0
        public void c(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2938z)) {
                int b = u0.b(this.f);
                if (b != 0) {
                    if (b != 2) {
                        throw C2905B.d();
                    }
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        list.add(Integer.valueOf(AbstractC2922i.b(c0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(z()));
                    if (R()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (c0() == this.f);
                this.c = i;
                return;
            }
            C2938z c2938z = (C2938z) list;
            int b2 = u0.b(this.f);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw C2905B.d();
                }
                int c02 = this.c + c0();
                while (this.c < c02) {
                    c2938z.i(AbstractC2922i.b(c0()));
                }
                return;
            }
            do {
                c2938z.i(z());
                if (R()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (c0() == this.f);
            this.c = i2;
        }

        @Override // ax.r0.g0
        public long d() throws IOException {
            h0(0);
            return d0();
        }

        public long d0() throws IOException {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.c;
            int i2 = this.e;
            if (i2 == i) {
                throw C2905B.k();
            }
            byte[] bArr = this.b;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.c = i3;
                return b;
            }
            if (i2 - i3 < 9) {
                return e0();
            }
            int i4 = i + 2;
            int i5 = (bArr[i3] << 7) ^ b;
            if (i5 < 0) {
                j = i5 ^ (-128);
            } else {
                int i6 = i + 3;
                int i7 = (bArr[i4] << 14) ^ i5;
                if (i7 >= 0) {
                    j = i7 ^ 16256;
                    i4 = i6;
                } else {
                    int i8 = i + 4;
                    int i9 = i7 ^ (bArr[i6] << 21);
                    if (i9 < 0) {
                        j4 = (-2080896) ^ i9;
                    } else {
                        long j5 = i9;
                        i4 = i + 5;
                        long j6 = j5 ^ (bArr[i8] << 28);
                        if (j6 >= 0) {
                            j3 = 266354560;
                        } else {
                            i8 = i + 6;
                            long j7 = j6 ^ (bArr[i4] << 35);
                            if (j7 < 0) {
                                j2 = -34093383808L;
                            } else {
                                i4 = i + 7;
                                j6 = j7 ^ (bArr[i8] << 42);
                                if (j6 >= 0) {
                                    j3 = 4363953127296L;
                                } else {
                                    i8 = i + 8;
                                    j7 = j6 ^ (bArr[i4] << 49);
                                    if (j7 < 0) {
                                        j2 = -558586000294016L;
                                    } else {
                                        i4 = i + 9;
                                        long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                        if (j8 < 0) {
                                            int i10 = i + 10;
                                            if (bArr[i4] < 0) {
                                                throw C2905B.e();
                                            }
                                            i4 = i10;
                                        }
                                        j = j8;
                                    }
                                }
                            }
                            j4 = j2 ^ j7;
                        }
                        j = j3 ^ j6;
                    }
                    i4 = i8;
                    j = j4;
                }
            }
            this.c = i4;
            return j;
        }

        @Override // ax.r0.g0
        public long e() throws IOException {
            h0(1);
            return X();
        }

        @Override // ax.r0.g0
        public <T> T f(h0<T> h0Var, C2929p c2929p) throws IOException {
            h0(2);
            return (T) Z(h0Var, c2929p);
        }

        @Override // ax.r0.g0
        public void g(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2938z)) {
                int b = u0.b(this.f);
                if (b == 2) {
                    int c0 = c0();
                    m0(c0);
                    int i3 = this.c + c0;
                    while (this.c < i3) {
                        list.add(Integer.valueOf(W()));
                    }
                    return;
                }
                if (b != 5) {
                    throw C2905B.d();
                }
                do {
                    list.add(Integer.valueOf(K()));
                    if (R()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (c0() == this.f);
                this.c = i;
                return;
            }
            C2938z c2938z = (C2938z) list;
            int b2 = u0.b(this.f);
            if (b2 == 2) {
                int c02 = c0();
                m0(c02);
                int i4 = this.c + c02;
                while (this.c < i4) {
                    c2938z.i(W());
                }
                return;
            }
            if (b2 != 5) {
                throw C2905B.d();
            }
            do {
                c2938z.i(K());
                if (R()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (c0() == this.f);
            this.c = i2;
        }

        @Override // ax.r0.g0
        public void h(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2912I)) {
                int b = u0.b(this.f);
                if (b != 0) {
                    if (b != 2) {
                        throw C2905B.d();
                    }
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        list.add(Long.valueOf(AbstractC2922i.c(d0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(A()));
                    if (R()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (c0() == this.f);
                this.c = i;
                return;
            }
            C2912I c2912i = (C2912I) list;
            int b2 = u0.b(this.f);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw C2905B.d();
                }
                int c02 = this.c + c0();
                while (this.c < c02) {
                    c2912i.k(AbstractC2922i.c(d0()));
                }
                return;
            }
            do {
                c2912i.k(A());
                if (R()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (c0() == this.f);
            this.c = i2;
        }

        @Override // ax.r0.g0
        public void i(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2938z)) {
                int b = u0.b(this.f);
                if (b != 0) {
                    if (b != 2) {
                        throw C2905B.d();
                    }
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(p()));
                    if (R()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (c0() == this.f);
                this.c = i;
                return;
            }
            C2938z c2938z = (C2938z) list;
            int b2 = u0.b(this.f);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw C2905B.d();
                }
                int c02 = this.c + c0();
                while (this.c < c02) {
                    c2938z.i(c0());
                }
                return;
            }
            do {
                c2938z.i(p());
                if (R()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (c0() == this.f);
            this.c = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ax.r0.g0
        public <T> void j(List<T> list, h0<T> h0Var, C2929p c2929p) throws IOException {
            int i;
            if (u0.b(this.f) != 3) {
                throw C2905B.d();
            }
            int i2 = this.f;
            do {
                list.add(U(h0Var, c2929p));
                if (R()) {
                    return;
                } else {
                    i = this.c;
                }
            } while (c0() == i2);
            this.c = i;
        }

        @Override // ax.r0.g0
        public int k() throws IOException {
            h0(5);
            return V();
        }

        @Override // ax.r0.g0
        public int l() {
            return this.f;
        }

        @Override // ax.r0.g0
        public boolean m() throws IOException {
            h0(0);
            return c0() != 0;
        }

        @Override // ax.r0.g0
        public long n() throws IOException {
            h0(1);
            return X();
        }

        @Override // ax.r0.g0
        public void o(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2912I)) {
                int b = u0.b(this.f);
                if (b == 0) {
                    do {
                        list.add(Long.valueOf(d()));
                        if (R()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (c0() == this.f);
                    this.c = i;
                    return;
                }
                if (b != 2) {
                    throw C2905B.d();
                }
                int c0 = this.c + c0();
                while (this.c < c0) {
                    list.add(Long.valueOf(d0()));
                }
                g0(c0);
                return;
            }
            C2912I c2912i = (C2912I) list;
            int b2 = u0.b(this.f);
            if (b2 == 0) {
                do {
                    c2912i.k(d());
                    if (R()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            if (b2 != 2) {
                throw C2905B.d();
            }
            int c02 = this.c + c0();
            while (this.c < c02) {
                c2912i.k(d0());
            }
            g0(c02);
        }

        @Override // ax.r0.g0
        public int p() throws IOException {
            h0(0);
            return c0();
        }

        @Override // ax.r0.g0
        public <T> T q(Class<T> cls, C2929p c2929p) throws IOException {
            h0(3);
            return (T) U(d0.a().d(cls), c2929p);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ax.r0.g0
        public <T> void r(List<T> list, h0<T> h0Var, C2929p c2929p) throws IOException {
            int i;
            if (u0.b(this.f) != 2) {
                throw C2905B.d();
            }
            int i2 = this.f;
            do {
                list.add(Z(h0Var, c2929p));
                if (R()) {
                    return;
                } else {
                    i = this.c;
                }
            } while (c0() == i2);
            this.c = i;
        }

        @Override // ax.r0.g0
        public double readDouble() throws IOException {
            h0(1);
            return Double.longBitsToDouble(X());
        }

        @Override // ax.r0.g0
        public float readFloat() throws IOException {
            h0(5);
            return Float.intBitsToFloat(V());
        }

        @Override // ax.r0.g0
        public void s(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2912I)) {
                int b = u0.b(this.f);
                if (b == 0) {
                    do {
                        list.add(Long.valueOf(N()));
                        if (R()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (c0() == this.f);
                    this.c = i;
                    return;
                }
                if (b != 2) {
                    throw C2905B.d();
                }
                int c0 = this.c + c0();
                while (this.c < c0) {
                    list.add(Long.valueOf(d0()));
                }
                g0(c0);
                return;
            }
            C2912I c2912i = (C2912I) list;
            int b2 = u0.b(this.f);
            if (b2 == 0) {
                do {
                    c2912i.k(N());
                    if (R()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            if (b2 != 2) {
                throw C2905B.d();
            }
            int c02 = this.c + c0();
            while (this.c < c02) {
                c2912i.k(d0());
            }
            g0(c02);
        }

        @Override // ax.r0.g0
        public void t(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2912I)) {
                int b = u0.b(this.f);
                if (b == 1) {
                    do {
                        list.add(Long.valueOf(n()));
                        if (R()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (c0() == this.f);
                    this.c = i;
                    return;
                }
                if (b != 2) {
                    throw C2905B.d();
                }
                int c0 = c0();
                n0(c0);
                int i3 = this.c + c0;
                while (this.c < i3) {
                    list.add(Long.valueOf(Y()));
                }
                return;
            }
            C2912I c2912i = (C2912I) list;
            int b2 = u0.b(this.f);
            if (b2 == 1) {
                do {
                    c2912i.k(n());
                    if (R()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            if (b2 != 2) {
                throw C2905B.d();
            }
            int c02 = c0();
            n0(c02);
            int i4 = this.c + c02;
            while (this.c < i4) {
                c2912i.k(Y());
            }
        }

        @Override // ax.r0.g0
        public void u(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2938z)) {
                int b = u0.b(this.f);
                if (b == 0) {
                    do {
                        list.add(Integer.valueOf(I()));
                        if (R()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (c0() == this.f);
                    this.c = i;
                    return;
                }
                if (b != 2) {
                    throw C2905B.d();
                }
                int c0 = this.c + c0();
                while (this.c < c0) {
                    list.add(Integer.valueOf(c0()));
                }
                g0(c0);
                return;
            }
            C2938z c2938z = (C2938z) list;
            int b2 = u0.b(this.f);
            if (b2 == 0) {
                do {
                    c2938z.i(I());
                    if (R()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            if (b2 != 2) {
                throw C2905B.d();
            }
            int c02 = this.c + c0();
            while (this.c < c02) {
                c2938z.i(c0());
            }
            g0(c02);
        }

        @Override // ax.r0.g0
        public void v(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2938z)) {
                int b = u0.b(this.f);
                if (b != 0) {
                    if (b != 2) {
                        throw C2905B.d();
                    }
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(w()));
                    if (R()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (c0() == this.f);
                this.c = i;
                return;
            }
            C2938z c2938z = (C2938z) list;
            int b2 = u0.b(this.f);
            if (b2 != 0) {
                if (b2 != 2) {
                    throw C2905B.d();
                }
                int c02 = this.c + c0();
                while (this.c < c02) {
                    c2938z.i(c0());
                }
                return;
            }
            do {
                c2938z.i(w());
                if (R()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (c0() == this.f);
            this.c = i2;
        }

        @Override // ax.r0.g0
        public int w() throws IOException {
            h0(0);
            return c0();
        }

        @Override // ax.r0.g0
        public <T> T x(Class<T> cls, C2929p c2929p) throws IOException {
            h0(2);
            return (T) Z(d0.a().d(cls), c2929p);
        }

        @Override // ax.r0.g0
        public void y(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof C2938z)) {
                int b = u0.b(this.f);
                if (b == 2) {
                    int c0 = c0();
                    m0(c0);
                    int i3 = this.c + c0;
                    while (this.c < i3) {
                        list.add(Integer.valueOf(W()));
                    }
                    return;
                }
                if (b != 5) {
                    throw C2905B.d();
                }
                do {
                    list.add(Integer.valueOf(k()));
                    if (R()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (c0() == this.f);
                this.c = i;
                return;
            }
            C2938z c2938z = (C2938z) list;
            int b2 = u0.b(this.f);
            if (b2 == 2) {
                int c02 = c0();
                m0(c02);
                int i4 = this.c + c02;
                while (this.c < i4) {
                    c2938z.i(W());
                }
                return;
            }
            if (b2 != 5) {
                throw C2905B.d();
            }
            do {
                c2938z.i(k());
                if (R()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (c0() == this.f);
            this.c = i2;
        }

        @Override // ax.r0.g0
        public int z() throws IOException {
            h0(0);
            return AbstractC2922i.b(c0());
        }
    }

    /* synthetic */ AbstractC2918e(a aVar) {
        this();
    }

    public static AbstractC2918e Q(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private AbstractC2918e() {
    }
}
