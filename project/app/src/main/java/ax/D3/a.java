/*
 * Decompiled with CFR 0.152.
 */
package ax.D3;

import android.widget.ProgressBar;

public class a {
    private final ProgressBar a;
    private final ProgressBar b;
    private boolean c;

    public a(ProgressBar progressBar, ProgressBar progressBar2, boolean bl) {
        this.a = progressBar;
        this.b = progressBar2;
        this.a(bl);
    }

    private void c(boolean bl) {
        ProgressBar progressBar = this.b;
        int n8 = 8;
        int n9 = bl ? 0 : 8;
        progressBar.setVisibility(n9);
        progressBar = this.a;
        n9 = bl ? n8 : 0;
        progressBar.setVisibility(n9);
    }

    public void a(boolean bl) {
        this.c = bl;
        this.c(bl);
    }

    public void b(int n8) {
        if (n8 != 4 && n8 != 8) {
            this.c(this.c);
            return;
        }
        this.b.setVisibility(n8);
        this.a.setVisibility(n8);
    }
}

