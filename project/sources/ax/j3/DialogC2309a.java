package ax.j3;

import android.app.Activity;
import android.content.DialogInterface;
import ax.j3.DialogC2310b;

/* renamed from: ax.j3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC2309a extends DialogC2310b {

    /* renamed from: ax.j3.a$a, reason: collision with other inner class name */
    class DialogInterfaceOnCancelListenerC0340a implements DialogInterface.OnCancelListener {
        final /* synthetic */ DialogC2310b.d a;

        DialogInterfaceOnCancelListenerC0340a(DialogC2310b.d dVar) {
            this.a = dVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.a.a();
        }
    }

    public DialogC2309a(Activity activity, String str, String str2, DialogC2310b.d dVar) {
        super(activity, DialogC2310b.c.NEXT_CLOUD, str, null, null, null, str2, dVar);
    }

    public static DialogC2309a F(Activity activity, String str, String str2, DialogC2310b.d dVar) {
        DialogC2309a dialogC2309a = new DialogC2309a(activity, str, str2, dVar);
        dialogC2309a.setOnCancelListener(new DialogInterfaceOnCancelListenerC0340a(dVar));
        return dialogC2309a;
    }
}
