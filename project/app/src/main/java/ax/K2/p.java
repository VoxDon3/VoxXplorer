/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import android.database.Cursor;
import ax.K2.n;
import ax.K2.o;
import ax.k2.i;
import ax.k2.u;
import ax.k2.x;
import ax.m2.b;
import ax.o2.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class p
implements o {
    private final u a;
    private final i<n> b;

    public p(u u8) {
        this.a = u8;
        this.b = new i<n>(this, u8){
            final p d;
            {
                this.d = p8;
                super(u8);
            }

            @Override
            public String e() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }

            public void k(k k8, n n8) {
                if (n8.a() == null) {
                    k8.t0(1);
                } else {
                    k8.D(1, n8.a());
                }
                if (n8.b() == null) {
                    k8.t0(2);
                    return;
                }
                k8.D(2, n8.b());
            }
        };
    }

    public static List<Class<?>> c() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public void a(n n8) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(n8);
            this.a.A();
            return;
        }
        finally {
            this.a.i();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<String> b(String string) {
        Throwable throwable2;
        Cursor cursor;
        x x8;
        block5: {
            ArrayList<String> arrayList;
            x8 = x.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (string == null) {
                x8.t0(1);
            } else {
                x8.D(1, string);
            }
            this.a.d();
            cursor = ax.m2.b.b(this.a, x8, false, null);
            try {
                arrayList = new ArrayList<String>(cursor.getCount());
                while (cursor.moveToNext()) {
                    string = cursor.isNull(0) ? null : cursor.getString(0);
                    arrayList.add(string);
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            cursor.close();
            x8.f();
            return arrayList;
        }
        cursor.close();
        x8.f();
        throw throwable2;
    }
}

