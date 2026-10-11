package ax.r0;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.r0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2922i {
    int a;
    int b;
    int c;
    C2923j d;
    private boolean e;

    /* renamed from: ax.r0.i$b */
    private static final class b extends AbstractC2922i {
        private final byte[] f;
        private final boolean g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;
        private int n;

        private void M() {
            int i = this.h + this.i;
            this.h = i;
            int i2 = i - this.k;
            int i3 = this.n;
            if (i2 <= i3) {
                this.i = 0;
                return;
            }
            int i4 = i2 - i3;
            this.i = i4;
            this.h = i - i4;
        }

        private void P() throws IOException {
            if (this.h - this.j >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f;
                int i2 = this.j;
                this.j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw C2905B.e();
        }

        private void R() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw C2905B.e();
        }

        @Override // ax.r0.AbstractC2922i
        public String A() throws IOException {
            int J = J();
            if (J > 0) {
                int i = this.h;
                int i2 = this.j;
                if (J <= i - i2) {
                    String e = t0.e(this.f, i2, J);
                    this.j += J;
                    return e;
                }
            }
            if (J == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (J <= 0) {
                throw C2905B.f();
            }
            throw C2905B.k();
        }

        @Override // ax.r0.AbstractC2922i
        public int B() throws IOException {
            if (e()) {
                this.l = 0;
                return 0;
            }
            int J = J();
            this.l = J;
            if (u0.a(J) != 0) {
                return this.l;
            }
            throw C2905B.b();
        }

        @Override // ax.r0.AbstractC2922i
        public int C() throws IOException {
            return J();
        }

        @Override // ax.r0.AbstractC2922i
        public long D() throws IOException {
            return K();
        }

        @Override // ax.r0.AbstractC2922i
        public boolean E(int i) throws IOException {
            int b = u0.b(i);
            if (b == 0) {
                P();
                return true;
            }
            if (b == 1) {
                O(8);
                return true;
            }
            if (b == 2) {
                O(J());
                return true;
            }
            if (b == 3) {
                N();
                a(u0.c(u0.a(i), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b != 5) {
                throw C2905B.d();
            }
            O(4);
            return true;
        }

        public byte F() throws IOException {
            int i = this.j;
            if (i == this.h) {
                throw C2905B.k();
            }
            byte[] bArr = this.f;
            this.j = i + 1;
            return bArr[i];
        }

        public byte[] G(int i) throws IOException {
            if (i > 0) {
                int i2 = this.h;
                int i3 = this.j;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.j = i4;
                    return Arrays.copyOfRange(this.f, i3, i4);
                }
            }
            if (i > 0) {
                throw C2905B.k();
            }
            if (i == 0) {
                return C2904A.c;
            }
            throw C2905B.f();
        }

        public int H() throws IOException {
            int i = this.j;
            if (this.h - i < 4) {
                throw C2905B.k();
            }
            byte[] bArr = this.f;
            this.j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long I() throws IOException {
            int i = this.j;
            if (this.h - i < 8) {
                throw C2905B.k();
            }
            byte[] bArr = this.f;
            this.j = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public int J() throws IOException {
            int i;
            int i2 = this.j;
            int i3 = this.h;
            if (i3 != i2) {
                byte[] bArr = this.f;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.j = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
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
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
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
                    this.j = i5;
                    return i;
                }
            }
            return (int) L();
        }

        public long K() throws IOException {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.j;
            int i2 = this.h;
            if (i2 != i) {
                byte[] bArr = this.f;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.j = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
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
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
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
                    this.j = i4;
                    return j;
                }
            }
            return L();
        }

        long L() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((F() & 128) == 0) {
                    return j;
                }
            }
            throw C2905B.e();
        }

        public void N() throws IOException {
            int B;
            do {
                B = B();
                if (B == 0) {
                    return;
                }
            } while (E(B));
        }

        public void O(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.h;
                int i3 = this.j;
                if (i <= i2 - i3) {
                    this.j = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw C2905B.k();
            }
            throw C2905B.f();
        }

        @Override // ax.r0.AbstractC2922i
        public void a(int i) throws C2905B {
            if (this.l != i) {
                throw C2905B.a();
            }
        }

        @Override // ax.r0.AbstractC2922i
        public int d() {
            return this.j - this.k;
        }

        @Override // ax.r0.AbstractC2922i
        public boolean e() throws IOException {
            return this.j == this.h;
        }

        @Override // ax.r0.AbstractC2922i
        public void k(int i) {
            this.n = i;
            M();
        }

        @Override // ax.r0.AbstractC2922i
        public int l(int i) throws C2905B {
            if (i < 0) {
                throw C2905B.f();
            }
            int d = i + d();
            int i2 = this.n;
            if (d > i2) {
                throw C2905B.k();
            }
            this.n = d;
            M();
            return i2;
        }

        @Override // ax.r0.AbstractC2922i
        public boolean m() throws IOException {
            return K() != 0;
        }

        @Override // ax.r0.AbstractC2922i
        public AbstractC2921h n() throws IOException {
            int J = J();
            if (J > 0) {
                int i = this.h;
                int i2 = this.j;
                if (J <= i - i2) {
                    AbstractC2921h G = (this.g && this.m) ? AbstractC2921h.G(this.f, i2, J) : AbstractC2921h.l(this.f, i2, J);
                    this.j += J;
                    return G;
                }
            }
            return J == 0 ? AbstractC2921h.c0 : AbstractC2921h.E(G(J));
        }

        @Override // ax.r0.AbstractC2922i
        public double o() throws IOException {
            return Double.longBitsToDouble(I());
        }

        @Override // ax.r0.AbstractC2922i
        public int p() throws IOException {
            return J();
        }

        @Override // ax.r0.AbstractC2922i
        public int q() throws IOException {
            return H();
        }

        @Override // ax.r0.AbstractC2922i
        public long r() throws IOException {
            return I();
        }

        @Override // ax.r0.AbstractC2922i
        public float s() throws IOException {
            return Float.intBitsToFloat(H());
        }

        @Override // ax.r0.AbstractC2922i
        public int t() throws IOException {
            return J();
        }

        @Override // ax.r0.AbstractC2922i
        public long u() throws IOException {
            return K();
        }

        @Override // ax.r0.AbstractC2922i
        public int v() throws IOException {
            return H();
        }

        @Override // ax.r0.AbstractC2922i
        public long w() throws IOException {
            return I();
        }

        @Override // ax.r0.AbstractC2922i
        public int x() throws IOException {
            return AbstractC2922i.b(J());
        }

        @Override // ax.r0.AbstractC2922i
        public long y() throws IOException {
            return AbstractC2922i.c(K());
        }

        @Override // ax.r0.AbstractC2922i
        public String z() throws IOException {
            int J = J();
            if (J > 0) {
                int i = this.h;
                int i2 = this.j;
                if (J <= i - i2) {
                    String str = new String(this.f, i2, J, C2904A.a);
                    this.j += J;
                    return str;
                }
            }
            if (J == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (J < 0) {
                throw C2905B.f();
            }
            throw C2905B.k();
        }

        private b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.n = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.f = bArr;
            this.h = i2 + i;
            this.j = i;
            this.k = i;
            this.g = z;
        }
    }

    /* renamed from: ax.r0.i$c */
    private static final class c extends AbstractC2922i {
        private final InputStream f;
        private final byte[] g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;

        private AbstractC2921h F(int i) throws IOException {
            byte[] I = I(i);
            if (I != null) {
                return AbstractC2921h.k(I);
            }
            int i2 = this.j;
            int i3 = this.h;
            int i4 = i3 - i2;
            this.l += i3;
            this.j = 0;
            this.h = 0;
            List<byte[]> J = J(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, i2, bArr, 0, i4);
            for (byte[] bArr2 : J) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return AbstractC2921h.E(bArr);
        }

        private byte[] H(int i, boolean z) throws IOException {
            byte[] I = I(i);
            if (I != null) {
                return z ? (byte[]) I.clone() : I;
            }
            int i2 = this.j;
            int i3 = this.h;
            int i4 = i3 - i2;
            this.l += i3;
            this.j = 0;
            this.h = 0;
            List<byte[]> J = J(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, i2, bArr, 0, i4);
            for (byte[] bArr2 : J) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        private byte[] I(int i) throws IOException {
            if (i == 0) {
                return C2904A.c;
            }
            if (i < 0) {
                throw C2905B.f();
            }
            int i2 = this.l;
            int i3 = this.j;
            int i4 = i2 + i3 + i;
            if (i4 - this.c > 0) {
                throw C2905B.j();
            }
            int i5 = this.m;
            if (i4 > i5) {
                S((i5 - i2) - i3);
                throw C2905B.k();
            }
            int i6 = this.h - i3;
            int i7 = i - i6;
            if (i7 >= 4096 && i7 > this.f.available()) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, this.j, bArr, 0, i6);
            this.l += this.h;
            this.j = 0;
            this.h = 0;
            while (i6 < i) {
                int read = this.f.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw C2905B.k();
                }
                this.l += read;
                i6 += read;
            }
            return bArr;
        }

        private List<byte[]> J(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw C2905B.k();
                    }
                    this.l += read;
                    i2 += read;
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void P() {
            int i = this.h + this.i;
            this.h = i;
            int i2 = this.l + i;
            int i3 = this.m;
            if (i2 <= i3) {
                this.i = 0;
                return;
            }
            int i4 = i2 - i3;
            this.i = i4;
            this.h = i - i4;
        }

        private void Q(int i) throws IOException {
            if (X(i)) {
                return;
            }
            if (i <= (this.c - this.l) - this.j) {
                throw C2905B.k();
            }
            throw C2905B.j();
        }

        private void T(int i) throws IOException {
            if (i < 0) {
                throw C2905B.f();
            }
            int i2 = this.l;
            int i3 = this.j;
            int i4 = i2 + i3 + i;
            int i5 = this.m;
            if (i4 > i5) {
                S((i5 - i2) - i3);
                throw C2905B.k();
            }
            this.l = i2 + i3;
            int i6 = this.h - i3;
            this.h = 0;
            this.j = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long skip = this.f.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(this.f.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i6 += (int) skip;
                    }
                } finally {
                    this.l += i6;
                    P();
                }
            }
            if (i6 >= i) {
                return;
            }
            int i7 = this.h;
            int i8 = i7 - this.j;
            this.j = i7;
            Q(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.h;
                if (i9 <= i10) {
                    this.j = i9;
                    return;
                } else {
                    i8 += i10;
                    this.j = i10;
                    Q(1);
                }
            }
        }

        private void U() throws IOException {
            if (this.h - this.j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.g;
                int i2 = this.j;
                this.j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw C2905B.e();
        }

        private void W() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (G() >= 0) {
                    return;
                }
            }
            throw C2905B.e();
        }

        private boolean X(int i) throws IOException {
            int i2 = this.j;
            int i3 = i2 + i;
            int i4 = this.h;
            if (i3 <= i4) {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
            int i5 = this.c;
            int i6 = this.l;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.m) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.g;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.l += i2;
                this.h -= i2;
                this.j = 0;
            }
            InputStream inputStream = this.f;
            byte[] bArr2 = this.g;
            int i7 = this.h;
            int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.c - this.l) - i7));
            if (read == 0 || read < -1 || read > this.g.length) {
                throw new IllegalStateException(this.f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.h += read;
            P();
            if (this.h >= i) {
                return true;
            }
            return X(i);
        }

        @Override // ax.r0.AbstractC2922i
        public String A() throws IOException {
            byte[] H;
            int M = M();
            int i = this.j;
            int i2 = this.h;
            if (M <= i2 - i && M > 0) {
                H = this.g;
                this.j = i + M;
            } else {
                if (M == 0) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                i = 0;
                if (M <= i2) {
                    Q(M);
                    H = this.g;
                    this.j = M;
                } else {
                    H = H(M, false);
                }
            }
            return t0.e(H, i, M);
        }

        @Override // ax.r0.AbstractC2922i
        public int B() throws IOException {
            if (e()) {
                this.k = 0;
                return 0;
            }
            int M = M();
            this.k = M;
            if (u0.a(M) != 0) {
                return this.k;
            }
            throw C2905B.b();
        }

        @Override // ax.r0.AbstractC2922i
        public int C() throws IOException {
            return M();
        }

        @Override // ax.r0.AbstractC2922i
        public long D() throws IOException {
            return N();
        }

        @Override // ax.r0.AbstractC2922i
        public boolean E(int i) throws IOException {
            int b = u0.b(i);
            if (b == 0) {
                U();
                return true;
            }
            if (b == 1) {
                S(8);
                return true;
            }
            if (b == 2) {
                S(M());
                return true;
            }
            if (b == 3) {
                R();
                a(u0.c(u0.a(i), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b != 5) {
                throw C2905B.d();
            }
            S(4);
            return true;
        }

        public byte G() throws IOException {
            if (this.j == this.h) {
                Q(1);
            }
            byte[] bArr = this.g;
            int i = this.j;
            this.j = i + 1;
            return bArr[i];
        }

        public int K() throws IOException {
            int i = this.j;
            if (this.h - i < 4) {
                Q(4);
                i = this.j;
            }
            byte[] bArr = this.g;
            this.j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long L() throws IOException {
            int i = this.j;
            if (this.h - i < 8) {
                Q(8);
                i = this.j;
            }
            byte[] bArr = this.g;
            this.j = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public int M() throws IOException {
            int i;
            int i2 = this.j;
            int i3 = this.h;
            if (i3 != i2) {
                byte[] bArr = this.g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.j = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
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
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
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
                    this.j = i5;
                    return i;
                }
            }
            return (int) O();
        }

        public long N() throws IOException {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.j;
            int i2 = this.h;
            if (i2 != i) {
                byte[] bArr = this.g;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.j = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
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
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
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
                    this.j = i4;
                    return j;
                }
            }
            return O();
        }

        long O() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((G() & 128) == 0) {
                    return j;
                }
            }
            throw C2905B.e();
        }

        public void R() throws IOException {
            int B;
            do {
                B = B();
                if (B == 0) {
                    return;
                }
            } while (E(B));
        }

        public void S(int i) throws IOException {
            int i2 = this.h;
            int i3 = this.j;
            if (i > i2 - i3 || i < 0) {
                T(i);
            } else {
                this.j = i3 + i;
            }
        }

        @Override // ax.r0.AbstractC2922i
        public void a(int i) throws C2905B {
            if (this.k != i) {
                throw C2905B.a();
            }
        }

        @Override // ax.r0.AbstractC2922i
        public int d() {
            return this.l + this.j;
        }

        @Override // ax.r0.AbstractC2922i
        public boolean e() throws IOException {
            return this.j == this.h && !X(1);
        }

        @Override // ax.r0.AbstractC2922i
        public void k(int i) {
            this.m = i;
            P();
        }

        @Override // ax.r0.AbstractC2922i
        public int l(int i) throws C2905B {
            if (i < 0) {
                throw C2905B.f();
            }
            int i2 = i + this.l + this.j;
            int i3 = this.m;
            if (i2 > i3) {
                throw C2905B.k();
            }
            this.m = i2;
            P();
            return i3;
        }

        @Override // ax.r0.AbstractC2922i
        public boolean m() throws IOException {
            return N() != 0;
        }

        @Override // ax.r0.AbstractC2922i
        public AbstractC2921h n() throws IOException {
            int M = M();
            int i = this.h;
            int i2 = this.j;
            if (M > i - i2 || M <= 0) {
                return M == 0 ? AbstractC2921h.c0 : F(M);
            }
            AbstractC2921h l = AbstractC2921h.l(this.g, i2, M);
            this.j += M;
            return l;
        }

        @Override // ax.r0.AbstractC2922i
        public double o() throws IOException {
            return Double.longBitsToDouble(L());
        }

        @Override // ax.r0.AbstractC2922i
        public int p() throws IOException {
            return M();
        }

        @Override // ax.r0.AbstractC2922i
        public int q() throws IOException {
            return K();
        }

        @Override // ax.r0.AbstractC2922i
        public long r() throws IOException {
            return L();
        }

        @Override // ax.r0.AbstractC2922i
        public float s() throws IOException {
            return Float.intBitsToFloat(K());
        }

        @Override // ax.r0.AbstractC2922i
        public int t() throws IOException {
            return M();
        }

        @Override // ax.r0.AbstractC2922i
        public long u() throws IOException {
            return N();
        }

        @Override // ax.r0.AbstractC2922i
        public int v() throws IOException {
            return K();
        }

        @Override // ax.r0.AbstractC2922i
        public long w() throws IOException {
            return L();
        }

        @Override // ax.r0.AbstractC2922i
        public int x() throws IOException {
            return AbstractC2922i.b(M());
        }

        @Override // ax.r0.AbstractC2922i
        public long y() throws IOException {
            return AbstractC2922i.c(N());
        }

        @Override // ax.r0.AbstractC2922i
        public String z() throws IOException {
            int M = M();
            if (M > 0) {
                int i = this.h;
                int i2 = this.j;
                if (M <= i - i2) {
                    String str = new String(this.g, i2, M, C2904A.a);
                    this.j += M;
                    return str;
                }
            }
            if (M == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (M > this.h) {
                return new String(H(M, false), C2904A.a);
            }
            Q(M);
            String str2 = new String(this.g, this.j, M, C2904A.a);
            this.j += M;
            return str2;
        }

        private c(InputStream inputStream, int i) {
            super();
            this.m = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            C2904A.b(inputStream, "input");
            this.f = inputStream;
            this.g = new byte[i];
            this.h = 0;
            this.j = 0;
            this.l = 0;
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static AbstractC2922i f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC2922i g(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? h(C2904A.c) : new c(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC2922i h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC2922i i(byte[] bArr, int i, int i2) {
        return j(bArr, i, i2, false);
    }

    static AbstractC2922i j(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.l(i2);
            return bVar;
        } catch (C2905B e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract String A() throws IOException;

    public abstract int B() throws IOException;

    public abstract int C() throws IOException;

    public abstract long D() throws IOException;

    public abstract boolean E(int i) throws IOException;

    public abstract void a(int i) throws C2905B;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void k(int i);

    public abstract int l(int i) throws C2905B;

    public abstract boolean m() throws IOException;

    public abstract AbstractC2921h n() throws IOException;

    public abstract double o() throws IOException;

    public abstract int p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    public abstract float s() throws IOException;

    public abstract int t() throws IOException;

    public abstract long u() throws IOException;

    public abstract int v() throws IOException;

    public abstract long w() throws IOException;

    public abstract int x() throws IOException;

    public abstract long y() throws IOException;

    public abstract String z() throws IOException;

    private AbstractC2922i() {
        this.b = 100;
        this.c = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.e = false;
    }
}
