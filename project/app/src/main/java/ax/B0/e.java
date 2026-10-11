/*
 * Decompiled with CFR 0.152.
 */
package ax.B0;

import androidx.fragment.app.Fragment;
import ax.B0.g;
import ax.Gb.l;

public final class e
extends g {
    public e(Fragment fragment) {
        l.f(fragment, "fragment");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attempting to get target fragment from fragment ");
        stringBuilder.append(fragment);
        super(fragment, stringBuilder.toString());
    }
}

