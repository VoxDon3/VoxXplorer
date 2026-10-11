package ax.Rc;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class d implements Serializable {
    private final ax.Vc.b c0 = new ax.Vc.b();
    private final Object q;

    public d(Object obj) {
        this.q = obj;
    }

    public void a(String str, String str2) {
        b bVar = new b(this.q, str, str2);
        Iterator<EventListener> it = this.c0.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(bVar);
        }
    }

    public void b(int i, String str) {
        b bVar = new b(this.q, i, str);
        Iterator<EventListener> it = this.c0.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(bVar);
        }
    }

    public int c() {
        return this.c0.e();
    }
}
