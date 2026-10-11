/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint(value={"AppCompatCustomView"})
public class A
extends ImageButton {
    private int a;

    public final void b(int n8, boolean bl) {
        super.setVisibility(n8);
        if (bl) {
            this.a = n8;
        }
    }

    public final int getUserSetVisibility() {
        return this.a;
    }

    public void setVisibility(int n8) {
        this.b(n8, true);
    }
}

