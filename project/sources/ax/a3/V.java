package ax.a3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class V extends I {
    private b t0;
    private String u0;
    private String[] v0;

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (V.this.t0 != null) {
                V.this.t0.a(V.this.v0[i]);
            }
            dialogInterface.dismiss();
        }
    }

    public interface b {
        void a(String str);
    }

    public static V l3(String str) {
        V v = new V();
        Bundle bundle = new Bundle();
        bundle.putString("sort_method", str);
        v.v2(bundle);
        return v;
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        if (j0() == null) {
            return;
        }
        this.u0 = j0().getString("sort_method");
        this.v0 = p2().getResources().getStringArray(R.array.settings_sort_method_values);
    }

    @Override // ax.a3.I
    public Dialog g3() {
        a.C0006a a2 = C3190h.a(f0());
        a2.p(R.string.settings_sortby);
        a2.m(R.array.settings_sort_method_entries, k3(this.u0), new a());
        a2.setPositiveButton(android.R.string.ok, null);
        a2.b(true);
        return a2.create();
    }

    public int k3(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.v0;
            if (i >= strArr.length) {
                C3184b.g("invalid sortMethod : " + str);
                return 0;
            }
            if (str.equals(strArr[i])) {
                return i;
            }
            i++;
        }
    }

    public void m3(b bVar) {
        this.t0 = bVar;
    }
}
