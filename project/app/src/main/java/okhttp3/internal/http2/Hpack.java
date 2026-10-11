/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import ax.Gb.g;
import ax.Gb.l;
import ax.tb.i;
import ax.tb.o;
import ax.xc.C;
import ax.xc.e;
import ax.xc.h;
import ax.xc.p;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.http2.Huffman;

public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<h, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    static {
        Hpack hpack;
        INSTANCE = hpack = new Hpack();
        Header header = new Header(Header.TARGET_AUTHORITY, "");
        Object object = Header.TARGET_METHOD;
        Header header2 = new Header((h)object, "GET");
        object = new Header((h)object, "POST");
        Object object2 = Header.TARGET_PATH;
        Header header3 = new Header((h)object2, "/");
        object2 = new Header((h)object2, "/index.html");
        Object object3 = Header.TARGET_SCHEME;
        Header header4 = new Header((h)object3, "http");
        object3 = new Header((h)object3, "https");
        h h8 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{header, header2, object, header3, object2, header4, object3, new Header(h8, "200"), new Header(h8, "204"), new Header(h8, "206"), new Header(h8, "304"), new Header(h8, "400"), new Header(h8, "404"), new Header(h8, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<h, Integer> nameToFirstIndex() {
        Header[] headerArray = STATIC_HEADER_TABLE;
        LinkedHashMap<h, Integer> linkedHashMap = new LinkedHashMap(headerArray.length);
        int n8 = headerArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            headerArray = STATIC_HEADER_TABLE;
            if (((AbstractMap)linkedHashMap).containsKey(headerArray[i8].name)) continue;
            linkedHashMap.put(headerArray[i8].name, i8);
        }
        linkedHashMap = java.util.DesugarCollections.unmodifiableMap(linkedHashMap);
        l.e(linkedHashMap, "unmodifiableMap(result)");
        return linkedHashMap;
    }

    public final h checkLowercase(h h8) throws IOException {
        l.f(h8, "name");
        int n8 = h8.G();
        for (int i8 = 0; i8 < n8; ++i8) {
            byte by = h8.n(i8);
            if (65 > by || by >= 91) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PROTOCOL_ERROR response malformed: mixed case name: ");
            stringBuilder.append(h8.K());
            throw new IOException(stringBuilder.toString());
        }
        return h8;
    }

    public final Map<h, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final ax.xc.g source;

        public Reader(C c8, int n8) {
            l.f(c8, "source");
            this(c8, n8, 0, 4, null);
        }

        public Reader(C headerArray, int n8, int n9) {
            l.f(headerArray, "source");
            this.headerTableSizeSetting = n8;
            this.maxDynamicTableByteCount = n9;
            this.headerList = new ArrayList<Header>();
            this.source = p.d((C)headerArray);
            headerArray = new Header[8];
            this.dynamicTable = headerArray;
            this.nextHeaderIndex = headerArray.length - 1;
        }

        public /* synthetic */ Reader(C c8, int n8, int n9, int n10, g g8) {
            if ((n10 & 4) != 0) {
                n9 = n8;
            }
            this(c8, n8, n9);
        }

        private final void adjustDynamicTableByteCount() {
            int n8 = this.maxDynamicTableByteCount;
            int n9 = this.dynamicTableByteCount;
            if (n8 < n9) {
                if (n8 == 0) {
                    this.clearDynamicTable();
                    return;
                }
                this.evictToRecoverBytes(n9 - n8);
            }
        }

        private final void clearDynamicTable() {
            i.p(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int n8) {
            return this.nextHeaderIndex + 1 + n8;
        }

        private final int evictToRecoverBytes(int n8) {
            int n9 = 0;
            int n10 = 0;
            if (n8 > 0) {
                Object object;
                int n11 = n8;
                n8 = n10;
                for (n9 = this.dynamicTable.length - 1; n9 >= (n10 = this.nextHeaderIndex) && n11 > 0; --n9) {
                    object = this.dynamicTable[n9];
                    l.c(object);
                    n10 = object.hpackSize;
                    n11 -= n10;
                    this.dynamicTableByteCount -= n10;
                    --this.headerCount;
                    ++n8;
                }
                object = this.dynamicTable;
                System.arraycopy(object, n10 + 1, object, n10 + 1 + n8, this.headerCount);
                this.nextHeaderIndex += n8;
                n9 = n8;
            }
            return n9;
        }

        private final h getName(int n8) throws IOException {
            Object object;
            if (this.isStaticHeader(n8)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[n8].name;
            }
            int n9 = this.dynamicTableIndex(n8 - INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (n9 >= 0 && n9 < ((Header[])(object = this.dynamicTable)).length) {
                object = object[n9];
                l.c(object);
                return ((Header)object).name;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Header index too large ");
            ((StringBuilder)object).append(n8 + 1);
            throw new IOException(((StringBuilder)object).toString());
        }

        private final void insertIntoDynamicTable(int n8, Header header) {
            Header[] headerArray;
            int n9;
            this.headerList.add(header);
            int n10 = n9 = header.hpackSize;
            if (n8 != -1) {
                headerArray = this.dynamicTable[this.dynamicTableIndex(n8)];
                l.c(headerArray);
                n10 = n9 - headerArray.hpackSize;
            }
            if (n10 > (n9 = this.maxDynamicTableByteCount)) {
                this.clearDynamicTable();
                return;
            }
            int n11 = this.evictToRecoverBytes(this.dynamicTableByteCount + n10 - n9);
            if (n8 == -1) {
                n8 = this.headerCount;
                headerArray = this.dynamicTable;
                if (n8 + 1 > headerArray.length) {
                    Header[] headerArray2 = new Header[headerArray.length * 2];
                    System.arraycopy(headerArray, 0, headerArray2, headerArray.length, headerArray.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArray2;
                }
                n8 = this.nextHeaderIndex;
                this.nextHeaderIndex = n8 - 1;
                this.dynamicTable[n8] = header;
                ++this.headerCount;
            } else {
                n9 = this.dynamicTableIndex(n8);
                this.dynamicTable[n8 + (n9 + n11)] = header;
            }
            this.dynamicTableByteCount += n10;
        }

        private final boolean isStaticHeader(int n8) {
            return n8 >= 0 && n8 <= INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int n8) throws IOException {
            Object object;
            if (this.isStaticHeader(n8)) {
                Header header = INSTANCE.getSTATIC_HEADER_TABLE()[n8];
                this.headerList.add(header);
                return;
            }
            int n9 = this.dynamicTableIndex(n8 - INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (n9 >= 0 && n9 < ((Header[])(object = this.dynamicTable)).length) {
                Collection collection = this.headerList;
                object = object[n9];
                l.c(object);
                collection.add(object);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Header index too large ");
            stringBuilder.append(n8 + 1);
            throw new IOException(stringBuilder.toString());
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int n8) throws IOException {
            this.insertIntoDynamicTable(-1, new Header(this.getName(n8), this.readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            this.insertIntoDynamicTable(-1, new Header(INSTANCE.checkLowercase(this.readByteString()), this.readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int n8) throws IOException {
            h h8 = this.getName(n8);
            h h9 = this.readByteString();
            this.headerList.add(new Header(h8, h9));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            h h8 = INSTANCE.checkLowercase(this.readByteString());
            h h9 = this.readByteString();
            this.headerList.add(new Header(h8, h9));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> list = o.V((Iterable)this.headerList);
            this.headerList.clear();
            return list;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final h readByteString() throws IOException {
            int n8 = this.readByte();
            boolean bl = (n8 & 0x80) == 128;
            long l8 = this.readInt(n8, 127);
            if (bl) {
                e e8 = new e();
                Huffman.INSTANCE.decode(this.source, l8, e8);
                return e8.m0();
            }
            return this.source.B(l8);
        }

        public final void readHeaders() throws IOException {
            while (!this.source.P()) {
                int n8 = Util.and(this.source.readByte(), 255);
                if (n8 != 128) {
                    if ((n8 & 0x80) == 128) {
                        this.readIndexedHeader(this.readInt(n8, 127) - 1);
                        continue;
                    }
                    if (n8 == 64) {
                        this.readLiteralHeaderWithIncrementalIndexingNewName();
                        continue;
                    }
                    if ((n8 & 0x40) == 64) {
                        this.readLiteralHeaderWithIncrementalIndexingIndexedName(this.readInt(n8, 63) - 1);
                        continue;
                    }
                    if ((n8 & 0x20) == 32) {
                        this.maxDynamicTableByteCount = n8 = this.readInt(n8, 31);
                        if (n8 >= 0 && n8 <= this.headerTableSizeSetting) {
                            this.adjustDynamicTableByteCount();
                            continue;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid dynamic table size update ");
                        stringBuilder.append(this.maxDynamicTableByteCount);
                        throw new IOException(stringBuilder.toString());
                    }
                    if (n8 != 16 && n8 != 0) {
                        this.readLiteralHeaderWithoutIndexingIndexedName(this.readInt(n8, 15) - 1);
                        continue;
                    }
                    this.readLiteralHeaderWithoutIndexingNewName();
                    continue;
                }
                throw new IOException("index == 0");
            }
        }

        public final int readInt(int n8, int n9) throws IOException {
            int n10;
            if ((n8 &= n9) < n9) {
                return n8;
            }
            n8 = 0;
            while (((n10 = this.readByte()) & 0x80) != 0) {
                n9 += (n10 & 0x7F) << n8;
                n8 += 7;
            }
            return n9 + (n10 << n8);
        }
    }

    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final e out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int n8, e e8) {
            l.f(e8, "out");
            this(n8, false, e8, 2, null);
        }

        public Writer(int n8, boolean bl, e headerArray) {
            l.f(headerArray, "out");
            this.headerTableSizeSetting = n8;
            this.useCompression = bl;
            this.out = headerArray;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = n8;
            headerArray = new Header[8];
            this.dynamicTable = headerArray;
            this.nextHeaderIndex = headerArray.length - 1;
        }

        public /* synthetic */ Writer(int n8, boolean bl, e e8, int n9, g g8) {
            if ((n9 & 1) != 0) {
                n8 = 4096;
            }
            if ((n9 & 2) != 0) {
                bl = true;
            }
            this(n8, bl, e8);
        }

        public Writer(e e8) {
            l.f(e8, "out");
            this(0, false, e8, 3, null);
        }

        private final void adjustDynamicTableByteCount() {
            int n8 = this.maxDynamicTableByteCount;
            int n9 = this.dynamicTableByteCount;
            if (n8 < n9) {
                if (n8 == 0) {
                    this.clearDynamicTable();
                    return;
                }
                this.evictToRecoverBytes(n9 - n8);
            }
        }

        private final void clearDynamicTable() {
            i.p(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int n8) {
            int n9 = 0;
            int n10 = 0;
            if (n8 > 0) {
                Object[] objectArray;
                int n11 = n8;
                n8 = n10;
                for (n9 = this.dynamicTable.length - 1; n9 >= (n10 = this.nextHeaderIndex) && n11 > 0; --n9) {
                    objectArray = this.dynamicTable[n9];
                    l.c(objectArray);
                    n11 -= objectArray.hpackSize;
                    n10 = this.dynamicTableByteCount;
                    objectArray = this.dynamicTable[n9];
                    l.c(objectArray);
                    this.dynamicTableByteCount = n10 - objectArray.hpackSize;
                    --this.headerCount;
                    ++n8;
                }
                objectArray = this.dynamicTable;
                System.arraycopy(objectArray, n10 + 1, objectArray, n10 + 1 + n8, this.headerCount);
                objectArray = this.dynamicTable;
                n9 = this.nextHeaderIndex;
                Arrays.fill(objectArray, n9 + 1, n9 + 1 + n8, null);
                this.nextHeaderIndex += n8;
                n9 = n8;
            }
            return n9;
        }

        private final void insertIntoDynamicTable(Header header) {
            int n8 = header.hpackSize;
            int n9 = this.maxDynamicTableByteCount;
            if (n8 > n9) {
                this.clearDynamicTable();
                return;
            }
            this.evictToRecoverBytes(this.dynamicTableByteCount + n8 - n9);
            n9 = this.headerCount;
            Header[] headerArray = this.dynamicTable;
            if (n9 + 1 > headerArray.length) {
                Header[] headerArray2 = new Header[headerArray.length * 2];
                System.arraycopy(headerArray, 0, headerArray2, headerArray.length, headerArray.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArray2;
            }
            n9 = this.nextHeaderIndex;
            this.nextHeaderIndex = n9 - 1;
            this.dynamicTable[n9] = header;
            ++this.headerCount;
            this.dynamicTableByteCount += n8;
        }

        public final void resizeHeaderTable(int n8) {
            this.headerTableSizeSetting = n8;
            int n9 = this.maxDynamicTableByteCount;
            if (n9 == (n8 = Math.min(n8, 16384))) {
                return;
            }
            if (n8 < n9) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, n8);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = n8;
            this.adjustDynamicTableByteCount();
        }

        public final void writeByteString(h h8) throws IOException {
            Huffman huffman;
            l.f(h8, "data");
            if (this.useCompression && (huffman = Huffman.INSTANCE).encodedLength(h8) < h8.G()) {
                e e8 = new e();
                huffman.encode(h8, e8);
                h8 = e8.m0();
                this.writeInt(h8.G(), 127, 128);
                this.out.f1(h8);
                return;
            }
            this.writeInt(h8.G(), 127, 0);
            this.out.f1(h8);
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void writeHeaders(List<Header> list) throws IOException {
            int n8;
            l.f(list, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                n8 = this.smallestHeaderTableSizeSetting;
                if (n8 < this.maxDynamicTableByteCount) {
                    this.writeInt(n8, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                this.writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int n9 = list.size();
            int n10 = 0;
            while (true) {
                int n11;
                int n12;
                Object object;
                h h8;
                h h9;
                Header header;
                block18: {
                    block19: {
                        block15: {
                            block16: {
                                block17: {
                                    if (n10 >= n9) {
                                        return;
                                    }
                                    header = list.get(n10);
                                    h9 = header.name.I();
                                    h8 = header.value;
                                    object = INSTANCE;
                                    Integer n13 = ((Hpack)object).getNAME_TO_FIRST_INDEX().get(h9);
                                    if (n13 == null) break block15;
                                    n12 = n13;
                                    n11 = n12 + 1;
                                    if (2 > n11 || n11 >= 8) break block16;
                                    if (!l.a(((Hpack)object).getSTATIC_HEADER_TABLE()[n12].value, h8)) break block17;
                                    n8 = n11;
                                    break block18;
                                }
                                if (!l.a(((Hpack)object).getSTATIC_HEADER_TABLE()[n11].value, h8)) break block16;
                                n8 = n11;
                                n11 = n12 + 2;
                                break block18;
                            }
                            n8 = n11;
                            break block19;
                        }
                        n8 = -1;
                    }
                    n11 = -1;
                }
                int n14 = n8;
                int n15 = n11;
                if (n11 == -1) {
                    n12 = this.nextHeaderIndex + 1;
                    int n16 = this.dynamicTable.length;
                    while (true) {
                        n14 = n8;
                        n15 = n11;
                        if (n12 >= n16) break;
                        object = this.dynamicTable[n12];
                        l.c(object);
                        n14 = n8;
                        if (l.a(((Header)object).name, h9)) {
                            object = this.dynamicTable[n12];
                            l.c(object);
                            if (l.a(((Header)object).value, h8)) {
                                n11 = this.nextHeaderIndex;
                                n15 = INSTANCE.getSTATIC_HEADER_TABLE().length + (n12 - n11);
                                n14 = n8;
                                break;
                            }
                            n14 = n8;
                            if (n8 == -1) {
                                n14 = n12 - this.nextHeaderIndex + INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                        ++n12;
                        n8 = n14;
                    }
                }
                if (n15 != -1) {
                    this.writeInt(n15, 127, 128);
                } else if (n14 == -1) {
                    this.out.j1(64);
                    this.writeByteString(h9);
                    this.writeByteString(h8);
                    this.insertIntoDynamicTable(header);
                } else if (h9.H(Header.PSEUDO_PREFIX) && !l.a(Header.TARGET_AUTHORITY, h9)) {
                    this.writeInt(n14, 15, 0);
                    this.writeByteString(h8);
                } else {
                    this.writeInt(n14, 63, 64);
                    this.writeByteString(h8);
                    this.insertIntoDynamicTable(header);
                }
                ++n10;
            }
        }

        public final void writeInt(int n8, int n9, int n10) {
            if (n8 < n9) {
                this.out.j1(n8 | n10);
                return;
            }
            this.out.j1(n10 | n9);
            n8 -= n9;
            while (n8 >= 128) {
                this.out.j1(0x80 | n8 & 0x7F);
                n8 >>>= 7;
            }
            this.out.j1(n8);
        }
    }
}

