package ax.X3;

import android.util.Log;
import ax.M3.f;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public final class g implements ax.M3.f {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final class a implements c {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // ax.X3.g.c
        public int a() throws IOException {
            return ((d() << 8) & 65280) | (d() & 255);
        }

        @Override // ax.X3.g.c
        public int b(byte[] bArr, int i) throws IOException {
            int min = Math.min(i, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        @Override // ax.X3.g.c
        public short c() throws IOException {
            return (short) (d() & 255);
        }

        @Override // ax.X3.g.c
        public int d() throws IOException {
            if (this.a.remaining() < 1) {
                return -1;
            }
            return this.a.get();
        }

        @Override // ax.X3.g.c
        public long skip(long j) throws IOException {
            int min = (int) Math.min(this.a.remaining(), j);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    private static final class b {
        private final ByteBuffer a;

        b(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        private boolean c(int i, int i2) {
            return this.a.remaining() - i >= i2;
        }

        short a(int i) {
            if (c(i, 2)) {
                return this.a.getShort(i);
            }
            return (short) -1;
        }

        int b(int i) {
            if (c(i, 4)) {
                return this.a.getInt(i);
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

    private interface c {
        int a() throws IOException;

        int b(byte[] bArr, int i) throws IOException;

        short c() throws IOException;

        int d() throws IOException;

        long skip(long j) throws IOException;
    }

    private static final class d implements c {
        private final InputStream a;

        d(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // ax.X3.g.c
        public int a() throws IOException {
            return ((this.a.read() << 8) & 65280) | (this.a.read() & 255);
        }

        @Override // ax.X3.g.c
        public int b(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        @Override // ax.X3.g.c
        public short c() throws IOException {
            return (short) (this.a.read() & 255);
        }

        @Override // ax.X3.g.c
        public int d() throws IOException {
            return this.a.read();
        }

        @Override // ax.X3.g.c
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    private static int d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private int e(c cVar, ax.Q3.b bVar) throws IOException {
        int a2 = cVar.a();
        if (!g(a2)) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a2);
            }
            return -1;
        }
        int i = i(cVar);
        if (i == -1) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] bArr = (byte[]) bVar.d(i, byte[].class);
        try {
            return k(cVar, bArr, i);
        } finally {
            bVar.c(bArr, byte[].class);
        }
    }

    private f.a f(c cVar) throws IOException {
        int a2 = cVar.a();
        if (a2 == 65496) {
            return f.a.JPEG;
        }
        int a3 = ((a2 << 16) & (-65536)) | (cVar.a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        if (a3 == -1991225785) {
            cVar.skip(21L);
            return cVar.d() >= 3 ? f.a.PNG_A : f.a.PNG;
        }
        if ((a3 >> 8) == 4671814) {
            return f.a.GIF;
        }
        if (a3 != 1380533830) {
            return f.a.UNKNOWN;
        }
        cVar.skip(4L);
        if ((((cVar.a() << 16) & (-65536)) | (cVar.a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != 1464156752) {
            return f.a.UNKNOWN;
        }
        int a4 = ((cVar.a() << 16) & (-65536)) | (cVar.a() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        if ((a4 & (-256)) != 1448097792) {
            return f.a.UNKNOWN;
        }
        int i = a4 & 255;
        if (i == 88) {
            cVar.skip(4L);
            return (cVar.d() & 16) != 0 ? f.a.WEBP_A : f.a.WEBP;
        }
        if (i != 76) {
            return f.a.WEBP;
        }
        cVar.skip(4L);
        return (cVar.d() & 8) != 0 ? f.a.WEBP_A : f.a.WEBP;
    }

    private static boolean g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    private boolean h(byte[] bArr, int i) {
        boolean z = bArr != null && i > a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    private int i(c cVar) throws IOException {
        short c2;
        int a2;
        long j;
        long skip;
        do {
            short c3 = cVar.c();
            if (c3 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) c3));
                }
                return -1;
            }
            c2 = cVar.c();
            if (c2 == 218) {
                return -1;
            }
            if (c2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a2 = cVar.a() - 2;
            if (c2 == 225) {
                return a2;
            }
            j = a2;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) c2) + ", wanted to skip: " + a2 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    private static int j(b bVar) {
        ByteOrder byteOrder;
        short a2 = bVar.a(6);
        if (a2 == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (a2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a2));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b2 = bVar.b(10) + 6;
        short a3 = bVar.a(b2);
        for (int i = 0; i < a3; i++) {
            int d2 = d(b2, i);
            short a4 = bVar.a(d2);
            if (a4 == 274) {
                short a5 = bVar.a(d2 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b3 = bVar.b(d2 + 4);
                    if (b3 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + ((int) a4) + " formatCode=" + ((int) a5) + " componentCount=" + b3);
                        }
                        int i2 = b3 + b[a5];
                        if (i2 <= 4) {
                            int i3 = d2 + 8;
                            if (i3 >= 0 && i3 <= bVar.d()) {
                                if (i2 >= 0 && i2 + i3 <= bVar.d()) {
                                    return bVar.a(i3);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) a4));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) a4));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a5));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) a5));
                }
            }
        }
        return -1;
    }

    private int k(c cVar, byte[] bArr, int i) throws IOException {
        int b2 = cVar.b(bArr, i);
        if (b2 == i) {
            if (h(bArr, i)) {
                return j(new b(bArr, i));
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + b2);
        }
        return -1;
    }

    @Override // ax.M3.f
    public f.a a(ByteBuffer byteBuffer) throws IOException {
        return f(new a((ByteBuffer) ax.k4.h.d(byteBuffer)));
    }

    @Override // ax.M3.f
    public int b(InputStream inputStream, ax.Q3.b bVar) throws IOException {
        return e(new d((InputStream) ax.k4.h.d(inputStream)), (ax.Q3.b) ax.k4.h.d(bVar));
    }

    @Override // ax.M3.f
    public f.a c(InputStream inputStream) throws IOException {
        return f(new d((InputStream) ax.k4.h.d(inputStream)));
    }
}
