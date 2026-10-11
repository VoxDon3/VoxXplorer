/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import ax.a3.I;
import ax.u3.h;

public class V
extends I {
    private b t0;
    private String u0;
    private String[] v0;

    public static V l3(String string) {
        V v8 = new V();
        Bundle bundle = new Bundle();
        bundle.putString("sort_method", string);
        v8.v2(bundle);
        return v8;
    }

    @Override
    public void f3() {
        super.f3();
        if (this.j0() == null) {
            return;
        }
        this.u0 = this.j0().getString("sort_method");
        this.v0 = this.p2().getResources().getStringArray(2130903068);
    }

    @Override
    public Dialog g3() {
        a.a a8 = h.a((Context)this.f0());
        a8.p(2131952597);
        a8.m(2130903067, this.k3(this.u0), new DialogInterface.OnClickListener(this){
            final V a;
            {
                this.a = v8;
            }

            public void onClick(DialogInterface dialogInterface, int n8) {
                if (this.a.t0 != null) {
                    this.a.t0.a(this.a.v0[n8]);
                }
                dialogInterface.dismiss();
            }
        });
        a8.setPositiveButton(17039370, null);
        a8.b(true);
        return a8.create();
    }

    public int k3(String string) {
        Object object;
        if (string == null) {
            return 0;
        }
        for (int i8 = 0; i8 < ((String[])(object = this.v0)).length; ++i8) {
            if (!string.equals(object[i8])) continue;
            return i8;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("invalid sortMethod : ");
        ((StringBuilder)object).append(string);
        ax.u3.b.g(((StringBuilder)object).toString());
        return 0;
    }

    public void m3(b b8) {
        this.t0 = b8;
    }

    public static interface b {
        public void a(String var1);
    }
}

