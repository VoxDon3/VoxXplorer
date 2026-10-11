/*
 * Decompiled with CFR 0.152.
 */
package ax.d0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import ax.d0.H;

public final class a
extends ClickableSpan {
    private final int a;
    private final H b;
    private final int c;

    public a(int n8, H h8, int n9) {
        this.a = n8;
        this.b = h8;
        this.c = n9;
    }

    public void onClick(View view) {
        view = new Bundle();
        view.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.c0(this.c, (Bundle)view);
    }
}

