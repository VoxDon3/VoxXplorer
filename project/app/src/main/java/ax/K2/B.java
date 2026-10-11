/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import android.database.Cursor;
import ax.K2.A;
import ax.K2.z;
import ax.k2.i;
import ax.k2.u;
import ax.k2.x;
import ax.m2.b;
import ax.o2.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class B
implements A {
    private final u a;
    private final i<z> b;
    private final ax.k2.A c;

    public B(u u8) {
        this.a = u8;
        this.b = new i<z>(this, u8){
            final B d;
            {
                this.d = b8;
                super(u8);
            }

            @Override
            public String e() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }

            public void k(k k8, z z8) {
                if (z8.a() == null) {
                    k8.t0(1);
                } else {
                    k8.D(1, z8.a());
                }
                if (z8.b() == null) {
                    k8.t0(2);
                    return;
                }
                k8.D(2, z8.b());
            }
        };
        this.c = new ax.k2.A(this, u8){
            final B d;
            {
                this.d = b8;
                super(u8);
            }

            @Override
            public String e() {
                return "DELETE FROM worktag WHERE work_spec_id=?";
            }
        };
    }

    public static List<Class<?>> d() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public void a(z z8) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(z8);
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
            x8 = x.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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

    @Override
    public void c(String string, Set<String> set) {
        A.a.a(this, string, set);
    }
}

