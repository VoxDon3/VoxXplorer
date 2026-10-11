/*
 * Decompiled with CFR 0.152.
 */
package ax.i5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

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
        c c8 = new c();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        c8.a = byteBuffer.getShort(11);
        c8.b = (short)(byteBuffer.get(13) & 0xFF);
        c8.c = byteBuffer.getShort(14);
        c8.d = byteBuffer.get(16);
        c8.e = (long)byteBuffer.getInt(32) & 0xFFFFFFFFL;
        c8.f = (long)byteBuffer.getInt(36) & 0xFFFFFFFFL;
        c8.g = (long)byteBuffer.getInt(44) & 0xFFFFFFFFL;
        c8.h = byteBuffer.getShort(48);
        byte by = (byte)byteBuffer.getShort(40);
        boolean bl = (by & 0x80) == 0;
        c8.i = bl;
        c8.j = (byte)(by & 7);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = 0; i8 < 11 && (by = byteBuffer.get(i8 + 48)) != 0; ++i8) {
            stringBuilder.append((char)by);
        }
        c8.k = stringBuilder.toString();
        return c8;
    }

    int a() {
        return this.b * this.a;
    }

    short b() {
        return this.a;
    }

    long c() {
        return this.e(0) + (long)this.d() * this.i() * (long)this.b();
    }

    byte d() {
        return this.d;
    }

    long e(int n8) {
        return (long)this.b() * ((long)this.g() + (long)n8 * this.i());
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fat32BootSector{bytesPerSector=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sectorsPerCluster=");
        stringBuilder.append(this.b);
        stringBuilder.append(", reservedSectors=");
        stringBuilder.append(this.c);
        stringBuilder.append(", fatCount=");
        stringBuilder.append(this.d);
        stringBuilder.append(", totalNumberOfSectors=");
        stringBuilder.append(this.e);
        stringBuilder.append(", sectorsPerFat=");
        stringBuilder.append(this.f);
        stringBuilder.append(", rootDirStartCluster=");
        stringBuilder.append(this.g);
        stringBuilder.append(", fsInfoStartSector=");
        stringBuilder.append(this.h);
        stringBuilder.append(", fatMirrored=");
        stringBuilder.append(this.i);
        stringBuilder.append(", validFat=");
        stringBuilder.append(this.j);
        stringBuilder.append(", volumeLabel='");
        stringBuilder.append(this.k);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

