/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class m {
    private static b a(c c8) throws IOException {
        c8.a(4);
        int n8 = c8.readUnsignedShort();
        if (n8 <= 100) {
            long l8;
            int n9;
            int n10;
            block6: {
                c8.a(6);
                n10 = 0;
                for (n9 = 0; n9 < n8; ++n9) {
                    int n11 = c8.b();
                    c8.a(4);
                    l8 = c8.c();
                    c8.a(4);
                    if (1835365473 != n11) {
                        continue;
                    }
                    break block6;
                }
                l8 = -1L;
            }
            if (l8 != -1L) {
                c8.a((int)(l8 - c8.getPosition()));
                c8.a(12);
                long l9 = c8.c();
                n9 = n10;
                while ((long)n9 < l9) {
                    n10 = c8.b();
                    long l10 = c8.c();
                    long l11 = c8.c();
                    if (1164798569 != n10 && 1701669481 != n10) {
                        ++n9;
                        continue;
                    }
                    return new b(l10 + l8, l11);
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    static ax.w0.b b(ByteBuffer byteBuffer) throws IOException {
        byteBuffer = byteBuffer.duplicate();
        byteBuffer.position((int)m.a(new a(byteBuffer)).a());
        return ax.w0.b.h(byteBuffer);
    }

    static long c(int n8) {
        return (long)n8 & 0xFFFFFFFFL;
    }

    static int d(short s8) {
        return s8 & 0xFFFF;
    }

    private static class a
    implements c {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override
        public void a(int n8) throws IOException {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + n8);
        }

        @Override
        public int b() throws IOException {
            return this.a.getInt();
        }

        @Override
        public long c() throws IOException {
            return m.c(this.a.getInt());
        }

        @Override
        public long getPosition() {
            return this.a.position();
        }

        @Override
        public int readUnsignedShort() throws IOException {
            return m.d(this.a.getShort());
        }
    }

    private static class b {
        private final long a;
        private final long b;

        b(long l8, long l9) {
            this.a = l8;
            this.b = l9;
        }

        long a() {
            return this.a;
        }
    }

    private static interface c {
        public void a(int var1) throws IOException;

        public int b() throws IOException;

        public long c() throws IOException;

        public long getPosition();

        public int readUnsignedShort() throws IOException;
    }
}

