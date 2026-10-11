package ax.b6;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes3.dex */
final class O3 extends P3 {
    private final byte[] c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    private final void f() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = i - this.g;
        int i3 = this.h;
        if (i2 <= i3) {
            this.e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.e = i4;
        this.d = i - i4;
    }

    @Override // ax.b6.P3
    public final int a(int i) throws C1663s4 {
        if (i < 0) {
            throw C1663s4.d();
        }
        int d = i + d();
        if (d < 0) {
            throw C1663s4.e();
        }
        int i2 = this.h;
        if (d > i2) {
            throw C1663s4.f();
        }
        this.h = d;
        f();
        return i2;
    }

    @Override // ax.b6.P3
    public final int d() {
        return this.f - this.g;
    }

    private O3(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.h = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }
}
