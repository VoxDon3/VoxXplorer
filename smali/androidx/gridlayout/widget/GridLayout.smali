.class public Landroidx/gridlayout/widget/GridLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/gridlayout/widget/GridLayout$i;,
        Landroidx/gridlayout/widget/GridLayout$r;,
        Landroidx/gridlayout/widget/GridLayout$n;,
        Landroidx/gridlayout/widget/GridLayout$m;,
        Landroidx/gridlayout/widget/GridLayout$q;,
        Landroidx/gridlayout/widget/GridLayout$k;,
        Landroidx/gridlayout/widget/GridLayout$p;,
        Landroidx/gridlayout/widget/GridLayout$j;,
        Landroidx/gridlayout/widget/GridLayout$o;,
        Landroidx/gridlayout/widget/GridLayout$l;
    }
.end annotation


# static fields
.field public static final A:Landroidx/gridlayout/widget/GridLayout$i;

.field public static final B:Landroidx/gridlayout/widget/GridLayout$i;

.field public static final C:Landroidx/gridlayout/widget/GridLayout$i;

.field static final i:Landroid/util/Printer;

.field static final j:Landroid/util/Printer;

.field private static final k:I

.field private static final l:I

.field private static final m:I

.field private static final n:I

.field private static final o:I

.field private static final p:I

.field private static final q:I

.field static final r:Landroidx/gridlayout/widget/GridLayout$i;

.field private static final s:Landroidx/gridlayout/widget/GridLayout$i;

.field private static final t:Landroidx/gridlayout/widget/GridLayout$i;

.field public static final u:Landroidx/gridlayout/widget/GridLayout$i;

.field public static final v:Landroidx/gridlayout/widget/GridLayout$i;

.field public static final w:Landroidx/gridlayout/widget/GridLayout$i;

.field public static final x:Landroidx/gridlayout/widget/GridLayout$i;

.field public static final y:Landroidx/gridlayout/widget/GridLayout$i;

.field public static final z:Landroidx/gridlayout/widget/GridLayout$i;


# instance fields
.field final a:Landroidx/gridlayout/widget/GridLayout$l;

.field final b:Landroidx/gridlayout/widget/GridLayout$l;

.field c:I

.field d:Z

.field e:I

.field f:I

.field g:I

