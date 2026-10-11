package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class MySpinner extends u {
    public MySpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void c() {
        if (getInternalPopup() == null) {
            return;
        }
        getInternalPopup().dismiss();
    }
}
