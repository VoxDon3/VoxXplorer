/*
 * Decompiled with CFR 0.152.
 */
package ax.B0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ax.B0.h;
import ax.Gb.l;

public final class d
extends h {
    private final ViewGroup c0;

    public d(Fragment fragment, ViewGroup viewGroup) {
        l.f(fragment, "fragment");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attempting to use <fragment> tag to add fragment ");
        stringBuilder.append(fragment);
        stringBuilder.append(" to container ");
        stringBuilder.append(viewGroup);
        super(fragment, stringBuilder.toString());
        this.c0 = viewGroup;
    }
}

