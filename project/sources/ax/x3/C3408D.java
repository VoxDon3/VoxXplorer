package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voxdon.xplorer.R;
import java.util.List;

/* renamed from: ax.x3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3408D extends RecyclerView.h<a> {
    private LayoutInflater d;
    private View.OnClickListener e;
    private AdapterView.OnItemClickListener f;
    private List<String> g;
    private Context h;

    /* renamed from: ax.x3.D$a */
    public class a extends RecyclerView.F {
        TextView u;
        ImageView v;
        ImageView w;

        /* renamed from: ax.x3.D$a$a, reason: collision with other inner class name */
        class C0485a extends ax.g3.c {
            final /* synthetic */ C3408D c;

            C0485a(C3408D c3408d) {
                this.c = c3408d;
            }

            @Override // ax.g3.c
            public void a(View view) {
                int k;
                if (C3408D.this.f == null || (k = a.this.k()) < 0) {
                    return;
                }
                C3408D.this.f.onItemClick(null, view, k, a.this.l());
            }
        }

        a(View view) {
            super(view);
            this.v = (ImageView) view.findViewById(R.id.icon);
            this.u = (TextView) view.findViewById(android.R.id.text1);
            ImageView imageView = (ImageView) view.findViewById(R.id.delete);
            this.w = imageView;
            imageView.setOnClickListener(C3408D.this.e);
            view.setOnClickListener(new C0485a(C3408D.this));
        }
    }

    public C3408D(Context context, List<String> list) {
        this.g = list;
        this.h = context;
        this.d = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void B(a aVar, int i) {
        aVar.u.setText(this.g.get(i));
        aVar.w.setTag(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public a D(ViewGroup viewGroup, int i) {
        return new a(this.d.inflate(R.layout.item_search_history, viewGroup, false));
    }

    public void R(AdapterView.OnItemClickListener onItemClickListener) {
        this.f = onItemClickListener;
    }

    public void S(View.OnClickListener onClickListener) {
        this.e = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int l() {
        return this.g.size();
    }
}
