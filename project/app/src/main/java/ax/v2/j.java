/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.view.ViewGroup;
import ax.v2.h;

public class j {
    private ViewGroup a;
    private Runnable b;

    public static j b(ViewGroup viewGroup) {
        return (j)viewGroup.getTag(h.c);
    }

    static void c(ViewGroup viewGroup, j j8) {
        viewGroup.setTag(h.c, (Object)j8);
    }

    public void a() {
        Runnable runnable2;
        if (j.b(this.a) == this && (runnable2 = this.b) != null) {
            runnable2.run();
        }
    }
}

