/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import android.database.Cursor;
import ax.K2.d;
import ax.K2.e;
import ax.k2.i;
import ax.k2.u;
import ax.k2.x;
import ax.m2.b;
import ax.o2.k;
import java.util.Collections;
import java.util.List;

public final class f
implements e {
    private final u a;
    private final i<d> b;

    public f(u u8) {
        this.a = u8;
        this.b = new i<d>(this, u8){
            final f d;
            {
                this.d = f8;
                super(u8);
            }

            @Override
            public String e() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }

            public void k(k k8, d d8) {
                if (d8.a() == null) {
                    k8.t0(1);
                } else {
                    k8.D(1, d8.a());
                }
                if (d8.b() == null) {
                    k8.t0(2);
                    return;
                }
                k8.X(2, d8.b());
            }
        };
    }

    public static List<Class<?>> c() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Long a(String object) {
        Throwable throwable2;
        Cursor cursor;
        x x8;
        block7: {
            block5: {
                block6: {
                    x8 = x.c("SELECT long_value FROM Preference where `key`=?", 1);
                    if (object == null) {
                        x8.t0(1);
                    } else {
                        x8.D(1, (String)object);
                    }
                    this.a.d();
                    object = this.a;
                    Object var2_4 = null;
                    cursor = ax.m2.b.b((u)object, x8, false, null);
                    object = var2_4;
                    try {
                        if (!cursor.moveToFirst()) break block5;
                        if (!cursor.isNull(0)) break block6;
                        object = var2_4;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                object = cursor.getLong(0);
            }
            cursor.close();
            x8.f();
            return object;
        }
        cursor.close();
        x8.f();
        throw throwable2;
    }

    @Override
    public void b(d d8) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(d8);
            this.a.A();
            return;
        }
        finally {
            this.a.i();
        }
    }
}

