package ax.D3;

import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class a {
    private final ProgressBar a;
    private final ProgressBar b;
    private boolean c;

    public a(ProgressBar progressBar, ProgressBar progressBar2, boolean z) {
        this.a = progressBar;
        this.b = progressBar2;
        a(z);
    }

    private void c(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
        this.a.setVisibility(z ? 8 : 0);
    }

    public void a(boolean z) {
        this.c = z;
        c(z);
    }

    public void b(int i) {
        if (i != 4 && i != 8) {
            c(this.c);
        } else {
            this.b.setVisibility(i);
            this.a.setVisibility(i);
        }
    }
}
