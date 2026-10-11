/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.SharedPreferences;
import ax.b6.i3;

public final class l3
implements SharedPreferences.OnSharedPreferenceChangeListener {
    private i3 a;

    public /* synthetic */ l3(i3 i32) {
        this.a = i32;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String string) {
        this.a.d(sharedPreferences, string);
    }
}

