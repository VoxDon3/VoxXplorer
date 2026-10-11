package ax.Sd;

import ax.Sd.b;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class i extends b {
    private static final byte[] e = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 0, 1, 7, 1, 1, 1, 1, 1, 1, 5, 1, 5, 0, 5, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 7, 0, 7, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 7, 7, 7};
    private static final byte[] f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 1, 1, 3, 3, 0, 3, 3, 3, 1, 2, 1, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 1, 3, 1, 1, 1, 3, 0, 3, 1, 3, 1, 1, 3, 3};
    private b.a b;
    private byte c;
    private int[] d = new int[4];

    public i() {
        j();
    }

    @Override // ax.Sd.b
    public String c() {
        return ax.Rd.b.r;
    }

    @Override // ax.Sd.b
    public float d() {
        int[] iArr;
        float f2;
        if (this.b == b.a.NOT_ME) {
            return 0.01f;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.d;
            if (i >= iArr.length) {
                break;
            }
            i2 += iArr[i];
            i++;
        }
        if (i2 <= 0) {
            f2 = 0.0f;
        } else {
            float f3 = i2;
            f2 = ((iArr[3] * 1.0f) / f3) - ((iArr[1] * 20.0f) / f3);
        }
        return (f2 >= 0.0f ? f2 : 0.0f) * 0.5f;
    }

    @Override // ax.Sd.b
    public b.a e() {
        return this.b;
    }

    @Override // ax.Sd.b
    public b.a f(byte[] bArr, int i, int i2) {
        ByteBuffer a = a(bArr, i, i2);
        byte[] array = a.array();
        int position = a.position();
        int i3 = 0;
        while (true) {
            if (i3 >= position) {
                break;
            }
            byte b = e[array[i3] & 255];
            byte b2 = f[(this.c * 8) + b];
            if (b2 == 0) {
                this.b = b.a.NOT_ME;
                break;
            }
            int[] iArr = this.d;
            iArr[b2] = iArr[b2] + 1;
            this.c = b;
            i3++;
        }
        return this.b;
    }

    @Override // ax.Sd.b
    public final void j() {
        this.b = b.a.DETECTING;
        this.c = (byte) 1;
        int i = 0;
        while (true) {
            int[] iArr = this.d;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
