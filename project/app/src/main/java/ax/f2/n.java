/*
 * Decompiled with CFR 0.152.
 */
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
import ax.Y.t;
import ax.f2.c;
import ax.f2.d;
import ax.f2.e;
import ax.f2.f;
import ax.f2.g;
import ax.f2.h;
import ax.f2.i;
import ax.f2.j;
import ax.f2.k;
import ax.f2.l;
import ax.f2.m;
import ax.f2.o;
import ax.f2.p;

public abstract class n {
    public static final b a = new b(null);

    public abstract Object a(ax.f2.a var1, ax.wb.e<? super ax.sb.t> var2);

    public abstract Object b(ax.wb.e<? super Integer> var1);

    public abstract Object c(Uri var1, InputEvent var2, ax.wb.e<? super ax.sb.t> var3);

    public abstract Object d(Uri var1, ax.wb.e<? super ax.sb.t> var2);

    public abstract Object e(o var1, ax.wb.e<? super ax.sb.t> var2);

    public abstract Object f(p var1, ax.wb.e<? super ax.sb.t> var2);

    @SuppressLint(value={"NewApi", "ClassVerificationFailure"})
    private static final class a
    extends n {
        private final MeasurementManager b;

        public a(MeasurementManager measurementManager) {
            ax.Gb.l.f(measurementManager, "mMeasurementManager");
            this.b = measurementManager;
        }

        public a(Context object) {
            ax.Gb.l.f(object, "context");
            object = ax.R.t.a(object, i.a());
            ax.Gb.l.e(object, "context.getSystemService\u2026:class.java\n            )");
            this(j.a(object));
        }

        private final DeletionRequest k(ax.f2.a a8) {
            ax.f2.b.a();
            throw null;
        }

        private final WebSourceRegistrationRequest l(o o8) {
            d.a();
            throw null;
        }

        private final WebTriggerRegistrationRequest m(p p8) {
            e.a();
            throw null;
        }

        @Override
        public Object a(ax.f2.a object, ax.wb.e<? super ax.sb.t> e8) {
            ax.Qb.m<? super ax.sb.t> m8 = new ax.Qb.m<ax.sb.t>(ax.xb.b.b(e8), 1);
            m8.C();
            h.a(this.b, this.k((ax.f2.a)object), new m(), t.a(m8));
            object = m8.z();
            if (object == ax.xb.b.c()) {
                ax.yb.h.c(e8);
            }
            if (object == ax.xb.b.c()) {
                return object;
            }
            return ax.sb.t.a;
        }

        @Override
        public Object b(ax.wb.e<? super Integer> e8) {
            Object object = new ax.Qb.m<Integer>(ax.xb.b.b(e8), 1);
            ((ax.Qb.m)object).C();
            k.a(this.b, new m(), t.a(object));
            object = ((ax.Qb.m)object).z();
            if (object == ax.xb.b.c()) {
                ax.yb.h.c(e8);
            }
            return object;
        }

        @Override
        public Object c(Uri object, InputEvent inputEvent, ax.wb.e<? super ax.sb.t> e8) {
            ax.Qb.m<? super ax.sb.t> m8 = new ax.Qb.m<ax.sb.t>(ax.xb.b.b(e8), 1);
            m8.C();
            f.a(this.b, object, inputEvent, new m(), t.a(m8));
            object = m8.z();
            if (object == ax.xb.b.c()) {
                ax.yb.h.c(e8);
            }
            if (object == ax.xb.b.c()) {
                return object;
            }
            return ax.sb.t.a;
        }

        @Override
        public Object d(Uri object, ax.wb.e<? super ax.sb.t> e8) {
            ax.Qb.m<? super ax.sb.t> m8 = new ax.Qb.m<ax.sb.t>(ax.xb.b.b(e8), 1);
            m8.C();
            l.a(this.b, object, new m(), t.a(m8));
            object = m8.z();
            if (object == ax.xb.b.c()) {
                ax.yb.h.c(e8);
            }
            if (object == ax.xb.b.c()) {
                return object;
            }
            return ax.sb.t.a;
        }

        @Override
        public Object e(o object, ax.wb.e<? super ax.sb.t> e8) {
            ax.Qb.m<? super ax.sb.t> m8 = new ax.Qb.m<ax.sb.t>(ax.xb.b.b(e8), 1);
            m8.C();
            g.a(this.b, this.l((o)object), new m(), t.a(m8));
            object = m8.z();
            if (object == ax.xb.b.c()) {
                ax.yb.h.c(e8);
            }
            if (object == ax.xb.b.c()) {
                return object;
            }
            return ax.sb.t.a;
        }

        @Override
        public Object f(p object, ax.wb.e<? super ax.sb.t> e8) {
            ax.Qb.m<? super ax.sb.t> m8 = new ax.Qb.m<ax.sb.t>(ax.xb.b.b(e8), 1);
            m8.C();
            c.a(this.b, this.m((p)object), new m(), t.a(m8));
            object = m8.z();
            if (object == ax.xb.b.c()) {
                ax.yb.h.c(e8);
            }
            if (object == ax.xb.b.c()) {
                return object;
            }
            return ax.sb.t.a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ax.Gb.g g8) {
            this();
        }

        @SuppressLint(value={"NewApi", "ClassVerificationFailure"})
        public final n a(Context context) {
            ax.Gb.l.f(context, "context");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AdServicesInfo.version=");
            ax.c2.b b8 = ax.c2.b.a;
            stringBuilder.append(b8.a());
            Log.d((String)"MeasurementManager", (String)stringBuilder.toString());
            if (b8.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }
}

