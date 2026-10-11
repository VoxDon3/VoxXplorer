package ax.a3;

import android.content.DialogInterface;

/* renamed from: ax.a3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC1363t implements DialogInterface.OnClickListener {
    boolean a = false;

    public abstract void a(DialogInterface dialogInterface, int i);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a) {
            return;
        }
        a(dialogInterface, i);
        this.a = true;
    }
}
