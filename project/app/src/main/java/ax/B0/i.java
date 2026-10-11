/*
 * Decompiled with CFR 0.152.
 */
package ax.B0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ax.B0.h;
import ax.Gb.l;

public final class i
extends h {
    private final ViewGroup c0;

    public i(Fragment fragment, ViewGroup viewGroup) {
        l.f(fragment, "fragment");
        l.f(viewGroup, "container");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attempting to add fragment ");
        stringBuilder.append(fragment);
        stringBuilder.append(" to container ");
        stringBuilder.append(viewGroup);
        stringBuilder.append(" which is not a FragmentContainerView");
        super(fragment, stringBuilder.toString());
        this.c0 = viewGroup;
    }
}

