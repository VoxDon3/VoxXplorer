/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import android.util.Log;
import ax.M3.f;
import ax.k4.h;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class g
implements f {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static int d(int n8, int n9) {
        return n8 + 2 + n9 * 12;
    }

    private int e(c object, ax.Q3.b b8) throws IOException {
        int n8 = object.a();
        if (!g.g(n8)) {
            if (Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Parser doesn't handle magic number: ");
                ((StringBuilder)object).append(n8);
                Log.d((String)"DfltImageHeaderParser", (String)((StringBuilder)object).toString());
            }
            return -1;
        }
        n8 = this.i((c)object);
        if (n8 == -1) {
            if (Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) {
                Log.d((String)"DfltImageHeaderParser", (String)"Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] byArray = b8.d(n8, byte[].class);
        try {
            n8 = this.k((c)object, byArray, n8);
            return n8;
        }
        finally {
            b8.c(byArray, byte[].class);
        }
    }

    private f.a f(c c8) throws IOException {
        int n8 = c8.a();
        if (n8 == 65496) {
            return f.a.d0;
        }
        if ((n8 = n8 << 16 & 0xFFFF0000 | c8.a() & 0xFFFF) == -1991225785) {
            c8.skip(21L);
            if (c8.d() >= 3) {
                return f.a.f0;
            }
            return f.a.g0;
        }
        if (n8 >> 8 == 4671814) {
            return f.a.c0;
        }
        if (n8 != 1380533830) {
            return f.a.j0;
        }
        c8.skip(4L);
        if ((c8.a() << 16 & 0xFFFF0000 | c8.a() & 0xFFFF) != 1464156752) {
            return f.a.j0;
        }
        n8 = c8.a() << 16 & 0xFFFF0000 | c8.a() & 0xFFFF;
        if ((n8 & 0xFFFFFF00) != 1448097792) {
            return f.a.j0;
        }
        if ((n8 &= 0xFF) == 88) {
            c8.skip(4L);
            if ((c8.d() & 0x10) != 0) {
                return f.a.h0;
            }
            return f.a.i0;
        }
        if (n8 == 76) {
            c8.skip(4L);
            if ((c8.d() & 8) != 0) {
                return f.a.h0;
            }
            return f.a.i0;
        }
        return f.a.i0;
    }

    private static boolean g(int n8) {
        return (n8 & 0xFFD8) == 65496 || n8 == 19789 || n8 == 18761;
        {
        }
    }

    private boolean h(byte[] byArray, int n8) {
        boolean bl = byArray != null && n8 > a.length;
        if (bl) {
            byte[] byArray2;
            for (n8 = 0; n8 < (byArray2 = a).length; ++n8) {
                if (byArray[n8] == byArray2[n8]) continue;
                return false;
            }
        }
        return bl;
    }

    private int i(c object) throws IOException {
        int n8;
        block7: {
            short s8;
            long l8;
            long l9;
            do {
                if ((s8 = object.c()) != 255) {
                    if (Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Unknown segmentId=");
                        ((StringBuilder)object).append(s8);
                        Log.d((String)"DfltImageHeaderParser", (String)((StringBuilder)object).toString());
                    }
                    return -1;
                }
                s8 = object.c();
                if (s8 == 218) {
                    return -1;
                }
                if (s8 == 217) {
                    if (Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) {
                        Log.d((String)"DfltImageHeaderParser", (String)"Found MARKER_EOI in exif segment");
                    }
                    return -1;
                }
                n8 = object.a() - 2;
                if (s8 == 225) break block7;
            } while ((l9 = object.skip(l8 = (long)n8)) == l8);
            if (Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unable to skip enough data, type: ");
                ((StringBuilder)object).append(s8);
                ((StringBuilder)object).append(", wanted to skip: ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(", but actually skipped: ");
                ((StringBuilder)object).append(l9);
                Log.d((String)"DfltImageHeaderParser", (String)((StringBuilder)object).toString());
            }
            return -1;
        }
        return n8;
    }

    private static int j(b b8) {
        Object object;
        int n8 = b8.a(6);
        if (n8 == 19789) {
            object = ByteOrder.BIG_ENDIAN;
        } else if (n8 == 18761) {
            object = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unknown endianness = ");
                ((StringBuilder)object).append(n8);
                Log.d((String)"DfltImageHeaderParser", (String)((StringBuilder)object).toString());
            }
            object = ByteOrder.BIG_ENDIAN;
        }
        b8.e((ByteOrder)object);
        int n9 = b8.b(10) + 6;
        int n10 = b8.a(n9);
        for (n8 = 0; n8 < n10; ++n8) {
            int n11 = g.d(n9, n8);
            short s8 = b8.a(n11);
            if (s8 != 274) continue;
            int n12 = b8.a(n11 + 2);
            if (n12 >= 1 && n12 <= 12) {
                int n13 = b8.b(n11 + 4);
                if (n13 < 0) {
                    if (!Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) continue;
                    Log.d((String)"DfltImageHeaderParser", (String)"Negative tiff component count");
                    continue;
                }
                if (Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Got tagIndex=");
                    ((StringBuilder)object).append(n8);
                    ((StringBuilder)object).append(" tagType=");
                    ((StringBuilder)object).append(s8);
                    ((StringBuilder)object).append(" formatCode=");
                    ((StringBuilder)object).append(n12);
                    ((StringBuilder)object).append(" componentCount=");
                    ((StringBuilder)object).append(n13);
                    Log.d((String)"DfltImageHeaderParser", (String)((StringBuilder)object).toString());
                }
                if ((n13 += b[n12]) > 4) {
                    if (!Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) continue;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Got byte count > 4, not orientation, continuing, formatCode=");
                    ((StringBuilder)object).append(n12);
                    Log.d((String)"DfltImageHeaderParser", (String)((StringBuilder)object).toString());
                    continue;
                }
                n12 = n11 + 8;
                if (n12 >= 0 && n12 <= b8.d()) {
                    if (n13 >= 0 && n13 + n12 <= b8.d()) {
                        return b8.a(n12);
                    }
                    if (!Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) continue;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Illegal number of bytes for TI tag data tagType=");
                    ((StringBuilder)object).append(s8);
                    Log.d((String)"DfltImageHeaderParser", (String)((StringBuilder)object).toString());
                    continue;
                }
                if (!Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) continue;
                object = new StringBuilder();
                ((StringBuilder)object).append("Illegal tagValueOffset=");
                ((StringBuilder)object).append(n12);
                ((StringBuilder)object).append(" tagType=");
                ((StringBuilder)object).append(s8);
                Log.d((String)"DfltImageHeaderParser", (String)((StringBuilder)object).toString());
                continue;
            }
            if (!Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) continue;
            object = new StringBuilder();
            ((StringBuilder)object).append("Got invalid format code = ");
            ((StringBuilder)object).append(n12);
            Log.d((String)"DfltImageHeaderParser", (String)((StringBuilder)object).toString());
        }
        return -1;
    }

    private int k(c object, byte[] byArray, int n8) throws IOException {
        int n9 = object.b(byArray, n8);
        if (n9 != n8) {
            if (Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unable to read exif segment data, length: ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(", actually read: ");
                ((StringBuilder)object).append(n9);
                Log.d((String)"DfltImageHeaderParser", (String)((StringBuilder)object).toString());
            }
            return -1;
        }
        if (this.h(byArray, n8)) {
            return g.j(new b(byArray, n8));
        }
        if (Log.isLoggable((String)"DfltImageHeaderParser", (int)3)) {
            Log.d((String)"DfltImageHeaderParser", (String)"Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override
    public f.a a(ByteBuffer byteBuffer) throws IOException {
        return this.f(new a(h.d(byteBuffer)));
    }

    @Override
    public int b(InputStream inputStream, ax.Q3.b b8) throws IOException {
        return this.e(new d(h.d(inputStream)), h.d(b8));
    }

    @Override
    public f.a c(InputStream inputStream) throws IOException {
        return this.f(new d(h.d(inputStream)));
    }

    private static final class a
    implements c {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override
        public int a() throws IOException {
            return this.d() << 8 & 0xFF00 | this.d() & 0xFF;
        }

        @Override
        public int b(byte[] byArray, int n8) throws IOException {
            if ((n8 = Math.min(n8, this.a.remaining())) == 0) {
                return -1;
            }
            this.a.get(byArray, 0, n8);
            return n8;
        }

        @Override
        public short c() throws IOException {
            return (short)(this.d() & 0xFF);
        }

        @Override
        public int d() throws IOException {
            if (this.a.remaining() < 1) {
                return -1;
            }
            return this.a.get();
        }

        @Override
        public long skip(long l8) throws IOException {
            int n8 = (int)Math.min((long)this.a.remaining(), l8);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + n8);
            return n8;
        }
    }

    private static final class b {
        private final ByteBuffer a;

        b(byte[] byArray, int n8) {
            this.a = (ByteBuffer)ByteBuffer.wrap(byArray).order(ByteOrder.BIG_ENDIAN).limit(n8);
        }

        private boolean c(int n8, int n9) {
            return this.a.remaining() - n8 >= n9;
        }

        short a(int n8) {
            if (this.c(n8, 2)) {
                return this.a.getShort(n8);
            }
            return -1;
        }

        int b(int n8) {
            if (this.c(n8, 4)) {
                return this.a.getInt(n8);
            }
            return -1;
        }

        int d() {
            return this.a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    private static interface c {
        public int a() throws IOException;

        public int b(byte[] var1, int var2) throws IOException;

        public short c() throws IOException;

        public int d() throws IOException;

        public long skip(long var1) throws IOException;
    }

    private static final class d
    implements c {
        private final InputStream a;

        d(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override
        public int a() throws IOException {
            return this.a.read() << 8 & 0xFF00 | this.a.read() & 0xFF;
        }

        @Override
        public int b(byte[] byArray, int n8) throws IOException {
            int n9;
            int n10;
            for (n9 = n8; n9 > 0 && (n10 = this.a.read(byArray, n8 - n9, n9)) != -1; n9 -= n10) {
            }
            return n8 - n9;
        }

        @Override
        public short c() throws IOException {
            return (short)(this.a.read() & 0xFF);
        }

        @Override
        public int d() throws IOException {
            return this.a.read();
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public long skip(long l8) throws IOException {
            if (l8 < 0L) {
                return 0L;
            }
            long l9 = l8;
            while (l9 > 0L) {
                long l10 = this.a.skip(l9);
                if (l10 <= 0L) {
                    if (this.a.read() == -1) {
                        return l8 - l9;
                    }
                    l10 = 1L;
                }
                l9 -= l10;
            }
            return l8 - l9;
        }
    }
}

