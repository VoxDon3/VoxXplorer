package ax.f9;

import java.util.Arrays;

/* renamed from: ax.f9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2085a implements InterfaceC2086b {
    private byte[] a;
    private byte[] b;
    private int c;

    public C2085a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Missing Seed for KDF");
        }
        this.a = Arrays.copyOf(bArr, bArr.length);
        if (bArr2 == null) {
            this.b = new byte[0];
        } else {
            this.b = Arrays.copyOf(bArr2, bArr2.length);
        }
        this.c = i;
    }

    public int a() {
        return this.c;
    }

    public byte[] b() {
        return this.b;
    }

    public byte[] c() {
        return this.a;
    }
}
