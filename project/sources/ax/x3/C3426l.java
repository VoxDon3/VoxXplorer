package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.voxdon.xplorer.file.T;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.x3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3426l extends BaseAdapter {
    private Context a;
    private List<ax.Z2.s> b = new ArrayList();

    /* renamed from: ax.x3.l$a */
    class a implements Comparator<ax.Z2.s> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ax.Z2.s sVar, ax.Z2.s sVar2) {
            long a = sVar.a();
            long a2 = sVar2.a();
            if (a < a2) {
                return -1;
            }
            return a == a2 ? 0 : 1;
        }
    }

    public C3426l(Context context) {
        this.a = context;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ax.Z2.s getItem(int i) {
        return this.b.get(i);
    }

    public void b() {
        this.b.clear();
        this.b.addAll(T.e(this.a));
        this.b.addAll(T.c(this.a));
        Collections.sort(this.b, new a());
        this.b.add(new ax.Z2.s(ax.Q2.f.Y0, 0, this.a.getString(R.string.menu_add_location), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0L, 0L));
        List<ax.Z2.s> list = this.b;
        ax.Q2.f fVar = ax.Q2.f.W0;
        list.add(0, new ax.Z2.s(fVar, 0, fVar.M(this.a), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0L, 0L));
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.desktop2_item, (ViewGroup) null);
        }
        ax.Z2.s sVar = this.b.get(i);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(ax.s3.b.e(this.a, sVar.e().d(), null));
        ((TextView) view.findViewById(R.id.name)).setText(sVar.f());
        ((TextView) view.findViewById(R.id.info)).setVisibility(8);
        return view;
    }
}
