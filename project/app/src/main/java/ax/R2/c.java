/*
 * Decompiled with CFR 0.152.
 */
package ax.R2;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import ax.R2.b;
import ax.X2.Q;
import ax.X2.v;
import ax.d3.x0;
import ax.u3.z;
import com.voxdon.xplorer.widget.WindowInsetsFrameLayout;

public abstract class c
extends ax.n.c
implements x0.a {
    private x0 mWindowInsetsHelper;

    @Override
    public void onIMEVisibilityChanged(boolean bl) {
    }

    protected void onSetContentView(boolean bl) {
        Object object = new x0(this, this);
        this.mWindowInsetsHelper = object;
        ((x0)object).d((WindowInsetsFrameLayout)((Object)this.findViewById(2131362746)));
        if (Q.N1() && z.w((Context)this)) {
            v.r(this.getWindow(), -16777216);
        }
        if (bl && (object = (Toolbar)this.findViewById(2131362981)) != null) {
            this.setSupportActionBar((Toolbar)object);
            this.getSupportActionBar().x(true);
            ((Toolbar)object).setNavigationOnClickListener(new View.OnClickListener(this){
                final c a;
                {
                    this.a = c8;
                }

                public void onClick(View view) {
                    this.a.finish();
                }
            });
        }
        if (Q.W1()) {
            int n8 = z.o((Context)this, 0x1010031);
            int n9 = b.a(this, 2131099681);
            this.mWindowInsetsHelper.h(n8);
            this.mWindowInsetsHelper.i(n9);
            if (Q.b1()) {
                z.B(this, n9);
            }
        }
    }
}

