package ax.v2;

import android.view.ViewGroup;

/* renamed from: ax.v2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3267j {
    private ViewGroup a;
    private Runnable b;

    public static C3267j b(ViewGroup viewGroup) {
        return (C3267j) viewGroup.getTag(C3265h.c);
    }

    static void c(ViewGroup viewGroup, C3267j c3267j) {
        viewGroup.setTag(C3265h.c, c3267j);
    }

    public void a() {
        Runnable runnable;
        if (b(this.a) != this || (runnable = this.b) == null) {
            return;
        }
        runnable.run();
    }
}
