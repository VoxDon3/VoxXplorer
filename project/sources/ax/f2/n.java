package ax.f2;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import ax.Qb.C0947m;
import ax.c2.C1807b;
import ax.sb.t;
import ax.xb.C3479b;

/* loaded from: classes.dex */
public abstract class n {
    public static final b a = new b(null);

    public static final class b {
        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final n a(Context context) {
            ax.Gb.l.f(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            C1807b c1807b = C1807b.a;
            sb.append(c1807b.a());
            Log.d("MeasurementManager", sb.toString());
            if (c1807b.a() >= 5) {
                return new a(context);
            }
            return null;
        }

        private b() {
        }
    }

    public abstract Object a(C2032a c2032a, ax.wb.e<? super t> eVar);

    public abstract Object b(ax.wb.e<? super Integer> eVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, ax.wb.e<? super t> eVar);

    public abstract Object d(Uri uri, ax.wb.e<? super t> eVar);

    public abstract Object e(o oVar, ax.wb.e<? super t> eVar);

    public abstract Object f(p pVar, ax.wb.e<? super t> eVar);

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    private static final class a extends n {
        private final MeasurementManager b;

        public a(MeasurementManager measurementManager) {
            ax.Gb.l.f(measurementManager, "mMeasurementManager");
            this.b = measurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeletionRequest k(C2032a c2032a) {
            C2033b.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(o oVar) {
            C2035d.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(p pVar) {
            C2036e.a();
            throw null;
        }

        @Override // ax.f2.n
        public Object a(C2032a c2032a, ax.wb.e<? super t> eVar) {
            C0947m c0947m = new C0947m(C3479b.b(eVar), 1);
            c0947m.C();
            this.b.deleteRegistrations(k(c2032a), new m(), ax.Y.t.a(c0947m));
            Object z = c0947m.z();
            if (z == C3479b.c()) {
                ax.yb.h.c(eVar);
            }
            return z == C3479b.c() ? z : t.a;
        }

        @Override // ax.f2.n
        public Object b(ax.wb.e<? super Integer> eVar) {
            C0947m c0947m = new C0947m(C3479b.b(eVar), 1);
            c0947m.C();
            this.b.getMeasurementApiStatus(new m(), ax.Y.t.a(c0947m));
            Object z = c0947m.z();
            if (z == C3479b.c()) {
                ax.yb.h.c(eVar);
            }
            return z;
        }

        @Override // ax.f2.n
        public Object c(Uri uri, InputEvent inputEvent, ax.wb.e<? super t> eVar) {
            C0947m c0947m = new C0947m(C3479b.b(eVar), 1);
            c0947m.C();
            this.b.registerSource(uri, inputEvent, new m(), ax.Y.t.a(c0947m));
            Object z = c0947m.z();
            if (z == C3479b.c()) {
                ax.yb.h.c(eVar);
            }
            return z == C3479b.c() ? z : t.a;
        }

        @Override // ax.f2.n
        public Object d(Uri uri, ax.wb.e<? super t> eVar) {
            C0947m c0947m = new C0947m(C3479b.b(eVar), 1);
            c0947m.C();
            this.b.registerTrigger(uri, new m(), ax.Y.t.a(c0947m));
            Object z = c0947m.z();
            if (z == C3479b.c()) {
                ax.yb.h.c(eVar);
            }
            return z == C3479b.c() ? z : t.a;
        }

        @Override // ax.f2.n
        public Object e(o oVar, ax.wb.e<? super t> eVar) {
            C0947m c0947m = new C0947m(C3479b.b(eVar), 1);
            c0947m.C();
            this.b.registerWebSource(l(oVar), new m(), ax.Y.t.a(c0947m));
            Object z = c0947m.z();
            if (z == C3479b.c()) {
                ax.yb.h.c(eVar);
            }
            return z == C3479b.c() ? z : t.a;
        }

        @Override // ax.f2.n
        public Object f(p pVar, ax.wb.e<? super t> eVar) {
            C0947m c0947m = new C0947m(C3479b.b(eVar), 1);
            c0947m.C();
            this.b.registerWebTrigger(m(pVar), new m(), ax.Y.t.a(c0947m));
            Object z = c0947m.z();
            if (z == C3479b.c()) {
                ax.yb.h.c(eVar);
            }
            return z == C3479b.c() ? z : t.a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                ax.Gb.l.f(r2, r0)
                java.lang.Class r0 = ax.f2.C2040i.a()
                java.lang.Object r2 = ax.R.t.a(r2, r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                ax.Gb.l.e(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = ax.f2.C2041j.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.f2.n.a.<init>(android.content.Context):void");
        }
    }
}
