/*
 * Decompiled with CFR 0.152.
 */
package ax.u6;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

public final class b
implements View.OnLayoutChangeListener {
    public final CarouselLayoutManager a;

    public /* synthetic */ b(CarouselLayoutManager carouselLayoutManager) {
        this.a = carouselLayoutManager;
    }

    public final void onLayoutChange(View view, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        CarouselLayoutManager.S1(this.a, view, n8, n9, n10, n11, n12, n13, n14, n15);
    }
}

