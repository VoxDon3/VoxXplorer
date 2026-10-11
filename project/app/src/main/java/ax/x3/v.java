/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import ax.Ha.c;

public class v
extends e {
    public v(Context context) {
        super(context);
    }

    public void g0(CharSequence charSequence) {
        this.Z(charSequence);
    }

    public void h0(View view, int n8, int n9) {
        Context context = this.u();
        try {
            i i8 = new i(context, this);
            i8.f(view);
            i8.l(n8, n9);
            return;
        }
        catch (RuntimeException runtimeException) {
            try {
                this.clearHeader();
                i i9 = new i(context, this);
                i9.f(view);
                i9.l(n8, n9);
            }
            catch (RuntimeException runtimeException2) {
                c.h().f().b("MENU_POPUP_HELPER").l(runtimeException2).h();
                Toast.makeText((Context)context, (int)2131951927, (int)1).show();
            }
            return;
        }
    }
}

