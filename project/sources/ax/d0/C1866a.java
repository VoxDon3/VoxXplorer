package ax.d0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: ax.d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1866a extends ClickableSpan {
    private final int a;
    private final H b;
    private final int c;

    public C1866a(int i, H h, int i2) {
        this.a = i;
        this.b = h;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.c0(this.c, bundle);
    }
}
