/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import ax.M5.p;

public class d
extends DialogFragment {
    private Dialog a;
    private DialogInterface.OnCancelListener b;
    private Dialog c;

    public static d a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        d d8 = new d();
        dialog = p.m(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        d8.a = dialog;
        if (onCancelListener != null) {
            d8.b = onCancelListener;
        }
        return d8;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        bundle = dialog;
        if (dialog == null) {
            this.setShowsDialog(false);
            if (this.c == null) {
                this.c = new AlertDialog.Builder((Context)p.l(this.getActivity())).create();
            }
            bundle = this.c;
        }
        return bundle;
    }

    public void show(FragmentManager fragmentManager, String string) {
        super.show(fragmentManager, string);
    }
}

