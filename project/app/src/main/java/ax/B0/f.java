/*
 * Decompiled with CFR 0.152.
 */
package ax.B0;

import androidx.fragment.app.Fragment;
import ax.B0.g;
import ax.Gb.l;

public final class f
extends g {
    private final Fragment c0;
    private final int d0;

    public f(Fragment fragment, Fragment fragment2, int n8) {
        l.f(fragment, "fragment");
        l.f(fragment2, "targetFragment");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attempting to set target fragment ");
        stringBuilder.append(fragment2);
        stringBuilder.append(" with request code ");
        stringBuilder.append(n8);
        stringBuilder.append(" for fragment ");
        stringBuilder.append(fragment);
        super(fragment, stringBuilder.toString());
        this.c0 = fragment2;
        this.d0 = n8;
    }
}

