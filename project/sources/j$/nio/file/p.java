package j$.nio.file;

import j$.util.C3819o;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ p(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.accept(x.b(obj));
                break;
            case 1:
                this.b.accept(x.b(obj));
                break;
            default:
                this.b.accept(new C3819o((Map.Entry) obj));
                break;
        }
    }
}
