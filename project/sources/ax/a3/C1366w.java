package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.a3.DialogC1343B;
import ax.u3.C3180B;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.R;

/* renamed from: ax.a3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1366w extends AbstractC1344C {
    private long t0 = 1000;

    /* renamed from: ax.a3.w$b */
    private class b extends DialogC1343B {
        private CoordinatorLayout f;
        private int g;
        private View h;
        private View i;
        private long j;

        /* renamed from: ax.a3.w$b$a */
        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b.this.cancel();
            }
        }

        /* renamed from: ax.a3.w$b$b, reason: collision with other inner class name */
        class ViewOnClickListenerC0251b implements View.OnClickListener {
            ViewOnClickListenerC0251b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1366w.this.O2();
                C1366w.this.l3();
            }
        }

        /* renamed from: ax.a3.w$b$c */
        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (System.currentTimeMillis() < b.this.j + C1366w.this.t0) {
                    return;
                }
                C1366w.this.O2();
                C1366w.this.l3();
            }
        }

        /* renamed from: ax.a3.w$b$d */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.h.setAlpha(1.0f);
                b.this.i.setAlpha(1.0f);
            }
        }

        private void r(View view) {
            View findViewById = view.findViewById(R.id.cancel);
            findViewById.setOnClickListener(new a());
            View findViewById2 = view.findViewById(R.id.finish);
            findViewById2.setOnClickListener(new ViewOnClickListenerC0251b());
            View findViewById3 = view.findViewById(R.id.finish_bottom);
            this.i = findViewById3;
            findViewById3.setAlpha(0.5f);
            this.i.setOnClickListener(new c());
            int i = this.g;
            if (i == 0) {
                findViewById2.setVisibility(4);
                findViewById.setVisibility(0);
                this.i.setVisibility(0);
            } else if (i == 1) {
                findViewById.setVisibility(4);
                findViewById2.setVisibility(4);
                this.i.setVisibility(8);
            } else if (!k()) {
                findViewById.setVisibility(4);
                findViewById2.setVisibility(0);
                this.i.setVisibility(8);
            }
            View findViewById4 = view.findViewById(R.id.back_button_desc);
            this.h = findViewById4;
            findViewById4.setAlpha(0.5f);
            this.f = (CoordinatorLayout) view.findViewById(R.id.ad_container);
            this.f.getLayoutParams().width = C3180B.e(getContext(), k() ? C1366w.m3(view.getContext()) : 300);
            View A1 = getOwnerActivity() instanceof MainActivity ? ((MainActivity) getOwnerActivity()).A1() : null;
            if (A1 != null) {
                if (A1.getParent() != null && (A1.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) A1.getParent()).removeView(A1);
                }
                A1.setLayoutParams(new CoordinatorLayout.f(-1, -2));
                this.f.addView(A1);
            }
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (System.currentTimeMillis() < this.j + C1366w.this.t0) {
                return;
            }
            super.onBackPressed();
            C1366w.this.l3();
        }

        @Override // ax.a3.DialogC1343B, android.app.Dialog
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            r(e());
            this.j = System.currentTimeMillis();
            this.h.postDelayed(new d(), C1366w.this.t0);
        }

        private b(Context context, boolean z, int i) {
            super(context, z ? DialogC1343B.b.FULLSCREEN_NO_BACKGROUND : DialogC1343B.b.FULLSCREEN_FIXED_SIZE);
            n(z ? getLayoutInflater().inflate(R.layout.dialog_exit_ads_full, (ViewGroup) null, false) : getLayoutInflater().inflate(R.layout.dialog_exit_ads, (ViewGroup) null, false));
            this.g = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3() {
        if (f0() != null) {
            ax.Q2.a.i().m("general", "double_back_exit").c("from", "ExitAdsDialog").e();
            f0().finish();
        }
    }

    public static int m3(Context context) {
        int z = C3180B.z(context);
        if (z >= 410) {
            return 390;
        }
        if (z >= 380) {
            return 360;
        }
        return z >= 350 ? 330 : 300;
    }

    public static boolean n3(int i) {
        return i == 0 || i == 1;
    }

    @Override // androidx.fragment.app.Fragment
    public void D1() {
        super.D1();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void K1() {
        super.K1();
        O2();
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        this.t0 = ax.t3.c.n().j();
    }

    @Override // ax.a3.AbstractC1344C
    public Dialog i3(boolean z) {
        int l = ax.t3.c.n().l();
        return new b(b(), z && n3(l), l);
    }
}
