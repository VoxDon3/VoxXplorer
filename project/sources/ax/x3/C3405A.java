package ax.x3;

import android.view.View;
import ax.n.ActivityC2561c;
import com.voxdon.xplorer.R;

/* renamed from: ax.x3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3405A extends C3418d {
    private View o;
    private View p;
    private View q;
    private View r;

    public C3405A(ActivityC2561c activityC2561c, View view, View view2) {
        super(activityC2561c, view, view2);
    }

    public int C() {
        View g = g(0);
        if (g != null) {
            return g.getId();
        }
        return -1;
    }

    public void D() {
        this.o = d(R.id.bottom_menu_cancel, android.R.string.cancel, R.drawable.ic_close, null);
        this.p = d(R.id.bottom_menu_paste, R.string.menu_paste, R.drawable.ic_content_paste, null);
        this.q = d(R.id.bottom_menu_save, R.string.menu_save, R.drawable.ic_save, null);
        this.r = d(R.id.bottom_menu_select, R.string.menu_select, R.drawable.ic_done, null);
    }

    public void E(boolean z, boolean z2) {
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        if (z) {
            this.q.setVisibility(0);
            if (z2) {
                o(this.q.getId(), true);
                return;
            } else {
                o(this.q.getId(), false);
                return;
            }
        }
        this.p.setVisibility(0);
        if (z2) {
            o(this.p.getId(), true);
        } else {
            o(this.p.getId(), false);
        }
    }

    public void F(boolean z) {
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        this.r.setVisibility(0);
        if (z) {
            o(this.r.getId(), true);
        } else {
            o(this.r.getId(), false);
        }
    }
}
