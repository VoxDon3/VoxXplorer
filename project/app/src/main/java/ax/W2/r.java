/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import ax.Ha.b;
import ax.Ha.c;
import ax.W2.h;
import ax.W2.j;
import ax.W2.s;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import java.util.ArrayList;
import java.util.List;

public class r
extends h {
    private o d;
    private List<n> e;
    private boolean f;

    public static r l() {
        return new r();
    }

    @Override
    protected j b() {
        return new s(this.f(), this.d, this.e, this.f);
    }

    public void k(o o8, List<n> list, boolean bl, h.a object) {
        this.d = o8;
        this.i((h.a)((Object)object));
        this.e = new ArrayList<n>();
        this.f = bl;
        for (n n8 : list) {
            if (n8 != null) {
                this.e.add(n8);
                continue;
            }
            b b8 = c.h().f().d("FileInfo == null").j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Location:");
            stringBuilder.append(o8.S().I());
            stringBuilder.append(",size:");
            stringBuilder.append(list.size());
            b8.g(stringBuilder.toString()).h();
        }
        this.j(h.c.c0);
    }
}

