package ax.x3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import ax.c3.C1809B;
import ax.c3.K;
import ax.u3.C3180B;
import com.voxdon.xplorer.widget.PieProgress;
import com.voxdon.xplorer.R;
import okhttp3.HttpUrl;

/* renamed from: ax.x3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3425k {
    Context a;
    View b;
    K c;
    ax.Z2.d d;
    View e;
    PieProgress f;
    TextView g;
    View h;
    TextView i;
    TextView j;
    TextView k;
    TextView l;
    Button m;
    boolean n;
    int o;
    int p;
    b q;

    /* renamed from: ax.x3.k$a */
    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            C3425k c3425k = C3425k.this;
            b bVar = c3425k.q;
            if (bVar != null) {
                bVar.x(c3425k.c);
            }
        }
    }

    /* renamed from: ax.x3.k$b */
    public interface b {
        void x(K k);
    }

    public C3425k(View view, ax.Z2.d dVar, K k, b bVar) {
        this.b = view;
        this.a = view.getContext();
        this.d = dVar;
        this.c = k;
        this.q = bVar;
        b();
        a();
    }

    private void b() {
        this.e = this.b.findViewById(R.id.graph_layout);
        this.f = (PieProgress) this.b.findViewById(R.id.pie_progress);
        ((TextView) this.b.findViewById(R.id.location_name)).setText(this.c.f(this.a));
        this.g = (TextView) this.b.findViewById(R.id.location_percent);
        this.h = this.b.findViewById(R.id.location_percent_mark);
        this.i = (TextView) this.b.findViewById(R.id.location_info);
        this.j = (TextView) this.b.findViewById(R.id.size_image);
        this.k = (TextView) this.b.findViewById(R.id.size_audio);
        this.l = (TextView) this.b.findViewById(R.id.size_video);
        this.m = (Button) this.b.findViewById(R.id.button_analyze);
        this.o = ax.Q.b.c(this.a, R.color.desktop2_full_indicate);
        this.p = ax.Q.b.c(this.a, R.color.desktop2_carousel_foreground_color);
        this.m.setText(R.string.label_clean);
        this.m.setOnClickListener(new a());
    }

    public void a() {
        if (this.d.t(this.c)) {
            float r = this.d.r(this.c);
            this.f.setProgressPercent((int) r);
            try {
                this.g.setText(C3180B.Q(r));
            } catch (IndexOutOfBoundsException e) {
                String Q = C3180B.Q(r);
                ax.Q2.d.c("emoji2settext", new Exception("Emoji error:" + Q + ":" + Q.length(), e));
                TextView textView = this.g;
                if (textView instanceof androidx.appcompat.widget.x) {
                    ((androidx.appcompat.widget.x) textView).setEmojiCompatEnabled(false);
                }
                this.g.setText(C3180B.R(r));
            }
            this.h.setVisibility(0);
            this.i.setText(this.d.v(this.c, true));
            this.n = r >= ((float) ax.Q2.e.l(this.a));
        } else {
            this.f.setProgressPercent(0);
            this.g.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            this.h.setVisibility(4);
            this.i.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            this.n = false;
        }
        if (this.n) {
            this.g.setTextColor(this.o);
        } else {
            this.g.setTextColor(this.p);
        }
        ax.Z2.d dVar = this.d;
        ax.Q2.f fVar = ax.Q2.f.z0;
        if (dVar.s(fVar)) {
            this.j.setText(C1809B.k(this.a, this.d.l(fVar, this.c.d())));
        } else {
            this.j.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        ax.Z2.d dVar2 = this.d;
        ax.Q2.f fVar2 = ax.Q2.f.A0;
        if (dVar2.s(fVar2)) {
            this.k.setText(C1809B.k(this.a, this.d.l(fVar2, this.c.d())));
        } else {
            this.k.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        ax.Z2.d dVar3 = this.d;
        ax.Q2.f fVar3 = ax.Q2.f.B0;
        if (dVar3.s(fVar3)) {
            this.l.setText(C1809B.k(this.a, this.d.l(fVar3, this.c.d())));
        } else {
            this.l.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    public void c(int i) {
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        int e = C3180B.e(this.a, i);
        layoutParams.width = e;
        layoutParams.height = e;
        this.e.setLayoutParams(layoutParams);
    }
}
