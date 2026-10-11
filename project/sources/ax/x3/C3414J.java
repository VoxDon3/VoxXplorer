package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voxdon.xplorer.R;
import java.util.List;

/* renamed from: ax.x3.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3414J extends RecyclerView.h<a> {
    private final Context d;
    private final List<ax.o3.o> e;
    private InterfaceC3406B f;

    /* renamed from: ax.x3.J$a */
    class a extends RecyclerView.F {
        private final TextView u;
        private final ImageView v;

        /* renamed from: ax.x3.J$a$a, reason: collision with other inner class name */
        class C0488a extends ax.g3.c {
            final /* synthetic */ C3414J c;

            C0488a(C3414J c3414j) {
                this.c = c3414j;
            }

            @Override // ax.g3.c
            public void a(View view) {
                int k;
                if (C3414J.this.f == null || (k = a.this.k()) < 0) {
                    return;
                }
                C3414J.this.f.a(view, k);
            }
        }

        public a(View view) {
            super(view);
            view.setOnClickListener(new C0488a(C3414J.this));
            this.u = (TextView) view.findViewById(R.id.name);
            this.v = (ImageView) view.findViewById(R.id.icon);
        }

        public void N(ax.o3.o oVar) {
            this.u.setText(oVar.e());
            int f = oVar.f();
            if (f == 2) {
                this.v.setImageResource(R.drawable.ic_tablet);
                return;
            }
            if (f == 3) {
                this.v.setImageResource(R.drawable.ic_laptop);
            } else if (f != 4) {
                this.v.setImageResource(R.drawable.ic_smartphone);
            } else {
                this.v.setImageResource(R.drawable.ic_television);
            }
        }
    }

    public C3414J(Context context, List<ax.o3.o> list) {
        this.d = context;
        this.e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void B(a aVar, int i) {
        aVar.N(this.e.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public a D(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.d).inflate(R.layout.transfer_device_item, viewGroup, false));
    }

    public void Q(InterfaceC3406B interfaceC3406B) {
        this.f = interfaceC3406B;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int l() {
        return this.e.size();
    }
}
