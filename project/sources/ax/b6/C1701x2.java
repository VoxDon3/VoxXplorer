package ax.b6;

import android.content.ContentResolver;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ax.b6.x2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1701x2 implements InterfaceC1717z2 {
    private final AtomicBoolean a = new AtomicBoolean();
    private HashMap<String, String> b = null;
    private final HashMap<String, Boolean> c = new HashMap<>(16, 1.0f);
    private final HashMap<String, Integer> d = new HashMap<>(16, 1.0f);
    private final HashMap<String, Long> e = new HashMap<>(16, 1.0f);
    private final HashMap<String, Float> f = new HashMap<>(16, 1.0f);
    private Object g = null;
    private boolean h = false;
    private String[] i = new String[0];
    private final F2 j = new D2();

    @Override // ax.b6.InterfaceC1717z2
    public final String a(ContentResolver contentResolver, String str, String str2) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.a.set(false);
                    this.b = new HashMap<>(16, 1.0f);
                    this.g = new Object();
                    contentResolver.registerContentObserver(C1693w2.a, true, new A2(this, null));
                } else if (this.a.getAndSet(false)) {
                    this.b.clear();
                    this.c.clear();
                    this.d.clear();
                    this.e.clear();
                    this.f.clear();
                    this.g = new Object();
                    this.h = false;
                }
                Object obj = this.g;
                if (this.b.containsKey(str)) {
                    String str3 = this.b.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : this.i) {
                    if (str.startsWith(str4)) {
                        if (!this.h) {
                            try {
                                HashMap<String, String> hashMap = (HashMap) this.j.a(contentResolver, this.i, new C2() { // from class: ax.b6.B2
                                    @Override // ax.b6.C2
                                    public final Map d(int i) {
                                        return new HashMap(i, 1.0f);
                                    }
                                });
                                if (!hashMap.isEmpty()) {
                                    Set<String> keySet = hashMap.keySet();
                                    keySet.removeAll(this.c.keySet());
                                    keySet.removeAll(this.d.keySet());
                                    keySet.removeAll(this.e.keySet());
                                    keySet.removeAll(this.f.keySet());
                                }
                                if (!hashMap.isEmpty()) {
                                    if (this.b.isEmpty()) {
                                        this.b = hashMap;
                                    } else {
                                        this.b.putAll(hashMap);
                                    }
                                }
                                this.h = true;
                            } catch (E2 unused) {
                            }
                            if (this.b.containsKey(str)) {
                                String str5 = this.b.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    String b = this.j.b(contentResolver, str);
                    if (b != null && b.equals(null)) {
                        b = null;
                    }
                    synchronized (this) {
                        try {
                            if (obj == this.g) {
                                this.b.put(str, b);
                            }
                        } finally {
                        }
                    }
                    if (b != null) {
                        return b;
                    }
                    return null;
                } catch (E2 unused2) {
                    return null;
                }
            } finally {
            }
        }
    }
}
