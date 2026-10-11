package ax.J5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import ax.M5.C0821p;

/* renamed from: ax.J5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class DialogFragmentC0743d extends DialogFragment {
    private Dialog a;
    private DialogInterface.OnCancelListener b;
    private Dialog c;

    public static DialogFragmentC0743d a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC0743d dialogFragmentC0743d = new DialogFragmentC0743d();
        Dialog dialog2 = (Dialog) C0821p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC0743d.a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC0743d.b = onCancelListener;
        }
        return dialogFragmentC0743d;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.c == null) {
            this.c = new AlertDialog.Builder((Context) C0821p.l(getActivity())).create();
        }
        return this.c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
