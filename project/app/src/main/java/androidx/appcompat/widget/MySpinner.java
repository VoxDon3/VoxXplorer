/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.u;

public class MySpinner
extends u {
    public MySpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void c() {
        if (this.getInternalPopup() == null) {
            return;
        }
        this.getInternalPopup().dismiss();
    }
}

