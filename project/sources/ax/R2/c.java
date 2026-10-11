package ax.R2;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import ax.X2.Q;
import ax.X2.v;
import ax.d3.x0;
import ax.n.ActivityC2561c;
import ax.u3.z;
import com.voxdon.xplorer.widget.WindowInsetsFrameLayout;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public abstract class c extends ActivityC2561c implements x0.a {
    private x0 mWindowInsetsHelper;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.finish();
        }
    }

    protected void onSetContentView(boolean z) {
        int color;
        Toolbar toolbar;
        x0 x0Var = new x0(this, this);
        this.mWindowInsetsHelper = x0Var;
        x0Var.d((WindowInsetsFrameLayout) findViewById(R.id.root_view));
        if (Q.N1() && z.w(this)) {
            v.r(getWindow(), -16777216);
        }
        if (z && (toolbar = (Toolbar) findViewById(R.id.toolbar)) != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().x(true);
            toolbar.setNavigationOnClickListener(new a());
        }
        if (Q.W1()) {
            int o = z.o(this, android.R.attr.colorBackground);
            color = getColor(R.color.actionbar_color);
            this.mWindowInsetsHelper.h(o);
            this.mWindowInsetsHelper.i(color);
            if (Q.b1()) {
                z.B(this, color);
            }
        }
    }

    @Override // ax.d3.x0.a
    public void onIMEVisibilityChanged(boolean z) {
    }
}
