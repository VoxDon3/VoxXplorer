package ax.a3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.logging.Logger;

/* renamed from: ax.a3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1355k extends I {
    private static final Logger u0 = ax.Q2.g.a(C1355k.class);
    ArrayList<String> t0;

    public static C1355k i3(int i, String str, String str2, ArrayList<String> arrayList) {
        C1355k c1355k = new C1355k();
        Bundle bundle = new Bundle();
        bundle.putInt("TITLE", i);
        bundle.putString("MESSAGE", str);
        bundle.putString("ERROR_MESSAGE", str2);
        c1355k.j3(arrayList);
        c1355k.v2(bundle);
        return c1355k;
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        if (j0() == null) {
            C3184b.e("no bundle?");
            Z2(false);
        }
    }

    @Override // ax.a3.I
    public Dialog g3() {
        boolean z;
        Bundle j0 = j0();
        a.C0006a a = C3190h.a(f0());
        int i = j0.getInt("TITLE", R.string.dialog_title_failure);
        if (i != 0) {
            a.p(i);
        }
        String string = j0.getString("TITLE_STRING");
        if (string != null) {
            a.setTitle(string);
        }
        String string2 = j0.getString("MESSAGE");
        if (string2 != null) {
            a.f(string2);
        }
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_command_result, (ViewGroup) null, false);
        String string3 = j0.getString("ERROR_MESSAGE");
        boolean z2 = true;
        if (TextUtils.isEmpty(string3)) {
            z = false;
        } else {
            TextView textView = (TextView) inflate.findViewById(R.id.error_message);
            textView.setVisibility(0);
            textView.setText(string3);
            z = true;
        }
        ArrayList<String> arrayList = this.t0;
        if (arrayList == null || arrayList.size() <= 0) {
            z2 = z;
        } else {
            ListView listView = (ListView) inflate.findViewById(R.id.filename_list);
            listView.setVisibility(0);
            listView.setAdapter((ListAdapter) new ArrayAdapter(b(), R.layout.dialog_command_result_filename, R.id.filename, this.t0));
            if (this.t0.size() > 5) {
                ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
                layoutParams.height = C3180B.e(b(), 100);
                listView.setLayoutParams(layoutParams);
            }
        }
        if (z2) {
            a.setView(inflate);
        }
        return a.setPositiveButton(android.R.string.ok, null).create();
    }

    public void j3(ArrayList<String> arrayList) {
        this.t0 = arrayList;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ax.i.q f0 = f0();
        if (f0 instanceof DialogInterface.OnDismissListener) {
            ((DialogInterface.OnDismissListener) f0).onDismiss(dialogInterface);
        }
    }
}
