package ax.Z8;

import ax.Z8.a;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class b {
    private static final byte[] a = {0, 0};
    public static final b b;
    public static final b c;

    /* renamed from: ax.Z8.b$b, reason: collision with other inner class name */
    private static class C0233b extends b {
        private C0233b() {
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> long a(ax.Z8.a<T> aVar) throws a.b {
            byte[] G = aVar.G(8);
            long j = 0;
            for (int i = 0; i < 8; i++) {
                j = (j << 8) | (G[i] & 255);
            }
            return j;
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> String b(ax.Z8.a<T> aVar) throws a.b {
            return c(aVar, ax.Y8.b.b);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> int d(ax.Z8.a<T> aVar) throws a.b {
            byte[] G = aVar.G(2);
            return (G[1] & 255) | ((G[0] << 8) & 65280);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> int e(ax.Z8.a<T> aVar) throws a.b {
            byte[] G = aVar.G(3);
            return (G[2] & 255) | ((G[0] << 16) & 16711680) | ((G[1] << 8) & 65280);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> long f(ax.Z8.a<T> aVar) throws a.b {
            byte[] G = aVar.G(4);
            return ((G[0] << 24) & 4278190080L) | ((G[1] << 16) & 16711680) | ((G[2] << 8) & 65280) | (G[3] & 255);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> long g(ax.Z8.a<T> aVar) throws a.b {
            long f = (f(aVar) << 32) + (f(aVar) & 4294967295L);
            if (f >= 0) {
                return f;
            }
            throw new a.b("Cannot handle bigendian values : " + Long.toHexString(f));
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> String h(ax.Z8.a<T> aVar, int i) throws a.b {
            return i(aVar, i, ax.Y8.b.b);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> void j(ax.Z8.a<T> aVar, long j) {
            aVar.o(new byte[]{(byte) (j >> 56), (byte) (j >> 48), (byte) (j >> 40), (byte) (j >> 32), (byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> void l(ax.Z8.a<T> aVar, int i) {
            if (i >= 0 && i <= 65535) {
                aVar.o(new byte[]{(byte) (i >> 8), (byte) i});
                return;
            }
            throw new IllegalArgumentException("Invalid uint16 value: " + i);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> void m(ax.Z8.a<T> aVar, long j) {
            if (j >= 0 && j <= 4294967295L) {
                aVar.o(new byte[]{(byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
                return;
            }
            throw new IllegalArgumentException("Invalid uint32 value: " + j);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> void n(ax.Z8.a<T> aVar, long j) {
            if (j >= 0) {
                j(aVar, j);
                return;
            }
            throw new IllegalArgumentException("Invalid uint64 value: " + j);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> void o(ax.Z8.a<T> aVar, String str) {
            aVar.o(str.getBytes(ax.Y8.b.b));
        }

        public String toString() {
            return "big endian";
        }
    }

    private static class c extends b {
        private c() {
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> long a(ax.Z8.a<T> aVar) throws a.b {
            byte[] G = aVar.G(8);
            long j = 0;
            for (int i = 7; i >= 0; i--) {
                j = (j << 8) | (G[i] & 255);
            }
            return j;
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> String b(ax.Z8.a<T> aVar) throws a.b {
            return c(aVar, ax.Y8.b.c);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> int d(ax.Z8.a<T> aVar) throws a.b {
            byte[] G = aVar.G(2);
            return ((G[1] << 8) & 65280) | (G[0] & 255);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> int e(ax.Z8.a<T> aVar) throws a.b {
            byte[] G = aVar.G(3);
            return ((G[2] << 16) & 16711680) | (G[0] & 255) | ((G[1] << 8) & 65280);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> long f(ax.Z8.a<T> aVar) throws a.b {
            byte[] G = aVar.G(4);
            return (G[0] & 255) | ((G[1] << 8) & 65280) | ((G[2] << 16) & 16711680) | ((G[3] << 24) & 4278190080L);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> long g(ax.Z8.a<T> aVar) throws a.b {
            long f = (f(aVar) & 4294967295L) + (f(aVar) << 32);
            if (f >= 0) {
                return f;
            }
            throw new a.b("Cannot handle little endian values : " + Long.toHexString(f));
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> String h(ax.Z8.a<T> aVar, int i) throws a.b {
            return i(aVar, i, ax.Y8.b.c);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> void j(ax.Z8.a<T> aVar, long j) {
            aVar.o(new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)});
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> void l(ax.Z8.a<T> aVar, int i) {
            if (i >= 0 && i <= 65535) {
                aVar.o(new byte[]{(byte) i, (byte) (i >> 8)});
                return;
            }
            throw new IllegalArgumentException("Invalid uint16 value: " + i);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> void m(ax.Z8.a<T> aVar, long j) {
            if (j >= 0 && j <= 4294967295L) {
                aVar.o(new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24)});
                return;
            }
            throw new IllegalArgumentException("Invalid uint32 value: " + j);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> void n(ax.Z8.a<T> aVar, long j) {
            if (j >= 0) {
                j(aVar, j);
                return;
            }
            throw new IllegalArgumentException("Invalid uint64 value: " + j);
        }

        @Override // ax.Z8.b
        public <T extends ax.Z8.a<T>> void o(ax.Z8.a<T> aVar, String str) {
            aVar.o(str.getBytes(ax.Y8.b.c));
        }

        public String toString() {
            return "little endian";
        }
    }

    static {
        b = new c();
        c = new C0233b();
    }

    public abstract <T extends ax.Z8.a<T>> long a(ax.Z8.a<T> aVar) throws a.b;

    public abstract <T extends ax.Z8.a<T>> String b(ax.Z8.a<T> aVar) throws a.b;

    <T extends ax.Z8.a<T>> String c(ax.Z8.a<T> aVar, Charset charset) throws a.b {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2];
        aVar.E(bArr);
        while (true) {
            if (bArr[0] == 0 && bArr[1] == 0) {
                return new String(byteArrayOutputStream.toByteArray(), charset);
            }
            byteArrayOutputStream.write(bArr, 0, 2);
            aVar.E(bArr);
        }
    }

    public abstract <T extends ax.Z8.a<T>> int d(ax.Z8.a<T> aVar) throws a.b;

    public abstract <T extends ax.Z8.a<T>> int e(ax.Z8.a<T> aVar) throws a.b;

    public abstract <T extends ax.Z8.a<T>> long f(ax.Z8.a<T> aVar) throws a.b;

    public abstract <T extends ax.Z8.a<T>> long g(ax.Z8.a<T> aVar) throws a.b;

    public abstract <T extends ax.Z8.a<T>> String h(ax.Z8.a<T> aVar, int i) throws a.b;

    <T extends ax.Z8.a<T>> String i(ax.Z8.a<T> aVar, int i, Charset charset) throws a.b {
        byte[] bArr = new byte[i * 2];
        aVar.E(bArr);
        return new String(bArr, charset);
    }

    public abstract <T extends ax.Z8.a<T>> void j(ax.Z8.a<T> aVar, long j);

    <T extends ax.Z8.a<T>> void k(ax.Z8.a<T> aVar, String str) {
        o(aVar, str);
        aVar.o(a);
    }

    public abstract <T extends ax.Z8.a<T>> void l(ax.Z8.a<T> aVar, int i);

    public abstract <T extends ax.Z8.a<T>> void m(ax.Z8.a<T> aVar, long j);

    public abstract <T extends ax.Z8.a<T>> void n(ax.Z8.a<T> aVar, long j);

    public abstract <T extends ax.Z8.a<T>> void o(ax.Z8.a<T> aVar, String str);
}
