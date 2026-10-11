package ax.w2;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: ax.w2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3334f {
    public static Interpolator a(Context context, int i) throws Resources.NotFoundException {
        return AnimationUtils.loadInterpolator(context, i);
    }
}
