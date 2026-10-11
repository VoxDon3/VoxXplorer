package ax.lc;

import ax.nc.C2651b;
import ax.oc.C2743a;

/* renamed from: ax.lc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2504d implements InterfaceC2503c {
    private C2651b a = new C2651b();

    public C2504d(char[] cArr, long j, long j2, byte[] bArr, boolean z) throws C2743a {
        b(bArr, cArr, j2, j, z);
    }

    private void b(byte[] bArr, char[] cArr, long j, long j2, boolean z) throws C2743a {
        byte b;
        if (cArr == null || cArr.length <= 0) {
            throw new C2743a("Wrong password!", C2743a.EnumC0408a.WRONG_PASSWORD);
        }
        this.a.c(cArr, z);
        int i = 0;
        byte b2 = bArr[0];
        while (i < 12) {
            i++;
            if (i == 12 && (b = (byte) (this.a.b() ^ b2)) != ((byte) (j2 >> 24)) && b != ((byte) (j >> 8))) {
                throw new C2743a("Wrong password!", C2743a.EnumC0408a.WRONG_PASSWORD);
            }
            C2651b c2651b = this.a;
            c2651b.d((byte) (c2651b.b() ^ b2));
            if (i != 12) {
                b2 = bArr[i];
            }
        }
    }

    @Override // ax.lc.InterfaceC2503c
    public int a(byte[] bArr, int i, int i2) throws C2743a {
        if (i < 0 || i2 < 0) {
            throw new C2743a("one of the input parameters were null in standard decrypt data");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            byte b = (byte) (((bArr[i3] & 255) ^ this.a.b()) & 255);
            this.a.d(b);
            bArr[i3] = b;
        }
        return i2;
    }
}
