package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.voxdon.xplorer.R;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class s extends ArrayAdapter<ax.W2.j> {
    private Context a;

    public class a {
        private TextView a;
        private TextView b;
        private TextView c;
        private TextView d;
        private TextView e;
        private ProgressBar f;
        private ax.W2.j g;
        private int h;
        private int i;

        public a(View view) {
            b(view);
        }

        private void b(View view) {
            this.a = (TextView) view.findViewById(R.id.file_progress_item_tv_progress_type);
            this.b = (TextView) view.findViewById(R.id.file_progress_item_tv_file_name);
            this.c = (TextView) view.findViewById(R.id.file_progress_item_tv_progress_size);
            this.d = (TextView) view.findViewById(R.id.file_progress_item_tv_progress_percent);
            this.e = (TextView) view.findViewById(R.id.file_progress_item_tv_progress_count);
            this.f = (ProgressBar) view.findViewById(R.id.file_progress_item_pb_total_progress);
        }

        public void a(ax.W2.j jVar, int i) {
            if (jVar == null) {
                return;
            }
            ax.W2.v w = jVar.w();
            ax.W2.j jVar2 = this.g;
            if (jVar2 == null || jVar2 != jVar) {
                this.g = jVar;
                this.h = jVar.B();
                this.a.setText(jVar.C());
                this.f.setMax(w.u());
            } else if (this.h != jVar.B()) {
                this.h = jVar.B();
                this.a.setText(jVar.C());
            }
            if (!w.R() && !w.Q()) {
                this.b.setText(w.v());
                this.c.setText(w.A(s.this.getContext()));
                this.d.setText(w.w());
                this.e.setText(s.this.a.getString(R.string.simple_progress_size, w.y()));
                this.f.setProgress(w.t());
                return;
            }
            int q = w.q();
            if (this.i != q) {
                this.i = q;
                this.f.setMax(q);
            }
            this.f.setProgress(w.o());
            this.b.setText(w.i());
            this.c.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            this.d.setText("99%");
            this.e.setText(s.this.getContext().getString(R.string.progress_count, w.p()));
        }
    }

    public s(Context context, List<ax.W2.j> list) {
        super(context, 0, list);
        this.a = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        ax.W2.j jVar = (ax.W2.j) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(R.layout.file_progress_item, viewGroup, false);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.a(jVar, i);
        return view;
    }
}
