/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import android.database.Cursor;
import ax.K2.i;
import ax.K2.j;
import ax.K2.m;
import ax.k2.A;
import ax.k2.u;
import ax.k2.x;
import ax.m2.a;
import ax.m2.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class k
implements j {
    private final u a;
    private final ax.k2.i<i> b;
    private final A c;
    private final A d;

    public k(u u8) {
        this.a = u8;
        this.b = new ax.k2.i<i>(this, u8){
            final k d;
            {
                this.d = k8;
                super(u8);
            }

            @Override
            public String e() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }

            public void k(ax.o2.k k8, i i8) {
                String string = i8.a;
                if (string == null) {
                    k8.t0(1);
                } else {
                    k8.D(1, string);
                }
                k8.X(2, i8.a());
                k8.X(3, i8.c);
            }
        };
        this.c = new A(this, u8){
            final k d;
            {
                this.d = k8;
                super(u8);
            }

            @Override
            public String e() {
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            }
        };
        this.d = new A(this, u8){
            final k d;
            {
                this.d = k8;
                super(u8);
            }

            @Override
            public String e() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    public static List<Class<?>> h() {
        return Collections.EMPTY_LIST;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<String> a() {
        Throwable throwable2;
        Cursor cursor;
        x x8;
        block3: {
            ArrayList<String> arrayList;
            x8 = x.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
            this.a.d();
            cursor = ax.m2.b.b(this.a, x8, false, null);
            try {
                arrayList = new ArrayList<String>(cursor.getCount());
                while (cursor.moveToNext()) {
                    String string = cursor.isNull(0) ? null : cursor.getString(0);
                    arrayList.add(string);
                }
            }
            catch (Throwable throwable2) {
                break block3;
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
    public void b(i i8) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(i8);
            this.a.A();
            return;
        }
        finally {
            this.a.i();
        }
    }

    @Override
    public i c(m m8) {
        return j.a.a(this, m8);
    }

    @Override
    public void d(String string, int n8) {
        this.a.d();
        ax.o2.k k8 = this.c.b();
        if (string == null) {
            k8.t0(1);
        } else {
            k8.D(1, string);
        }
        k8.X(2, n8);
        this.a.e();
        try {
            k8.I();
            this.a.A();
            return;
        }
        finally {
            this.a.i();
            this.c.h(k8);
        }
    }

    @Override
    public void e(m m8) {
        j.a.b(this, m8);
    }

    @Override
    public void f(String string) {
        this.a.d();
        ax.o2.k k8 = this.d.b();
        if (string == null) {
            k8.t0(1);
        } else {
            k8.D(1, string);
        }
        this.a.e();
        try {
            k8.I();
            this.a.A();
            return;
        }
        finally {
            this.a.i();
            this.d.h(k8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public i g(String object, int n8) {
        Throwable throwable2;
        u u8;
        x x8;
        block5: {
            block4: {
                x8 = x.c("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
                if (object == null) {
                    x8.t0(1);
                } else {
                    x8.D(1, (String)object);
                }
                x8.X(2, n8);
                this.a.d();
                u8 = this.a;
                object = null;
                Object var5_6 = null;
                u8 = ax.m2.b.b(u8, x8, false, null);
                try {
                    int n9 = ax.m2.a.e((Cursor)u8, "work_spec_id");
                    int n10 = ax.m2.a.e((Cursor)u8, "generation");
                    n8 = ax.m2.a.e((Cursor)u8, "system_id");
                    if (!u8.moveToFirst()) break block4;
                    object = u8.isNull(n9) ? var5_6 : u8.getString(n9);
                    object = new i((String)object, u8.getInt(n10), u8.getInt(n8));
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            u8.close();
            x8.f();
            return object;
        }
        u8.close();
        x8.f();
        throw throwable2;
    }
}

