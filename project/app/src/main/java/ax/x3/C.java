/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ax.X2.Q;
import java.util.ArrayList;
import java.util.List;

public class C
extends ArrayAdapter<a> {
    public C(Context context) {
        super(context, 0, C.a(context));
    }

    public static List<a> a(Context context) {
        ArrayList<a> arrayList = new ArrayList<a>();
        arrayList.add(a.a("SMB1"));
        if (Q.i()) {
            arrayList.add(a.a("SMB2"));
            arrayList.add(a.a("SMB3"));
        }
        arrayList.add(0, a.b(context));
        return arrayList;
    }

    public View getDropDownView(int n8, View view, ViewGroup viewGroup) {
        view = view == null ? (TextView)LayoutInflater.from((Context)this.getContext()).inflate(17367050, viewGroup, false) : (TextView)view;
        view.setText((CharSequence)((a)this.getItem((int)n8)).a);
        return view;
    }

    public View getView(int n8, View view, ViewGroup viewGroup) {
        view = view == null ? (TextView)LayoutInflater.from((Context)this.getContext()).inflate(2131558710, viewGroup, false) : (TextView)view;
        view.setText((CharSequence)((a)this.getItem((int)n8)).a);
        return view;
    }

    public static class a {
        String a;
        String b;

        a(Context context) {
            this.a = context.getString(2131951679);
            this.b = null;
        }

        a(String string) {
            this.a = string;
            this.b = string;
        }

        public static a a(String string) {
            return new a(string);
        }

        public static a b(Context context) {
            return new a(context);
        }

        public String c() {
            String string;
            String string2 = string = this.b;
            if (string == null) {
                string2 = null;
            }
            return string2;
        }

        public final boolean equals(Object object) {
            if (!(object instanceof a)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            String string = this.b;
            if (string != null) {
                return string.equals(((a)object).b);
            }
            return this.a.equals(((a)object).a);
        }
    }
}