.field h:Landroid/util/Printer;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    new-instance v0, Landroid/util/LogPrinter;

    .line 2
    .line 3
    const-class v1, Landroidx/gridlayout/widget/GridLayout;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x3

    .line 10
    invoke-direct {v0, v2, v1}, Landroid/util/LogPrinter;-><init>(ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/gridlayout/widget/GridLayout;->i:Landroid/util/Printer;

    .line 14
    .line 15
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$a;

    .line 16
    .line 17
    invoke-direct {v0}, Landroidx/gridlayout/widget/GridLayout$a;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/gridlayout/widget/GridLayout;->j:Landroid/util/Printer;

    .line 21
    .line 22
    sget v0, Lax/C0/b;->l:I

    .line 23
    .line 24
    sput v0, Landroidx/gridlayout/widget/GridLayout;->k:I

    .line 25
    .line 26
    sget v0, Lax/C0/b;->m:I

    .line 27
    .line 28
    sput v0, Landroidx/gridlayout/widget/GridLayout;->l:I

    .line 29
    .line 30
    sget v0, Lax/C0/b;->j:I

    .line 31
    .line 32
    sput v0, Landroidx/gridlayout/widget/GridLayout;->m:I

    .line 33
    .line 34
    sget v0, Lax/C0/b;->o:I

    .line 35
    .line 36
    sput v0, Landroidx/gridlayout/widget/GridLayout;->n:I

    .line 37
    .line 38
    sget v0, Lax/C0/b;->i:I

    .line 39
    .line 40
    sput v0, Landroidx/gridlayout/widget/GridLayout;->o:I

    .line 41
    .line 42
    sget v0, Lax/C0/b;->n:I

    .line 43
    .line 44
    sput v0, Landroidx/gridlayout/widget/GridLayout;->p:I

    .line 45
    .line 46
    sget v0, Lax/C0/b;->k:I

    .line 47
    .line 48
    sput v0, Landroidx/gridlayout/widget/GridLayout;->q:I

    .line 49
    .line 50
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$b;

    .line 51
    .line 52
    invoke-direct {v0}, Landroidx/gridlayout/widget/GridLayout$b;-><init>()V

    .line 53
    .line 54
    .line 55
    sput-object v0, Landroidx/gridlayout/widget/GridLayout;->r:Landroidx/gridlayout/widget/GridLayout$i;

    .line 56
    .line 57
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$c;

    .line 58
    .line 59
    invoke-direct {v0}, Landroidx/gridlayout/widget/GridLayout$c;-><init>()V

    .line 60
    .line 61
    .line 62
    sput-object v0, Landroidx/gridlayout/widget/GridLayout;->s:Landroidx/gridlayout/widget/GridLayout$i;

    .line 63
    .line 64
    new-instance v1, Landroidx/gridlayout/widget/GridLayout$d;

    .line 65
    .line 66
    invoke-direct {v1}, Landroidx/gridlayout/widget/GridLayout$d;-><init>()V

    .line 67
    .line 68
    .line 69
    sput-object v1, Landroidx/gridlayout/widget/GridLayout;->t:Landroidx/gridlayout/widget/GridLayout$i;

    .line 70
    .line 71
    sput-object v0, Landroidx/gridlayout/widget/GridLayout;->u:Landroidx/gridlayout/widget/GridLayout$i;

    .line 72
    .line 73
    sput-object v1, Landroidx/gridlayout/widget/GridLayout;->v:Landroidx/gridlayout/widget/GridLayout$i;

    .line 74
    .line 75
    sput-object v0, Landroidx/gridlayout/widget/GridLayout;->w:Landroidx/gridlayout/widget/GridLayout$i;

    .line 76
    .line 77
    sput-object v1, Landroidx/gridlayout/widget/GridLayout;->x:Landroidx/gridlayout/widget/GridLayout$i;

    .line 78
    .line 79
    invoke-static {v0, v1}, Landroidx/gridlayout/widget/GridLayout;->h(Landroidx/gridlayout/widget/GridLayout$i;Landroidx/gridlayout/widget/GridLayout$i;)Landroidx/gridlayout/widget/GridLayout$i;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    sput-object v2, Landroidx/gridlayout/widget/GridLayout;->y:Landroidx/gridlayout/widget/GridLayout$i;

    .line 84
    .line 85
    invoke-static {v1, v0}, Landroidx/gridlayout/widget/GridLayout;->h(Landroidx/gridlayout/widget/GridLayout$i;Landroidx/gridlayout/widget/GridLayout$i;)Landroidx/gridlayout/widget/GridLayout$i;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Landroidx/gridlayout/widget/GridLayout;->z:Landroidx/gridlayout/widget/GridLayout$i;

    .line 90
    .line 91
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$f;

    .line 92
    .line 93
    invoke-direct {v0}, Landroidx/gridlayout/widget/GridLayout$f;-><init>()V

    .line 94
    .line 95
    .line 96
    sput-object v0, Landroidx/gridlayout/widget/GridLayout;->A:Landroidx/gridlayout/widget/GridLayout$i;

    .line 97
    .line 98
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$g;

    .line 99
    .line 100
    invoke-direct {v0}, Landroidx/gridlayout/widget/GridLayout$g;-><init>()V

    .line 101
    .line 102
    .line 103
    sput-object v0, Landroidx/gridlayout/widget/GridLayout;->B:Landroidx/gridlayout/widget/GridLayout$i;

    .line 104
    .line 105
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$h;

    .line 106
    .line 107
    invoke-direct {v0}, Landroidx/gridlayout/widget/GridLayout$h;-><init>()V

    .line 108
    .line 109
    .line 110
    sput-object v0, Landroidx/gridlayout/widget/GridLayout;->C:Landroidx/gridlayout/widget/GridLayout$i;

    .line 111
    .line 112
    return-void
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, p2, v0}, Landroidx/gridlayout/widget/GridLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 7

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    new-instance p3, Landroidx/gridlayout/widget/GridLayout$l;

    const/4 v0, 0x1

    invoke-direct {p3, p0, v0}, Landroidx/gridlayout/widget/GridLayout$l;-><init>(Landroidx/gridlayout/widget/GridLayout;Z)V

    iput-object p3, p0, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 3
    new-instance p3, Landroidx/gridlayout/widget/GridLayout$l;

    const/4 v1, 0x0

    invoke-direct {p3, p0, v1}, Landroidx/gridlayout/widget/GridLayout$l;-><init>(Landroidx/gridlayout/widget/GridLayout;Z)V

    iput-object p3, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 4
    iput v1, p0, Landroidx/gridlayout/widget/GridLayout;->c:I

    .line 5
    iput-boolean v1, p0, Landroidx/gridlayout/widget/GridLayout;->d:Z

    .line 6
    iput v0, p0, Landroidx/gridlayout/widget/GridLayout;->e:I

    .line 7
    iput v1, p0, Landroidx/gridlayout/widget/GridLayout;->g:I

    .line 8
    sget-object p3, Landroidx/gridlayout/widget/GridLayout;->i:Landroid/util/Printer;

    iput-object p3, p0, Landroidx/gridlayout/widget/GridLayout;->h:Landroid/util/Printer;

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v2, Lax/C0/a;->a:I

    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p3

    iput p3, p0, Landroidx/gridlayout/widget/GridLayout;->f:I

    .line 10
    sget-object p3, Lax/C0/b;->h:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 11
    :try_start_31
    sget p2, Landroidx/gridlayout/widget/GridLayout;->l:I

    const/high16 p3, -0x80000000

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/gridlayout/widget/GridLayout;->setRowCount(I)V

    .line 12
    sget p2, Landroidx/gridlayout/widget/GridLayout;->m:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/gridlayout/widget/GridLayout;->setColumnCount(I)V

    .line 13
    sget p2, Landroidx/gridlayout/widget/GridLayout;->k:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/gridlayout/widget/GridLayout;->setOrientation(I)V

    .line 14
    sget p2, Landroidx/gridlayout/widget/GridLayout;->n:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/gridlayout/widget/GridLayout;->setUseDefaultMargins(Z)V

    .line 15
    sget p2, Landroidx/gridlayout/widget/GridLayout;->o:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/gridlayout/widget/GridLayout;->setAlignmentMode(I)V

    .line 16
    sget p2, Landroidx/gridlayout/widget/GridLayout;->p:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/gridlayout/widget/GridLayout;->setRowOrderPreserved(Z)V

    .line 17
    sget p2, Landroidx/gridlayout/widget/GridLayout;->q:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/gridlayout/widget/GridLayout;->setColumnOrderPreserved(Z)V
    :try_end_72
    .catchall {:try_start_31 .. :try_end_72} :catchall_76

    .line 18
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_76
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method static A([II)I
    .registers 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    if-ge v1, v0, :cond_d

    .line 4
    .line 5
    aget v2, p0, v1

    .line 6
    .line 7
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_d
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private B(Landroid/view/View;IIII)V
    .registers 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Landroidx/gridlayout/widget/GridLayout;->v(Landroid/view/View;Z)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-static {p2, v0, p4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const/4 p4, 0x0

    .line 11
    invoke-direct {p0, p1, p4}, Landroidx/gridlayout/widget/GridLayout;->v(Landroid/view/View;Z)I

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    invoke-static {p3, p4, p5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
.end method

.method private C(IIZ)V
    .registers 14

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_6
    if-ge v2, v0, :cond_75

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/16 v5, 0x8

    .line 18
    .line 19
    if-ne v3, v5, :cond_18

    .line 20
    .line 21
    move v5, p1

    .line 22
    move v6, p2

    .line 23
    goto/16 :goto_70

    .line 24
    .line 25
    :cond_18
    invoke-virtual {p0, v4}, Landroidx/gridlayout/widget/GridLayout;->q(Landroid/view/View;)Landroidx/gridlayout/widget/GridLayout$o;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz p3, :cond_2a

    .line 30
    .line 31
    iget v7, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 32
    .line 33
    iget v8, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 34
    .line 35
    move-object v3, p0

    .line 36
    move v5, p1

    .line 37
    move v6, p2

    .line 38
    invoke-direct/range {v3 .. v8}, Landroidx/gridlayout/widget/GridLayout;->B(Landroid/view/View;IIII)V

    .line 39
    .line 40
    .line 41
    move-object p1, v3

    .line 42
    goto :goto_70

    .line 43
    :cond_2a
    move v5, p1

    .line 44
    move v6, p2

    .line 45
    move-object p1, p0

    .line 46
    iget p2, p1, Landroidx/gridlayout/widget/GridLayout;->c:I

    .line 47
    .line 48
    if-nez p2, :cond_33

    .line 49
    .line 50
    const/4 p2, 0x1

    .line 51
    goto :goto_34

    .line 52
    :cond_33
    const/4 p2, 0x0

    .line 53
    :goto_34
    if-eqz p2, :cond_39

    .line 54
    .line 55
    iget-object v7, v3, Landroidx/gridlayout/widget/GridLayout$o;->b:Landroidx/gridlayout/widget/GridLayout$r;

    .line 56
    .line 57
    goto :goto_3b

    .line 58
    :cond_39
    iget-object v7, v3, Landroidx/gridlayout/widget/GridLayout$o;->a:Landroidx/gridlayout/widget/GridLayout$r;

    .line 59
    .line 60
    :goto_3b
    invoke-virtual {v7, p2}, Landroidx/gridlayout/widget/GridLayout$r;->b(Z)Landroidx/gridlayout/widget/GridLayout$i;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    sget-object v9, Landroidx/gridlayout/widget/GridLayout;->C:Landroidx/gridlayout/widget/GridLayout$i;

    .line 65
    .line 66
    if-ne v8, v9, :cond_70

    .line 67
    .line 68
    iget-object v7, v7, Landroidx/gridlayout/widget/GridLayout$r;->b:Landroidx/gridlayout/widget/GridLayout$n;

    .line 69
    .line 70
    if-eqz p2, :cond_4a

    .line 71
    .line 72
    iget-object v8, p1, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 73
    .line 74
    goto :goto_4c

    .line 75
    :cond_4a
    iget-object v8, p1, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 76
    .line 77
    :goto_4c
    invoke-virtual {v8}, Landroidx/gridlayout/widget/GridLayout$l;->u()[I

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    iget v9, v7, Landroidx/gridlayout/widget/GridLayout$n;->b:I

    .line 82
    .line 83
    aget v9, v8, v9

    .line 84
    .line 85
    iget v7, v7, Landroidx/gridlayout/widget/GridLayout$n;->a:I

    .line 86
    .line 87
    aget v7, v8, v7

    .line 88
    .line 89
    sub-int/2addr v9, v7

    .line 90
    invoke-direct {p0, v4, p2}, Landroidx/gridlayout/widget/GridLayout;->v(Landroid/view/View;Z)I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    sub-int v7, v9, v7

    .line 95
    .line 96
    if-eqz p2, :cond_68

    .line 97
    .line 98
    iget v8, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 99
    .line 100
    move-object v3, p1

    .line 101
    invoke-direct/range {v3 .. v8}, Landroidx/gridlayout/widget/GridLayout;->B(Landroid/view/View;IIII)V

    .line 102
    .line 103
    .line 104
    goto :goto_70

    .line 105
    :cond_68
    iget p1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 106
    .line 107
    move-object v3, p0

    .line 108
    move v8, v7

    .line 109
    move v7, p1

    .line 110
    invoke-direct/range {v3 .. v8}, Landroidx/gridlayout/widget/GridLayout;->B(Landroid/view/View;IIII)V

    .line 111
    .line 112
    .line 113
    :cond_70
    :goto_70
    add-int/lit8 v2, v2, 0x1

    .line 114
    .line 115
    move p1, v5

    .line 116
    move p2, v6

    .line 117
    goto :goto_6

    .line 118
    :cond_75
    return-void
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method private static D([IIII)V
    .registers 5

    .line 1
    array-length v0, p0

    .line 2
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-static {p0, p1, p2, p3}, Ljava/util/Arrays;->fill([IIII)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private static E(Landroidx/gridlayout/widget/GridLayout$o;IIII)V
    .registers 6

    .line 1
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$n;

    .line 2
    .line 3
    add-int/2addr p2, p1

    .line 4
    invoke-direct {v0, p1, p2}, Landroidx/gridlayout/widget/GridLayout$n;-><init>(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/gridlayout/widget/GridLayout$o;->d(Landroidx/gridlayout/widget/GridLayout$n;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Landroidx/gridlayout/widget/GridLayout$n;

    .line 11
    .line 12
    add-int/2addr p4, p3

    .line 13
    invoke-direct {p1, p3, p4}, Landroidx/gridlayout/widget/GridLayout$n;-><init>(II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/gridlayout/widget/GridLayout$o;->c(Landroidx/gridlayout/widget/GridLayout$n;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
.end method

.method public static F(I)Landroidx/gridlayout/widget/GridLayout$r;
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Landroidx/gridlayout/widget/GridLayout;->G(II)Landroidx/gridlayout/widget/GridLayout$r;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static G(II)Landroidx/gridlayout/widget/GridLayout$r;
    .registers 3

    .line 1
    sget-object v0, Landroidx/gridlayout/widget/GridLayout;->r:Landroidx/gridlayout/widget/GridLayout$i;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Landroidx/gridlayout/widget/GridLayout;->H(IILandroidx/gridlayout/widget/GridLayout$i;)Landroidx/gridlayout/widget/GridLayout$r;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public static H(IILandroidx/gridlayout/widget/GridLayout$i;)Landroidx/gridlayout/widget/GridLayout$r;
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, p2, v0}, Landroidx/gridlayout/widget/GridLayout;->I(IILandroidx/gridlayout/widget/GridLayout$i;F)Landroidx/gridlayout/widget/GridLayout$r;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static I(IILandroidx/gridlayout/widget/GridLayout$i;F)Landroidx/gridlayout/widget/GridLayout$r;
    .registers 10

    .line 1
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$r;

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq p0, v1, :cond_c

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    :goto_7
    move v2, p0

    .line 9
    move v3, p1

    .line 10
    move-object v4, p2

    .line 11
    move v5, p3

    .line 12
    goto :goto_e

    .line 13
    :cond_c
    const/4 v1, 0x0

    .line 14
    goto :goto_7

    .line 15
    :goto_e
    invoke-direct/range {v0 .. v5}, Landroidx/gridlayout/widget/GridLayout$r;-><init>(ZIILandroidx/gridlayout/widget/GridLayout$i;F)V

    .line 16
    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private J()V
    .registers 15

    .line 1
    iget v0, p0, Landroidx/gridlayout/widget/GridLayout;->c:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_7

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_8

    .line 8
    :cond_7
    const/4 v0, 0x0

    .line 9
    :goto_8
    if-eqz v0, :cond_d

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    iget-object v2, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 15
    .line 16
    :goto_f
    iget v2, v2, Landroidx/gridlayout/widget/GridLayout$l;->b:I

    .line 17
    .line 18
    const/high16 v3, -0x80000000

    .line 19
    .line 20
    if-eq v2, v3, :cond_16

    .line 21
    .line 22
    goto :goto_17

    .line 23
    :cond_16
    const/4 v2, 0x0

    .line 24
    :goto_17
    new-array v3, v2, [I

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    :goto_20
    if-ge v5, v4, :cond_82

    .line 34
    .line 35
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    check-cast v8, Landroidx/gridlayout/widget/GridLayout$o;

    .line 44
    .line 45
    if-eqz v0, :cond_31

    .line 46
    .line 47
    iget-object v9, v8, Landroidx/gridlayout/widget/GridLayout$o;->a:Landroidx/gridlayout/widget/GridLayout$r;

    .line 48
    .line 49
    goto :goto_33

    .line 50
    :cond_31
    iget-object v9, v8, Landroidx/gridlayout/widget/GridLayout$o;->b:Landroidx/gridlayout/widget/GridLayout$r;

    .line 51
    .line 52
    :goto_33
    iget-object v10, v9, Landroidx/gridlayout/widget/GridLayout$r;->b:Landroidx/gridlayout/widget/GridLayout$n;

    .line 53
    .line 54
    iget-boolean v9, v9, Landroidx/gridlayout/widget/GridLayout$r;->a:Z

    .line 55
    .line 56
    invoke-virtual {v10}, Landroidx/gridlayout/widget/GridLayout$n;->b()I

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    if-eqz v9, :cond_3f

    .line 61
    .line 62
    iget v6, v10, Landroidx/gridlayout/widget/GridLayout$n;->a:I

    .line 63
    .line 64
    :cond_3f
    if-eqz v0, :cond_44

    .line 65
    .line 66
    iget-object v10, v8, Landroidx/gridlayout/widget/GridLayout$o;->b:Landroidx/gridlayout/widget/GridLayout$r;

    .line 67
    .line 68
    goto :goto_46

    .line 69
    :cond_44
    iget-object v10, v8, Landroidx/gridlayout/widget/GridLayout$o;->a:Landroidx/gridlayout/widget/GridLayout$r;

    .line 70
    .line 71
    :goto_46
    iget-object v12, v10, Landroidx/gridlayout/widget/GridLayout$r;->b:Landroidx/gridlayout/widget/GridLayout$n;

    .line 72
    .line 73
    iget-boolean v10, v10, Landroidx/gridlayout/widget/GridLayout$r;->a:Z

    .line 74
    .line 75
    invoke-static {v12, v10, v2}, Landroidx/gridlayout/widget/GridLayout;->e(Landroidx/gridlayout/widget/GridLayout$n;ZI)I

    .line 76
    .line 77
    .line 78
    move-result v13

    .line 79
    if-eqz v10, :cond_52

    .line 80
    .line 81
    iget v7, v12, Landroidx/gridlayout/widget/GridLayout$n;->a:I

    .line 82
    .line 83
    :cond_52
    if-eqz v2, :cond_75

    .line 84
    .line 85
    if-eqz v9, :cond_58

    .line 86
    .line 87
    if-nez v10, :cond_6e

    .line 88
    .line 89
    :cond_58
    :goto_58
    add-int v9, v7, v13

    .line 90
    .line 91
    invoke-static {v3, v6, v7, v9}, Landroidx/gridlayout/widget/GridLayout;->i([IIII)Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    if-nez v12, :cond_6e

    .line 96
    .line 97
    if-eqz v10, :cond_65

    .line 98
    .line 99
    add-int/lit8 v6, v6, 0x1

    .line 100
    .line 101
    goto :goto_58

    .line 102
    :cond_65
    if-gt v9, v2, :cond_6a

    .line 103
    .line 104
    add-int/lit8 v7, v7, 0x1

    .line 105
    .line 106
    goto :goto_58

    .line 107
    :cond_6a
    add-int/lit8 v6, v6, 0x1

    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    goto :goto_58

    .line 111
    :cond_6e
    add-int v9, v7, v13

    .line 112
    .line 113
    add-int v10, v6, v11

    .line 114
    .line 115
    invoke-static {v3, v7, v9, v10}, Landroidx/gridlayout/widget/GridLayout;->D([IIII)V

    .line 116
    .line 117
    .line 118
    :cond_75
    if-eqz v0, :cond_7b

    .line 119
    .line 120
    invoke-static {v8, v6, v11, v7, v13}, Landroidx/gridlayout/widget/GridLayout;->E(Landroidx/gridlayout/widget/GridLayout$o;IIII)V

    .line 121
    .line 122
    .line 123
    goto :goto_7e

    .line 124
    :cond_7b
    invoke-static {v8, v7, v13, v6, v11}, Landroidx/gridlayout/widget/GridLayout;->E(Landroidx/gridlayout/widget/GridLayout$o;IIII)V

    .line 125
    .line 126
    .line 127
    :goto_7e
    add-int/2addr v7, v13

    .line 128
    add-int/lit8 v5, v5, 0x1

    .line 129
    .line 130
    goto :goto_20

    .line 131
    :cond_82
    return-void
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method static a(II)I
    .registers 2

    .line 1
    add-int/2addr p1, p0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-static {p1, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static b([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;[TT;)[TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    array-length v1, p0

    .line 10
    array-length v2, p1

    .line 11
    add-int/2addr v1, v2

    .line 12
    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, [Ljava/lang/Object;

    .line 17
    .line 18
    array-length v1, p0

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    array-length p0, p0

    .line 24
    array-length v1, p1

    .line 25
    invoke-static {p1, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    return-object v0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static c(I)Z
    .registers 1

    .line 1
    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method private d(Landroidx/gridlayout/widget/GridLayout$o;Z)V
    .registers 7

    .line 1
    if-eqz p2, :cond_5

    .line 2
    .line 3
    const-string v0, "column"

    .line 4
    .line 5
    goto :goto_7

    .line 6
    :cond_5
    const-string v0, "row"

    .line 7
    .line 8
    :goto_7
    if-eqz p2, :cond_c

    .line 9
    .line 10
    iget-object p1, p1, Landroidx/gridlayout/widget/GridLayout$o;->b:Landroidx/gridlayout/widget/GridLayout$r;

    .line 11
    .line 12
    goto :goto_e

    .line 13
    :cond_c
    iget-object p1, p1, Landroidx/gridlayout/widget/GridLayout$o;->a:Landroidx/gridlayout/widget/GridLayout$r;

    .line 14
    .line 15
    :goto_e
    iget-object p1, p1, Landroidx/gridlayout/widget/GridLayout$r;->b:Landroidx/gridlayout/widget/GridLayout$n;

    .line 16
    .line 17
    iget v1, p1, Landroidx/gridlayout/widget/GridLayout$n;->a:I

    .line 18
    .line 19
    const/high16 v2, -0x80000000

    .line 20
    .line 21
    if-eq v1, v2, :cond_2c

    .line 22
    .line 23
    if-gez v1, :cond_2c

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, " indices must be positive"

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Landroidx/gridlayout/widget/GridLayout;->w(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    if-eqz p2, :cond_31

    .line 46
    .line 47
    iget-object p2, p0, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 48
    .line 49
    goto :goto_33

    .line 50
    :cond_31
    iget-object p2, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 51
    .line 52
    :goto_33
    iget p2, p2, Landroidx/gridlayout/widget/GridLayout$l;->b:I

    .line 53
    .line 54
    if-eq p2, v2, :cond_77

    .line 55
    .line 56
    iget v1, p1, Landroidx/gridlayout/widget/GridLayout$n;->b:I

    .line 57
    .line 58
    const-string v2, " count"

    .line 59
    .line 60
    if-le v1, p2, :cond_57

    .line 61
    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v3, " indices (start + span) mustn\'t exceed the "

    .line 71
    .line 72
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1}, Landroidx/gridlayout/widget/GridLayout;->w(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_57
    invoke-virtual {p1}, Landroidx/gridlayout/widget/GridLayout$n;->b()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-le p1, p2, :cond_77

    .line 93
    .line 94
    new-instance p1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string p2, " span mustn\'t exceed the "

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p1}, Landroidx/gridlayout/widget/GridLayout;->w(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_77
    return-void
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method private static e(Landroidx/gridlayout/widget/GridLayout$n;ZI)I
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/gridlayout/widget/GridLayout$n;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez p2, :cond_7

    .line 6
    .line 7
    return v0

    .line 8
    :cond_7
    if-eqz p1, :cond_10

    .line 9
    .line 10
    iget p0, p0, Landroidx/gridlayout/widget/GridLayout$n;->a:I

    .line 11
    .line 12
    invoke-static {p0, p2}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    goto :goto_11

    .line 17
    :cond_10
    const/4 p0, 0x0

    .line 18
    :goto_11
    sub-int/2addr p2, p0

    .line 19
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private f()I
    .registers 7

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_6
    if-ge v2, v0, :cond_25

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/16 v5, 0x8

    .line 18
    .line 19
    if-ne v4, v5, :cond_15

    .line 20
    .line 21
    goto :goto_22

    .line 22
    :cond_15
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Landroidx/gridlayout/widget/GridLayout$o;

    .line 27
    .line 28
    mul-int/lit8 v1, v1, 0x1f

    .line 29
    .line 30
    invoke-virtual {v3}, Landroidx/gridlayout/widget/GridLayout$o;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    add-int/2addr v1, v3

    .line 35
    :goto_22
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_6

    .line 38
    :cond_25
    return v1
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private g()V
    .registers 3

    .line 1
    iget v0, p0, Landroidx/gridlayout/widget/GridLayout;->g:I

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->J()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->f()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Landroidx/gridlayout/widget/GridLayout;->g:I

    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->f()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eq v0, v1, :cond_21

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->h:Landroid/util/Printer;

    .line 22
    .line 23
    const-string v1, "The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec."

    .line 24
    .line 25
    invoke-interface {v0, v1}, Landroid/util/Printer;->println(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->x()V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->g()V

    .line 32
    .line 33
    .line 34
    :cond_21
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private static h(Landroidx/gridlayout/widget/GridLayout$i;Landroidx/gridlayout/widget/GridLayout$i;)Landroidx/gridlayout/widget/GridLayout$i;
    .registers 3

    .line 1
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroidx/gridlayout/widget/GridLayout$e;-><init>(Landroidx/gridlayout/widget/GridLayout$i;Landroidx/gridlayout/widget/GridLayout$i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private static i([IIII)Z
    .registers 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-le p3, v0, :cond_5

    .line 4
    .line 5
    return v1

    .line 6
    :cond_5
    :goto_5
    if-ge p2, p3, :cond_f

    .line 7
    .line 8
    aget v0, p0, p2

    .line 9
    .line 10
    if-le v0, p1, :cond_c

    .line 11
    .line 12
    return v1

    .line 13
    :cond_c
    add-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    goto :goto_5

    .line 16
    :cond_f
    const/4 p0, 0x1

    .line 17
    return p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method static m(IZ)Landroidx/gridlayout/widget/GridLayout$i;
    .registers 5

    .line 1
    const/4 v0, 0x7

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    const/4 v1, 0x7

    .line 5
    goto :goto_7

    .line 6
    :cond_5
    const/16 v1, 0x70

    .line 7
    .line 8
    :goto_7
    if-eqz p1, :cond_b

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    goto :goto_c

    .line 12
    :cond_b
    const/4 v2, 0x4

    .line 13
    :goto_c
    and-int/2addr p0, v1

    .line 14
    shr-int/2addr p0, v2

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq p0, v1, :cond_3f

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    if-eq p0, v1, :cond_37

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    if-eq p0, v1, :cond_2f

    .line 23
    .line 24
    if-eq p0, v0, :cond_2c

    .line 25
    .line 26
    const p1, 0x800003

    .line 27
    .line 28
    .line 29
    if-eq p0, p1, :cond_29

    .line 30
    .line 31
    const p1, 0x800005

    .line 32
    .line 33
    .line 34
    if-eq p0, p1, :cond_26

    .line 35
    .line 36
    sget-object p0, Landroidx/gridlayout/widget/GridLayout;->r:Landroidx/gridlayout/widget/GridLayout$i;

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_26
    sget-object p0, Landroidx/gridlayout/widget/GridLayout;->x:Landroidx/gridlayout/widget/GridLayout$i;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_29
    sget-object p0, Landroidx/gridlayout/widget/GridLayout;->w:Landroidx/gridlayout/widget/GridLayout$i;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_2c
    sget-object p0, Landroidx/gridlayout/widget/GridLayout;->C:Landroidx/gridlayout/widget/GridLayout$i;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2f
    if-eqz p1, :cond_34

    .line 49
    .line 50
    sget-object p0, Landroidx/gridlayout/widget/GridLayout;->z:Landroidx/gridlayout/widget/GridLayout$i;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_34
    sget-object p0, Landroidx/gridlayout/widget/GridLayout;->v:Landroidx/gridlayout/widget/GridLayout$i;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_37
    if-eqz p1, :cond_3c

    .line 57
    .line 58
    sget-object p0, Landroidx/gridlayout/widget/GridLayout;->y:Landroidx/gridlayout/widget/GridLayout$i;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_3c
    sget-object p0, Landroidx/gridlayout/widget/GridLayout;->u:Landroidx/gridlayout/widget/GridLayout$i;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_3f
    sget-object p0, Landroidx/gridlayout/widget/GridLayout;->A:Landroidx/gridlayout/widget/GridLayout$i;

    .line 65
    .line 66
    return-object p0
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method private n(Landroid/view/View;Landroidx/gridlayout/widget/GridLayout$o;ZZ)I
    .registers 9

    .line 1
    iget-boolean v0, p0, Landroidx/gridlayout/widget/GridLayout;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    if-eqz p3, :cond_b

    .line 8
    .line 9
    iget-object p2, p2, Landroidx/gridlayout/widget/GridLayout$o;->b:Landroidx/gridlayout/widget/GridLayout$r;

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    iget-object p2, p2, Landroidx/gridlayout/widget/GridLayout$o;->a:Landroidx/gridlayout/widget/GridLayout$r;

    .line 13
    .line 14
    :goto_d
    if-eqz p3, :cond_12

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 17
    .line 18
    goto :goto_14

    .line 19
    :cond_12
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 20
    .line 21
    :goto_14
    iget-object p2, p2, Landroidx/gridlayout/widget/GridLayout$r;->b:Landroidx/gridlayout/widget/GridLayout$n;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    if-eqz p3, :cond_25

    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->z()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_25

    .line 31
    .line 32
    if-nez p4, :cond_23

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    goto :goto_26

    .line 36
    :cond_23
    const/4 v3, 0x0

    .line 37
    goto :goto_26

    .line 38
    :cond_25
    move v3, p4

    .line 39
    :goto_26
    if-eqz v3, :cond_2e

    .line 40
    .line 41
    iget p2, p2, Landroidx/gridlayout/widget/GridLayout$n;->a:I

    .line 42
    .line 43
    if-nez p2, :cond_37

    .line 44
    .line 45
    :goto_2c
    const/4 v1, 0x1

    .line 46
    goto :goto_37

    .line 47
    :cond_2e
    iget p2, p2, Landroidx/gridlayout/widget/GridLayout$n;->b:I

    .line 48
    .line 49
    invoke-virtual {v0}, Landroidx/gridlayout/widget/GridLayout$l;->p()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-ne p2, v0, :cond_37

    .line 54
    .line 55
    goto :goto_2c

    .line 56
    :cond_37
    :goto_37
    invoke-direct {p0, p1, v1, p3, p4}, Landroidx/gridlayout/widget/GridLayout;->p(Landroid/view/View;ZZZ)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    return p1
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private o(Landroid/view/View;ZZ)I
    .registers 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-class p3, Lax/F0/a;

    .line 6
    .line 7
    if-eq p2, p3, :cond_16

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-class p2, Landroid/widget/Space;

    .line 14
    .line 15
    if-ne p1, p2, :cond_11

    .line 16
    .line 17
    goto :goto_16

    .line 18
    :cond_11
    iget p1, p0, Landroidx/gridlayout/widget/GridLayout;->f:I

    .line 19
    .line 20
    div-int/lit8 p1, p1, 0x2

    .line 21
    .line 22
    return p1

    .line 23
    :cond_16
    :goto_16
    const/4 p1, 0x0

    .line 24
    return p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private p(Landroid/view/View;ZZZ)I
    .registers 5

    .line 1
    invoke-direct {p0, p1, p3, p4}, Landroidx/gridlayout/widget/GridLayout;->o(Landroid/view/View;ZZ)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private r(Landroid/view/View;ZZ)I
    .registers 6

    .line 1
    iget v0, p0, Landroidx/gridlayout/widget/GridLayout;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_a

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3}, Landroidx/gridlayout/widget/GridLayout;->s(Landroid/view/View;ZZ)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_a
    if-eqz p2, :cond_f

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 14
    .line 15
    goto :goto_11

    .line 16
    :cond_f
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 17
    .line 18
    :goto_11
    if-eqz p3, :cond_18

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/gridlayout/widget/GridLayout$l;->t()[I

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_1c

    .line 25
    :cond_18
    invoke-virtual {v0}, Landroidx/gridlayout/widget/GridLayout$l;->y()[I

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_1c
    invoke-virtual {p0, p1}, Landroidx/gridlayout/widget/GridLayout;->q(Landroid/view/View;)Landroidx/gridlayout/widget/GridLayout$o;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p2, :cond_25

    .line 34
    .line 35
    iget-object p1, p1, Landroidx/gridlayout/widget/GridLayout$o;->b:Landroidx/gridlayout/widget/GridLayout$r;

    .line 36
    .line 37
    goto :goto_27

    .line 38
    :cond_25
    iget-object p1, p1, Landroidx/gridlayout/widget/GridLayout$o;->a:Landroidx/gridlayout/widget/GridLayout$r;

    .line 39
    .line 40
    :goto_27
    iget-object p1, p1, Landroidx/gridlayout/widget/GridLayout$r;->b:Landroidx/gridlayout/widget/GridLayout$n;

    .line 41
    .line 42
    if-eqz p3, :cond_2e

    .line 43
    .line 44
    iget p1, p1, Landroidx/gridlayout/widget/GridLayout$n;->a:I

    .line 45
    .line 46
    goto :goto_30

    .line 47
    :cond_2e
    iget p1, p1, Landroidx/gridlayout/widget/GridLayout$n;->b:I

    .line 48
    .line 49
    :goto_30
    aget p1, v0, p1

    .line 50
    .line 51
    return p1
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private t(Landroid/view/View;Z)I
    .registers 3

    .line 1
    if-eqz p2, :cond_7

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1

    .line 8
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private v(Landroid/view/View;Z)I
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroidx/gridlayout/widget/GridLayout;->r(Landroid/view/View;ZZ)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, p1, p2, v1}, Landroidx/gridlayout/widget/GridLayout;->r(Landroid/view/View;ZZ)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    add-int/2addr v0, p1

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static w(Ljava/lang/String;)V
    .registers 3

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, ". "

    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private x()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/gridlayout/widget/GridLayout;->g:I

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/gridlayout/widget/GridLayout$l;->E()V

    .line 9
    .line 10
    .line 11
    :cond_a
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 12
    .line 13
    if-eqz v0, :cond_11

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/gridlayout/widget/GridLayout$l;->E()V

    .line 16
    .line 17
    .line 18
    :cond_11
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->y()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private y()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 6
    .line 7
    if-eqz v1, :cond_10

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/gridlayout/widget/GridLayout$l;->F()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/gridlayout/widget/GridLayout$l;->F()V

    .line 15
    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private z()Z
    .registers 3

    .line 1
    invoke-static {p0}, Lax/c0/d0;->B(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 4

    .line 1
    instance-of v0, p1, Landroidx/gridlayout/widget/GridLayout$o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    check-cast p1, Landroidx/gridlayout/widget/GridLayout$o;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, p1, v0}, Landroidx/gridlayout/widget/GridLayout;->d(Landroidx/gridlayout/widget/GridLayout$o;Z)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, v1}, Landroidx/gridlayout/widget/GridLayout;->d(Landroidx/gridlayout/widget/GridLayout$o;Z)V

    .line 14
    .line 15
    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/gridlayout/widget/GridLayout;->j()Landroidx/gridlayout/widget/GridLayout$o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/gridlayout/widget/GridLayout;->k(Landroid/util/AttributeSet;)Landroidx/gridlayout/widget/GridLayout$o;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 2
    invoke-virtual {p0, p1}, Landroidx/gridlayout/widget/GridLayout;->l(Landroid/view/ViewGroup$LayoutParams;)Landroidx/gridlayout/widget/GridLayout$o;

    move-result-object p1

    return-object p1
.end method

.method public getAlignmentMode()I
    .registers 2

    .line 1
    iget v0, p0, Landroidx/gridlayout/widget/GridLayout;->e:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getColumnCount()I
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/gridlayout/widget/GridLayout$l;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getOrientation()I
    .registers 2

    .line 1
    iget v0, p0, Landroidx/gridlayout/widget/GridLayout;->c:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getPrinter()Landroid/util/Printer;
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->h:Landroid/util/Printer;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getRowCount()I
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/gridlayout/widget/GridLayout$l;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getUseDefaultMargins()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Landroidx/gridlayout/widget/GridLayout;->d:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected j()Landroidx/gridlayout/widget/GridLayout$o;
    .registers 2

    .line 1
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$o;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/gridlayout/widget/GridLayout$o;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public k(Landroid/util/AttributeSet;)Landroidx/gridlayout/widget/GridLayout$o;
    .registers 4

    .line 1
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$o;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Landroidx/gridlayout/widget/GridLayout$o;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    return-object v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected l(Landroid/view/ViewGroup$LayoutParams;)Landroidx/gridlayout/widget/GridLayout$o;
    .registers 3

    .line 1
    instance-of v0, p1, Landroidx/gridlayout/widget/GridLayout$o;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$o;

    .line 6
    .line 7
    check-cast p1, Landroidx/gridlayout/widget/GridLayout$o;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Landroidx/gridlayout/widget/GridLayout$o;-><init>(Landroidx/gridlayout/widget/GridLayout$o;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_c
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 14
    .line 15
    if-eqz v0, :cond_18

    .line 16
    .line 17
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$o;

    .line 18
    .line 19
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Landroidx/gridlayout/widget/GridLayout$o;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_18
    new-instance v0, Landroidx/gridlayout/widget/GridLayout$o;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Landroidx/gridlayout/widget/GridLayout$o;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    .line 29
    .line 30
    return-object v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method protected onLayout(ZIIII)V
    .registers 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-direct {v1}, Landroidx/gridlayout/widget/GridLayout;->g()V

    .line 4
    .line 5
    .line 6
    sub-int v6, p4, p2

    .line 7
    .line 8
    sub-int v0, p5, p3

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 11
    .line 12
    .line 13
    move-result v7

    .line 14
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 15
    .line 16
    .line 17
    move-result v8

    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iget-object v3, v1, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 27
    .line 28
    sub-int v4, v6, v7

    .line 29
    .line 30
    sub-int/2addr v4, v9

    .line 31
    invoke-virtual {v3, v4}, Landroidx/gridlayout/widget/GridLayout$l;->G(I)V

    .line 32
    .line 33
    .line 34
    iget-object v3, v1, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 35
    .line 36
    sub-int/2addr v0, v8

    .line 37
    sub-int/2addr v0, v2

    .line 38
    invoke-virtual {v3, v0}, Landroidx/gridlayout/widget/GridLayout$l;->G(I)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v1, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/gridlayout/widget/GridLayout$l;->u()[I

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    iget-object v0, v1, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroidx/gridlayout/widget/GridLayout$l;->u()[I

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    const/4 v14, 0x0

    .line 58
    :goto_39
    if-ge v14, v12, :cond_144

    .line 59
    .line 60
    invoke-virtual {v1, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const/16 v3, 0x8

    .line 69
    .line 70
    if-ne v0, v3, :cond_51

    .line 71
    .line 72
    move/from16 p4, v6

    .line 73
    .line 74
    move/from16 p5, v7

    .line 75
    .line 76
    move/from16 p2, v8

    .line 77
    .line 78
    const/16 v25, 0x0

    .line 79
    .line 80
    goto/16 :goto_138

    .line 81
    .line 82
    :cond_51
    invoke-virtual {v1, v2}, Landroidx/gridlayout/widget/GridLayout;->q(Landroid/view/View;)Landroidx/gridlayout/widget/GridLayout$o;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v3, v0, Landroidx/gridlayout/widget/GridLayout$o;->b:Landroidx/gridlayout/widget/GridLayout$r;

    .line 87
    .line 88
    iget-object v0, v0, Landroidx/gridlayout/widget/GridLayout$o;->a:Landroidx/gridlayout/widget/GridLayout$r;

    .line 89
    .line 90
    iget-object v4, v3, Landroidx/gridlayout/widget/GridLayout$r;->b:Landroidx/gridlayout/widget/GridLayout$n;

    .line 91
    .line 92
    iget-object v5, v0, Landroidx/gridlayout/widget/GridLayout$r;->b:Landroidx/gridlayout/widget/GridLayout$n;

    .line 93
    .line 94
    iget v15, v4, Landroidx/gridlayout/widget/GridLayout$n;->a:I

    .line 95
    .line 96
    aget v15, v10, v15

    .line 97
    .line 98
    iget v13, v5, Landroidx/gridlayout/widget/GridLayout$n;->a:I

    .line 99
    .line 100
    aget v13, v11, v13

    .line 101
    .line 102
    iget v4, v4, Landroidx/gridlayout/widget/GridLayout$n;->b:I

    .line 103
    .line 104
    aget v4, v10, v4

    .line 105
    .line 106
    iget v5, v5, Landroidx/gridlayout/widget/GridLayout$n;->b:I

    .line 107
    .line 108
    aget v5, v11, v5

    .line 109
    .line 110
    sub-int v16, v4, v15

    .line 111
    .line 112
    sub-int v17, v5, v13

    .line 113
    .line 114
    const/4 v4, 0x1

    .line 115
    invoke-direct {v1, v2, v4}, Landroidx/gridlayout/widget/GridLayout;->t(Landroid/view/View;Z)I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    move/from16 p2, v5

    .line 120
    .line 121
    move/from16 p4, v6

    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    invoke-direct {v1, v2, v5}, Landroidx/gridlayout/widget/GridLayout;->t(Landroid/view/View;Z)I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    invoke-virtual {v3, v4}, Landroidx/gridlayout/widget/GridLayout$r;->b(Z)Landroidx/gridlayout/widget/GridLayout$i;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v0, v5}, Landroidx/gridlayout/widget/GridLayout$r;->b(Z)Landroidx/gridlayout/widget/GridLayout$i;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iget-object v5, v1, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 137
    .line 138
    invoke-virtual {v5}, Landroidx/gridlayout/widget/GridLayout$l;->s()Landroidx/gridlayout/widget/GridLayout$q;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v5, v14}, Landroidx/gridlayout/widget/GridLayout$q;->c(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    check-cast v5, Landroidx/gridlayout/widget/GridLayout$m;

    .line 147
    .line 148
    iget-object v4, v1, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 149
    .line 150
    invoke-virtual {v4}, Landroidx/gridlayout/widget/GridLayout$l;->s()Landroidx/gridlayout/widget/GridLayout$q;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v4, v14}, Landroidx/gridlayout/widget/GridLayout$q;->c(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    check-cast v4, Landroidx/gridlayout/widget/GridLayout$m;

    .line 159
    .line 160
    move/from16 p5, v7

    .line 161
    .line 162
    const/4 v7, 0x1

    .line 163
    invoke-virtual {v5, v7}, Landroidx/gridlayout/widget/GridLayout$m;->e(Z)I

    .line 164
    .line 165
    .line 166
    move-result v18

    .line 167
    move-object/from16 p3, v5

    .line 168
    .line 169
    sub-int v5, v16, v18

    .line 170
    .line 171
    invoke-virtual {v3, v2, v5}, Landroidx/gridlayout/widget/GridLayout$i;->d(Landroid/view/View;I)I

    .line 172
    .line 173
    .line 174
    move-result v18

    .line 175
    invoke-virtual {v4, v7}, Landroidx/gridlayout/widget/GridLayout$m;->e(Z)I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    sub-int v5, v17, v5

    .line 180
    .line 181
    invoke-virtual {v0, v2, v5}, Landroidx/gridlayout/widget/GridLayout$i;->d(Landroid/view/View;I)I

    .line 182
    .line 183
    .line 184
    move-result v19

    .line 185
    invoke-direct {v1, v2, v7, v7}, Landroidx/gridlayout/widget/GridLayout;->r(Landroid/view/View;ZZ)I

    .line 186
    .line 187
    .line 188
    move-result v20

    .line 189
    const/4 v5, 0x0

    .line 190
    invoke-direct {v1, v2, v5, v7}, Landroidx/gridlayout/widget/GridLayout;->r(Landroid/view/View;ZZ)I

    .line 191
    .line 192
    .line 193
    move-result v21

    .line 194
    invoke-direct {v1, v2, v7, v5}, Landroidx/gridlayout/widget/GridLayout;->r(Landroid/view/View;ZZ)I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    invoke-direct {v1, v2, v5, v5}, Landroidx/gridlayout/widget/GridLayout;->r(Landroid/view/View;ZZ)I

    .line 199
    .line 200
    .line 201
    move-result v22

    .line 202
    add-int v23, v20, v7

    .line 203
    .line 204
    add-int v22, v21, v22

    .line 205
    .line 206
    move-object/from16 v24, v4

    .line 207
    .line 208
    add-int v4, p2, v23

    .line 209
    .line 210
    const/16 v25, 0x0

    .line 211
    .line 212
    const/4 v5, 0x1

    .line 213
    move/from16 p1, v7

    .line 214
    .line 215
    move-object/from16 v26, v24

    .line 216
    .line 217
    move/from16 v7, p2

    .line 218
    .line 219
    move-object/from16 v24, v0

    .line 220
    .line 221
    move-object/from16 v0, p3

    .line 222
    .line 223
    invoke-virtual/range {v0 .. v5}, Landroidx/gridlayout/widget/GridLayout$m;->a(Landroidx/gridlayout/widget/GridLayout;Landroid/view/View;Landroidx/gridlayout/widget/GridLayout$i;IZ)I

    .line 224
    .line 225
    .line 226
    move-result v27

    .line 227
    add-int v4, v6, v22

    .line 228
    .line 229
    const/4 v5, 0x0

    .line 230
    move-object/from16 v1, p0

    .line 231
    .line 232
    move/from16 p2, v8

    .line 233
    .line 234
    move-object/from16 v0, v26

    .line 235
    .line 236
    move-object v8, v3

    .line 237
    move-object/from16 v3, v24

    .line 238
    .line 239
    invoke-virtual/range {v0 .. v5}, Landroidx/gridlayout/widget/GridLayout$m;->a(Landroidx/gridlayout/widget/GridLayout;Landroid/view/View;Landroidx/gridlayout/widget/GridLayout$i;IZ)I

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    sub-int v1, v16, v23

    .line 244
    .line 245
    invoke-virtual {v8, v2, v7, v1}, Landroidx/gridlayout/widget/GridLayout$i;->e(Landroid/view/View;II)I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    sub-int v4, v17, v22

    .line 250
    .line 251
    invoke-virtual {v3, v2, v6, v4}, Landroidx/gridlayout/widget/GridLayout$i;->e(Landroid/view/View;II)I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    add-int v15, v15, v18

    .line 256
    .line 257
    add-int v15, v15, v27

    .line 258
    .line 259
    invoke-direct/range {p0 .. p0}, Landroidx/gridlayout/widget/GridLayout;->z()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_10c

    .line 264
    .line 265
    add-int v7, p5, v20

    .line 266
    .line 267
    add-int/2addr v7, v15

    .line 268
    goto :goto_113

    .line 269
    :cond_10c
    sub-int v6, p4, v1

    .line 270
    .line 271
    sub-int/2addr v6, v9

    .line 272
    sub-int v6, v6, p1

    .line 273
    .line 274
    sub-int v7, v6, v15

    .line 275
    .line 276
    :goto_113
    add-int v8, p2, v13

    .line 277
    .line 278
    add-int v8, v8, v19

    .line 279
    .line 280
    add-int/2addr v8, v0

    .line 281
    add-int v8, v8, v21

    .line 282
    .line 283
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-ne v1, v0, :cond_126

    .line 288
    .line 289
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eq v3, v0, :cond_133

    .line 294
    .line 295
    :cond_126
    const/high16 v0, 0x40000000    # 2.0f

    .line 296
    .line 297
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    invoke-static {v3, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    invoke-virtual {v2, v4, v0}, Landroid/view/View;->measure(II)V

    .line 306
    .line 307
    .line 308
    :cond_133
    add-int/2addr v1, v7

    .line 309
    add-int/2addr v3, v8

    .line 310
    invoke-virtual {v2, v7, v8, v1, v3}, Landroid/view/View;->layout(IIII)V

    .line 311
    .line 312
    .line 313
    :goto_138
    add-int/lit8 v14, v14, 0x1

    .line 314
    .line 315
    move-object/from16 v1, p0

    .line 316
    .line 317
    move/from16 v8, p2

    .line 318
    .line 319
    move/from16 v6, p4

    .line 320
    .line 321
    move/from16 v7, p5

    .line 322
    .line 323
    goto/16 :goto_39

    .line 324
    .line 325
    :cond_144
    return-void
    .line 326
    .line 327
    .line 328
.end method

.method protected onMeasure(II)V
    .registers 10

    .line 1
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->g()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->y()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v1, v2

    .line 25
    neg-int v2, v0

    .line 26
    invoke-static {p1, v2}, Landroidx/gridlayout/widget/GridLayout;->a(II)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    neg-int v3, v1

    .line 31
    invoke-static {p2, v3}, Landroidx/gridlayout/widget/GridLayout;->a(II)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const/4 v4, 0x1

    .line 36
    invoke-direct {p0, v2, v3, v4}, Landroidx/gridlayout/widget/GridLayout;->C(IIZ)V

    .line 37
    .line 38
    .line 39
    iget v4, p0, Landroidx/gridlayout/widget/GridLayout;->c:I

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    if-nez v4, :cond_3b

    .line 43
    .line 44
    iget-object v4, p0, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 45
    .line 46
    invoke-virtual {v4, v2}, Landroidx/gridlayout/widget/GridLayout$l;->w(I)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-direct {p0, v2, v3, v5}, Landroidx/gridlayout/widget/GridLayout;->C(IIZ)V

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Landroidx/gridlayout/widget/GridLayout$l;->w(I)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    goto :goto_4d

    .line 60
    :cond_3b
    iget-object v4, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 61
    .line 62
    invoke-virtual {v4, v3}, Landroidx/gridlayout/widget/GridLayout$l;->w(I)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-direct {p0, v2, v3, v5}, Landroidx/gridlayout/widget/GridLayout;->C(IIZ)V

    .line 67
    .line 68
    .line 69
    iget-object v3, p0, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Landroidx/gridlayout/widget/GridLayout$l;->w(I)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    move v6, v4

    .line 76
    move v4, v2

    .line 77
    move v2, v6

    .line 78
    :goto_4d
    add-int/2addr v4, v0

    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    add-int/2addr v2, v1

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-static {v0, p1, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-static {v1, p2, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 105
    .line 106
    .line 107
    return-void
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method final q(Landroid/view/View;)Landroidx/gridlayout/widget/GridLayout$o;
    .registers 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/gridlayout/widget/GridLayout$o;

    .line 6
    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public requestLayout()V
    .registers 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->x()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method s(Landroid/view/View;ZZ)I
    .registers 7

    .line 1
    invoke-virtual {p0, p1}, Landroidx/gridlayout/widget/GridLayout;->q(Landroid/view/View;)Landroidx/gridlayout/widget/GridLayout$o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p2, :cond_e

    .line 6
    .line 7
    if-eqz p3, :cond_b

    .line 8
    .line 9
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 10
    .line 11
    goto :goto_15

    .line 12
    :cond_b
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 13
    .line 14
    goto :goto_15

    .line 15
    :cond_e
    if-eqz p3, :cond_13

    .line 16
    .line 17
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 18
    .line 19
    goto :goto_15

    .line 20
    :cond_13
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 21
    .line 22
    :goto_15
    const/high16 v2, -0x80000000

    .line 23
    .line 24
    if-ne v1, v2, :cond_1e

    .line 25
    .line 26
    invoke-direct {p0, p1, v0, p2, p3}, Landroidx/gridlayout/widget/GridLayout;->n(Landroid/view/View;Landroidx/gridlayout/widget/GridLayout$o;ZZ)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1e
    return v1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public setAlignmentMode(I)V
    .registers 2

    .line 1
    iput p1, p0, Landroidx/gridlayout/widget/GridLayout;->e:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/gridlayout/widget/GridLayout;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setColumnCount(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/gridlayout/widget/GridLayout$l;->J(I)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->x()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/gridlayout/widget/GridLayout;->requestLayout()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setColumnOrderPreserved(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->a:Landroidx/gridlayout/widget/GridLayout$l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/gridlayout/widget/GridLayout$l;->K(Z)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->x()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/gridlayout/widget/GridLayout;->requestLayout()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setOrientation(I)V
    .registers 3

    .line 1
    iget v0, p0, Landroidx/gridlayout/widget/GridLayout;->c:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_c

    .line 4
    .line 5
    iput p1, p0, Landroidx/gridlayout/widget/GridLayout;->c:I

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->x()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/gridlayout/widget/GridLayout;->requestLayout()V

    .line 11
    .line 12
    .line 13
    :cond_c
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setPrinter(Landroid/util/Printer;)V
    .registers 2

    .line 1
    if-nez p1, :cond_4

    .line 2
    .line 3
    sget-object p1, Landroidx/gridlayout/widget/GridLayout;->j:Landroid/util/Printer;

    .line 4
    .line 5
    :cond_4
    iput-object p1, p0, Landroidx/gridlayout/widget/GridLayout;->h:Landroid/util/Printer;

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setRowCount(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/gridlayout/widget/GridLayout$l;->J(I)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->x()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/gridlayout/widget/GridLayout;->requestLayout()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setRowOrderPreserved(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/gridlayout/widget/GridLayout;->b:Landroidx/gridlayout/widget/GridLayout$l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/gridlayout/widget/GridLayout$l;->K(Z)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/gridlayout/widget/GridLayout;->x()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/gridlayout/widget/GridLayout;->requestLayout()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public setUseDefaultMargins(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Landroidx/gridlayout/widget/GridLayout;->d:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/gridlayout/widget/GridLayout;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method final u(Landroid/view/View;Z)I
    .registers 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    if-ne v0, v1, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_a
    invoke-direct {p0, p1, p2}, Landroidx/gridlayout/widget/GridLayout;->t(Landroid/view/View;Z)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-direct {p0, p1, p2}, Landroidx/gridlayout/widget/GridLayout;->v(Landroid/view/View;Z)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    add-int/2addr v0, p1

    .line 20
    return v0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
