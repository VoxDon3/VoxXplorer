/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.preference.PreferenceGroup;
import androidx.preference.h;
import ax.S.k;
import ax.b2.c;
import ax.b2.f;

public class PreferenceCategory
extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, f.e, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
    }

    @Override
    public boolean O0() {
        return super.S() ^ true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void c0(h h8) {
        super.c0(h8);
        if (Build.VERSION.SDK_INT >= 28) {
            c.a(h8.a, true);
        }
    }
}

