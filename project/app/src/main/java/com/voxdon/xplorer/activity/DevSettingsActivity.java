/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import ax.R2.c;
import ax.t3.b;

public class DevSettingsActivity
extends c {
    @Override
    public boolean isContentClipToPadding(boolean bl) {
        return false;
    }

    @Override
    public void onApplyWindowsInsets(ax.T.b b8, boolean bl) {
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.setContentView(2131558437);
        this.onSetContentView(true);
        this.setTitle(2131951801);
        FragmentManager fragmentManager = this.getFragmentManager();
        object = new b();
        fragmentManager = fragmentManager.beginTransaction();
        fragmentManager.replace(2131362331, (Fragment)object);
        fragmentManager.commit();
    }
}

