/*
 * Decompiled with CFR 0.152.
 */
package ax.u6;

import com.google.android.material.carousel.CarouselLayoutManager;

public final class c
implements Runnable {
    public final CarouselLayoutManager q;

    public /* synthetic */ c(CarouselLayoutManager carouselLayoutManager) {
        this.q = carouselLayoutManager;
    }

    @Override
    public final void run() {
        CarouselLayoutManager.R1(this.q);
    }
}

