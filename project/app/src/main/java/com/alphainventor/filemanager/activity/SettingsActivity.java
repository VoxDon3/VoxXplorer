/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.activity;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.t;
import ax.Q2.a;
import ax.R2.c;
import ax.T.b;
import ax.d3.n0;

public class SettingsActivity
extends c {
    @Override
    public boolean isContentClipToPadding(boolean bl) {
        return false;
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.setContentView(2131558437);
        this.onSetContentView(true);
        this.setTitle(2131952303);
        if (this.getSupportFragmentManager().j0(2131362331) == null) {
            object = this.getSupportFragmentManager().o();
            ((t)object).r(2131362331, new n0());
            ((t)object).i();
        }
        ((Toolbar)this.findViewById(2131362981)).setNavigationOnClickListener(new ax.g3.c(this){
            final SettingsActivity c;
            {
                this.c = settingsActivity;
            }

            @Override
            public void a(View view) {
                this.c.getOnBackPressedDispatcher().k();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        a.i().q(this.getClass().getSimpleName());
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}

