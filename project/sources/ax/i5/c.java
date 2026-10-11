package ax.i5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
class c {
    private short a;
    private short b;
    private short c;
    private byte d;
    private long e;
    private long f;
    private long g;
    private short h;
    private boolean i;
    private byte j;
    private String k;

    private c() {
    }

    static c m(ByteBuffer byteBuffer) {
        c cVar = new c();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        cVar.a = byteBuffer.getShort(11);
        cVar.b = (short) (byteBuffer.get(13) & 255);
        cVar.c = byteBuffer.getShort(14);
        cVar.d = byteBuffer.get(16);
        cVar.e = byteBuffer.getInt(32) & 4294967295L;
        cVar.f = byteBuffer.getInt(36) & 4294967295L;
        cVar.g = byteBuffer.getInt(44) & 4294967295L;
        cVar.h = byteBuffer.getShort(48);
        byte b = (byte) byteBuffer.getShort(40);
        cVar.i = (b & 128) == 0;
        cVar.j = (byte) (b & 7);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            byte b2 = byteBuffer.get(i + 48);
            if (b2 == 0) {
                break;
            }
            sb.append((char) b2);
        }
        cVar.k = sb.toString();
        return cVar;
    }

    int a() {
        return this.b * this.a;
    }

    short b() {
        return this.a;
    }

    long c() {
        return e(0) + (d() * i() * b());
    }

    byte d() {
        return this.d;
    }

    long e(int i) {
        return b() * (g() + (i * i()));
    }

    short f() {
        return this.h;
    }

    short g() {
        return this.c;
    }

    long h() {
        return this.g;
    }

    long i() {
        return this.f;
    }

    long j() {
        return this.e;
    }

    byte k() {
        return this.j;
    }

    boolean l() {
        return this.i;
    }

    public String toString() {
        return "Fat32BootSector{bytesPerSector=" + ((int) this.a) + ", sectorsPerCluster=" + ((int) this.b) + ", reservedSectors=" + ((int) this.c) + ", fatCount=" + ((int) this.d) + ", totalNumberOfSectors=" + this.e + ", sectorsPerFat=" + this.f + ", rootDirStartCluster=" + this.g + ", fsInfoStartSector=" + ((int) this.h) + ", fatMirrored=" + this.i + ", validFat=" + ((int) this.j) + ", volumeLabel='" + this.k + "'}";
    }
}
