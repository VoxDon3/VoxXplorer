.class public Lcom/android/ex/photo/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/ex/photo/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/Intent;

.field private b:Ljava/lang/Integer;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:[Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/Float;

.field private i:Z

.field private j:Z

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:Z

.field private p:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 4
    invoke-direct {p0}, Lcom/android/ex/photo/d$b;->b()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Ljava/lang/Class;Lcom/android/ex/photo/d$a;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/ex/photo/d$b;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-void
.end method

.method private b()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/android/ex/photo/d$b;->j:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/android/ex/photo/d$b;->o:Z

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/android/ex/photo/d$b;->p:Z

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
.end method


# virtual methods
.method public a()Landroid/content/Intent;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.VIEW"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 9
    .line 10
    const/high16 v1, 0x4080000

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->b:Ljava/lang/Integer;

    .line 16
    .line 17
    if-eqz v0, :cond_1d

    .line 18
    .line 19
    iget-object v1, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 20
    .line 21
    const-string v2, "photo_index"

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    :cond_1d
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->c:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v0, :cond_28

    .line 33
    .line 34
    iget-object v1, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 35
    .line 36
    const-string v2, "initial_photo_uri"

    .line 37
    .line 38
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    :cond_28
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->c:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v0, :cond_39

    .line 44
    .line 45
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->b:Ljava/lang/Integer;

    .line 46
    .line 47
    if-nez v0, :cond_31

    .line 48
    .line 49
    goto :goto_39

    .line 50
    :cond_31
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v1, "specified both photo index and photo uri"

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_39
    :goto_39
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->d:Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v0, :cond_4f

    .line 61
    .line 62
    iget-object v1, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 63
    .line 64
    const-string v2, "photos_uri"

    .line 65
    .line 66
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 70
    .line 71
    iget-object v1, p0, Lcom/android/ex/photo/d$b;->d:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 78
    .line 79
    .line 80
    :cond_4f
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->e:Ljava/lang/String;

    .line 81
    .line 82
    if-eqz v0, :cond_5a

    .line 83
    .line 84
    iget-object v1, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 85
    .line 86
    const-string v2, "resolved_photo_uri"

    .line 87
    .line 88
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 89
    .line 90
    .line 91
    :cond_5a
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->f:[Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v0, :cond_65

    .line 94
    .line 95
    iget-object v1, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 96
    .line 97
    const-string v2, "projection"

    .line 98
    .line 99
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 100
    .line 101
    .line 102
    :cond_65
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->g:Ljava/lang/String;

    .line 103
    .line 104
    if-eqz v0, :cond_70

    .line 105
    .line 106
    iget-object v1, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 107
    .line 108
    const-string v2, "thumbnail_uri"

    .line 109
    .line 110
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 111
    .line 112
    .line 113
    :cond_70
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->h:Ljava/lang/Float;

    .line 114
    .line 115
    if-eqz v0, :cond_7b

    .line 116
    .line 117
    iget-object v1, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 118
    .line 119
    const-string v2, "max_scale"

    .line 120
    .line 121
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 122
    .line 123
    .line 124
    :cond_7b
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 125
    .line 126
    const-string v1, "watch_network"

    .line 127
    .line 128
    iget-boolean v2, p0, Lcom/android/ex/photo/d$b;->i:Z

    .line 129
    .line 130
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 131
    .line 132
    .line 133
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 134
    .line 135
    const-string v1, "scale_up_animation"

    .line 136
    .line 137
    iget-boolean v2, p0, Lcom/android/ex/photo/d$b;->j:Z

    .line 138
    .line 139
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 140
    .line 141
    .line 142
    iget-boolean v0, p0, Lcom/android/ex/photo/d$b;->j:Z

    .line 143
    .line 144
    if-eqz v0, :cond_b5

    .line 145
    .line 146
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 147
    .line 148
    const-string v1, "start_x_extra"

    .line 149
    .line 150
    iget v2, p0, Lcom/android/ex/photo/d$b;->k:I

    .line 151
    .line 152
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 156
    .line 157
    const-string v1, "start_y_extra"

    .line 158
    .line 159
    iget v2, p0, Lcom/android/ex/photo/d$b;->l:I

    .line 160
    .line 161
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 165
    .line 166
    const-string v1, "start_width_extra"

    .line 167
    .line 168
    iget v2, p0, Lcom/android/ex/photo/d$b;->m:I

    .line 169
    .line 170
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 171
    .line 172
    .line 173
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 174
    .line 175
    const-string v1, "start_height_extra"

    .line 176
    .line 177
    iget v2, p0, Lcom/android/ex/photo/d$b;->n:I

    .line 178
    .line 179
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 180
    .line 181
    .line 182
    :cond_b5
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 183
    .line 184
    const-string v1, "action_bar_hidden_initially"

    .line 185
    .line 186
    iget-boolean v2, p0, Lcom/android/ex/photo/d$b;->o:Z

    .line 187
    .line 188
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 189
    .line 190
    .line 191
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 192
    .line 193
    const-string v1, "display_thumbs_fullscreen"

    .line 194
    .line 195
    iget-boolean v2, p0, Lcom/android/ex/photo/d$b;->p:Z

    .line 196
    .line 197
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 198
    .line 199
    .line 200
    iget-object v0, p0, Lcom/android/ex/photo/d$b;->a:Landroid/content/Intent;

    .line 201
    .line 202
    return-object v0
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

.method public c(Z)Lcom/android/ex/photo/d$b;
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/android/ex/photo/d$b;->p:Z

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method public d(F)Lcom/android/ex/photo/d$b;
    .registers 2

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/android/ex/photo/d$b;->h:Ljava/lang/Float;

    .line 6
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
.end method

.method public e(Ljava/lang/String;)Lcom/android/ex/photo/d$b;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/android/ex/photo/d$b;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method

.method public f(Ljava/lang/String;)Lcom/android/ex/photo/d$b;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/android/ex/photo/d$b;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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
    .line 22
.end method
