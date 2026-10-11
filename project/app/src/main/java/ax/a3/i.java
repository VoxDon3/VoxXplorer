/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ListAdapter;
import androidx.appcompat.app.a;
import androidx.fragment.app.e;
import ax.Q2.f;
import ax.a3.t;
import ax.u3.h;
import com.alphainventor.filemanager.activity.MainActivity;
import java.io.Serializable;

public class i
extends e {
    private f t0;

    public static i d3() {
        i i8 = new i();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOCATION", (Serializable)((Object)f.M0));
        i8.v2(bundle);
        return i8;
    }

    public static i e3() {
        i i8 = new i();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOCATION", (Serializable)((Object)f.G0));
        i8.v2(bundle);
        return i8;
    }

    @Override
    public Dialog T2(Bundle object) {
        a.a a8 = h.a((Context)this.f0());
        object = this.t0;
        f f8 = f.M0;
        object = object == f8 ? ax.x3.f.a(a8.getContext()) : ax.x3.f.b(a8.getContext());
        a8.a((ListAdapter)object, new t(this, (ax.x3.f)((Object)object)){
            final ax.x3.f b;
            final i c;
            {
                this.c = i8;
                this.b = f8;
            }

            @Override
            public void a(DialogInterface object, int n8) {
                if (this.c.X0()) {
                    object = this.b.c(n8);
                    if (this.c.f0() instanceof MainActivity) {
                        ((MainActivity)this.c.f0()).v1().a(object.a, object.b);
                    }
                }
            }
        });
        if (this.t0 == f8) {
            a8.p(2131951880);
        } else {
            a8.p(2131951881);
        }
        a8.b(true);
        object = a8.create();
        object.setCanceledOnTouchOutside(true);
        return object;
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
        this.t0 = (f)((Object)this.j0().getSerializable("LOCATION"));
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }
}

