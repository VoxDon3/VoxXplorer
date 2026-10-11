package ax.pb;

import ax.pb.k0;
import ax.qb.C2896d;
import ax.qb.C2897e;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/* loaded from: classes3.dex */
class F extends AbstractC2818s {
    int C0;
    k0.a D0;

    F(k0.a aVar) {
        this.D0 = aVar;
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        int i2;
        k0.a aVar = this.D0;
        int i3 = 0;
        if ((aVar.d & Integer.MIN_VALUE) == 0) {
            int i4 = aVar.o;
            byte[] bArr2 = new byte[i4];
            aVar.p = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i4);
            k0.a aVar2 = this.D0;
            int i5 = aVar2.o;
            i2 = i + i5;
            if (this.p0 > i5) {
                try {
                    if ((this.j0 & 32768) == 32768) {
                        do {
                            int i6 = i2 + i3;
                            if (bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                                this.D0.e = new String(bArr, i2, i3, "UTF-16LE");
                            }
                            i3 += 2;
                        } while (i3 <= 256);
                        throw new RuntimeException("zero termination not found");
                    }
                    while (bArr[i2 + i3] != 0) {
                        i3++;
                        if (i3 > 256) {
                            throw new RuntimeException("zero termination not found");
                        }
                    }
                    this.D0.e = new String(bArr, i2, i3, Z.K);
                } catch (UnsupportedEncodingException e) {
                    if (C2897e.c0 > 1) {
                        e.printStackTrace(AbstractC2818s.A0);
                    }
                }
                i2 += i3;
            } else {
                aVar2.e = new String();
            }
        } else {
            byte[] bArr3 = new byte[16];
            aVar.q = bArr3;
            System.arraycopy(bArr, i, bArr3, 0, 16);
            this.D0.e = new String();
            i2 = i;
        }
        return i2 - i;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        int i2 = AbstractC2818s.i(bArr, i);
        this.C0 = i2;
        int i3 = i + 2;
        if (i2 > 10) {
            return i3 - i;
        }
        k0.a aVar = this.D0;
        int i4 = i + 3;
        byte b = bArr[i3];
        aVar.f = b & 255;
        aVar.g = b & 1;
        aVar.h = (b & 2) == 2;
        aVar.i = (b & 4) == 4;
        aVar.j = (b & 8) == 8;
        aVar.a = AbstractC2818s.i(bArr, i4);
        this.D0.k = AbstractC2818s.i(bArr, i + 5);
        this.D0.b = AbstractC2818s.j(bArr, i + 7);
        this.D0.l = AbstractC2818s.j(bArr, i + 11);
        this.D0.c = AbstractC2818s.j(bArr, i + 15);
        this.D0.d = AbstractC2818s.j(bArr, i + 19);
        this.D0.m = AbstractC2818s.q(bArr, i + 23);
        this.D0.n = AbstractC2818s.i(bArr, i + 31);
        this.D0.o = bArr[i + 33] & 255;
        return (i + 34) - i;
    }

    @Override // ax.pb.AbstractC2818s
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SmbComNegotiateResponse[");
        sb.append(super.toString());
        sb.append(",wordCount=");
        sb.append(this.o0);
        sb.append(",dialectIndex=");
        sb.append(this.C0);
        sb.append(",securityMode=0x");
        sb.append(C2896d.c(this.D0.f, 1));
        sb.append(",security=");
        sb.append(this.D0.g == 0 ? "share" : "user");
        sb.append(",encryptedPasswords=");
        sb.append(this.D0.h);
        sb.append(",maxMpxCount=");
        sb.append(this.D0.a);
        sb.append(",maxNumberVcs=");
        sb.append(this.D0.k);
        sb.append(",maxBufferSize=");
        sb.append(this.D0.b);
        sb.append(",maxRawSize=");
        sb.append(this.D0.l);
        sb.append(",sessionKey=0x");
        sb.append(C2896d.c(this.D0.c, 8));
        sb.append(",capabilities=0x");
        sb.append(C2896d.c(this.D0.d, 8));
        sb.append(",serverTime=");
        sb.append(new Date(this.D0.m));
        sb.append(",serverTimeZone=");
        sb.append(this.D0.n);
        sb.append(",encryptionKeyLength=");
        sb.append(this.D0.o);
        sb.append(",byteCount=");
        sb.append(this.p0);
        sb.append(",oemDomainName=");
        sb.append(this.D0.e);
        sb.append("]");
        return new String(sb.toString());
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        return 0;
    }
}
