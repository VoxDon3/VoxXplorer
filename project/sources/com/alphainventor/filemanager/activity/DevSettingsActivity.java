package com.voxdon.xplorer.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import ax.R2.c;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class DevSettingsActivity extends c {
    @Override // ax.d3.x0.a
    public boolean isContentClipToPadding(boolean z) {
        return false;
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings_fragment);
        onSetContentView(true);
        setTitle(R.string.debug);
        FragmentManager fragmentManager = getFragmentManager();
        ax.t3.b bVar = new ax.t3.b();
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.replace(R.id.fragment_container, bVar);
        beginTransaction.commit();
    }

    @Override // ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
    }
}
