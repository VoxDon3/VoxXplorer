/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import ax.a3.I;

public class D
extends I {
    @Override
    public Dialog g3() {
        return new a(this.b());
    }

    public static class a
    extends Dialog {
        public a(Context context) {
            super(context, 2132017510);
            this.setContentView(2131558509);
            this.setCancelable(false);
        }
    }
}

