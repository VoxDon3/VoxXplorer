package ax.W5;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* renamed from: ax.W5.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1075v0 extends C1081x0 {
    private final byte[] b;
    private int c;
    private int d;
    private int e;

    /* synthetic */ C1075v0(byte[] bArr, int i, int i2, boolean z, C1072u0 c1072u0) {
        super(null);
        this.e = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.b = bArr;
        this.c = 0;
    }

    public final int c(int i) throws P0 {
        int i2 = this.e;
        this.e = 0;
        int i3 = this.c + this.d;
        this.c = i3;
        if (i3 <= 0) {
            this.d = 0;
            return i2;
        }
        this.d = i3;
        this.c = 0;
        return i2;
    }
}
