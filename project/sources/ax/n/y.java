package ax.n;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class y extends androidx.fragment.app.e {
    @Override // androidx.fragment.app.e
    public Dialog T2(Bundle bundle) {
        return new x(b(), S2());
    }

    @Override // androidx.fragment.app.e
    public void a3(Dialog dialog, int i) {
        if (!(dialog instanceof x)) {
            super.a3(dialog, i);
            return;
        }
        x xVar = (x) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        xVar.h(1);
    }
}
