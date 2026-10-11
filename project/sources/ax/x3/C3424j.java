package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import ax.V2.d;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.R;
import java.util.List;

/* renamed from: ax.x3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3424j extends BaseAdapter implements d.b {
    Context a;
    ax.V2.d b;
    List<Bookmark> c;

    public C3424j(Context context, ax.V2.d dVar) {
        this.a = context;
        this.b = dVar;
        this.c = dVar.h(4, 2, true);
    }

    @Override // ax.V2.d.b
    public void a() {
        this.c = this.b.h(4, 2, true);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bookmark getItem(int i) {
        if (i >= this.c.size()) {
            return null;
        }
        return this.c.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return Math.min(this.c.size(), 4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (view == null) {
            view = from.inflate(R.layout.desktop2_carousel_last_visited_item, viewGroup, false);
        }
        Context context = viewGroup.getContext();
        Bookmark item = getItem(i);
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(ax.s3.b.d(context, item.s()));
        ((TextView) view.findViewById(R.id.title)).setText(ax.Q2.f.H(context, item.u()));
        ((TextView) view.findViewById(R.id.path)).setText(item.x());
        return view;
    }
}
