/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
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
import androidx.fragment.app.f;
import ax.Q2.g;
import ax.a3.I;
import ax.u3.B;
import ax.u3.b;
import ax.u3.h;
import java.util.ArrayList;
import java.util.logging.Logger;

public class k
extends I {
    private static final Logger u0 = g.a(k.class);
    ArrayList<String> t0;

    public static k i3(int n8, String string, String string2, ArrayList<String> arrayList) {
        k k8 = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("TITLE", n8);
        bundle.putString("MESSAGE", string);
        bundle.putString("ERROR_MESSAGE", string2);
        k8.j3(arrayList);
        k8.v2(bundle);
        return k8;
    }

    @Override
    public void f3() {
        super.f3();
        if (this.j0() == null) {
            b.e("no bundle?");
            this.Z2(false);
        }
    }

    @Override
    public Dialog g3() {
        String string;
        Object object = this.j0();
        a.a a8 = h.a((Context)this.f0());
        int n8 = object.getInt("TITLE", 2131951894);
        if (n8 != 0) {
            a8.p(n8);
        }
        if ((string = object.getString("TITLE_STRING")) != null) {
            a8.setTitle(string);
        }
        if ((string = object.getString("MESSAGE")) != null) {
            a8.f(string);
        }
        string = LayoutInflater.from((Context)this.f0()).inflate(2131558496, null, false);
        String string2 = object.getString("ERROR_MESSAGE");
        boolean bl = TextUtils.isEmpty((CharSequence)string2);
        int n9 = 1;
        if (!bl) {
            object = (TextView)string.findViewById(2131362192);
            object.setVisibility(0);
            object.setText((CharSequence)string2);
            n8 = 1;
        } else {
            n8 = 0;
        }
        object = this.t0;
        if (object != null && ((ArrayList)object).size() > 0) {
            string2 = (ListView)string.findViewById(2131362307);
            string2.setVisibility(0);
            string2.setAdapter((ListAdapter)new ArrayAdapter(this.b(), 2131558497, 2131362304, this.t0));
            n8 = n9;
            if (this.t0.size() > 5) {
                object = string2.getLayoutParams();
                ((ViewGroup.LayoutParams)object).height = B.e(this.b(), 100);
                string2.setLayoutParams((ViewGroup.LayoutParams)object);
                n8 = n9;
            }
        }
        if (n8 != 0) {
            a8.setView((View)string);
        }
        return a8.setPositiveButton(17039370, null).create();
    }

    public void j3(ArrayList<String> arrayList) {
        this.t0 = arrayList;
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        f f8 = this.f0();
        if (f8 instanceof DialogInterface.OnDismissListener) {
            ((DialogInterface.OnDismissListener)f8).onDismiss(dialogInterface);
        }
    }
}

