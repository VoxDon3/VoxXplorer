/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.user;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;

public class BroadcastPreference
extends Preference
implements Preference.OnPreferenceClickListener {
    public BroadcastPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setOnPreferenceClickListener(this);
    }

    public boolean onPreferenceClick(Preference preference) {
        this.getContext().sendBroadcast(this.getIntent());
        return true;
    }
}

