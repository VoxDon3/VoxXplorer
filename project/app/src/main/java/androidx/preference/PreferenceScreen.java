/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.PreferenceGroup;
import androidx.preference.g;
import ax.S.k;
import ax.b2.f;

public final class PreferenceScreen
extends PreferenceGroup {
    private boolean Z0 = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(context, f.g, 16842891));
    }

    @Override
    protected boolean a1() {
        return false;
    }

    @Override
    protected void d0() {
        g.b b8;
        if (this.A() == null && this.w() == null && this.Z0() != 0 && (b8 = this.K().g()) != null) {
            b8.R(this);
        }
    }

    public boolean h1() {
        return this.Z0;
    }
}

