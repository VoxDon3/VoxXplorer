package ax.J5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import ax.M5.C0821p;

/* renamed from: ax.J5.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0755p extends androidx.fragment.app.e {
    private Dialog t0;
    private DialogInterface.OnCancelListener u0;
    private Dialog v0;

    public static C0755p d3(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C0755p c0755p = new C0755p();
        Dialog dialog2 = (Dialog) C0821p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c0755p.t0 = dialog2;
        if (onCancelListener != null) {
            c0755p.u0 = onCancelListener;
        }
        return c0755p;
    }

    @Override // androidx.fragment.app.e
    public Dialog T2(Bundle bundle) {
        Dialog dialog = this.t0;
        if (dialog != null) {
            return dialog;
        }
        Z2(false);
        if (this.v0 == null) {
            this.v0 = new AlertDialog.Builder((Context) C0821p.l(b())).create();
        }
        return this.v0;
    }

    @Override // androidx.fragment.app.e
    public void c3(FragmentManager fragmentManager, String str) {
        super.c3(fragmentManager, str);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.u0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
