/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import androidx.work.impl.WorkDatabase;
import ax.B2.l;
import ax.B2.r;
import ax.C2.D;
import ax.C2.o;
import ax.C2.t;
import ax.C2.u;
import ax.K2.w;
import java.util.LinkedList;
import java.util.UUID;

public abstract class b
implements Runnable {
    private final o q = new o();

    public static b b(UUID uUID, D d8) {
        return new b(d8, uUID){
            final D c0;
            final UUID d0;
            {
                this.c0 = d8;
                this.d0 = uUID;
            }

            @Override
            void g() {
                WorkDatabase workDatabase = this.c0.o();
                workDatabase.e();
                try {
                    this.a(this.c0, this.d0.toString());
                    workDatabase.A();
                    this.f(this.c0);
                    return;
                }
                finally {
                    workDatabase.i();
                }
            }
        };
    }

    public static b c(String string, D d8, boolean bl) {
        return new b(d8, string, bl){
            final D c0;
            final String d0;
            final boolean e0;
            {
                this.c0 = d8;
                this.d0 = string;
                this.e0 = bl;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            void g() {
                Throwable throwable2;
                WorkDatabase workDatabase;
                block4: {
                    workDatabase = this.c0.o();
                    workDatabase.e();
                    try {
                        for (String string : workDatabase.I().l(this.d0)) {
                            this.a(this.c0, string);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    workDatabase.A();
                    workDatabase.i();
                    if (this.e0) {
                        this.f(this.c0);
                    }
                    return;
                }
                workDatabase.i();
                throw throwable2;
            }
        };
    }

    private void e(WorkDatabase object, String object2) {
        w w8 = ((WorkDatabase)object).I();
        object = ((WorkDatabase)object).D();
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add((String)object2);
        while (!linkedList.isEmpty()) {
            String string = (String)linkedList.remove();
            object2 = w8.m(string);
            if (object2 != r.d0 && object2 != r.e0) {
                w8.j(r.g0, string);
            }
            linkedList.addAll(object.a(string));
        }
    }

    void a(D object, String string) {
        this.e(((D)object).o(), string);
        ((D)object).l().p(string);
        object = ((D)object).m().iterator();
        while (object.hasNext()) {
            ((t)object.next()).d(string);
        }
    }

    public l d() {
        return this.q;
    }

    void f(D d8) {
        u.b(d8.h(), d8.o(), d8.m());
    }

    abstract void g();

    @Override
    public void run() {
        try {
            this.g();
            this.q.a(l.a);
            return;
        }
        catch (Throwable throwable) {
            this.q.a(new l.b.a(throwable));
            return;
        }
    }
}

