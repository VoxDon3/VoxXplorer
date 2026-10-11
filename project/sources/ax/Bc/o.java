package ax.Bc;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes3.dex */
public class o {
    public static final o d = new o(SubsamplingScaleImageView.TILE_SIZE_AUTO, false, false);
    private final int a;
    private final boolean b;
    private final boolean c;

    private o(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }
}
