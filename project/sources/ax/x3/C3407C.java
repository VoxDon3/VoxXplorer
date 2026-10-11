package ax.x3;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ax.X2.Q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.x3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3407C extends ArrayAdapter<a> {
    public C3407C(Context context) {
        super(context, 0, a(context));
    }

    public static List<a> a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(a.a("SMB1"));
        if (Q.i()) {
            arrayList.add(a.a("SMB2"));
            arrayList.add(a.a("SMB3"));
        }
        arrayList.add(0, a.b(context));
        return arrayList;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = view == null ? (TextView) LayoutInflater.from(getContext()).inflate(R.layout.simple_dropdown_item_1line, viewGroup, false) : (TextView) view;
        textView.setText(((a) getItem(i)).a);
        return textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = view == null ? (TextView) LayoutInflater.from(getContext()).inflate(com.voxdon.xplorer.R.layout.view_spinner_text, viewGroup, false) : (TextView) view;
        textView.setText(((a) getItem(i)).a);
        return textView;
    }

    /* renamed from: ax.x3.C$a */
    public static class a {
        String a;
        String b;

        a(String str) {
            this.a = str;
            this.b = str;
        }

        public static a a(String str) {
            return new a(str);
        }

        public static a b(Context context) {
            return new a(context);
        }

        public String c() {
            String str = this.b;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            String str = this.b;
            return str != null ? str.equals(((a) obj).b) : this.a.equals(((a) obj).a);
        }

        a(Context context) {
            this.a = context.getString(com.voxdon.xplorer.R.string.automatic);
            this.b = null;
        }
    }
}
