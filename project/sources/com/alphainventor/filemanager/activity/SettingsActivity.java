package com.voxdon.xplorer.activity;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.t;
import ax.R2.c;
import ax.d3.n0;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class SettingsActivity extends c {

    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            SettingsActivity.this.getOnBackPressedDispatcher().k();
        }
    }

    @Override // ax.d3.x0.a
    public boolean isContentClipToPadding(boolean z) {
        return false;
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings_fragment);
        onSetContentView(true);
        setTitle(R.string.menu_settings);
        if (getSupportFragmentManager().j0(R.id.fragment_container) == null) {
            t o = getSupportFragmentManager().o();
            o.r(R.id.fragment_container, new n0());
            o.i();
        }
        ((Toolbar) findViewById(R.id.toolbar)).setNavigationOnClickListener(new a());
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        ax.Q2.a.i().q(getClass().getSimpleName());
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    @Override // ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
    }
}
