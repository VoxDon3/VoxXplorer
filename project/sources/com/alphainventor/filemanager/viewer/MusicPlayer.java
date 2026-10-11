package com.voxdon.xplorer.viewer;

import android.os.Bundle;
import android.widget.Toast;
import ax.n.ActivityC2561c;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class MusicPlayer extends ActivityC2561c {
    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ax.Ha.c.h().f().b("MUSIC PLAYER ACTIVITY LAUNCHED").g("data : " + getIntent().getData()).h();
        Toast.makeText(this, R.string.error, 1).show();
        finish();
    }
}
