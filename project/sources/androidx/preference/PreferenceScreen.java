package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.g;
import ax.S.k;
import ax.b2.C1478f;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean Z0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(context, C1478f.g, R.attr.preferenceScreenStyle));
        this.Z0 = true;
    }

    @Override // androidx.preference.PreferenceGroup
    protected boolean a1() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected void d0() {
        g.b g;
        if (A() != null || w() != null || Z0() == 0 || (g = K().g()) == null) {
            return;
        }
        g.R(this);
    }

    public boolean h1() {
        return this.Z0;
    }
}
