package ax.a3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import ax.d3.o0;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class W extends I {

    class a implements DialogInterface.OnShowListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            W.this.k0().o().r(R.id.content, new o0()).i();
        }
    }

    public static W i3() {
        return new W();
    }

    @Override // ax.a3.I
    public Dialog g3() {
        a.C0006a a2 = C3190h.a(b());
        a2.setView(LayoutInflater.from(b()).inflate(R.layout.fragment_popup_settings, (ViewGroup) null));
        a2.b(true);
        androidx.appcompat.app.a create = a2.create();
        create.setOnShowListener(new a());
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Bundle bundle = new Bundle();
        bundle.putBoolean("result", true);
        A0().l1("dialog_dismiss_request", bundle);
    }
}
