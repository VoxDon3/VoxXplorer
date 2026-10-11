.class Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;-><init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

.field final synthetic b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->a:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .registers 7

    .line 1
    const/16 p1, 0x2f

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-ne p2, p1, :cond_14

    .line 5
    .line 6
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_14

    .line 11
    .line 12
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 13
    .line 14
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 17
    .line 18
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->s0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Z)V

    .line 19
    .line 20
    .line 21
    :cond_14
    const/16 p1, 0x43

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-ne p2, p1, :cond_d5

    .line 25
    .line 26
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_d5

    .line 31
    .line 32
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 33
    .line 34
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_d5

    .line 41
    .line 42
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 43
    .line 44
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->u0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroidx/recyclerview/widget/RecyclerView;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 53
    .line 54
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->k0(Landroid/view/View;)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-ltz p1, :cond_d4

    .line 61
    .line 62
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 63
    .line 64
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 65
    .line 66
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-lt p1, p2, :cond_4d

    .line 75
    .line 76
    goto/16 :goto_d4

    .line 77
    .line 78
    :cond_4d
    if-lez p1, :cond_d4

    .line 79
    .line 80
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 81
    .line 82
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 83
    .line 84
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 85
    .line 86
    sget-object p3, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;->d0:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;

    .line 87
    .line 88
    invoke-static {p2, p3}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;)V

    .line 89
    .line 90
    .line 91
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 92
    .line 93
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 94
    .line 95
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 96
    .line 97
    add-int/lit8 p3, p1, -0x1

    .line 98
    .line 99
    invoke-static {p2, p3}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->n0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;I)I

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 103
    .line 104
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 105
    .line 106
    iget-object v0, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 107
    .line 108
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Ljava/util/ArrayList;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 117
    .line 118
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    invoke-static {v0, p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->q0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;I)I

    .line 125
    .line 126
    .line 127
    new-instance p2, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 133
    .line 134
    iget-object v0, v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 135
    .line 136
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 145
    .line 146
    iget-object v2, v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    iget-object v2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 152
    .line 153
    iget-object v2, v2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 154
    .line 155
    invoke-static {v2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Ljava/util/ArrayList;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 164
    .line 165
    iget-object v2, v2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    iput-object p2, v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 175
    .line 176
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 177
    .line 178
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 179
    .line 180
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Ljava/util/ArrayList;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 188
    .line 189
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 190
    .line 191
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 192
    .line 193
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->A0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView$h;->s(I)V

    .line 198
    .line 199
    .line 200
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 201
    .line 202
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 203
    .line 204
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 205
    .line 206
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->A0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->z(I)V

    .line 211
    .line 212
    .line 213
    :cond_d4
    :goto_d4
    return v1

    .line 214
    :cond_d5
    const/16 p1, 0x70

    .line 215
    .line 216
    if-ne p2, p1, :cond_db

    .line 217
    .line 218
    const/4 p1, 0x1

    .line 219
    goto :goto_dc

    .line 220
    :cond_db
    const/4 p1, 0x0

    .line 221
    :goto_dc
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    if-nez p2, :cond_e4

    .line 226
    .line 227
    const/4 p2, 0x1

    .line 228
    goto :goto_e5

    .line 229
    :cond_e4
    const/4 p2, 0x0

    .line 230
    :goto_e5
    and-int/2addr p1, p2

    .line 231
    if-eqz p1, :cond_1b3

    .line 232
    .line 233
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 234
    .line 235
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 236
    .line 237
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 242
    .line 243
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 244
    .line 245
    invoke-virtual {p2}, Landroid/widget/TextView;->length()I

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    if-ne p1, p2, :cond_1b3

    .line 250
    .line 251
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 252
    .line 253
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 254
    .line 255
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 256
    .line 257
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->u0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Landroidx/recyclerview/widget/RecyclerView;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 262
    .line 263
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->u:Landroid/widget/EditText;

    .line 264
    .line 265
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->k0(Landroid/view/View;)I

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    if-ltz p1, :cond_1b2

    .line 270
    .line 271
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 272
    .line 273
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 274
    .line 275
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Ljava/util/ArrayList;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 280
    .line 281
    .line 282
    move-result p2

    .line 283
    if-lt p1, p2, :cond_11e

    .line 284
    .line 285
    goto/16 :goto_1b2

    .line 286
    .line 287
    :cond_11e
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 288
    .line 289
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 290
    .line 291
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Ljava/util/ArrayList;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 296
    .line 297
    .line 298
    move-result p2

    .line 299
    sub-int/2addr p2, v1

    .line 300
    if-ge p1, p2, :cond_1b2

    .line 301
    .line 302
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 303
    .line 304
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 305
    .line 306
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 307
    .line 308
    sget-object p3, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;->d0:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;

    .line 309
    .line 310
    invoke-static {p2, p3}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;Lcom/voxdon/xplorer/texteditor/TextEditorActivity$h;)V

    .line 311
    .line 312
    .line 313
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 314
    .line 315
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 316
    .line 317
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 318
    .line 319
    invoke-static {p2, p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->n0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;I)I

    .line 320
    .line 321
    .line 322
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 323
    .line 324
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 325
    .line 326
    iget-object p3, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 327
    .line 328
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Ljava/util/ArrayList;

    .line 329
    .line 330
    .line 331
    move-result-object p2

    .line 332
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object p2

    .line 336
    check-cast p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 337
    .line 338
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 339
    .line 340
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 341
    .line 342
    .line 343
    move-result p2

    .line 344
    invoke-static {p3, p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->q0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;I)I

    .line 345
    .line 346
    .line 347
    new-instance p2, Ljava/lang/StringBuilder;

    .line 348
    .line 349
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 350
    .line 351
    .line 352
    iget-object p3, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 353
    .line 354
    iget-object p3, p3, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 355
    .line 356
    invoke-static {p3}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Ljava/util/ArrayList;

    .line 357
    .line 358
    .line 359
    move-result-object p3

    .line 360
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object p3

    .line 364
    check-cast p3, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 365
    .line 366
    iget-object v0, p3, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 367
    .line 368
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    iget-object v0, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 372
    .line 373
    iget-object v0, v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 374
    .line 375
    invoke-static {v0}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Ljava/util/ArrayList;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    add-int/lit8 v2, p1, 0x1

    .line 380
    .line 381
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    check-cast v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;

    .line 386
    .line 387
    iget-object v0, v0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p2

    .line 396
    iput-object p2, p3, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$j;->a:Ljava/lang/String;

    .line 397
    .line 398
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 399
    .line 400
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 401
    .line 402
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->N(Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;)Ljava/util/ArrayList;

    .line 403
    .line 404
    .line 405
    move-result-object p2

    .line 406
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    iget-object p2, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 410
    .line 411
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 412
    .line 413
    iget-object p2, p2, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 414
    .line 415
    invoke-static {p2}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->A0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 416
    .line 417
    .line 418
    move-result-object p2

    .line 419
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->s(I)V

    .line 420
    .line 421
    .line 422
    iget-object p1, p0, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a$b;->b:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;

    .line 423
    .line 424
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i$a;->y:Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 425
    .line 426
    iget-object p1, p1, Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;->e:Lcom/voxdon/xplorer/texteditor/TextEditorActivity;

    .line 427
    .line 428
    invoke-static {p1}, Lcom/voxdon/xplorer/texteditor/TextEditorActivity;->A0(Lcom/voxdon/xplorer/texteditor/TextEditorActivity;)Lcom/voxdon/xplorer/texteditor/TextEditorActivity$i;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$h;->z(I)V

    .line 433
    .line 434
    .line 435
    :cond_1b2
    :goto_1b2
    return v1

    .line 436
    :cond_1b3
    return v0
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
