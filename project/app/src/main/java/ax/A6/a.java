/*
 * Decompiled with CFR 0.152.
 */
package ax.A6;

import android.view.View;
import android.widget.EditText;
import ax.A6.c;

public final class a
implements View.OnFocusChangeListener {
    public final EditText[] a;

    public /* synthetic */ a(EditText[] editTextArray) {
        this.a = editTextArray;
    }

    public final void onFocusChange(View view, boolean bl) {
        c.b(this.a, view, bl);
    }
}

