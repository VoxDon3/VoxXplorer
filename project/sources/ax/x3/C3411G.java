package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voxdon.xplorer.R;

/* renamed from: ax.x3.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3411G extends RecyclerView.h<a> {
    public static long h = Long.MAX_VALUE;
    private int d;
    private boolean e;
    private AdapterView.OnItemClickListener f;
    private float g;

    /* renamed from: ax.x3.G$a */
    public class a extends RecyclerView.F {
        private View u;

        /* renamed from: ax.x3.G$a$a, reason: collision with other inner class name */
        class C0486a extends ax.g3.c {
            final /* synthetic */ C3411G c;

            C0486a(C3411G c3411g) {
                this.c = c3411g;
            }

            @Override // ax.g3.c
            public void a(View view) {
                int k;
                if (C3411G.this.e || C3411G.this.f == null || (k = a.this.k()) < 0) {
                    return;
                }
                C3411G.this.f.onItemClick(null, view, k, a.this.l());
            }
        }

        /* renamed from: ax.x3.G$a$b */
        class b implements View.OnLongClickListener {
            final /* synthetic */ C3411G a;

            b(C3411G c3411g) {
                this.a = c3411g;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return false;
            }
        }

        a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.background_layer);
            this.u = findViewById;
            findViewById.setOnClickListener(new C0486a(C3411G.this));
            this.u.setOnLongClickListener(new b(C3411G.this));
        }

        void N() {
            if (this.u != null) {
                if (C3411G.this.e) {
                    this.u.setBackgroundResource(0);
                    this.a.setAlpha(C3411G.this.g);
                    this.a.setEnabled(true);
                } else {
                    this.u.setBackgroundResource(R.drawable.bg_transparent_bound);
                    this.a.setAlpha(1.0f);
                    this.a.setEnabled(false);
                }
            }
        }
    }

    public C3411G(Context context, int i) {
        K(true);
        this.d = i;
        this.g = ax.u3.z.i(context, android.R.attr.disabledAlpha, 0.3f);
        this.e = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void B(a aVar, int i) {
        aVar.N();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public a D(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sublocation_list_footer, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.network_footer_bt_text)).setText(this.d);
        return new a(inflate);
    }

    public void S(AdapterView.OnItemClickListener onItemClickListener) {
        this.f = onItemClickListener;
    }

    public void T(RecyclerView recyclerView, boolean z) {
        this.e = z;
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            RecyclerView.F m0 = recyclerView.m0(recyclerView.getChildAt(i));
            if (m0 instanceof a) {
                ((a) m0).N();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int l() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long m(int i) {
        return h;
    }
}
