package ax.V2;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import ax.c3.K;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class f extends BaseAdapter {
    private List<Bookmark> a = new ArrayList();
    private Context b;
    private d c;
    private K d;
    private String e;

    class a extends ax.g3.c {
        final /* synthetic */ Bookmark c;

        a(Bookmark bookmark) {
            this.c = bookmark;
        }

        @Override // ax.g3.c
        public void a(View view) {
            f.this.c.p(this.c);
            f.this.e(this.c);
            f.this.notifyDataSetChanged();
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 21 || keyEvent.getAction() != 0) {
                return false;
            }
            ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof ListView)) {
                parent = parent.getParent();
            }
            if (!(parent instanceof ListView)) {
                return true;
            }
            ListView listView = (ListView) parent;
            listView.setItemsCanFocus(false);
            listView.setDescendantFocusability(131072);
            listView.requestFocus();
            return true;
        }
    }

    public f(Context context, d dVar) {
        this.b = context;
        this.c = dVar;
    }

    private List<Bookmark> c(List<Bookmark> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Bookmark> it = list.iterator();
        while (it.hasNext()) {
            K u = it.next().u();
            if (!arrayList.contains(u)) {
                arrayList.add(u);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            K k = (K) obj;
            for (Bookmark bookmark : list) {
                if (k.equals(bookmark.u())) {
                    arrayList2.add(bookmark);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Bookmark bookmark) {
        this.a.remove(bookmark);
    }

    public void d(K k, String str) {
        this.d = k;
        this.e = str;
        List<Bookmark> h = this.c.h(5, 3, false);
        Iterator<Bookmark> it = h.iterator();
        while (it.hasNext()) {
            Bookmark next = it.next();
            K u = next.u();
            String w = next.w();
            if (u.equals(k) && w != null && w.equals(str)) {
                it.remove();
            }
        }
        List<Bookmark> c = c(h);
        this.a.clear();
        for (Bookmark bookmark : c) {
            if (bookmark.A()) {
                this.a.add(bookmark);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        Bookmark bookmark = (Bookmark) getItem(i);
        if (view == null) {
            view = ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.layout.item_top_windows, (ViewGroup) null);
        }
        ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(bookmark.r(this.b));
        ((TextView) view.findViewById(R.id.path)).setText(bookmark.x());
        if (i == 0 || bookmark.s() != ((Bookmark) getItem(i - 1)).s()) {
            view.findViewById(R.id.location_layout).setVisibility(0);
            String H = ax.Q2.f.H(this.b, bookmark.u());
            String G = ax.Q2.f.G(this.b, bookmark.u());
            ((TextView) view.findViewById(R.id.location)).setText(H);
            ((ImageView) view.findViewById(R.id.location_icon)).setImageDrawable(ax.s3.b.j(this.b, bookmark.s(), false));
            ((ImageView) view.findViewById(R.id.location_icon)).setVisibility(0);
            if (G != null) {
                ((TextView) view.findViewById(R.id.secondary_name)).setText("(" + G + ")");
            } else {
                ((TextView) view.findViewById(R.id.secondary_name)).setText(HttpUrl.FRAGMENT_ENCODE_SET);
            }
        } else {
            view.findViewById(R.id.location_layout).setVisibility(8);
        }
        view.findViewById(R.id.clear_button).setOnClickListener(new a(bookmark));
        view.findViewById(R.id.clear_button).setOnKeyListener(new b());
        return view;
    }
}
