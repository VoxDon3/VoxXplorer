package com.voxdon.xplorer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ActivatableFrameLayout extends FrameLayout {
    private a a;

    public interface a {
        void a(boolean z);
    }

    public ActivatableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        super.setActivated(z);
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    public void setOnActivatedListener(a aVar) {
        this.a = aVar;
    }
}
