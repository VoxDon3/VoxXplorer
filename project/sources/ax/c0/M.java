package ax.c0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

/* loaded from: classes.dex */
public final class M {
    private final PointerIcon a;

    static class a {
        static PointerIcon a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        static PointerIcon b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        static PointerIcon c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    private M(PointerIcon pointerIcon) {
        this.a = pointerIcon;
    }

    public static M b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new M(a.b(context, i)) : new M(null);
    }

    public Object a() {
        return this.a;
    }
}
