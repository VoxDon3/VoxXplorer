/*
 * Decompiled with CFR 0.152.
 */
package ax.w2;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class f {
    public static Interpolator a(Context context, int n8) throws Resources.NotFoundException {
        return AnimationUtils.loadInterpolator((Context)context, (int)n8);
    }
}

