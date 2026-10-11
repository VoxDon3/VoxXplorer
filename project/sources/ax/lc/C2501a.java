package ax.lc;

import ax.mc.C2551a;
import ax.nc.C2650a;
import ax.oc.C2743a;
import ax.rc.C3026a;
import ax.sc.EnumC3084a;
import java.util.Arrays;

/* renamed from: ax.lc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2501a implements InterfaceC2503c {
    private C2650a a;
    private C2551a b;
    private int c = 1;
    private byte[] d = new byte[16];
    private byte[] e = new byte[16];

    public C2501a(C3026a c3026a, char[] cArr, byte[] bArr, byte[] bArr2, boolean z) throws C2743a {
        c(bArr, bArr2, cArr, c3026a, z);
    }

    private void c(byte[] bArr, byte[] bArr2, char[] cArr, C3026a c3026a, boolean z) throws C2743a {
        if (cArr == null || cArr.length <= 0) {
            throw new C2743a("empty or null password provided for AES decryption", C2743a.EnumC0408a.WRONG_PASSWORD);
        }
        EnumC3084a b = c3026a.b();
        byte[] a = C2502b.a(bArr, cArr, b, z);
        if (!Arrays.equals(bArr2, C2502b.b(a, b))) {
            throw new C2743a("Wrong Password", C2743a.EnumC0408a.WRONG_PASSWORD);
        }
        this.a = C2502b.c(a, b);
        this.b = C2502b.d(a, b);
    }

    @Override // ax.lc.InterfaceC2503c
    public int a(byte[] bArr, int i, int i2) throws C2743a {
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                return i2;
            }
            int i5 = i3 + 16;
            int i6 = i5 <= i4 ? 16 : i4 - i3;
            this.b.f(bArr, i3, i6);
            C2502b.e(this.d, this.c);
            this.a.e(this.d, this.e);
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = i3 + i7;
                bArr[i8] = (byte) (bArr[i8] ^ this.e[i7]);
            }
            this.c++;
            i3 = i5;
        }
    }

    public byte[] b(int i) {
        return this.b.d(i);
    }
}
