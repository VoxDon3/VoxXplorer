/*
 * Decompiled with CFR 0.152.
 */
package ax.p0;

import android.content.Context;
import ax.Gb.l;
import ax.Ib.a;
import ax.Mb.g;
import ax.Qb.J;
import ax.n0.d;
import ax.n0.f;
import ax.p0.b;
import java.io.File;
import java.util.List;

public final class c
implements a<Context, f<ax.q0.d>> {
    private final String a;
    private final ax.o0.b<ax.q0.d> b;
    private final ax.Fb.l<Context, List<d<ax.q0.d>>> c;
    private final J d;
    private final Object e;
    private volatile f<ax.q0.d> f;

    public c(String string, ax.o0.b<ax.q0.d> b8, ax.Fb.l<? super Context, ? extends List<? extends d<ax.q0.d>>> l8, J j8) {
        l.f(string, "name");
        l.f(l8, "produceMigrations");
        l.f(j8, "scope");
        this.a = string;
        this.b = b8;
        this.c = l8;
        this.d = j8;
        this.e = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f<ax.q0.d> c(Context object, g<?> object2) {
        l.f(object, "thisRef");
        l.f(object2, "property");
        object2 = this.f;
        if (object2 != null) {
            return object2;
        }
        object2 = this.e;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (this.f != null) break block4;
                        Context context = object.getApplicationContext();
                        object = ax.q0.c.a;
                        ax.o0.b<ax.q0.d> b8 = this.b;
                        ax.sb.c c8 = this.c;
                        l.e(context, "applicationContext");
                        List<d<ax.q0.d>> list = c8.invoke(context);
                        J j8 = this.d;
                        c8 = new ax.Fb.a<File>(context, this){
                            final c c0;
                            final Context q;
                            {
                                this.q = context;
                                this.c0 = c8;
                                super(0);
                            }

                            public final File a() {
                                Context context = this.q;
                                l.e(context, "applicationContext");
                                return ax.p0.b.a(context, this.c0.a);
                            }
                        };
                        this.f = ((ax.q0.c)object).a(b8, (List<? extends d<ax.q0.d>>)list, j8, (ax.Fb.a<? extends File>)c8);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object = this.f;
                l.c(object);
                return object;
            }
            throw throwable2;
        }
    }
}

