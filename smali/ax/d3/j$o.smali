.class Lax/d3/j$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/W2/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/j;->u5(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lax/d3/j;


# direct methods
.method constructor <init>(Lax/d3/j;ZLjava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/d3/j$o;->c:Lax/d3/j;

    .line 2
    .line 3
    iput-boolean p2, p0, Lax/d3/j$o;->a:Z

    .line 4
    .line 5
    iput-object p3, p0, Lax/d3/j$o;->b:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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


# virtual methods
.method public a(Lax/W2/h$b;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Object;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/W2/h$b;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object p5, p0, Lax/d3/j$o;->c:Lax/d3/j;

    .line 2
    .line 3
    invoke-static {p5}, Lax/d3/j;->V4(Lax/d3/j;)V

    .line 4
    .line 5
    .line 6
    sget-object p5, Lax/d3/j$i;->a:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    aget p5, p5, v0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq p5, v1, :cond_65

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq p5, v2, :cond_5f

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    if-eq p5, v1, :cond_18

    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    iget-object p5, p0, Lax/d3/j$o;->c:Lax/d3/j;

    .line 26
    .line 27
    invoke-virtual {p5}, Lax/d3/n;->L3()Z

    .line 28
    .line 29
    .line 30
    move-result p5

    .line 31
    if-nez p5, :cond_50

    .line 32
    .line 33
    new-instance p5, Landroid/content/Intent;

    .line 34
    .line 35
    iget-object v0, p0, Lax/d3/j$o;->c:Lax/d3/j;

    .line 36
    .line 37
    invoke-virtual {v0}, Lax/d3/j;->o3()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-class v1, Lcom/voxdon/xplorer/activity/ResultActivity;

    .line 42
    .line 43
    invoke-direct {p5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Lcom/voxdon/xplorer/activity/ResultActivity;->a:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p5, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    sget-object p1, Lcom/voxdon/xplorer/activity/ResultActivity;->b:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p5, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    sget-object p1, Lcom/voxdon/xplorer/activity/ResultActivity;->c:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p5, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    sget-object p1, Lcom/voxdon/xplorer/activity/ResultActivity;->d:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {p5, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    const/high16 p1, 0x10000000

    .line 67
    .line 68
    invoke-virtual {p5, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lax/d3/j$o;->c:Lax/d3/j;

    .line 72
    .line 73
    invoke-virtual {p1}, Lax/d3/j;->o3()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1, p5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_50
    const p1, 0x7f130116

    .line 82
    .line 83
    .line 84
    invoke-static {p1, p2, p3, p4}, Lax/a3/k;->i3(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Lax/a3/k;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iget-object p2, p0, Lax/d3/j$o;->c:Lax/d3/j;

    .line 89
    .line 90
    const-string p3, "result"

    .line 91
    .line 92
    invoke-virtual {p2, p1, p3, v0}, Lax/d3/n;->A(Landroidx/fragment/app/e;Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_5f
    iget-object p1, p0, Lax/d3/j$o;->c:Lax/d3/j;

    .line 97
    .line 98
    invoke-virtual {p1, p2, v1}, Lax/d3/n;->F4(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_65
    iget-boolean p1, p0, Lax/d3/j$o;->a:Z

    .line 103
    .line 104
    if-nez p1, :cond_77

    .line 105
    .line 106
    iget-object p1, p0, Lax/d3/j$o;->c:Lax/d3/j;

    .line 107
    .line 108
    new-instance p3, Lax/d3/j$o$a;

    .line 109
    .line 110
    invoke-direct {p3, p0}, Lax/d3/j$o$a;-><init>(Lax/d3/j$o;)V

    .line 111
    .line 112
    .line 113
    const p4, 0x7f130297

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, p2, v1, p4, p3}, Lax/d3/n;->G4(Ljava/lang/String;IILandroid/view/View$OnClickListener;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_77
    iget-object p1, p0, Lax/d3/j$o;->b:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, Lax/U2/f;

    .line 127
    .line 128
    iget-object p2, p0, Lax/d3/j$o;->c:Lax/d3/j;

    .line 129
    .line 130
    invoke-static {p2, p1}, Lax/d3/j;->W4(Lax/d3/j;Lax/U2/f;)V

    .line 131
    .line 132
    .line 133
    return-void
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

.method public b()V
    .registers 1

    .line 1
    return-void
    .line 2
    .line 3
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
