/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.a;
import ax.a3.I;
import ax.a3.t;
import ax.u3.h;

public class J
extends I {
    public static J i3() {
        return new J();
    }

    @Override
    public Dialog g3() {
        Object object = h.a((Context)this.f0());
        Object[] objectArray = this.G0().getStringArray(2130903063);
        ((a.a)object).a((ListAdapter)new ArrayAdapter(((a.a)object).getContext(), 2131558690, objectArray), new t(this){
            final J b;
            {
                this.b = j8;
            }

            @Override
            public void a(DialogInterface dialogInterface, int n8) {
                ax.d3.J.e(this.b, "request_open_as", "result_selection", n8);
            }
        });
        object = ((a.a)object).p(2131952280).b(true).create();
        object.setCanceledOnTouchOutside(true);
        return object;
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
    }

    @Override
    public void s1() {
        super.s1();
        ax.d3.J.b(this, "request_open_as");
    }
}

