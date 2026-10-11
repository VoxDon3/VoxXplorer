/*
 * Decompiled with CFR 0.152.
 */
package ax.T6;

import android.text.StaticLayout;
import ax.F6.t;
import com.google.android.material.textfield.TextInputLayout;

public final class p
implements t {
    public final TextInputLayout a;

    public /* synthetic */ p(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override
    public final void a(StaticLayout.Builder builder) {
        TextInputLayout.b(this.a, builder);
    }
}

