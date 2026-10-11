/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.e;
import ax.n.x;

public class y
extends e {
    @Override
    public Dialog T2(Bundle bundle) {
        return new x(this.b(), this.S2());
    }

    @Override
    public void a3(Dialog dialog, int n8) {
        if (dialog instanceof x) {
            x x8 = (x)dialog;
            if (n8 != 1 && n8 != 2) {
                if (n8 != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            x8.h(1);
            return;
        }
        super.a3(dialog, n8);
    }
}

