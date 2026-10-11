.class Lax/a3/h$e;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        "Ljava/util/List<",
        "Lax/a3/h$d;",
        ">;>;"
    }
.end annotation


# instance fields
.field h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/a3/h$d;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic i:Lax/a3/h;


# direct methods
.method public constructor <init>(Lax/a3/h;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lj$/util/DesugarCollections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lax/a3/h$e;->h:Ljava/util/List;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method private B()Ljava/util/concurrent/Future;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    new-instance v1, Lax/a3/h$e$b;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lax/a3/h$e$b;-><init>(Lax/a3/h$e;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 16
    .line 17
    .line 18
    return-object v1
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic w(Lax/a3/h$e;[Ljava/lang/Object;)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/u3/q;->v([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method static synthetic x(Lax/a3/h$e;[Ljava/lang/Object;)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/u3/q;->v([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method private z()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_6b

    .line 10
    :cond_9
    invoke-direct {p0}, Lax/a3/h$e;->B()Ljava/util/concurrent/Future;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :try_start_d
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    const-wide/16 v3, 0x3e8

    .line 17
    .line 18
    invoke-interface {v1, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_14} :catch_15

    .line 19
    .line 20
    .line 21
    goto :goto_16

    .line 22
    :catch_15
    nop

    .line 23
    :goto_16
    invoke-static {v0}, Lax/i3/a;->f(Landroid/content/Context;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v2, 0x0

    .line 28
    aget-byte v2, v0, v2

    .line 29
    .line 30
    if-eqz v2, :cond_68

    .line 31
    .line 32
    new-instance v2, Lax/a3/h$e$a;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Lax/a3/h$e$a;-><init>(Lax/a3/h$e;)V

    .line 35
    .line 36
    .line 37
    const/16 v3, 0x1f4

    .line 38
    .line 39
    const/16 v4, 0x14

    .line 40
    .line 41
    invoke-static {v0, v3, v4, v2}, Lax/u3/p;->b([BIILax/u3/p$b;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_35
    :goto_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_68

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ljava/util/concurrent/Future;

    .line 65
    .line 66
    invoke-virtual {p0}, Lax/u3/q;->isCancelled()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_4c

    .line 71
    .line 72
    const/4 v4, 0x1

    .line 73
    invoke-interface {v3, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 74
    .line 75
    .line 76
    goto :goto_35

    .line 77
    :cond_4c
    :try_start_4c
    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Lax/u3/p$c;

    .line 82
    .line 83
    iget-boolean v4, v3, Lax/u3/p$c;->b:Z

    .line 84
    .line 85
    if-eqz v4, :cond_35

    .line 86
    .line 87
    iget-object v3, v3, Lax/u3/p$c;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_5b
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4c .. :try_end_5b} :catch_5e
    .catch Ljava/lang/InterruptedException; {:try_start_4c .. :try_end_5b} :catch_5c

    .line 90
    .line 91
    .line 92
    goto :goto_35

    .line 93
    :catch_5c
    move-exception v3

    .line 94
    goto :goto_60

    .line 95
    :catch_5e
    move-exception v3

    .line 96
    goto :goto_64

    .line 97
    :goto_60
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 98
    .line 99
    .line 100
    goto :goto_35

    .line 101
    :goto_64
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 102
    .line 103
    .line 104
    goto :goto_35

    .line 105
    :cond_68
    :try_start_68
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_6b
    .catch Ljava/lang/InterruptedException; {:try_start_68 .. :try_end_6b} :catch_6b
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_68 .. :try_end_6b} :catch_6b

    .line 106
    .line 107
    .line 108
    :catch_6b
    :goto_6b
    return-void
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
.end method


# virtual methods
.method protected varargs A([Ljava/lang/Void;)Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Void;",
            ")",
            "Ljava/util/List<",
            "Lax/a3/h$d;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lax/a3/h$e;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lax/a3/h$e;->z()V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lax/a3/h$e;->h:Ljava/util/List;

    .line 10
    .line 11
    return-object p1
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

.method protected C(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/a3/h$d;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 2
    .line 3
    invoke-static {p1}, Lax/a3/h;->h3(Lax/a3/h;)Lcom/voxdon/xplorer/file/o;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_13

    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 21
    .line 22
    invoke-static {p1}, Lax/a3/h;->f3(Lax/a3/h;)V

    .line 23
    .line 24
    .line 25
    return-void
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

.method protected D(Ljava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/a3/h$d;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a3/h;->h3(Lax/a3/h;)Lcom/voxdon/xplorer/file/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->k0(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_13

    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    const/4 v0, 0x1

    .line 21
    if-eqz p1, :cond_52

    .line 22
    .line 23
    iget-object v2, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 24
    .line 25
    invoke-static {v2}, Lax/a3/h;->i3(Lax/a3/h;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 33
    .line 34
    invoke-static {v2}, Lax/a3/h;->i3(Lax/a3/h;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 42
    .line 43
    invoke-static {p1}, Lax/a3/h;->j3(Lax/a3/h;)Lax/a3/h$f;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 51
    .line 52
    invoke-static {p1}, Lax/a3/h;->k3(Lax/a3/h;)Landroid/widget/ListView;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Landroid/widget/ListView;->setSelectionAfterHeaderView()V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 60
    .line 61
    invoke-static {p1}, Lax/a3/h;->i3(Lax/a3/h;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-lez p1, :cond_4c

    .line 70
    .line 71
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 72
    .line 73
    invoke-static {p1, v1}, Lax/a3/h;->l3(Lax/a3/h;Z)V

    .line 74
    .line 75
    .line 76
    goto :goto_67

    .line 77
    :cond_4c
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 78
    .line 79
    invoke-static {p1, v0}, Lax/a3/h;->l3(Lax/a3/h;Z)V

    .line 80
    .line 81
    .line 82
    goto :goto_67

    .line 83
    :cond_52
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 84
    .line 85
    invoke-static {p1, v0}, Lax/a3/h;->l3(Lax/a3/h;Z)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 89
    .line 90
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const v1, 0x7f13013b

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 102
    .line 103
    .line 104
    :goto_67
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 105
    .line 106
    invoke-static {p1}, Lax/a3/h;->f3(Lax/a3/h;)V

    .line 107
    .line 108
    .line 109
    return-void
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
.end method

.method protected varargs E([Ljava/lang/Integer;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 11
    .line 12
    invoke-static {p1}, Lax/a3/h;->i3(Lax/a3/h;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 20
    .line 21
    invoke-static {p1}, Lax/a3/h;->i3(Lax/a3/h;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lax/a3/h$e;->h:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 31
    .line 32
    invoke-static {p1}, Lax/a3/h;->j3(Lax/a3/h;)Lax/a3/h$f;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 37
    .line 38
    .line 39
    return-void
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

.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/h$e;->A([Ljava/lang/Void;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

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

.method protected bridge synthetic p(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/h$e;->C(Ljava/util/List;)V

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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/h$e;->D(Ljava/util/List;)V

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

.method protected r()V
    .registers 2

    .line 1
    invoke-super {p0}, Lax/u3/q;->r()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/a3/h$e;->i:Lax/a3/h;

    .line 5
    .line 6
    invoke-static {v0}, Lax/a3/h;->h3(Lax/a3/h;)Lcom/voxdon/xplorer/file/o;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->n0()V

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
.end method

.method protected bridge synthetic s([Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/a3/h$e;->E([Ljava/lang/Integer;)V

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

.method declared-synchronized y(Lax/a3/h$d;)V
    .registers 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/a3/h$e;->h:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_22

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lax/a3/h$d;

    .line 19
    .line 20
    iget-object v2, p1, Lax/a3/h$d;->a:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v2, :cond_7

    .line 23
    .line 24
    iget-object v3, v1, Lax/a3/h$d;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_7

    .line 31
    .line 32
    goto :goto_23

    .line 33
    :catchall_20
    move-exception p1

    .line 34
    goto :goto_3b

    .line 35
    :cond_22
    const/4 v1, 0x0

    .line 36
    :goto_23
    if-eqz v1, :cond_34

    .line 37
    .line 38
    iget-object v0, v1, Lax/a3/h$d;->b:Ljava/lang/String;

    .line 39
    .line 40
    if-eqz v0, :cond_39

    .line 41
    .line 42
    iget-object v0, p0, Lax/a3/h$e;->h:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lax/a3/h$e;->h:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_39

    .line 53
    :cond_34
    iget-object v0, p0, Lax/a3/h$e;->h:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_39
    .catchall {:try_start_1 .. :try_end_39} :catchall_20

    .line 56
    .line 57
    .line 58
    :cond_39
    :goto_39
    monitor-exit p0

    .line 59
    return-void

    .line 60
    :goto_3b
    :try_start_3b
    monitor-exit p0
    :try_end_3c
    .catchall {:try_start_3b .. :try_end_3c} :catchall_20

    .line 61
    throw p1
.end method
