package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ax.b2.C1480h;
import ax.c0.C1760d0;

/* loaded from: classes.dex */
public class h extends RecyclerView.F {
    private final Drawable u;
    private ColorStateList v;
    private final SparseArray<View> w;
    private boolean x;
    private boolean y;

    h(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.w = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i = C1480h.a;
        sparseArray.put(i, view.findViewById(i));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.u = view.getBackground();
        if (textView != null) {
            this.v = textView.getTextColors();
        }
    }

    public View N(int i) {
        View view = this.w.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.a.findViewById(i);
        if (findViewById != null) {
            this.w.put(i, findViewById);
        }
        return findViewById;
    }

    public boolean O() {
        return this.x;
    }

    public boolean P() {
        return this.y;
    }

    void Q() {
        Drawable background = this.a.getBackground();
        Drawable drawable = this.u;
        if (background != drawable) {
            C1760d0.o0(this.a, drawable);
        }
        TextView textView = (TextView) N(R.id.title);
        if (textView == null || this.v == null || textView.getTextColors().equals(this.v)) {
            return;
        }
        textView.setTextColor(this.v);
    }

    public void R(boolean z) {
        this.x = z;
    }

    public void S(boolean z) {
        this.y = z;
    }
}
