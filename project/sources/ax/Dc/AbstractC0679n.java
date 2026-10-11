package ax.Dc;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipException;
import okhttp3.internal.http2.Settings;

/* renamed from: ax.Dc.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0679n implements N {
    private byte[] c0;
    private byte[] d0;
    private final W q;

    /* renamed from: ax.Dc.n$a */
    public enum a {
        DES(26113),
        RC2pre52(26114),
        TripleDES168(26115),
        TripleDES192(26121),
        AES128(26126),
        AES192(26127),
        AES256(26128),
        RC2(26370),
        RC4(26625),
        UNKNOWN(Settings.DEFAULT_INITIAL_WINDOW_SIZE);

        private static final Map<Integer, a> m0;
        private final int q;

        static {
            HashMap hashMap = new HashMap();
            for (a aVar : values()) {
                hashMap.put(Integer.valueOf(aVar.h()), aVar);
            }
            m0 = DesugarCollections.unmodifiableMap(hashMap);
        }

        a(int i) {
            this.q = i;
        }

        public static a d(int i) {
            return m0.get(Integer.valueOf(i));
        }

        public int h() {
            return this.q;
        }
    }

    /* renamed from: ax.Dc.n$b */
    public enum b {
        NONE(0),
        CRC32(1),
        MD5(32771),
        SHA1(32772),
        RIPEND160(32775),
        SHA256(32780),
        SHA384(32781),
        SHA512(32782);

        private static final Map<Integer, b> k0;
        private final int q;

        static {
            HashMap hashMap = new HashMap();
            for (b bVar : values()) {
                hashMap.put(Integer.valueOf(bVar.h()), bVar);
            }
            k0 = DesugarCollections.unmodifiableMap(hashMap);
        }

        b(int i) {
            this.q = i;
        }

        public static b d(int i) {
            return k0.get(Integer.valueOf(i));
        }

        public int h() {
            return this.q;
        }
    }

    protected AbstractC0679n(W w) {
        this.q = w;
    }

    protected final void a(int i, int i2) throws ZipException {
        if (i2 >= i) {
            return;
        }
        throw new ZipException(getClass().getName() + " is too short, only " + i2 + " bytes, expected at least " + i);
    }

    @Override // ax.Dc.N
    public W b() {
        return this.q;
    }

    @Override // ax.Dc.N
    public W c() {
        byte[] bArr = this.c0;
        return new W(bArr != null ? bArr.length : 0);
    }

    @Override // ax.Dc.N
    public void d(byte[] bArr, int i, int i2) throws ZipException {
        g(Arrays.copyOfRange(bArr, i, i2 + i));
    }

    public void e(byte[] bArr) {
        this.d0 = Z.c(bArr);
    }

    @Override // ax.Dc.N
    public byte[] f() {
        return Z.c(this.c0);
    }

    public void g(byte[] bArr) {
        this.c0 = Z.c(bArr);
    }

    @Override // ax.Dc.N
    public byte[] h() {
        byte[] bArr = this.d0;
        return bArr != null ? Z.c(bArr) : f();
    }

    @Override // ax.Dc.N
    public W i() {
        return this.d0 != null ? new W(this.d0.length) : c();
    }

    @Override // ax.Dc.N
    public void j(byte[] bArr, int i, int i2) throws ZipException {
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
        e(copyOfRange);
        if (this.c0 == null) {
            g(copyOfRange);
        }
    }
}
