/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import android.database.Cursor;
import ax.K2.a;
import ax.K2.b;
import ax.k2.i;
import ax.k2.u;
import ax.k2.x;
import ax.o2.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c
implements b {
    private final u a;
    private final i<a> b;

    public c(u u8) {
        this.a = u8;
        this.b = new i<a>(this, u8){
            final c d;
            {
                this.d = c8;
                super(u8);
            }

            @Override
            public String e() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            public void k(k k8, a a8) {
                if (a8.b() == null) {
                    k8.t0(1);
                } else {
                    k8.D(1, a8.b());
                }
                if (a8.a() == null) {
                    k8.t0(2);
                    return;
                }
                k8.D(2, a8.a());
            }
        };
    }

    public static List<Class<?>> e() {
        return Collections.EMPTY_LIST;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<String> a(String string) {
        Throwable throwable2;
        Cursor cursor;
        x x8;
        block5: {
            ArrayList<String> arrayList;
            x8 = x.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
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
    public void b(a a8) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(a8);
            this.a.A();
            return;
        }
        finally {
            this.a.i();
        }
    }

    @Override
    public boolean c(String object) {
        Throwable throwable2;
        Cursor cursor;
        x x8;
        block5: {
            boolean bl;
            block4: {
                boolean bl2 = true;
                x8 = x.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                if (object == null) {
                    x8.t0(1);
                } else {
                    x8.D(1, (String)object);
                }
                this.a.d();
                object = this.a;
                bl = false;
                cursor = ax.m2.b.b((u)object, x8, false, null);
                try {
                    if (!cursor.moveToFirst()) break block4;
                    int n8 = cursor.getInt(0);
                    bl = n8 != 0 ? bl2 : false;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            cursor.close();
            x8.f();
            return bl;
        }
        cursor.close();
        x8.f();
        throw throwable2;
    }

    @Override
    public boolean d(String object) {
        Throwable throwable2;
        x x8;
        block5: {
            boolean bl;
            block4: {
                boolean bl2 = true;
                x8 = x.c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
                if (object == null) {
                    x8.t0(1);
                } else {
                    x8.D(1, (String)object);
                }
                this.a.d();
                object = this.a;
                bl = false;
                object = ax.m2.b.b((u)object, x8, false, null);
                try {
                    if (!object.moveToFirst()) break block4;
                    int n8 = object.getInt(0);
                    bl = n8 != 0 ? bl2 : false;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            object.close();
            x8.f();
            return bl;
        }
        object.close();
        x8.f();
        throw throwable2;
    }
}

