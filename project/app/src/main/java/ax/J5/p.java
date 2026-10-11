/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;

public class p
extends e {
    private Dialog t0;
    private DialogInterface.OnCancelListener u0;
    private Dialog v0;

    public static p d3(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        p p8 = new p();
        dialog = ax.M5.p.m(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        p8.t0 = dialog;
        if (onCancelListener != null) {
            p8.u0 = onCancelListener;
        }
        return p8;
    }

    @Override
    public Dialog T2(Bundle bundle) {
        Dialog dialog = this.t0;
        bundle = dialog;
        if (dialog == null) {
            this.Z2(false);
            if (this.v0 == null) {
                this.v0 = new AlertDialog.Builder(ax.M5.p.l(this.b())).create();
            }
            bundle = this.v0;
        }
        return bundle;
    }

    @Override
    public void c3(FragmentManager fragmentManager, String string) {
        super.c3(fragmentManager, string);
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.u0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}

