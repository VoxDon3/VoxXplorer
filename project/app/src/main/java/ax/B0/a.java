/*
 * Decompiled with CFR 0.152.
 */
package ax.B0;

import androidx.fragment.app.Fragment;
import ax.B0.h;
import ax.Gb.l;

public final class a
extends h {
    private final String c0;

    public a(Fragment fragment, String string) {
        l.f(fragment, "fragment");
        l.f(string, "previousFragmentId");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attempting to reuse fragment ");
        stringBuilder.append(fragment);
        stringBuilder.append(" with previous ID ");
        stringBuilder.append(string);
        super(fragment, stringBuilder.toString());
        this.c0 = string;
    }
}

