/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import java.util.concurrent.ThreadPoolExecutor;

public final class h
implements Runnable {
    public final e.h c0;
    public final ThreadPoolExecutor d0;
    public final EmojiCompatInitializer.b q;

    public /* synthetic */ h(EmojiCompatInitializer.b b8, e.h h8, ThreadPoolExecutor threadPoolExecutor) {
        this.q = b8;
        this.c0 = h8;
        this.d0 = threadPoolExecutor;
    }

    @Override
    public final void run() {
        EmojiCompatInitializer.b.b(this.q, this.c0, this.d0);
    }
}

