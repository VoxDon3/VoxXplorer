/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.a;
import ax.a3.I;
import ax.u3.h;

public class o
extends I {
    private e t0;
    private String u0;
    private String v0;
    private String w0;
    private int x0;

    public static o j3(String string, String string2, String string3) {
        o o8 = new o();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_type", 2);
        bundle.putString("host", string);
        bundle.putString("param1", string2);
        bundle.putString("param2", string3);
        o8.v2(bundle);
        return o8;
    }

    public static String k3(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" key fingerprint: ");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static o l3(String string, String string2, String string3) {
        o o8 = new o();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_type", 1);
        bundle.putString("host", string);
        bundle.putString("param1", string2);
        bundle.putString("param2", string3);
        o8.v2(bundle);
        return o8;
    }

    @Override
    public void H1() {
        super.H1();
    }

    @Override
    public void f3() {
        super.f3();
        if (this.j0() != null) {
            this.x0 = this.j0().getInt("dialog_type");
            this.w0 = this.j0().getString("host");
            this.u0 = this.j0().getString("param1");
            this.v0 = this.j0().getString("param2");
        }
    }

    @Override
    public Dialog g3() {
        Object object;
        this.Y2(false);
        a.a a8 = h.a((Context)this.f0());
        int n8 = this.x0;
        if (n8 == 1) {
            a8.setTitle(this.w0);
            a8.f(o.k3(this.u0, this.v0));
        } else if (n8 == 2) {
            a8.p(2131952322);
            object = new StringBuilder();
            ((StringBuilder)object).append("Subject DN: ");
            ((StringBuilder)object).append(this.u0);
            ((StringBuilder)object).append("\nIssuer DN: ");
            ((StringBuilder)object).append(this.v0);
            a8.f(((StringBuilder)object).toString());
        }
        a8.setView(LayoutInflater.from((Context)this.f0()).inflate(2131558518, null, false));
        a8.setPositiveButton(17039379, new DialogInterface.OnClickListener(this){
            final o a;
            {
                this.a = o8;
            }

            public void onClick(DialogInterface dialogInterface, int n8) {
                this.a.t0.a(true);
            }
        });
        a8.setNegativeButton(17039369, new DialogInterface.OnClickListener(this){
            final o a;
            {
                this.a = o8;
            }

            public void onClick(DialogInterface dialogInterface, int n8) {
                this.a.t0.a(false);
            }
        });
        a8.j(new DialogInterface.OnCancelListener(this){
            final o a;
            {
                this.a = o8;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.a.t0.a(false);
            }
        });
        object = a8.create();
        object.setOnShowListener(new DialogInterface.OnShowListener(){
            final a a;
            final o b;
            {
                this.b = o8;
                this.a = a8;
            }

            public void onShow(DialogInterface dialogInterface) {
                dialogInterface = this.a.i(-1);
                if (dialogInterface != null) {
                    dialogInterface.requestFocus();
                }
            }
        });
        object.setCanceledOnTouchOutside(false);
        return object;
    }

    public void m3(e e8) {
        this.t0 = e8;
    }

    public static interface e {
        public void a(boolean var1);
    }
}

