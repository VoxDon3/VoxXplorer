package ax.x3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ax.X2.Q;
import ax.s3.C3045a;
import ax.u3.C3180B;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.x3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3420f extends BaseAdapter {
    private List<a> a;
    private Context b;

    /* renamed from: ax.x3.f$a */
    public static class a {
        public ax.Q2.f a;
        public Object b;
        public String c;

        a(Context context, ax.Q2.f fVar, Object obj) {
            this.a = fVar;
            this.b = obj;
            if (fVar != ax.Q2.f.H0) {
                this.c = fVar.M(context);
            } else if (obj == Boolean.FALSE) {
                this.c = context.getString(R.string.location_ftp);
            } else {
                this.c = context.getString(R.string.location_ftps);
            }
        }
    }

    public C3420f(Context context, List<a> list) {
        this.b = context;
        this.a = list;
    }

    public static C3420f a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(context, ax.Q2.f.N0, null));
        arrayList.add(new a(context, ax.Q2.f.O0, null));
        arrayList.add(new a(context, ax.Q2.f.P0, null));
        if (Q.D0()) {
            arrayList.add(new a(context, ax.Q2.f.S0, null));
        }
        return new C3420f(context, arrayList);
    }

    public static C3420f b(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(context, ax.Q2.f.L0, null));
        arrayList.add(new a(context, ax.Q2.f.J0, null));
        arrayList.add(new a(context, ax.Q2.f.H0, Boolean.FALSE));
        arrayList.add(new a(context, ax.Q2.f.I0, null));
        arrayList.add(new a(context, ax.Q2.f.K0, null));
        return new C3420f(context, arrayList);
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = view != null ? (TextView) view : (TextView) ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.layout.select_dialog_item_material, viewGroup, false);
        a item = getItem(i);
        textView.setText(item.c);
        Drawable c = C3045a.c(this.b, ax.s3.b.k(item.a, null));
        int e = C3180B.e(this.b, 32);
        c.setBounds(0, 0, e, e);
        textView.setCompoundDrawables(c, null, null, null);
        textView.setCompoundDrawablePadding(C3180B.e(this.b, 12));
        return textView;
    }
}
