package ax.fc;

import ax.cc.InterfaceC1856c;
import ax.kc.C2424f;
import java.lang.reflect.Method;

/* renamed from: ax.fc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2093d {
    private Throwable a;
    private String b;
    private Method c;
    private Object d;
    private InterfaceC1856c e;
    private Object f;

    public C2093d(Throwable th, String str, Method method, Object obj, InterfaceC1856c interfaceC1856c) {
        this.a = th;
        this.b = str;
        this.c = method;
        this.d = obj;
        this.e = interfaceC1856c;
        this.f = interfaceC1856c != null ? interfaceC1856c.a() : null;
    }

    public Throwable a() {
        return this.a;
    }

    public Object b() {
        return this.f;
    }

    public C2093d c(Throwable th) {
        this.a = th;
        return this;
    }

    public C2093d d(String str) {
        this.b = str;
        return this;
    }

    public C2093d e(InterfaceC1856c interfaceC1856c) {
        this.e = interfaceC1856c;
        return this;
    }

    public C2093d f(Object obj) {
        this.f = obj;
        return this;
    }

    public String toString() {
        String property = System.getProperty("line.separator");
        return "PublicationError{" + property + "\tcause=" + this.a + property + "\tmessage='" + this.b + '\'' + property + "\thandler=" + this.c + property + "\tlistener=" + this.d + property + "\tpublishedMessage=" + b() + '}';
    }

    public C2093d(Throwable th, String str, InterfaceC1856c interfaceC1856c) {
        this.a = th;
        this.b = str;
    }

    public C2093d(Throwable th, String str, C2424f c2424f) {
        this.a = th;
        this.b = str;
        this.c = c2424f.a().f();
    }

    public C2093d(Throwable th, String str) {
        this.a = th;
        this.b = str;
    }

    public C2093d() {
    }
}
