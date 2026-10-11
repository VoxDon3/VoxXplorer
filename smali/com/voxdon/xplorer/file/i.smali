.class public Lcom/voxdon/xplorer/file/i;
.super Lax/c3/k;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# instance fields
.field private m0:Ljava/lang/String;

.field private n0:Ljava/lang/String;

.field private o0:Ljava/lang/String;

.field private p0:Ljava/lang/String;

.field private q0:Ljava/lang/String;

.field private r0:Z

.field private s0:Z

.field private t0:Z

.field private u0:Z

.field private v0:J

.field private w0:J

.field private x0:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/file/h;Ljava/lang/String;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 37
    invoke-direct {p0, p1}, Lax/c3/k;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 38
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/h;->p0()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/i;->x0:Landroid/net/Uri;

    .line 39
    iput-object p2, p0, Lcom/voxdon/xplorer/file/i;->n0:Ljava/lang/String;

    .line 40
    invoke-static {p2}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/i;->q0:Ljava/lang/String;

    const/4 p1, 0x0

    .line 41
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/i;->r0:Z

    .line 42
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/i;->s0:Z

    const/4 p1, 0x1

    .line 43
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/i;->u0:Z

    .line 44
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/i;->t0:Z

    const-wide/16 p1, -0x1

    .line 45
    iput-wide p1, p0, Lcom/voxdon/xplorer/file/i;->v0:J

    const-wide/16 p1, 0x0

    .line 46
    iput-wide p1, p0, Lcom/voxdon/xplorer/file/i;->w0:J

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/h;Ljava/lang/String;Landroid/database/Cursor;)V
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/c3/k;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 2
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/h;->p0()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/i;->x0:Landroid/net/Uri;

    .line 3
    new-instance v5, Lax/c3/l;

    invoke-direct {v5, p3}, Lax/c3/l;-><init>(Landroid/database/Cursor;)V

    .line 4
    iget-object p1, v5, Lax/c3/l;->a:Ljava/lang/String;

    .line 5
    iput-object p1, p0, Lcom/voxdon/xplorer/file/i;->o0:Ljava/lang/String;

    .line 6
    const-string p3, "_"

    const/4 v6, 0x1

    const-string v7, "/"

    if-eqz p1, :cond_28

    invoke-virtual {p1, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_28

    .line 7
    const-string v0, ".$"

    invoke-virtual {p1, v0, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    move-object v3, p1

    const/4 p1, 0x1

    goto :goto_2b

    :cond_28
    const/4 v0, 0x0

    move-object v3, p1

    const/4 p1, 0x0

    .line 8
    :goto_2b
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    move-result-object v1

    iget-object v2, p0, Lcom/voxdon/xplorer/file/i;->x0:Landroid/net/Uri;

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lcom/voxdon/xplorer/file/g;->q(Landroid/content/Context;Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lax/c3/l;)Ljava/lang/String;

    move-result-object p2

    .line 9
    invoke-static {v4, p2}, Lax/c3/d0;->I(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const-string v1, "file:"

    const-string v2, ","

    if-nez v0, :cond_6d

    .line 10
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object v0

    const-string v3, "invalid file document file path"

    invoke-virtual {v0, v3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "parentPath:"

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ",docId:"

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v5, Lax/c3/l;->a:Ljava/lang/String;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    goto :goto_cc

    .line 11
    :cond_6d
    invoke-static {v4, p2}, Lax/c3/d0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-virtual {v0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_cc

    .line 14
    invoke-virtual {v0, v7, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-static {v4, p1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0xc

    if-le p1, v0, :cond_cb

    .line 17
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    move-result-object p1

    const-string v0, "DOCUMENT FILE NAME FIXED UNUSUAL"

    invoke-virtual {p1, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v5, Lax/c3/l;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v5, Lax/c3/l;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/voxdon/xplorer/file/i;->x0:Landroid/net/Uri;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->h()V

    :cond_cb
    const/4 p1, 0x1

    .line 18
    :cond_cc
    :goto_cc
    iget-object v0, v5, Lax/c3/l;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_108

    .line 19
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object p3

    invoke-virtual {p3}, Lax/Ha/b;->f()Lax/Ha/b;

    move-result-object p3

    const-string v0, "empty document displayname"

    invoke-virtual {p3, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "docid:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v5, Lax/c3/l;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ",root:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/voxdon/xplorer/file/i;->x0:Landroid/net/Uri;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    move-result-object p3

    invoke-virtual {p3}, Lax/Ha/b;->h()V

    const/4 p3, 0x0

    goto :goto_121

    .line 20
    :cond_108
    iget-object v0, v5, Lax/c3/l;->b:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_11b

    .line 21
    iget-object v0, v5, Lax/c3/l;->b:Ljava/lang/String;

    invoke-virtual {v0, v7, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 22
    invoke-static {v4, p3}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_121

    .line 23
    :cond_11b
    iget-object p3, v5, Lax/c3/l;->b:Ljava/lang/String;

    invoke-static {v4, p3}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    :goto_121
    if-eqz p3, :cond_199

    .line 24
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_199

    .line 25
    invoke-virtual {v7, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_199

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DOCUMENT FILE NAME CONFLICT:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v5, Lax/c3/l;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/voxdon/xplorer/FileManagerApp;->b(Ljava/lang/String;)V

    if-nez p1, :cond_199

    .line 27
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    move-result-object p1

    const-string v0, "DOCUMENT FILE NAME CONFLICT 1"

    invoke-virtual {p1, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v5, Lax/c3/l;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v5, Lax/c3/l;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/voxdon/xplorer/file/i;->x0:Landroid/net/Uri;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->h()V

    :cond_199
    if-nez p2, :cond_1d3

    .line 28
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    move-result-object p1

    const-string v0, "DOCUMENT FILE PATH NULL"

    invoke-virtual {p1, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v5, Lax/c3/l;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 29
    :cond_1d3
    iput-object p2, p0, Lcom/voxdon/xplorer/file/i;->n0:Ljava/lang/String;

    .line 30
    invoke-static {p2}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/i;->q0:Ljava/lang/String;

    .line 31
    iput-boolean v6, p0, Lcom/voxdon/xplorer/file/i;->r0:Z

    .line 32
    invoke-virtual {v5}, Lax/c3/l;->d()Z

    move-result p1

    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/i;->s0:Z

    .line 33
    invoke-virtual {v5}, Lax/c3/l;->b()Z

    move-result p1

    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/i;->u0:Z

    .line 34
    invoke-virtual {v5}, Lax/c3/l;->a()Z

    move-result p1

    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/i;->t0:Z

    .line 35
    iget-wide p1, v5, Lax/c3/l;->d:J

    iput-wide p1, p0, Lcom/voxdon/xplorer/file/i;->v0:J

    .line 36
    iget-wide p1, v5, Lax/c3/l;->e:J

    iput-wide p1, p0, Lcom/voxdon/xplorer/file/i;->w0:J

    return-void
.end method


# virtual methods
.method protected C()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/i;->q0:Ljava/lang/String;

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

.method protected F()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/i;->n0:Ljava/lang/String;

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

.method protected U()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/i;->n0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/i;->l0(Lcom/voxdon/xplorer/file/n;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public d()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/i;->t0:Z

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

.method public e0(Z)Landroid/os/ParcelFileDescriptor;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_11

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/i;->n0()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "r"

    .line 12
    .line 13
    invoke-static {p1, v0, v1}, Lcom/voxdon/xplorer/file/g;->o(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/i;->n0()Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "rw"

    .line 27
    .line 28
    invoke-static {p1, v0, v1}, Lcom/voxdon/xplorer/file/g;->o(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
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

.method public h()Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/i;->C()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "."

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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

.method public i0()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public isDirectory()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/i;->s0:Z

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

.method public j()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/i;->u0:Z

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

.method public j0()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public k0()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public l()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public l0(Lcom/voxdon/xplorer/file/n;)I
    .registers 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/i;->n0:Ljava/lang/String;

    .line 2
    .line 3
    check-cast p1, Lcom/voxdon/xplorer/file/i;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/voxdon/xplorer/file/i;->n0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p1
    :try_end_a
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_a} :catch_b

    .line 11
    return p1

    .line 12
    :catch_b
    const/4 p1, -0x1

    .line 13
    return p1
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

.method public m0()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/i;->o0:Ljava/lang/String;

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

.method public n()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/i;->r0:Z

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

.method public n0()Landroid/net/Uri;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->c0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_19

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/voxdon/xplorer/file/i;->x0:Landroid/net/Uri;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v0, v1, v2}, Lcom/voxdon/xplorer/file/g;->e(Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, Lax/Q2/f;->h1:Lax/Q2/f;

    .line 31
    .line 32
    if-ne v0, v1, :cond_38

    .line 33
    .line 34
    iget-object v0, p0, Lcom/voxdon/xplorer/file/i;->o0:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v0, :cond_30

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/i;->p0()Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v1, p0, Lcom/voxdon/xplorer/file/i;->o0:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :cond_30
    new-instance v0, Lax/b3/t;

    .line 50
    .line 51
    const-string v1, "no doc id"

    .line 52
    .line 53
    invoke-direct {v0, v1}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_38
    invoke-static {}, Lax/u3/b;->f()V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lax/b3/j;

    .line 61
    .line 62
    const-string v1, "not reachable"

    .line 63
    .line 64
    invoke-direct {v0, v1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0
    .line 68
.end method

.method public o0()Landroid/net/Uri;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->c0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_19

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/voxdon/xplorer/file/i;->x0:Landroid/net/Uri;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v0, v1, v2}, Lcom/voxdon/xplorer/file/g;->e(Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, Lax/Q2/f;->h1:Lax/Q2/f;

    .line 31
    .line 32
    if-ne v0, v1, :cond_48

    .line 33
    .line 34
    iget-object v0, p0, Lcom/voxdon/xplorer/file/i;->p0:Ljava/lang/String;

    .line 35
    .line 36
    if-nez v0, :cond_3d

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lcom/voxdon/xplorer/file/i;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/i;->m0()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lcom/voxdon/xplorer/file/i;->p0:Ljava/lang/String;

    .line 61
    .line 62
    :cond_3d
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/i;->p0()Landroid/net/Uri;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v1, p0, Lcom/voxdon/xplorer/file/i;->p0:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v0, v1}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :cond_48
    invoke-static {}, Lax/u3/b;->f()V

    .line 74
    .line 75
    .line 76
    new-instance v0, Lax/b3/j;

    .line 77
    .line 78
    const-string v1, "not reachable"

    .line 79
    .line 80
    invoke-direct {v0, v1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0
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
.end method

.method public p()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/file/i;->w0:J

    .line 2
    .line 3
    return-wide v0
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

.method public p0()Landroid/net/Uri;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/i;->x0:Landroid/net/Uri;

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

.method public q()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/file/i;->v0:J

    .line 2
    .line 3
    return-wide v0
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

.method public q0(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/i;->p0:Ljava/lang/String;

    .line 2
    .line 3
    return-void
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

.method public r(Z)I
    .registers 2

    .line 1
    iget-boolean p1, p0, Lcom/voxdon/xplorer/file/i;->s0:Z

    .line 2
    .line 3
    if-nez p1, :cond_6

    .line 4
    .line 5
    const/4 p1, -0x2

    .line 6
    return p1

    .line 7
    :cond_6
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->X()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
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

.method public s()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/i;->m0:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    const-string v0, "application/octet-stream"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lax/c3/v;->e(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/voxdon/xplorer/file/i;->m0:Ljava/lang/String;

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lcom/voxdon/xplorer/file/i;->m0:Ljava/lang/String;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public t()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/i;->n0:Ljava/lang/String;

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
