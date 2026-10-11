package ax.x3;

import android.os.Handler;
import android.view.View;
import ax.u3.C3180B;
import ax.u3.C3184b;
import com.android.ex.photo.PhotoViewPager;
import com.voxdon.xplorer.R;

/* renamed from: ax.x3.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3409E {
    private int a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private final View f;
    private final PhotoViewPager g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final View m;
    private final View n;
    private final View o;
    private final View p;
    private final View q;
    private final View r;
    private final d t;
    private boolean u;
    private Runnable v = new c();
    private final Handler s = new Handler();

    /* renamed from: ax.x3.E$a */
    class a extends ax.g3.c {
        a() {
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
        @Override // ax.g3.c
        public void a(View view) {
            boolean z;
            boolean z2;
            int id = view.getId();
            boolean z3 = true;
            boolean z4 = false;
            switch (id) {
                case R.id.interval10 /* 2131362413 */:
                    C3409E.this.a = 10000;
                    z = false;
                    z2 = false;
                    break;
                case R.id.interval15 /* 2131362414 */:
                    C3409E.this.a = 15000;
                    z = false;
                    z2 = false;
                    break;
                case R.id.interval2 /* 2131362415 */:
                    C3409E.this.a = 2000;
                    z = false;
                    z2 = false;
                    break;
                case R.id.interval3 /* 2131362416 */:
                    C3409E.this.a = 3000;
                    z = false;
                    z2 = false;
                    break;
                case R.id.interval4 /* 2131362417 */:
                    C3409E.this.a = 4000;
                    z = false;
                    z2 = false;
                    break;
                case R.id.interval5 /* 2131362418 */:
                    C3409E.this.a = 5000;
                    z = false;
                    z2 = false;
                    break;
                default:
                    switch (id) {
                        case R.id.toggle_repeat /* 2131362979 */:
                            C3409E.this.b = !r0.b;
                            z = false;
                            z3 = false;
                            z4 = true;
                            z2 = false;
                            break;
                        case R.id.toggle_shuffle /* 2131362980 */:
                            C3409E.this.c = !r0.c;
                            z = true;
                            z3 = false;
                            z2 = false;
                            break;
                        default:
                            switch (id) {
                                case R.id.video_full /* 2131363032 */:
                                    C3409E.this.u = true;
                                    z = false;
                                    z3 = false;
                                    z2 = true;
                                    break;
                                case R.id.video_interval /* 2131363033 */:
                                    C3409E.this.u = false;
                                    z = false;
                                    z3 = false;
                                    z2 = true;
                                    break;
                                default:
                                    z = false;
                                    z3 = false;
                                    z2 = false;
                                    break;
                            }
                    }
            }
            if (z3) {
                ax.t3.d.e(view.getContext(), C3409E.this.a);
            }
            if (z4) {
                ax.t3.d.f(view.getContext(), C3409E.this.b);
            }
            if (z) {
                ax.t3.d.g(view.getContext(), C3409E.this.c);
            }
            if (z2) {
                ax.t3.d.h(view.getContext(), C3409E.this.u);
            }
            C3409E.this.E();
        }
    }

    /* renamed from: ax.x3.E$b */
    class b extends ax.g3.c {
        b() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            C3409E.this.C();
        }
    }

    /* renamed from: ax.x3.E$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3409E.this.d != 2) {
                return;
            }
            int e = C3409E.this.g.getAdapter().e();
            if (e == 0) {
                C3184b.f();
                C3409E.this.A(0);
                C3409E.this.t.a(C3409E.this.c);
                return;
            }
            int currentItem = (C3409E.this.g.getCurrentItem() + 1) % e;
            boolean z = currentItem != 0;
            if (currentItem != C3409E.this.e) {
                C3409E.this.g.N(currentItem, z);
                C3409E.this.s.removeCallbacks(this);
                C3409E.this.s.postDelayed(this, C3409E.this.a);
            } else if (C3409E.this.b) {
                C3409E.this.g.N(currentItem, z);
                C3409E.this.s.removeCallbacks(this);
                C3409E.this.s.postDelayed(this, C3409E.this.a);
            } else {
                C3409E.this.g.N(C3409E.this.e, z);
                C3409E.this.A(0);
                C3409E.this.t.a(C3409E.this.c);
            }
        }
    }

    /* renamed from: ax.x3.E$d */
    public interface d {
        void a(boolean z);

        void b(boolean z);

        void c(boolean z);
    }

    public C3409E(View view, PhotoViewPager photoViewPager, d dVar) {
        this.f = view;
        this.t = dVar;
        this.a = ax.t3.d.a(view.getContext());
        this.b = ax.t3.d.b(view.getContext());
        this.c = ax.t3.d.c(view.getContext());
        this.u = ax.t3.d.d(view.getContext());
        this.g = photoViewPager;
        this.h = view.findViewById(R.id.interval2);
        this.i = view.findViewById(R.id.interval3);
        this.j = view.findViewById(R.id.interval4);
        this.k = view.findViewById(R.id.interval5);
        this.l = view.findViewById(R.id.interval10);
        this.m = view.findViewById(R.id.interval15);
        this.n = view.findViewById(R.id.video_interval);
        this.o = view.findViewById(R.id.video_full);
        this.p = view.findViewById(R.id.toggle_repeat);
        this.q = view.findViewById(R.id.toggle_shuffle);
        this.r = view.findViewById(R.id.start);
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(int i) {
        this.d = i;
    }

    private void B() {
        a aVar = new a();
        this.h.setOnClickListener(aVar);
        this.i.setOnClickListener(aVar);
        this.j.setOnClickListener(aVar);
        this.k.setOnClickListener(aVar);
        this.l.setOnClickListener(aVar);
        this.m.setOnClickListener(aVar);
        this.n.setOnClickListener(aVar);
        this.o.setOnClickListener(aVar);
        this.p.setOnClickListener(aVar);
        this.q.setOnClickListener(aVar);
        E();
        this.r.setOnClickListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        this.h.setActivated(this.a == 2000);
        this.i.setActivated(this.a == 3000);
        this.j.setActivated(this.a == 4000);
        this.k.setActivated(this.a == 5000);
        this.l.setActivated(this.a == 10000);
        this.m.setActivated(this.a == 15000);
        this.n.setActivated(!this.u);
        this.o.setActivated(this.u);
        this.p.setActivated(this.b);
        if (this.b) {
            this.p.setContentDescription(this.f.getContext().getString(R.string.repeat_on));
        } else {
            this.p.setContentDescription(this.f.getContext().getString(R.string.repeat_none));
        }
        this.q.setActivated(this.c);
        if (this.c) {
            this.q.setContentDescription(this.f.getContext().getString(R.string.shuffle_on));
        } else {
            this.q.setContentDescription(this.f.getContext().getString(R.string.shuffle_off));
        }
    }

    private void t() {
        this.t.c(this.c);
        this.e = this.g.getCurrentItem();
        this.s.postDelayed(this.v, this.a);
    }

    public void C() {
        this.f.setVisibility(8);
        A(2);
        t();
    }

    public void D() {
        this.f.setVisibility(0);
        int width = ((View) this.f.getParent()).getWidth();
        int e = C3180B.e(this.f.getContext(), 400);
        if (width >= e) {
            this.f.getLayoutParams().width = e;
        } else {
            this.f.getLayoutParams().width = -1;
        }
        this.r.requestFocus();
        A(1);
    }

    public void p() {
        this.s.removeCallbacks(this.v);
        int i = this.d;
        if (i != 0) {
            A(0);
            if (i != 1) {
                this.t.b(this.c);
            }
        }
        if (this.f.getVisibility() == 0) {
            this.f.setVisibility(8);
        }
    }

    public void q() {
        p();
    }

    public int r() {
        return this.a;
    }

    public boolean s() {
        return this.u;
    }

    public boolean u() {
        return this.f.getVisibility() == 0;
    }

    public boolean v() {
        return x() || this.d == 1;
    }

    public boolean w() {
        return this.d == 3;
    }

    public boolean x() {
        int i = this.d;
        return i == 2 || i == 3;
    }

    public void y() {
        A(3);
    }

    public void z() {
        A(2);
        this.v.run();
    }
}
