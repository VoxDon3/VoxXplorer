/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.Q2.a;
import ax.a3.B;
import ax.a3.C;
import ax.t3.c;
import com.alphainventor.filemanager.activity.MainActivity;

public class w
extends C {
    private long t0 = 1000L;

    private void l3() {
        if (this.f0() != null) {
            a.i().m("general", "double_back_exit").c("from", "ExitAdsDialog").e();
            this.f0().finish();
        }
    }

    public static int m3(Context context) {
        int n8 = ax.u3.B.z(context);
        if (n8 >= 410) {
            return 390;
        }
        if (n8 >= 380) {
            return 360;
        }
        if (n8 >= 350) {
            return 330;
        }
        return 300;
    }

    public static boolean n3(int n8) {
        return n8 == 0 || n8 == 1;
        {
        }
    }

    @Override
    public void D1() {
        super.D1();
    }

    @Override
    public void K1() {
        super.K1();
        this.O2();
    }

    @Override
    public void f3() {
        super.f3();
        this.t0 = c.n().j();
    }

    @Override
    public Dialog i3(boolean bl) {
        int n8 = c.n().l();
        bl = bl && w.n3(n8);
        return new b(this, this.b(), bl, n8);
    }

    private class b
    extends B {
        private CoordinatorLayout f;
        private int g;
        private View h;
        private View i;
        private long j;
        final w k;

        private b(w object, Context context, boolean bl, int n8) {
            this.k = object;
            object = bl ? B.b.c0 : B.b.d0;
            super(context, (B.b)((Object)object));
            object = bl ? this.getLayoutInflater().inflate(2131558502, null, false) : this.getLayoutInflater().inflate(2131558501, null, false);
            this.n((View)object);
            this.g = n8;
        }

        private void r(View object) {
            View view;
            View view2 = object.findViewById(2131361999);
            view2.setOnClickListener(new View.OnClickListener(this){
                final b a;
                {
                    this.a = b8;
                }

                public void onClick(View view) {
                    this.a.cancel();
                }
            });
            View view3 = object.findViewById(2131362313);
            view3.setOnClickListener(new View.OnClickListener(this){
                final b a;
                {
                    this.a = b8;
                }

                public void onClick(View view) {
                    this.a.k.O2();
                    this.a.k.l3();
                }
            });
            this.i = view = object.findViewById(2131362314);
            view.setAlpha(0.5f);
            this.i.setOnClickListener(new View.OnClickListener(this){
                final b a;
                {
                    this.a = b8;
                }

                public void onClick(View view) {
                    if (System.currentTimeMillis() < this.a.j + this.a.k.t0) {
                        return;
                    }
                    this.a.k.O2();
                    this.a.k.l3();
                }
            });
            int n8 = this.g;
            if (n8 == 0) {
                view3.setVisibility(4);
                view2.setVisibility(0);
                this.i.setVisibility(0);
            } else if (n8 == 1) {
                view2.setVisibility(4);
                view3.setVisibility(4);
                this.i.setVisibility(8);
            } else if (!this.k()) {
                view2.setVisibility(4);
                view3.setVisibility(0);
                this.i.setVisibility(8);
            }
            this.h = view = object.findViewById(2131361911);
            view.setAlpha(0.5f);
            this.f = (CoordinatorLayout)object.findViewById(2131361866);
            n8 = this.k() ? w.m3(object.getContext()) : 300;
            this.f.getLayoutParams().width = ax.u3.B.e(this.getContext(), n8);
            object = this.getOwnerActivity() instanceof MainActivity ? ((MainActivity)this.getOwnerActivity()).A1() : null;
            if (object != null) {
                if (object.getParent() != null && object.getParent() instanceof ViewGroup) {
                    ((ViewGroup)object.getParent()).removeView(object);
                }
                object.setLayoutParams((ViewGroup.LayoutParams)new CoordinatorLayout.f(-1, -2));
                this.f.addView((View)object);
            }
        }

        public void onBackPressed() {
            if (System.currentTimeMillis() < this.j + this.k.t0) {
                return;
            }
            super.onBackPressed();
            this.k.l3();
        }

        @Override
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.r(this.e());
            this.j = System.currentTimeMillis();
            this.h.postDelayed(new Runnable(this){
                final b q;
                {
                    this.q = b8;
                }

                @Override
                public void run() {
                    this.q.h.setAlpha(1.0f);
                    this.q.i.setAlpha(1.0f);
                }
            }, this.k.t0);
        }
    }
}

