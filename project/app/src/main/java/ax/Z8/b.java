/*
 * Decompiled with CFR 0.152.
 */
package ax.Z8;

import ax.Z8.a;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

public abstract class b {
    private static final byte[] a = new byte[]{0, 0};
    public static final b b = new c();
    public static final b c = new b();

    public abstract <T extends a<T>> long a(a<T> var1) throws a.b;

    public abstract <T extends a<T>> String b(a<T> var1) throws a.b;

    <T extends a<T>> String c(a<T> a8, Charset charset) throws a.b {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[2];
        a8.E(byArray);
        while (byArray[0] != 0 || byArray[1] != 0) {
            byteArrayOutputStream.write(byArray, 0, 2);
            a8.E(byArray);
        }
        return new String(byteArrayOutputStream.toByteArray(), charset);
    }

    public abstract <T extends a<T>> int d(a<T> var1) throws a.b;

    public abstract <T extends a<T>> int e(a<T> var1) throws a.b;

    public abstract <T extends a<T>> long f(a<T> var1) throws a.b;

    public abstract <T extends a<T>> long g(a<T> var1) throws a.b;

    public abstract <T extends a<T>> String h(a<T> var1, int var2) throws a.b;

    <T extends a<T>> String i(a<T> a8, int n8, Charset charset) throws a.b {
        byte[] byArray = new byte[n8 * 2];
        a8.E(byArray);
        return new String(byArray, charset);
    }

    public abstract <T extends a<T>> void j(a<T> var1, long var2);

    <T extends a<T>> void k(a<T> a8, String string) {
        this.o(a8, string);
        a8.o(a);
    }

    public abstract <T extends a<T>> void l(a<T> var1, int var2);

    public abstract <T extends a<T>> void m(a<T> var1, long var2);

    public abstract <T extends a<T>> void n(a<T> var1, long var2);

    public abstract <T extends a<T>> void o(a<T> var1, String var2);

