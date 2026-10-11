/*
 * Decompiled with CFR 0.152.
 */
package ax.T6;

import com.google.android.material.textfield.TextInputLayout;

public final class n
implements Runnable {
    public final TextInputLayout q;

    public /* synthetic */ n(TextInputLayout textInputLayout) {
        this.q = textInputLayout;
    }

    @Override
    public final void run() {
        TextInputLayout.a(this.q);
    }
}

