/*
 * Decompiled with CFR 0.152.
 */
package ax.B0;

import androidx.fragment.app.Fragment;
import ax.Gb.l;

public abstract class h
extends RuntimeException {
    private final Fragment q;

    public h(Fragment fragment, String string) {
        l.f(fragment, "fragment");
        super(string);
        this.q = fragment;
    }

    public final Fragment a() {
        return this.q;
    }
}

