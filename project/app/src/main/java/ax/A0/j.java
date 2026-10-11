/*
 * Decompiled with CFR 0.152.
 */
package ax.A0;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.savedstate.a;

public final class j
implements a.c {
    public final FragmentManager a;

    public /* synthetic */ j(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override
    public final Bundle a() {
        return FragmentManager.b(this.a);
    }
}

