/*
 * Decompiled with CFR 0.152.
 */
package ax.Rc;

import ax.Rc.b;
import ax.Rc.c;
import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;

public class d
implements Serializable {
    private final ax.Vc.b c0 = new ax.Vc.b();
    private final Object q;

    public d(Object object) {
        this.q = object;
    }

    public void a(String object, String object2) {
        object2 = new b(this.q, (String)object, (String)object2);
        object = this.c0.iterator();
        while (object.hasNext()) {
            ((c)((EventListener)object.next())).a((b)object2);
        }
    }

    public void b(int n8, String object) {
        object = new b(this.q, n8, (String)object);
        Iterator<EventListener> iterator = this.c0.iterator();
        while (iterator.hasNext()) {
            ((c)iterator.next()).b((b)object);
        }
    }

    public int c() {
        return this.c0.e();
    }
}

