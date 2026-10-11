package ax.M5;

import android.content.Intent;
import ax.L5.InterfaceC0794f;

/* loaded from: classes3.dex */
final class D extends E {
    final /* synthetic */ Intent a;
    final /* synthetic */ InterfaceC0794f b;

    D(Intent intent, InterfaceC0794f interfaceC0794f, int i) {
        this.a = intent;
        this.b = interfaceC0794f;
    }

    @Override // ax.M5.E
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
