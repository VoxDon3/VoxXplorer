/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import ax.Gb.g;
import ax.Gb.l;
import ax.tb.i;

public final class Settings {
    public static final int COUNT = 10;
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values = new int[10];

    public final void clear() {
        this.set = 0;
        i.o(this.values, 0, 0, 0, 6, null);
    }

    public final int get(int n8) {
        return this.values[n8];
    }

    public final boolean getEnablePush(boolean bl) {
        if ((this.set & 4) != 0) {
            if (this.values[2] == 1) {
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        if ((this.set & 0x80) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    public final int getMaxConcurrentStreams() {
        if ((this.set & 0x10) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int n8) {
        if ((this.set & 0x20) != 0) {
            n8 = this.values[5];
        }
        return n8;
    }

    public final int getMaxHeaderListSize(int n8) {
        if ((this.set & 0x40) != 0) {
            n8 = this.values[6];
        }
        return n8;
    }

    public final boolean isSet(int n8) {
        return (1 << n8 & this.set) != 0;
    }

    public final void merge(Settings settings) {
        l.f(settings, "other");
        for (int i8 = 0; i8 < 10; ++i8) {
            if (!settings.isSet(i8)) continue;
            this.set(i8, settings.get(i8));
        }
    }

    public final Settings set(int n8, int n9) {
        int[] nArray;
        if (n8 >= 0 && n8 < (nArray = this.values).length) {
            this.set = 1 << n8 | this.set;
            nArray[n8] = n9;
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }
}

