.class public final Lax/P/l$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P/l$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroidx/core/graphics/drawable/IconCompat;

.field private final b:Ljava/lang/CharSequence;

.field private final c:Landroid/app/PendingIntent;

.field private d:Z

.field private final e:Landroid/os/Bundle;

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/P/u;",
            ">;"
        }
    .end annotation
.end field

.field private g:I

.field private h:Z

.field private i:Z

.field private j:Z


# direct methods
.method public constructor <init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
    .registers 15

    .line 1
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v10}, Lax/P/l$a$a;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lax/P/u;ZIZZZ)V

    return-void
.end method

.method private constructor <init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lax/P/u;ZIZZZ)V
    .registers 12

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lax/P/l$a$a;->d:Z

    .line 4
    iput-boolean v0, p0, Lax/P/l$a$a;->h:Z

    .line 5
    iput-object p1, p0, Lax/P/l$a$a;->a:Landroidx/core/graphics/drawable/IconCompat;

    .line 6
    invoke-static {p2}, Lax/P/l$d;->e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lax/P/l$a$a;->b:Ljava/lang/CharSequence;

    .line 7
    iput-object p3, p0, Lax/P/l$a$a;->c:Landroid/app/PendingIntent;

    .line 8
    iput-object p4, p0, Lax/P/l$a$a;->e:Landroid/os/Bundle;

    if-nez p5, :cond_18

    const/4 p1, 0x0

    goto :goto_21

    .line 9
    :cond_18
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    invoke-static {p5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_21
    iput-object p1, p0, Lax/P/l$a$a;->f:Ljava/util/ArrayList;

    .line 11
    iput-boolean p6, p0, Lax/P/l$a$a;->d:Z

    .line 12
    iput p7, p0, Lax/P/l$a$a;->g:I

    .line 13
    iput-boolean p8, p0, Lax/P/l$a$a;->h:Z

    .line 14
    iput-boolean p9, p0, Lax/P/l$a$a;->i:Z

    .line 15
    iput-boolean p10, p0, Lax/P/l$a$a;->j:Z

    return-void
.end method

.method private b()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/P/l$a$a;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_9

    .line 6
    :cond_5
    iget-object v0, p0, Lax/P/l$a$a;->c:Landroid/app/PendingIntent;

    .line 7
    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    :goto_9
    return-void

    .line 11
    :cond_a
    new-instance v0, Ljava/lang/NullPointerException;

    .line 12
    .line 13
    const-string v1, "Contextual Actions must contain a valid PendingIntent"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public a()Lax/P/l$a;
    .registers 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P/l$a$a;->b()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, Lax/P/l$a$a;->f:Ljava/util/ArrayList;

    .line 17
    .line 18
    if-eqz v3, :cond_30

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/4 v5, 0x0

    .line 25
    :goto_18
    if-ge v5, v4, :cond_30

    .line 26
    .line 27
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    add-int/lit8 v5, v5, 0x1

    .line 32
    .line 33
    check-cast v6, Lax/P/u;

    .line 34
    .line 35
    invoke-virtual {v6}, Lax/P/u;->j()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_2c

    .line 40
    .line 41
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_18

    .line 45
    :cond_2c
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_18

    .line 49
    :cond_30
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/4 v4, 0x0

    .line 54
    if-eqz v3, :cond_39

    .line 55
    .line 56
    move-object v11, v4

    .line 57
    goto :goto_46

    .line 58
    :cond_39
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    new-array v3, v3, [Lax/P/u;

    .line 63
    .line 64
    invoke-interface {v1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, [Lax/P/u;

    .line 69
    .line 70
    move-object v11, v1

    .line 71
    :goto_46
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_4e

    .line 76
    .line 77
    :goto_4c
    move-object v10, v4

    .line 78
    goto :goto_5c

    .line 79
    :cond_4e
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    new-array v1, v1, [Lax/P/u;

    .line 84
    .line 85
    invoke-interface {v2, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    move-object v4, v1

    .line 90
    check-cast v4, [Lax/P/u;

    .line 91
    .line 92
    goto :goto_4c

    .line 93
    :goto_5c
    new-instance v5, Lax/P/l$a;

    .line 94
    .line 95
    iget-object v6, v0, Lax/P/l$a$a;->a:Landroidx/core/graphics/drawable/IconCompat;

    .line 96
    .line 97
    iget-object v7, v0, Lax/P/l$a$a;->b:Ljava/lang/CharSequence;

    .line 98
    .line 99
    iget-object v8, v0, Lax/P/l$a$a;->c:Landroid/app/PendingIntent;

    .line 100
    .line 101
    iget-object v9, v0, Lax/P/l$a$a;->e:Landroid/os/Bundle;

    .line 102
    .line 103
    iget-boolean v12, v0, Lax/P/l$a$a;->d:Z

    .line 104
    .line 105
    iget v13, v0, Lax/P/l$a$a;->g:I

    .line 106
    .line 107
    iget-boolean v14, v0, Lax/P/l$a$a;->h:Z

    .line 108
    .line 109
    iget-boolean v15, v0, Lax/P/l$a$a;->i:Z

    .line 110
    .line 111
    iget-boolean v1, v0, Lax/P/l$a$a;->j:Z

    .line 112
    .line 113
    move/from16 v16, v1

    .line 114
    .line 115
    invoke-direct/range {v5 .. v16}, Lax/P/l$a;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lax/P/u;[Lax/P/u;ZIZZZ)V

    .line 116
    .line 117
    .line 118
    return-object v5
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
