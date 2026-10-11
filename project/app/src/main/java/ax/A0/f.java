/*
 * Decompiled with CFR 0.152.
 */
package ax.A0;

import android.content.res.Configuration;
import androidx.fragment.app.FragmentManager;
import ax.b0.a;

public final class f
implements a {
    public final FragmentManager a;

    public /* synthetic */ f(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void accept(Object object) {
        FragmentManager.e(this.a, (Configuration)object);
    }
}

