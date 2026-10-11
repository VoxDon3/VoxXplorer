/*
 * Decompiled with CFR 0.152.
 */
package ax.r6;

import com.google.android.material.button.MaterialButton;

public final class b
implements Runnable {
    public final MaterialButton q;

    public /* synthetic */ b(MaterialButton materialButton) {
        this.q = materialButton;
    }

    @Override
    public final void run() {
        MaterialButton.a(this.q);
    }
}

