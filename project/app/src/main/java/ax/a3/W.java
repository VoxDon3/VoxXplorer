/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.a;
import androidx.fragment.app.Fragment;
import ax.a3.I;
import ax.d3.o0;
import ax.u3.h;

public class W
extends I {
    public static W i3() {
        return new W();
    }

    @Override
    public Dialog g3() {
        Object object = h.a(this.b());
        ((a.a)object).setView(LayoutInflater.from((Context)this.b()).inflate(2131558557, null));
        ((a.a)object).b(true);
        object = ((a.a)object).create();
        object.setOnShowListener(new DialogInterface.OnShowListener(this){
            final W a;
            {
                this.a = w8;
            }

            public void onShow(DialogInterface object) {
                object = new o0();
                this.a.k0().o().r(2131362057, (Fragment)object).i();
            }
        });
        object.setCanceledOnTouchOutside(true);
        return object;
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        dialogInterface = new Bundle();
        dialogInterface.putBoolean("result", true);
        this.A0().l1("dialog_dismiss_request", (Bundle)dialogInterface);
    }
}

