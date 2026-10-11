/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jzlib;

final class JZlib {
    static final WrapperType a = WrapperType.q;
    static final WrapperType b = WrapperType.c0;
    static final WrapperType c = WrapperType.d0;
    static final WrapperType d = WrapperType.e0;

    JZlib() {
    }

    static final class WrapperType
    extends Enum<WrapperType> {
        public static final /* enum */ WrapperType c0;
        public static final /* enum */ WrapperType d0;
        public static final /* enum */ WrapperType e0;
        private static final WrapperType[] f0;
        public static final /* enum */ WrapperType q;

        static {
            q = new WrapperType();
            c0 = new WrapperType();
            d0 = new WrapperType();
            e0 = new WrapperType();
            f0 = WrapperType.d();
        }

        private static /* synthetic */ WrapperType[] d() {
            return new WrapperType[]{q, c0, d0, e0};
        }

        public static WrapperType valueOf(String string) {
            return Enum.valueOf(WrapperType.class, string);
        }

        public static WrapperType[] values() {
            return (WrapperType[])f0.clone();
        }
    }
}

