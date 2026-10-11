package ax.a3;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.a;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class J extends I {

    class a extends AbstractDialogInterfaceOnClickListenerC1363t {
        a() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            ax.d3.J.e(J.this, "request_open_as", "result_selection", i);
        }
    }

    public static J i3() {
        return new J();
    }

    @Override // ax.a3.I
    public Dialog g3() {
        a.C0006a a2 = C3190h.a(f0());
        a2.a(new ArrayAdapter(a2.getContext(), R.layout.select_dialog_item_material, G0().getStringArray(R.array.openas_menu)), new a());
        androidx.appcompat.app.a create = a2.p(R.string.menu_open_as).b(true).create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        ax.d3.J.b(this, "request_open_as");
    }
}
