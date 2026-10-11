package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.voxdon.xplorer.R;
import java.util.ArrayList;

/* renamed from: ax.x3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3419e extends androidx.viewpager.widget.a {
    private final Context c;
    private final ArrayList<Object> d = new ArrayList<>();
    private final ArrayList<String> e = new ArrayList<>();
    private final ArrayList<View> f = new ArrayList<>();
    private final ArrayList<LinearLayout> g = new ArrayList<>();
    private final ArrayList<NestedScrollView> h = new ArrayList<>();

    public C3419e(Context context) {
        this.c = context;
    }

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public int e() {
        return this.d.size();
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence g(int i) {
        return this.e.get(i);
    }

    @Override // androidx.viewpager.widget.a
    public Object j(ViewGroup viewGroup, int i) {
        View view = this.f.get(i);
        viewGroup.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.a
    public boolean k(View view, Object obj) {
        return view == obj;
    }

    public void v(ViewGroup viewGroup, String str, String str2) {
        this.d.add(str);
        this.e.add(str2);
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.item_card_container, viewGroup, false);
        this.f.add(inflate);
        this.g.add((LinearLayout) inflate.findViewById(R.id.card_container));
        this.h.add((NestedScrollView) inflate.findViewById(R.id.card_scrollview));
        l();
    }

    public LinearLayout w(int i) {
        return this.g.get(i);
    }

    public View x(int i) {
        return this.f.get(i);
    }

    public ArrayList<NestedScrollView> y() {
        return this.h;
    }
}
