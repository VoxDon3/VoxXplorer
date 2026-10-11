package androidx.emoji2.text;

import ax.w0.C3322b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
class m {

    private static class a implements c {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.m.c
        public void a(int i) throws IOException {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.emoji2.text.m.c
        public int b() throws IOException {
            return this.a.getInt();
        }

        @Override // androidx.emoji2.text.m.c
        public long c() throws IOException {
            return m.c(this.a.getInt());
        }

        @Override // androidx.emoji2.text.m.c
        public long getPosition() {
            return this.a.position();
        }

        @Override // androidx.emoji2.text.m.c
        public int readUnsignedShort() throws IOException {
            return m.d(this.a.getShort());
        }
    }

    private static class b {
        private final long a;
        private final long b;

        b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        long a() {
            return this.a;
        }
    }

    private interface c {
        void a(int i) throws IOException;

        int b() throws IOException;

        long c() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    private static b a(c cVar) throws IOException {
        long j;
        cVar.a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.a(6);
        int i = 0;
        while (true) {
            if (i >= readUnsignedShort) {
                j = -1;
                break;
            }
            int b2 = cVar.b();
            cVar.a(4);
            j = cVar.c();
            cVar.a(4);
            if (1835365473 == b2) {
                break;
            }
            i++;
        }
        if (j != -1) {
            cVar.a((int) (j - cVar.getPosition()));
            cVar.a(12);
            long c2 = cVar.c();
            for (int i2 = 0; i2 < c2; i2++) {
                int b3 = cVar.b();
                long c3 = cVar.c();
                long c4 = cVar.c();
                if (1164798569 == b3 || 1701669481 == b3) {
                    return new b(c3 + j, c4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static C3322b b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return C3322b.h(duplicate);
    }

    static long c(int i) {
        return i & 4294967295L;
    }

    static int d(short s) {
        return s & 65535;
    }
}