    private static class b
    extends b {
        private b() {
        }

        @Override
        public <T extends a<T>> long a(a<T> object) throws a.b {
            object = ((a)object).G(8);
            long l8 = 0L;
            for (int i8 = 0; i8 < 8; ++i8) {
                l8 = l8 << 8 | (long)(object[i8] & 0xFF);
            }
            return l8;
        }

        @Override
        public <T extends a<T>> String b(a<T> a8) throws a.b {
            return this.c(a8, ax.Y8.b.b);
        }

        @Override
        public <T extends a<T>> int d(a<T> object) throws a.b {
            object = ((a)object).G(2);
            Object object2 = object[0];
            return object[1] & 0xFF | object2 << 8 & 0xFF00;
        }

        @Override
        public <T extends a<T>> int e(a<T> object) throws a.b {
            object = ((a)object).G(3);
            Object object2 = object[0];
            Object object3 = object[1];
            return object[2] & 0xFF | (object2 << 16 & 0xFF0000 | object3 << 8 & 0xFF00);
        }

        @Override
        public <T extends a<T>> long f(a<T> object) throws a.b {
            object = ((a)object).G(4);
            return (long)(object[0] << 24) & 0xFF000000L | (long)(object[1] << 16) & 0xFF0000L | (long)(object[2] << 8) & 0xFF00L | (long)object[3] & 0xFFL;
        }

        @Override
        public <T extends a<T>> long g(a<T> object) throws a.b {
            long l8 = (this.f((a<T>)object) << 32) + (this.f((a<T>)object) & 0xFFFFFFFFL);
            if (l8 >= 0L) {
                return l8;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot handle bigendian values : ");
            ((StringBuilder)object).append(Long.toHexString(l8));
            throw new a.b(((StringBuilder)object).toString());
        }

        @Override
        public <T extends a<T>> String h(a<T> a8, int n8) throws a.b {
            return this.i(a8, n8, ax.Y8.b.b);
        }

        @Override
        public <T extends a<T>> void j(a<T> a8, long l8) {
            a8.o(new byte[]{(byte)(l8 >> 56), (byte)(l8 >> 48), (byte)(l8 >> 40), (byte)(l8 >> 32), (byte)(l8 >> 24), (byte)(l8 >> 16), (byte)(l8 >> 8), (byte)l8});
        }

        @Override
        public <T extends a<T>> void l(a<T> object, int n8) {
            if (n8 >= 0 && n8 <= 65535) {
                ((a)object).o(new byte[]{(byte)(n8 >> 8), (byte)n8});
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid uint16 value: ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        @Override
        public <T extends a<T>> void m(a<T> object, long l8) {
            if (l8 >= 0L && l8 <= 0xFFFFFFFFL) {
                ((a)object).o(new byte[]{(byte)(l8 >> 24), (byte)(l8 >> 16), (byte)(l8 >> 8), (byte)l8});
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid uint32 value: ");
            ((StringBuilder)object).append(l8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        @Override
        public <T extends a<T>> void n(a<T> object, long l8) {
            if (l8 >= 0L) {
                this.j((a<T>)object, l8);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid uint64 value: ");
            ((StringBuilder)object).append(l8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        @Override
        public <T extends a<T>> void o(a<T> a8, String string) {
            a8.o(string.getBytes(ax.Y8.b.b));
        }

        public String toString() {
            return "big endian";
        }
    }

    private static class c
    extends b {
        private c() {
        }

        @Override
        public <T extends a<T>> long a(a<T> object) throws a.b {
            object = ((a)object).G(8);
            long l8 = 0L;
            for (int i8 = 7; i8 >= 0; --i8) {
                l8 = l8 << 8 | (long)(object[i8] & 0xFF);
            }
            return l8;
        }

        @Override
        public <T extends a<T>> String b(a<T> a8) throws a.b {
            return this.c(a8, ax.Y8.b.c);
        }

        @Override
        public <T extends a<T>> int d(a<T> object) throws a.b {
            object = ((a)object).G(2);
            Object object2 = object[0];
            return object[1] << 8 & 0xFF00 | object2 & 0xFF;
        }

        @Override
        public <T extends a<T>> int e(a<T> object) throws a.b {
            object = ((a)object).G(3);
            Object object2 = object[0];
            Object object3 = object[1];
            return object[2] << 16 & 0xFF0000 | (object2 & 0xFF | object3 << 8 & 0xFF00);
        }

        @Override
        public <T extends a<T>> long f(a<T> object) throws a.b {
            object = ((a)object).G(4);
            return (long)object[0] & 0xFFL | (long)(object[1] << 8) & 0xFF00L | (long)(object[2] << 16) & 0xFF0000L | (long)(object[3] << 24) & 0xFF000000L;
        }

        @Override
        public <T extends a<T>> long g(a<T> object) throws a.b {
            long l8 = (this.f((a<T>)object) & 0xFFFFFFFFL) + (this.f((a<T>)object) << 32);
            if (l8 >= 0L) {
                return l8;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot handle little endian values : ");
            ((StringBuilder)object).append(Long.toHexString(l8));
            throw new a.b(((StringBuilder)object).toString());
        }

        @Override
        public <T extends a<T>> String h(a<T> a8, int n8) throws a.b {
            return this.i(a8, n8, ax.Y8.b.c);
        }

        @Override
        public <T extends a<T>> void j(a<T> a8, long l8) {
            a8.o(new byte[]{(byte)l8, (byte)(l8 >> 8), (byte)(l8 >> 16), (byte)(l8 >> 24), (byte)(l8 >> 32), (byte)(l8 >> 40), (byte)(l8 >> 48), (byte)(l8 >> 56)});
        }

        @Override
        public <T extends a<T>> void l(a<T> object, int n8) {
            if (n8 >= 0 && n8 <= 65535) {
                ((a)object).o(new byte[]{(byte)n8, (byte)(n8 >> 8)});
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid uint16 value: ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        @Override
        public <T extends a<T>> void m(a<T> object, long l8) {
            if (l8 >= 0L && l8 <= 0xFFFFFFFFL) {
                ((a)object).o(new byte[]{(byte)l8, (byte)(l8 >> 8), (byte)(l8 >> 16), (byte)(l8 >> 24)});
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid uint32 value: ");
            ((StringBuilder)object).append(l8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        @Override
        public <T extends a<T>> void n(a<T> object, long l8) {
            if (l8 >= 0L) {
                this.j((a<T>)object, l8);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid uint64 value: ");
            ((StringBuilder)object).append(l8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        @Override
        public <T extends a<T>> void o(a<T> a8, String string) {
            a8.o(string.getBytes(ax.Y8.b.c));
        }

        public String toString() {
            return "little endian";
        }
    }
}

