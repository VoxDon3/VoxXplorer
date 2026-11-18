.class public Lcom/voxdon/xplorer/file/y;
.super Lax/c3/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/file/y$b;
    }
.end annotation


# static fields
.field private static final R0:Ljava/util/logging/Logger;


# instance fields
.field private A0:Ljava/lang/Boolean;

.field private B0:Landroid/net/Uri;

.field private C0:Ljava/lang/Boolean;

.field private D0:Ljava/lang/Boolean;

.field private E0:Ljava/lang/Boolean;

.field private F0:I

.field private G0:Ljava/lang/String;

.field private H0:Ljava/lang/String;

.field private I0:Lax/c3/K;

.field private J0:Z

.field private K0:Ljava/lang/Boolean;

.field private L0:Lcom/voxdon/xplorer/file/y$b;

.field M0:Ljava/io/File;

.field private N0:Ljava/lang/String;

.field private O0:Z

.field private P0:Z

.field Q0:Ljava/lang/String;

.field protected m0:Lcom/voxdon/xplorer/file/x;

.field protected n0:Ljava/io/File;

.field private o0:Ljava/lang/String;

.field private p0:Ljava/lang/String;

.field private q0:Ljava/lang/String;

.field private r0:Ljava/lang/String;

.field private s0:Ljava/lang/Boolean;

.field private t0:Ljava/lang/Long;

.field private u0:Ljava/lang/Long;

.field private v0:Ljava/lang/Long;

.field public w0:Ljava/lang/Boolean;

.field public x0:Ljava/lang/Boolean;

.field private y0:Ljava/lang/Boolean;

.field private z0:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.LocalFileInfo"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/file/y;->R0:Ljava/util/logging/Logger;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>(Lcom/voxdon/xplorer/file/x;Landroid/net/Uri;Lax/c3/K;Ljava/lang/String;Landroid/database/Cursor;)V
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 63
    invoke-direct {p0, p1}, Lax/c3/k;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 64
    sget-object v0, Lcom/voxdon/xplorer/file/y$b;->q:Lcom/voxdon/xplorer/file/y$b;

    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->L0:Lcom/voxdon/xplorer/file/y$b;

    .line 65
    const-string v0, "no_constructor"

    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->N0:Ljava/lang/String;

    .line 66
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->m0:Lcom/voxdon/xplorer/file/x;

    .line 67
    new-instance v6, Lax/c3/l;

    invoke-direct {v6, p5}, Lax/c3/l;-><init>(Landroid/database/Cursor;)V

    .line 68
    iget-object p1, v6, Lax/c3/l;->a:Ljava/lang/String;

    .line 69
    const-string p5, "_"

    const/4 v0, 0x1

    const-string v7, "/"

    if-eqz p1, :cond_2a

    invoke-virtual {p1, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2a

    .line 70
    const-string v1, ".$"

    invoke-virtual {p1, v1, p5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    move-object v4, p1

    const/4 p1, 0x1

    goto :goto_2d

    :cond_2a
    const/4 v1, 0x0

    move-object v4, p1

    const/4 p1, 0x0

    .line 71
    :goto_2d
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    move-result-object v1

    move-object v3, p2

    move-object v2, p3

    move-object v5, p4

    invoke-static/range {v1 .. v6}, Lcom/voxdon/xplorer/file/g;->q(Landroid/content/Context;Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lax/c3/l;)Ljava/lang/String;

    move-result-object p2

    .line 72
    invoke-static {v5, p2, v0}, Lax/c3/d0;->J(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_200

    .line 73
    invoke-static {v5, p2, v0}, Lax/c3/d0;->o(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p3

    .line 74
    invoke-virtual {p3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    .line 75
    invoke-virtual {p3, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p4

    const-string v1, "file:"

    const-string v4, ",root:"

    const-string v8, ","

    if-eqz p4, :cond_a1

    .line 76
    invoke-virtual {p3, v7, p5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 77
    invoke-static {v5, p1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 78
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 p3, 0xc

    if-le p1, p3, :cond_a2

    .line 79
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    move-result-object p1

    const-string p3, "LOCAL DOCUMENT FILE NAME FIXED UNUSUAL"

    invoke-virtual {p1, p3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, v6, Lax/c3/l;->b:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, v6, Lax/c3/l;->a:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->h()V

    goto :goto_a2

    :cond_a1
    move v0, p1

    .line 80
    :cond_a2
    :goto_a2
    iget-object p1, v6, Lax/c3/l;->b:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_e2

    .line 81
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    move-result-object p1

    const-string p3, "empty local document displayname"

    invoke-virtual {p1, p3}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "id:"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, v6, Lax/c3/l;->a:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, ",parent:"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->h()V

    const/4 p1, 0x0

    goto :goto_fb

    .line 82
    :cond_e2
    iget-object p1, v6, Lax/c3/l;->b:Ljava/lang/String;

    invoke-virtual {p1, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_f5

    .line 83
    iget-object p1, v6, Lax/c3/l;->b:Ljava/lang/String;

    invoke-virtual {p1, v7, p5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 84
    invoke-static {v5, p1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_fb

    .line 85
    :cond_f5
    iget-object p1, v6, Lax/c3/l;->b:Ljava/lang/String;

    invoke-static {v5, p1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_fb
    if-eqz p1, :cond_181

    .line 86
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_181

    .line 87
    invoke-virtual {v7, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_181

    .line 88
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "LOCAL DOCUMENT FILE NAME CONFLICT:"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, v6, Lax/c3/l;->b:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/voxdon/xplorer/FileManagerApp;->b(Ljava/lang/String;)V

    if-eqz v0, :cond_139

    .line 89
    const-string p3, "DOCUMENT PATH CONFLICT"

    invoke-static {p3}, Lax/u3/b;->e(Ljava/lang/String;)V

    goto :goto_181

    .line 90
    :cond_139
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    move-result-object p1

    const-string p2, "LOCAL DOCUMENT FILE NAME CONFLICT 1"

    invoke-virtual {p1, p2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "parent:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, v6, Lax/c3/l;->b:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, v6, Lax/c3/l;->a:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 91
    new-instance p1, Lax/b3/j;

    const-string p2, "path conflict"

    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_181
    :goto_181
    if-nez p2, :cond_1b7

    .line 92
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object p3

    const-string p4, "LOCAL DOCUMENT FILE PATH NULL"

    invoke-virtual {p3, p4}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    move-result-object p3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p5, v6, Lax/c3/l;->b:Ljava/lang/String;

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 93
    :cond_1b7
    iput-object v3, p0, Lcom/voxdon/xplorer/file/y;->B0:Landroid/net/Uri;

    .line 94
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 95
    iput-object p2, p0, Lcom/voxdon/xplorer/file/y;->p0:Ljava/lang/String;

    .line 96
    invoke-virtual {v6}, Lax/c3/l;->d()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 97
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->s0:Ljava/lang/Boolean;

    .line 98
    invoke-virtual {v6}, Lax/c3/l;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->z0:Ljava/lang/Boolean;

    .line 99
    invoke-virtual {v6}, Lax/c3/l;->a()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->A0:Ljava/lang/Boolean;

    .line 100
    iget-wide p1, v6, Lax/c3/l;->d:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 101
    iget-wide p1, v6, Lax/c3/l;->e:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 102
    iput-object v2, p0, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    if-nez v2, :cond_1fb

    .line 103
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->u0()V

    .line 104
    :cond_1fb
    const-string p1, "constructor 3"

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->N0:Ljava/lang/String;

    return-void

    .line 105
    :cond_200
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    move-result-object p1

    const-string p2, "invalid file local document file path"

    invoke-virtual {p1, p2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "parentPath:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ",docId:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, v6, Lax/c3/l;->a:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 106
    new-instance p1, Lax/b3/j;

    const-string p2, "path problem"

    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/x;Lax/c3/K;Lax/p3/a;)V
    .registers 6

    .line 46
    invoke-direct {p0, p1}, Lax/c3/k;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 47
    sget-object v0, Lcom/voxdon/xplorer/file/y$b;->q:Lcom/voxdon/xplorer/file/y$b;

    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->L0:Lcom/voxdon/xplorer/file/y$b;

    .line 48
    const-string v0, "no_constructor"

    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->N0:Ljava/lang/String;

    .line 49
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->m0:Lcom/voxdon/xplorer/file/x;

    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/y;->O0:Z

    .line 51
    new-instance p1, Ljava/io/File;

    iget-object v0, p3, Lax/p3/a;->q:Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 52
    iget-boolean p1, p3, Lax/p3/a;->e0:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 53
    iget-boolean p1, p3, Lax/p3/a;->f0:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->s0:Ljava/lang/Boolean;

    .line 54
    iget-boolean p1, p3, Lax/p3/a;->g0:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->A0:Ljava/lang/Boolean;

    .line 55
    iget-boolean p1, p3, Lax/p3/a;->h0:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->z0:Ljava/lang/Boolean;

    .line 56
    iget-wide v0, p3, Lax/p3/a;->i0:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 57
    iget-wide v0, p3, Lax/p3/a;->j0:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 58
    iget-boolean p1, p3, Lax/p3/a;->d0:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->x0:Ljava/lang/Boolean;

    .line 59
    iget-object p1, p3, Lax/p3/a;->c0:Ljava/lang/String;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->r0:Ljava/lang/String;

    .line 60
    iget-object p1, p3, Lax/p3/a;->q:Ljava/lang/String;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->p0:Ljava/lang/String;

    .line 61
    iput-object p2, p0, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    if-nez p2, :cond_60

    .line 62
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->u0()V

    :cond_60
    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/x;Lcom/voxdon/xplorer/file/y;)V
    .registers 4

    .line 26
    invoke-direct {p0, p1}, Lax/c3/k;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 27
    sget-object v0, Lcom/voxdon/xplorer/file/y$b;->q:Lcom/voxdon/xplorer/file/y$b;

    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->L0:Lcom/voxdon/xplorer/file/y$b;

    .line 28
    const-string v0, "no_constructor"

    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->N0:Ljava/lang/String;

    .line 29
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->m0:Lcom/voxdon/xplorer/file/x;

    .line 30
    iget-object p1, p2, Lcom/voxdon/xplorer/file/y;->B0:Landroid/net/Uri;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->B0:Landroid/net/Uri;

    .line 31
    iget-object p1, p2, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 32
    iget-object p1, p2, Lcom/voxdon/xplorer/file/y;->p0:Ljava/lang/String;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->p0:Ljava/lang/String;

    .line 33
    iget-object p1, p2, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 34
    iget-object p1, p2, Lcom/voxdon/xplorer/file/y;->s0:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->s0:Ljava/lang/Boolean;

    .line 35
    iget-object p1, p2, Lcom/voxdon/xplorer/file/y;->A0:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->A0:Ljava/lang/Boolean;

    .line 36
    iget-object p1, p2, Lcom/voxdon/xplorer/file/y;->z0:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->z0:Ljava/lang/Boolean;

    .line 37
    iget-object p1, p2, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 38
    iget-object p1, p2, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 39
    iget-object p1, p2, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    .line 40
    iget-boolean v0, p2, Lcom/voxdon/xplorer/file/y;->O0:Z

    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/y;->O0:Z

    .line 41
    iget-boolean v0, p2, Lcom/voxdon/xplorer/file/y;->P0:Z

    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/y;->P0:Z

    .line 42
    iget-object v0, p2, Lcom/voxdon/xplorer/file/y;->q0:Ljava/lang/String;

    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->q0:Ljava/lang/String;

    .line 43
    iget-object p2, p2, Lcom/voxdon/xplorer/file/y;->u0:Ljava/lang/Long;

    iput-object p2, p0, Lcom/voxdon/xplorer/file/y;->u0:Ljava/lang/Long;

    if-nez p1, :cond_4a

    .line 44
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->u0()V

    .line 45
    :cond_4a
    const-string p1, "constructor 2"

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->N0:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;)V
    .registers 5

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;Z)V
    .registers 6

    .line 4
    invoke-direct {p0, p1}, Lax/c3/k;-><init>(Lcom/voxdon/xplorer/file/m;)V

    .line 5
    sget-object v0, Lcom/voxdon/xplorer/file/y$b;->q:Lcom/voxdon/xplorer/file/y$b;

    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->L0:Lcom/voxdon/xplorer/file/y$b;

    .line 6
    const-string v0, "no_constructor"

    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->N0:Ljava/lang/String;

    .line 7
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->m0:Lcom/voxdon/xplorer/file/x;

    .line 8
    invoke-static {p2}, Lax/u3/b;->b(Ljava/lang/Object;)V

    .line 9
    iput-object p2, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 10
    iput-boolean p4, p0, Lcom/voxdon/xplorer/file/y;->P0:Z

    .line 11
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    if-eqz p4, :cond_23

    .line 12
    invoke-static {p1}, Lax/c3/I;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/voxdon/xplorer/file/y;->p0:Ljava/lang/String;

    .line 13
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->q0:Ljava/lang/String;

    goto :goto_27

    .line 14
    :cond_23
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->p0:Ljava/lang/String;

    .line 15
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->q0:Ljava/lang/String;

    .line 16
    :goto_27
    iput-object p3, p0, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    if-nez p3, :cond_2e

    .line 17
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->u0()V

    .line 18
    :cond_2e
    const-string p1, "constructor 1"

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->N0:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;ZZZZJJ)V
    .registers 12

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;)V

    .line 20
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 21
    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->s0:Ljava/lang/Boolean;

    .line 22
    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->A0:Ljava/lang/Boolean;

    .line 23
    invoke-static {p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->z0:Ljava/lang/Boolean;

    .line 24
    invoke-static {p8, p9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 25
    invoke-static {p10, p11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Ljava/io/File;Lax/c3/K;Z)V
    .registers 6

    .line 1
    invoke-direct {p0, p1, p3, p4, p5}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;Z)V

    .line 2
    iput-object p2, p0, Lcom/voxdon/xplorer/file/y;->M0:Ljava/io/File;

    return-void
.end method

.method private A0()V
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-nez v4, :cond_36

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 18
    .line 19
    if-ne v0, v1, :cond_36

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_36

    .line 30
    .line 31
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->n0()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_36

    .line 36
    .line 37
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/z;->n(Ljava/lang/String;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 54
    .line 55
    :cond_36
    return-void
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

.method public static I0(Ljava/lang/String;)Lcom/voxdon/xplorer/file/y;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lax/c3/x;->g(Ljava/lang/String;)Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/voxdon/xplorer/file/y;

    .line 10
    .line 11
    return-object p0
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

.method private static J0(Ljava/lang/String;)I
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez v1, :cond_c

    .line 11
    .line 12
    return v2

    .line 13
    :cond_c
    :goto_c
    if-lez v1, :cond_1b

    .line 14
    .line 15
    add-int/lit8 v3, v1, -0x1

    .line 16
    .line 17
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    sget-char v4, Lax/c3/d0;->b:C

    .line 22
    .line 23
    if-ne v3, v4, :cond_1b

    .line 24
    .line 25
    add-int/lit8 v1, v1, -0x1

    .line 26
    .line 27
    goto :goto_c

    .line 28
    :cond_1b
    if-nez v1, :cond_1e

    .line 29
    .line 30
    return v0

    .line 31
    :cond_1e
    :goto_1e
    if-ge v0, v1, :cond_2d

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    sget-char v4, Lax/c3/d0;->b:C

    .line 38
    .line 39
    if-ne v3, v4, :cond_2a

    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    :cond_2a
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_1e

    .line 46
    :cond_2d
    return v2
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

.method private static L0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-le v0, p1, :cond_2a

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget-char v2, Lax/c3/d0;->b:C

    .line 17
    .line 18
    if-eq v0, v2, :cond_14

    .line 19
    .line 20
    goto :goto_2a

    .line 21
    :cond_14
    add-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-gt v0, p1, :cond_1d

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1d
    invoke-virtual {p0, v2, p1}, Ljava/lang/String;->indexOf(II)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-gez p1, :cond_24

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_24
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_2a
    :goto_2a
    return-object v1
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
.end method

.method private Q0()Z
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {v1}, Lj$/io/FileRetargetClass;->toPath(Ljava/io/File;)Lj$/nio/file/Path;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Lj$/nio/file/Path;->toAbsolutePath()Lj$/nio/file/Path;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-array v2, v0, [Lj$/nio/file/LinkOption;

    .line 15
    .line 16
    invoke-static {v1, v2}, Lj$/nio/file/Files;->isDirectory(Lj$/nio/file/Path;[Lj$/nio/file/LinkOption;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_33

    .line 21
    .line 22
    invoke-static {v1}, Lj$/nio/file/Files;->newDirectoryStream(Lj$/nio/file/Path;)Ljava/nio/file/DirectoryStream;

    .line 23
    .line 24
    .line 25
    move-result-object v1
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_19} :catch_25
    .catch Ljava/nio/file/DirectoryIteratorException; {:try_start_1 .. :try_end_19} :catch_25

    .line 26
    :try_start_19
    invoke-interface {v1}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2
    :try_end_21
    .catchall {:try_start_19 .. :try_end_21} :catchall_27

    .line 34
    :try_start_21
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_24
    .catch Ljava/io/IOException; {:try_start_21 .. :try_end_24} :catch_25
    .catch Ljava/nio/file/DirectoryIteratorException; {:try_start_21 .. :try_end_24} :catch_25

    .line 35
    .line 36
    .line 37
    return v2

    .line 38
    :catch_25
    nop

    .line 39
    goto :goto_34

    .line 40
    :catchall_27
    move-exception v2

    .line 41
    if-eqz v1, :cond_32

    .line 42
    .line 43
    :try_start_2a
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2d
    .catchall {:try_start_2a .. :try_end_2d} :catchall_2e

    .line 44
    .line 45
    .line 46
    goto :goto_32

    .line 47
    :catchall_2e
    move-exception v1

    .line 48
    :try_start_2f
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :cond_32
    :goto_32
    throw v2
    :try_end_33
    .catch Ljava/io/IOException; {:try_start_2f .. :try_end_33} :catch_25
    .catch Ljava/nio/file/DirectoryIteratorException; {:try_start_2f .. :try_end_33} :catch_25

    .line 52
    :cond_33
    return v0

    .line 53
    :goto_34
    const/4 v1, 0x1

    .line 54
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/y;->r(Z)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-lez v2, :cond_3c

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    :cond_3c
    return v0
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private R0()Z
    .registers 7

    .line 1
    invoke-static {}, Lax/X2/Q;->V1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v2, Lax/Q2/f;->o0:Lax/Q2/f;

    .line 14
    .line 15
    if-ne v0, v2, :cond_11

    .line 16
    .line 17
    return v1

    .line 18
    :cond_11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_18

    .line 23
    .line 24
    return v1

    .line 25
    :cond_18
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 26
    .line 27
    if-nez v0, :cond_1f

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->p()J

    .line 30
    .line 31
    .line 32
    :cond_1f
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    const-wide/16 v4, 0x0

    .line 39
    .line 40
    cmp-long v0, v2, v4

    .line 41
    .line 42
    if-nez v0, :cond_37

    .line 43
    .line 44
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    cmp-long v0, v2, v4

    .line 51
    .line 52
    if-eqz v0, :cond_37

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    return v0

    .line 56
    :cond_37
    return v1
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

.method public static U0(Lax/c3/K;Ljava/lang/String;)Z
    .registers 3

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Lax/c3/d0;->v(Lax/c3/K;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/voxdon/xplorer/file/y;->J0(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 p1, 0x3

    .line 12
    if-ne p0, p1, :cond_f

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_f
    const/4 p0, 0x0

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
.end method

.method public static Y0(Ljava/lang/String;)Z
    .registers 2

    .line 1
    const-string v0, "/Android"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lax/c3/d0;->G(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1b

    .line 8
    .line 9
    const-string v0, "/Android/obb"

    .line 10
    .line 11
    invoke-static {v0, p0}, Lax/c3/d0;->G(Ljava/lang/String;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1b

    .line 16
    .line 17
    const-string v0, "/Android/data"

    .line 18
    .line 19
    invoke-static {v0, p0}, Lax/c3/d0;->G(Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_19

    .line 24
    .line 25
    goto :goto_1b

    .line 26
    :cond_19
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1b
    :goto_1b
    const/4 p0, 0x1

    .line 29
    return p0
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

.method public static c1(Lcom/voxdon/xplorer/file/y;Lcom/voxdon/xplorer/file/y;)Z
    .registers 5

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq v0, v1, :cond_c

    .line 11
    .line 12
    return v2

    .line 13
    :cond_c
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lax/Q2/f;->Q(Lax/c3/K;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_21

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->P0()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->P0()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eq p0, p1, :cond_21

    .line 32
    .line 33
    return v2

    .line 34
    :cond_21
    const/4 p0, 0x1

    .line 35
    return p0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private e1()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->p0:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_e

    .line 4
    .line 5
    const-string v1, "/"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic l0(Lcom/voxdon/xplorer/file/y;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/y;->J0:Z

    .line 2
    .line 3
    return p1
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

.method private n0()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/t3/j;->k(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_16

    .line 10
    .line 11
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lax/Z2/j;->q0()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_16

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_16
    const/4 v0, 0x0

    .line 24
    return v0
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
.end method

.method private n1(Lax/X2/L;ZZZZ)V
    .registers 8

    .line 1
    iget-boolean v0, p1, Lax/X2/L;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2d

    .line 4
    .line 5
    if-eqz p4, :cond_e

    .line 6
    .line 7
    iget-wide v0, p1, Lax/X2/L;->a:J

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    iput-object p4, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 14
    .line 15
    :cond_e
    if-eqz p2, :cond_18

    .line 16
    .line 17
    iget-boolean p2, p1, Lax/X2/L;->b:Z

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 24
    .line 25
    :cond_18
    if-eqz p3, :cond_22

    .line 26
    .line 27
    iget-wide p1, p1, Lax/X2/L;->c:J

    .line 28
    .line 29
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 34
    .line 35
    :cond_22
    if-eqz p5, :cond_28

    .line 36
    .line 37
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 38
    .line 39
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->x0:Ljava/lang/Boolean;

    .line 40
    .line 41
    :cond_28
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->w0:Ljava/lang/Boolean;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2d
    if-eqz p5, :cond_33

    .line 47
    .line 48
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 49
    .line 50
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->x0:Ljava/lang/Boolean;

    .line 51
    .line 52
    :cond_33
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 53
    .line 54
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->w0:Ljava/lang/Boolean;

    .line 55
    .line 56
    const-wide/16 v0, 0x0

    .line 57
    .line 58
    if-eqz p4, :cond_41

    .line 59
    .line 60
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object p4

    .line 64
    iput-object p4, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 65
    .line 66
    :cond_41
    if-eqz p3, :cond_49

    .line 67
    .line 68
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    iput-object p3, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 73
    .line 74
    :cond_49
    if-eqz p2, :cond_51

    .line 75
    .line 76
    iget-object p2, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 77
    .line 78
    if-nez p2, :cond_51

    .line 79
    .line 80
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 81
    .line 82
    :cond_51
    return-void
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

.method private p0(ZZ)Z
    .registers 10

    .line 1
    const-string v0, ",base:"

    .line 2
    .line 3
    const-string v1, "exist:"

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->e1()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_c

    .line 11
    .line 12
    return v3

    .line 13
    :cond_c
    invoke-static {}, Lax/X2/Q;->P1()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_32

    .line 18
    .line 19
    iget-object v2, p0, Lcom/voxdon/xplorer/file/y;->w0:Ljava/lang/Boolean;

    .line 20
    .line 21
    if-eqz v2, :cond_1e

    .line 22
    .line 23
    if-eqz p2, :cond_19

    .line 24
    .line 25
    goto :goto_1e

    .line 26
    :cond_19
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    goto :goto_38

    .line 31
    :cond_1e
    :goto_1e
    :try_start_1e
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->O0()Lax/X2/L;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iget-boolean p2, p2, Lax/X2/L;->e:Z

    .line 36
    .line 37
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iput-object v2, p0, Lcom/voxdon/xplorer/file/y;->w0:Ljava/lang/Boolean;
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_2a} :catch_2b

    .line 42
    .line 43
    goto :goto_38

    .line 44
    :catch_2b
    iget-object p2, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    goto :goto_38

    .line 51
    :cond_32
    iget-object p2, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    :goto_38
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    if-eqz v2, :cond_4d

    .line 64
    .line 65
    if-eqz p1, :cond_45

    .line 66
    .line 67
    if-eqz p2, :cond_45

    .line 68
    .line 69
    goto :goto_4d

    .line 70
    :cond_45
    :try_start_45
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->s1()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v4
    :try_end_4d
    .catch Lax/b3/p; {:try_start_45 .. :try_end_4d} :catch_5a
    .catch Lax/b3/r; {:try_start_45 .. :try_end_4d} :catch_58
    .catch Lax/b3/C; {:try_start_45 .. :try_end_4d} :catch_55
    .catch Lax/b3/t; {:try_start_45 .. :try_end_4d} :catch_52
    .catch Lax/b3/v; {:try_start_45 .. :try_end_4d} :catch_e2
    .catch Ljava/lang/Exception; {:try_start_45 .. :try_end_4d} :catch_50

    .line 78
    :cond_4d
    :goto_4d
    const/4 p1, 0x0

    .line 79
    goto/16 :goto_1f1

    .line 80
    .line 81
    :catch_50
    move-exception p1

    .line 82
    goto :goto_5d

    .line 83
    :catch_52
    move-exception p1

    .line 84
    goto/16 :goto_147

    .line 85
    .line 86
    :catch_55
    nop

    .line 87
    goto/16 :goto_177

    .line 88
    .line 89
    :catch_58
    nop

    .line 90
    goto :goto_4d

    .line 91
    :catch_5a
    nop

    .line 92
    goto/16 :goto_1f0

    .line 93
    .line 94
    :goto_5d
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Lax/c3/K;->e()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    new-instance v6, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v1, ",root:"

    .line 123
    .line 124
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    if-eqz v2, :cond_a7

    .line 139
    .line 140
    new-instance v2, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v1, ",loc:"

    .line 149
    .line 150
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v1}, Lax/Q2/f;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    :cond_a7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    if-eqz v2, :cond_c7

    .line 173
    .line 174
    new-instance v2, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v0}, Lax/c3/K;->k()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    :cond_c7
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    const-string v2, "SDCARD EXISTS UNKNOWN"

    .line 209
    .line 210
    invoke-virtual {v0, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {p1, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_4d

    .line 226
    .line 227
    :catch_e2
    :try_start_e2
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->s1()Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    const-string v0, "SDCARD EXIST RETRY SUCCESS"

    .line 244
    .line 245
    invoke-virtual {p1, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    iget-object v2, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 258
    .line 259
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-virtual {p1}, Lax/Ha/b;->h()V
    :try_end_114
    .catch Ljava/lang/Exception; {:try_start_e2 .. :try_end_114} :catch_116

    .line 275
    .line 276
    .line 277
    goto/16 :goto_4d

    .line 278
    .line 279
    :catch_116
    move-exception p1

    .line 280
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    const-string v2, "SDCARD EXIST RETRY ERROR"

    .line 289
    .line 290
    invoke-virtual {v0, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    new-instance v0, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    iget-object v1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 324
    .line 325
    .line 326
    goto/16 :goto_4d

    .line 327
    .line 328
    :goto_147
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    const-string v2, "SDCARD FILE NOT EXIST"

    .line 337
    .line 338
    invoke-virtual {v0, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    new-instance v0, Ljava/lang/StringBuilder;

    .line 347
    .line 348
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    iget-object v1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 355
    .line 356
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 372
    .line 373
    .line 374
    goto/16 :goto_4d

    .line 375
    .line 376
    :goto_177
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 377
    .line 378
    const/16 v1, 0x17

    .line 379
    .line 380
    if-ge p1, v1, :cond_17e

    .line 381
    .line 382
    goto :goto_1f0

    .line 383
    :cond_17e
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    invoke-virtual {p1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    if-eqz p1, :cond_4d

    .line 392
    .line 393
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-static {v1, p1}, Lax/Q2/e;->E(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-static {v1}, Lax/X2/K;->N(Ljava/lang/String;)Z

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    if-nez v2, :cond_4d

    .line 406
    .line 407
    invoke-static {v1}, Lax/X2/K;->K(Ljava/lang/String;)Z

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    if-nez v2, :cond_4d

    .line 412
    .line 413
    if-eqz v1, :cond_4d

    .line 414
    .line 415
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    const-string v2, "CLEAR ROOT URI OVER 23"

    .line 424
    .line 425
    invoke-virtual {v1, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    new-instance v2, Ljava/lang/StringBuilder;

    .line 430
    .line 431
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 432
    .line 433
    .line 434
    const-string v6, "location:"

    .line 435
    .line 436
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 440
    .line 441
    .line 442
    move-result-object v6

    .line 443
    invoke-virtual {v6}, Lax/c3/K;->d()Lax/Q2/f;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    invoke-virtual {v6}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v6

    .line 451
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    const-string v0, ",path:"

    .line 465
    .line 466
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    const-string p1, ",exist:"

    .line 473
    .line 474
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    iget-object p1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 478
    .line 479
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 480
    .line 481
    .line 482
    move-result p1

    .line 483
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    invoke-virtual {v1, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 491
    .line 492
    .line 493
    move-result-object p1

    .line 494
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 495
    .line 496
    .line 497
    :goto_1f0
    const/4 p1, 0x1

    .line 498
    :goto_1f1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->M0()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    if-nez v4, :cond_298

    .line 503
    .line 504
    if-eqz p2, :cond_24e

    .line 505
    .line 506
    if-eqz p1, :cond_24e

    .line 507
    .line 508
    invoke-static {p0}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 509
    .line 510
    .line 511
    move-result p1

    .line 512
    if-eqz p1, :cond_24e

    .line 513
    .line 514
    iget-object p1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 515
    .line 516
    invoke-virtual {p1}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object p1

    .line 520
    if-eqz p1, :cond_24e

    .line 521
    .line 522
    array-length p1, p1

    .line 523
    if-lez p1, :cond_24e

    .line 524
    .line 525
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    .line 526
    .line 527
    .line 528
    move-result-object p1

    .line 529
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    invoke-static {p1, v1, v0}, Lcom/voxdon/xplorer/file/g;->b(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 537
    .line 538
    .line 539
    move-result-object p1

    .line 540
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    const-string v0, "CLEARING ROOT URI"

    .line 545
    .line 546
    invoke-virtual {p1, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 547
    .line 548
    .line 549
    move-result-object p1

    .line 550
    new-instance v0, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 553
    .line 554
    .line 555
    iget-object v1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 556
    .line 557
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    const-string v1, ","

    .line 565
    .line 566
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    invoke-virtual {v1}, Lax/c3/K;->toString()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-virtual {p1, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 589
    .line 590
    .line 591
    :cond_24e
    if-nez p2, :cond_292

    .line 592
    .line 593
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 594
    .line 595
    .line 596
    move-result p1

    .line 597
    if-eqz p1, :cond_278

    .line 598
    .line 599
    :try_start_256
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 600
    .line 601
    .line 602
    move-result-object p1

    .line 603
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->p0:Ljava/lang/String;

    .line 604
    .line 605
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/shizuku/c;->y(Ljava/lang/String;)Lax/X2/L;

    .line 606
    .line 607
    .line 608
    move-result-object p1

    .line 609
    iget-boolean p2, p1, Lax/X2/L;->e:Z
    :try_end_262
    .catch Ljava/io/IOException; {:try_start_256 .. :try_end_262} :catch_263

    .line 610
    .line 611
    goto :goto_292

    .line 612
    :catch_263
    new-instance p1, Ljava/lang/StringBuilder;

    .line 613
    .line 614
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 615
    .line 616
    .line 617
    const-string v0, "?"

    .line 618
    .line 619
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object p1

    .line 629
    invoke-static {p1}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    goto :goto_292

    .line 633
    :cond_278
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 634
    .line 635
    .line 636
    move-result-object p1

    .line 637
    sget-object v0, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 638
    .line 639
    if-ne p1, v0, :cond_292

    .line 640
    .line 641
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->n0()Z

    .line 642
    .line 643
    .line 644
    move-result p1

    .line 645
    if-eqz p1, :cond_292

    .line 646
    .line 647
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 648
    .line 649
    .line 650
    move-result-object p1

    .line 651
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object p2

    .line 655
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/z;->m(Ljava/lang/String;)Z

    .line 656
    .line 657
    .line 658
    move-result p2

    .line 659
    :cond_292
    :goto_292
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 660
    .line 661
    .line 662
    move-result-object v4

    .line 663
    goto/16 :goto_356

    .line 664
    .line 665
    :cond_298
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 666
    .line 667
    .line 668
    move-result p1

    .line 669
    if-nez p1, :cond_356

    .line 670
    .line 671
    if-eqz p2, :cond_356

    .line 672
    .line 673
    invoke-static {p0}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 674
    .line 675
    .line 676
    move-result p1

    .line 677
    if-eqz p1, :cond_356

    .line 678
    .line 679
    iget-object p1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 680
    .line 681
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 682
    .line 683
    .line 684
    move-result p1

    .line 685
    if-eqz p1, :cond_339

    .line 686
    .line 687
    :try_start_2ae
    invoke-static {p0}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 688
    .line 689
    .line 690
    move-result-object p1

    .line 691
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object p1

    .line 695
    iget-object p2, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 696
    .line 697
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object p2

    .line 701
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 702
    .line 703
    .line 704
    move-result p1

    .line 705
    if-eqz p1, :cond_2c7

    .line 706
    .line 707
    const-string p1, "URI HAS NAME"

    .line 708
    .line 709
    goto :goto_2df

    .line 710
    :catch_2c5
    move-exception p1

    .line 711
    goto :goto_2ca

    .line 712
    :cond_2c7
    const-string p1, "URI DO NOT HAVE NAME"
    :try_end_2c9
    .catch Lax/b3/j; {:try_start_2ae .. :try_end_2c9} :catch_2c5

    .line 713
    .line 714
    goto :goto_2df

    .line 715
    :goto_2ca
    new-instance p2, Ljava/lang/StringBuilder;

    .line 716
    .line 717
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 718
    .line 719
    .line 720
    const-string v1, "EX:"

    .line 721
    .line 722
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object p1

    .line 729
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object p1

    .line 736
    :goto_2df
    iget-object p2, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 737
    .line 738
    invoke-virtual {p2}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object p2

    .line 742
    if-eqz p2, :cond_30b

    .line 743
    .line 744
    array-length v1, p2

    .line 745
    if-lez v1, :cond_30b

    .line 746
    .line 747
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    .line 748
    .line 749
    .line 750
    move-result-object p2

    .line 751
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    invoke-static {p2, v1, v0}, Lcom/voxdon/xplorer/file/g;->b(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)V

    .line 756
    .line 757
    .line 758
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 759
    .line 760
    .line 761
    move-result-object p2

    .line 762
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 763
    .line 764
    .line 765
    move-result-object p2

    .line 766
    const-string v0, "SDCARD HAS CHANGED. CLEARING ROOT URI"

    .line 767
    .line 768
    invoke-virtual {p2, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 769
    .line 770
    .line 771
    move-result-object p2

    .line 772
    invoke-virtual {p2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 773
    .line 774
    .line 775
    move-result-object p1

    .line 776
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 777
    .line 778
    .line 779
    goto :goto_354

    .line 780
    :cond_30b
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    const-string v1, "SDCARD COULD NOT ACCESS ROOT"

    .line 789
    .line 790
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    new-instance v1, Ljava/lang/StringBuilder;

    .line 795
    .line 796
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 800
    .line 801
    .line 802
    const-string p1, ",not null:"

    .line 803
    .line 804
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 805
    .line 806
    .line 807
    if-eqz p2, :cond_329

    .line 808
    .line 809
    goto :goto_32a

    .line 810
    :cond_329
    const/4 v3, 0x0

    .line 811
    :goto_32a
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object p1

    .line 818
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 819
    .line 820
    .line 821
    move-result-object p1

    .line 822
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 823
    .line 824
    .line 825
    goto :goto_354

    .line 826
    :cond_339
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 827
    .line 828
    .line 829
    move-result-object p1

    .line 830
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 831
    .line 832
    .line 833
    move-result-object p1

    .line 834
    const-string p2, "SDCARD NOT DIRECTORY?!"

    .line 835
    .line 836
    invoke-virtual {p1, p2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 837
    .line 838
    .line 839
    move-result-object p1

    .line 840
    iget-object p2, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 841
    .line 842
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object p2

    .line 846
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 847
    .line 848
    .line 849
    move-result-object p1

    .line 850
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 851
    .line 852
    .line 853
    :goto_354
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 854
    .line 855
    :cond_356
    :goto_356
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 856
    .line 857
    .line 858
    move-result p1

    .line 859
    return p1
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
.end method

.method private p1()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->z0()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private s1()Z
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p0}, Lcom/voxdon/xplorer/file/g;->j(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;)Lax/c3/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_3a

    .line 10
    .line 11
    iget-wide v1, v0, Lax/c3/l;->e:J

    .line 12
    .line 13
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/c3/l;->a()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Lcom/voxdon/xplorer/file/y;->A0:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0}, Lax/c3/l;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, p0, Lcom/voxdon/xplorer/file/y;->z0:Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v0}, Lax/c3/l;->d()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 48
    .line 49
    iget-wide v0, v0, Lax/c3/l;->d:J

    .line 50
    .line 51
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    return v0

    .line 59
    :cond_3a
    const-wide/16 v0, 0x0

    .line 60
    .line 61
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 66
    .line 67
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 68
    .line 69
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->A0:Ljava/lang/Boolean;

    .line 70
    .line 71
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->z0:Ljava/lang/Boolean;

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    return v0
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
.end method

.method private u0()V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->p0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_63

    .line 8
    .line 9
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "GLFLFI 2:"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "location:"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v2, ",path:"

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Lcom/voxdon/xplorer/file/y;->p0:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v2, ",name:"

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v2, ","

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    .line 98
    .line 99
    return-void

    .line 100
    :cond_63
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v0, v1, v2}, Lax/Z2/j;->J(Ljava/lang/String;Lax/c3/K;)Lax/c3/K;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    .line 119
    .line 120
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

.method private u1(ZZZZ)V
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_19

    .line 6
    .line 7
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/shizuku/c;->y(Ljava/lang/String;)Lax/X2/L;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_12
    move-object v1, p0

    .line 20
    move v3, p1

    .line 21
    move v4, p2

    .line 22
    move v5, p3

    .line 23
    move v6, p4

    .line 24
    move-object v2, v0

    .line 25
    goto :goto_1e

    .line 26
    :cond_19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->O0()Lax/X2/L;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_12

    .line 31
    :goto_1e
    invoke-direct/range {v1 .. v6}, Lcom/voxdon/xplorer/file/y;->n1(Lax/X2/L;ZZZZ)V

    .line 32
    .line 33
    .line 34
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

.method private v0()V
    .registers 2

    .line 1
    const-string v0, "application/octet-stream"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lax/c3/v;->e(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->o0:Ljava/lang/String;

    .line 8
    .line 9
    return-void
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

.method private w1()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->A0()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private y0()V
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-nez v4, :cond_5c

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->isDirectory()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_5c

    .line 18
    .line 19
    invoke-static {}, Lax/X2/Q;->H()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_28

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_28

    .line 30
    .line 31
    :try_start_1e
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->s1()Z

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_26} :catch_27

    .line 37
    .line 38
    .line 39
    goto :goto_28

    .line 40
    :catch_27
    nop

    .line 41
    :cond_28
    :goto_28
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    cmp-long v4, v0, v2

    .line 48
    .line 49
    if-nez v4, :cond_5c

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget-object v1, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 56
    .line 57
    if-ne v0, v1, :cond_5c

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_5c

    .line 68
    .line 69
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->n0()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5c

    .line 74
    .line 75
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/z;->s(Ljava/lang/String;)J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 92
    .line 93
    :cond_5c
    return-void
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

.method private y1()V
    .registers 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->y0()V
    :try_end_f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_f} :catch_10

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_10
    const-wide/16 v0, -0x1

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private z0()V
    .registers 3

    .line 1
    invoke-static {}, Lax/X2/Q;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_20

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lax/c3/K;->f:Lax/c3/K;

    .line 12
    .line 13
    if-ne v0, v1, :cond_20

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_20

    .line 20
    .line 21
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_50

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->q1()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_50

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 46
    .line 47
    if-ne v0, v1, :cond_50

    .line 48
    .line 49
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_50

    .line 56
    .line 57
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->n0()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_50

    .line 62
    .line 63
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/z;->K(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 80
    .line 81
    :cond_50
    return-void
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
.end method


# virtual methods
.method public B0()Lax/c3/K;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    .line 2
    .line 3
    if-nez v0, :cond_5c

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->u0()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "BASE LOCATION UNIT NULL 2"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "loc:"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, ",path:"

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->F()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, ",constructor:"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, Lcom/voxdon/xplorer/file/y;->N0:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v2, ",retry:"

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    .line 63
    .line 64
    if-eqz v2, :cond_43

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    goto :goto_44

    .line 68
    :cond_43
    const/4 v2, 0x0

    .line 69
    :goto_44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    .line 84
    .line 85
    if-nez v0, :cond_5c

    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    .line 92
    .line 93
    :cond_5c
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    .line 94
    .line 95
    return-object v0
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

.method public C()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->r0:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->r0:Ljava/lang/String;

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->r0:Ljava/lang/String;

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

.method public C0()Ljava/lang/String;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->H0:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_50

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lax/Q2/f;->g0(Lax/Q2/f;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_41

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "library:?"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->isDirectory()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v0, v1, v2}, Lax/c3/d0;->v(Lax/c3/K;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->H0:Ljava/lang/String;

    .line 64
    .line 65
    goto :goto_50

    .line 66
    :cond_41
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-static {v0, v1, v2}, Lax/c3/d0;->v(Lax/c3/K;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->H0:Ljava/lang/String;

    .line 80
    .line 81
    :cond_50
    :goto_50
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->H0:Ljava/lang/String;

    .line 82
    .line 83
    return-object v0
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

.method public D()Lcom/voxdon/xplorer/file/p;
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/c3/K;->h:Lax/c3/K;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eq v0, v1, :cond_a

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_a
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lax/Z2/j;->q()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_21

    .line 20
    .line 21
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/file/z;->o(Ljava/lang/String;)Lcom/voxdon/xplorer/file/p;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    :cond_21
    return-object v2
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

.method public D0()J
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->u0:Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_4d

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->isDirectory()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_3f

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->s()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lax/y0/a;->S(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_3a

    .line 20
    .line 21
    :try_start_14
    new-instance v0, Lax/y0/a;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, v1}, Lax/y0/a;-><init>(Ljava/lang/String;)V
    :try_end_1d
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_1d} :catch_38

    .line 28
    .line 29
    .line 30
    :try_start_1d
    invoke-virtual {v0}, Lax/y0/a;->o()Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, Lcom/voxdon/xplorer/file/y;->u0:Ljava/lang/Long;
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_23} :catch_23

    .line 35
    .line 36
    :catch_23
    :try_start_23
    iget-object v1, p0, Lcom/voxdon/xplorer/file/y;->u0:Ljava/lang/Long;
    :try_end_25
    .catch Ljava/io/IOException; {:try_start_23 .. :try_end_25} :catch_38

    .line 37
    .line 38
    if-nez v1, :cond_2d

    .line 39
    .line 40
    :try_start_27
    invoke-virtual {v0}, Lax/y0/a;->n()Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p0, Lcom/voxdon/xplorer/file/y;->u0:Ljava/lang/Long;
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_2d} :catch_2d

    .line 45
    .line 46
    :catch_2d
    :cond_2d
    :try_start_2d
    iget-object v1, p0, Lcom/voxdon/xplorer/file/y;->u0:Ljava/lang/Long;
    :try_end_2f
    .catch Ljava/io/IOException; {:try_start_2d .. :try_end_2f} :catch_38

    .line 47
    .line 48
    if-nez v1, :cond_3f

    .line 49
    .line 50
    :try_start_31
    invoke-virtual {v0}, Lax/y0/a;->m()Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->u0:Ljava/lang/Long;
    :try_end_37
    .catch Ljava/lang/Exception; {:try_start_31 .. :try_end_37} :catch_38

    .line 55
    .line 56
    goto :goto_3f

    .line 57
    :catch_38
    nop

    .line 58
    goto :goto_3f

    .line 59
    :cond_3a
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->G()Lax/c3/z;

    .line 60
    .line 61
    .line 62
    sget-object v0, Lax/c3/z;->c0:Lax/c3/z;

    .line 63
    .line 64
    :cond_3f
    :goto_3f
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->u0:Ljava/lang/Long;

    .line 65
    .line 66
    if-nez v0, :cond_4d

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->q()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->u0:Ljava/lang/Long;

    .line 77
    .line 78
    :cond_4d
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->u0:Ljava/lang/Long;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    return-wide v0
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

.method public E0()Ljava/lang/String;
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/Q2/f;->z0:Lax/Q2/f;

    .line 6
    .line 7
    const-string v2, ""

    .line 8
    .line 9
    if-ne v0, v1, :cond_16

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->isDirectory()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_15

    .line 16
    .line 17
    invoke-virtual {p0}, Lax/c3/k;->f0()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_15
    return-object v2

    .line 23
    :cond_16
    sget-object v1, Lax/Q2/f;->B0:Lax/Q2/f;

    .line 24
    .line 25
    if-eq v0, v1, :cond_24

    .line 26
    .line 27
    sget-object v1, Lax/Q2/f;->A0:Lax/Q2/f;

    .line 28
    .line 29
    if-ne v0, v1, :cond_1f

    .line 30
    .line 31
    goto :goto_24

    .line 32
    :cond_1f
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->V()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :cond_24
    :goto_24
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->isDirectory()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2f

    .line 42
    .line 43
    invoke-virtual {p0}, Lax/c3/k;->g0()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_2f
    return-object v2
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

.method public F()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->p0:Ljava/lang/String;

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

.method public F0()Ljava/io/File;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

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

.method public G0(I)Ljava/lang/String;
    .registers 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/y;->u(I)Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->Q0:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->D0()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-virtual {p0, v0, v1, p1}, Lcom/voxdon/xplorer/file/n;->w(JI)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->Q0:Ljava/lang/String;

    .line 18
    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
.end method

.method public H0()Lcom/voxdon/xplorer/file/y$b;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->L0:Lcom/voxdon/xplorer/file/y$b;

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

.method public K0()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->q0:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->q0:Ljava/lang/String;

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->q0:Ljava/lang/String;

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

.method public M0()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->Q(Lax/c3/K;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_14

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_11

    .line 16
    .line 17
    goto :goto_14

    .line 18
    :cond_11
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->G0:Ljava/lang/String;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_14
    :goto_14
    const/4 v0, 0x0

    .line 22
    return-object v0
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
.end method

.method public N()Ljava/io/File;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

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

.method public N0()Landroid/net/Uri;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/r;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->B0:Landroid/net/Uri;

    .line 2
    .line 3
    if-nez v0, :cond_79

    .line 4
    .line 5
    invoke-static {}, Lax/X2/Q;->V1()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_79

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_58

    .line 17
    .line 18
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Lax/Z2/j;->E0(Lax/c3/K;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_47

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->M0()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_64

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/16 v3, 0xe

    .line 43
    .line 44
    if-ge v2, v3, :cond_2e

    .line 45
    .line 46
    goto :goto_64

    .line 47
    :cond_2e
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2, v0}, Lcom/voxdon/xplorer/file/g;->n(Lax/c3/K;Ljava/lang/String;)Landroid/net/Uri;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_64

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v2, v0}, Lcom/voxdon/xplorer/file/g;->a(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_64

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_64

    .line 72
    :cond_47
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->M0()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v0, v1, v2}, Lcom/voxdon/xplorer/file/g;->x(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    goto :goto_64

    .line 89
    :cond_58
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v0, v2, v1}, Lcom/voxdon/xplorer/file/g;->x(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :cond_64
    :goto_64
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_71

    .line 106
    .line 107
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->B0:Landroid/net/Uri;

    .line 112
    .line 113
    goto :goto_79

    .line 114
    :cond_71
    new-instance v0, Lax/b3/r;

    .line 115
    .line 116
    const-string v1, "RootUri is empty"

    .line 117
    .line 118
    invoke-direct {v0, v1}, Lax/b3/r;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :cond_79
    :goto_79
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->B0:Landroid/net/Uri;

    .line 123
    .line 124
    return-object v0
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

.method public O0()Lax/X2/L;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->K0()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lax/X2/L;

    .line 6
    .line 7
    invoke-direct {v1}, Lax/X2/L;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lax/X2/v;->l(Ljava/lang/String;Lax/X2/L;)Lax/X2/L;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public P0()I
    .registers 7

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/file/y;->F0:I

    .line 2
    .line 3
    if-nez v0, :cond_71

    .line 4
    .line 5
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez v0, :cond_e

    .line 11
    .line 12
    iput v1, p0, Lcom/voxdon/xplorer/file/y;->F0:I

    .line 13
    .line 14
    goto :goto_71

    .line 15
    :cond_e
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lax/Q2/f;->Q(Lax/c3/K;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1b

    .line 24
    .line 25
    iput v1, p0, Lcom/voxdon/xplorer/file/y;->F0:I

    .line 26
    .line 27
    goto :goto_71

    .line 28
    :cond_1b
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Lax/Z2/j;->E0(Lax/c3/K;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/high16 v2, 0x20000000

    .line 41
    .line 42
    const-string v3, "/Android/obb"

    .line 43
    .line 44
    const/high16 v4, 0x10000000

    .line 45
    .line 46
    const-string v5, "/Android/data"

    .line 47
    .line 48
    if-eqz v0, :cond_59

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->M0()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-nez v0, :cond_3a

    .line 55
    .line 56
    iput v1, p0, Lcom/voxdon/xplorer/file/y;->F0:I

    .line 57
    .line 58
    goto :goto_71

    .line 59
    :cond_3a
    invoke-static {v5, v0}, Lax/c3/d0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_48

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    add-int/2addr v0, v4

    .line 70
    iput v0, p0, Lcom/voxdon/xplorer/file/y;->F0:I

    .line 71
    .line 72
    goto :goto_71

    .line 73
    :cond_48
    invoke-static {v3, v0}, Lax/c3/d0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_56

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    add-int/2addr v0, v2

    .line 84
    iput v0, p0, Lcom/voxdon/xplorer/file/y;->F0:I

    .line 85
    .line 86
    goto :goto_71

    .line 87
    :cond_56
    iput v1, p0, Lcom/voxdon/xplorer/file/y;->F0:I

    .line 88
    .line 89
    goto :goto_71

    .line 90
    :cond_59
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v5, v0}, Lax/c3/d0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_66

    .line 99
    .line 100
    iput v4, p0, Lcom/voxdon/xplorer/file/y;->F0:I

    .line 101
    .line 102
    goto :goto_71

    .line 103
    :cond_66
    invoke-static {v3, v0}, Lax/c3/d0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_6f

    .line 108
    .line 109
    iput v2, p0, Lcom/voxdon/xplorer/file/y;->F0:I

    .line 110
    .line 111
    goto :goto_71

    .line 112
    :cond_6f
    iput v1, p0, Lcom/voxdon/xplorer/file/y;->F0:I

    .line 113
    .line 114
    :cond_71
    :goto_71
    iget v0, p0, Lcom/voxdon/xplorer/file/y;->F0:I

    .line 115
    .line 116
    return v0
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

.method public S0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/y;->J0:Z

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

.method public T0()Z
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->N0()Landroid/net/Uri;

    .line 3
    .line 4
    .line 5
    move-result-object v1
    :try_end_5
    .catch Lax/b3/r; {:try_start_1 .. :try_end_5} :catch_8

    .line 6
    if-eqz v1, :cond_8

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :catch_8
    :cond_8
    return v0
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

.method public U()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->p0:Ljava/lang/String;

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

.method public V0()Z
    .registers 5

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_3a

    .line 6
    .line 7
    invoke-static {v0}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_33

    .line 12
    .line 13
    new-instance v1, Ljava/lang/Exception;

    .line 14
    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v3, "Invalid path 2: "

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v3, ":"

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->F()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v2, "ISFP2"

    .line 48
    .line 49
    invoke-static {v2, v1}, Lax/Q2/d;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :cond_33
    const-string v1, "/Android"

    .line 53
    .line 54
    invoke-static {v1, v0}, Lax/c3/d0;->G(Ljava/lang/String;Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    return v0

    .line 59
    :cond_3a
    const/4 v0, 0x0

    .line 60
    return v0
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public W0()Z
    .registers 5

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_18

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->X()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, -0x1

    .line 14
    if-eq v0, v3, :cond_17

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->X()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v3, -0x3

    .line 21
    if-eq v0, v3, :cond_17

    .line 22
    .line 23
    return v2

    .line 24
    :cond_17
    return v1

    .line 25
    :cond_18
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 26
    .line 27
    if-eqz v0, :cond_1d

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1d
    return v1
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
.end method

.method public X0()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->I0:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 8
    .line 9
    if-ne v0, v1, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_c
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public Z0()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->E0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_23

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_f

    .line 10
    .line 11
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->E0:Ljava/lang/Boolean;

    .line 14
    .line 15
    goto :goto_23

    .line 16
    :cond_f
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lcom/voxdon/xplorer/file/y;->J0(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x4

    .line 25
    if-ne v0, v1, :cond_1c

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_1d

    .line 29
    :cond_1c
    const/4 v0, 0x0

    .line 30
    :goto_1d
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->E0:Ljava/lang/Boolean;

    .line 35
    .line 36
    :cond_23
    :goto_23
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->E0:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    return v0
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

.method public a0()Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->X()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_10

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->X()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_10
    invoke-static {}, Lax/X2/Q;->P0()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1b

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->Q0()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0

    .line 28
    :cond_1b
    invoke-super {p0}, Lcom/voxdon/xplorer/file/n;->a0()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0
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
.end method

.method public a1()Z
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->C0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_71

    .line 4
    .line 5
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_69

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lax/Q2/f;->R(Lax/c3/K;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_69

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_69

    .line 26
    .line 27
    const-string v1, "/Android/data"

    .line 28
    .line 29
    invoke-static {v1, v0}, Lax/c3/d0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_31

    .line 34
    .line 35
    const-string v2, "/Android/data/com.voxdon.xplorer"

    .line 36
    .line 37
    invoke-static {v2, v0}, Lax/c3/d0;->I(Ljava/lang/String;Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_47

    .line 42
    .line 43
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    iput-object v2, p0, Lcom/voxdon/xplorer/file/y;->C0:Ljava/lang/Boolean;

    .line 46
    .line 47
    iput-object v1, p0, Lcom/voxdon/xplorer/file/y;->G0:Ljava/lang/String;

    .line 48
    .line 49
    goto :goto_47

    .line 50
    :cond_31
    const-string v1, "/Android/obb"

    .line 51
    .line 52
    invoke-static {v1, v0}, Lax/c3/d0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_47

    .line 57
    .line 58
    const-string v2, "/Android/obb/com.voxdon.xplorer"

    .line 59
    .line 60
    invoke-static {v2, v0}, Lax/c3/d0;->I(Ljava/lang/String;Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_47

    .line 65
    .line 66
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 67
    .line 68
    iput-object v2, p0, Lcom/voxdon/xplorer/file/y;->C0:Ljava/lang/Boolean;

    .line 69
    .line 70
    iput-object v1, p0, Lcom/voxdon/xplorer/file/y;->G0:Ljava/lang/String;

    .line 71
    .line 72
    :cond_47
    :goto_47
    iget-object v1, p0, Lcom/voxdon/xplorer/file/y;->C0:Ljava/lang/Boolean;

    .line 73
    .line 74
    if-eqz v1, :cond_69

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_69

    .line 81
    .line 82
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v1, v2}, Lax/Z2/j;->E0(Lax/c3/K;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_69

    .line 95
    .line 96
    iget-object v1, p0, Lcom/voxdon/xplorer/file/y;->G0:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/file/y;->L0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v0, :cond_69

    .line 103
    .line 104
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->G0:Ljava/lang/String;

    .line 105
    .line 106
    :cond_69
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->C0:Ljava/lang/Boolean;

    .line 107
    .line 108
    if-nez v0, :cond_71

    .line 109
    .line 110
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 111
    .line 112
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->C0:Ljava/lang/Boolean;

    .line 113
    .line 114
    :cond_71
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->C0:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    return v0
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

.method public b1()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->D0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_23

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_f

    .line 10
    .line 11
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->D0:Ljava/lang/Boolean;

    .line 14
    .line 15
    goto :goto_23

    .line 16
    :cond_f
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lcom/voxdon/xplorer/file/y;->J0(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x3

    .line 25
    if-ne v0, v1, :cond_1c

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_1d

    .line 29
    :cond_1c
    const/4 v0, 0x0

    .line 30
    :goto_1d
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->D0:Ljava/lang/Boolean;

    .line 35
    .line 36
    :cond_23
    :goto_23
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->D0:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    return v0
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

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/y;->s0(Lcom/voxdon/xplorer/file/n;)I

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
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->A0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_58

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->A0:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_58

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_58

    .line 28
    .line 29
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Lax/Z2/j;->E0(Lax/c3/K;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_32

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->b1()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_32

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    return v0

    .line 51
    :cond_32
    :try_start_32
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->s1()Z
    :try_end_35
    .catch Lax/b3/r; {:try_start_32 .. :try_end_35} :catch_58
    .catch Ljava/lang/Exception; {:try_start_32 .. :try_end_35} :catch_36

    .line 52
    .line 53
    .line 54
    goto :goto_58

    .line 55
    :catch_36
    move-exception v0

    .line 56
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "DOCUMENT FILE CANREAD"

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 87
    .line 88
    .line 89
    :catch_58
    :cond_58
    :goto_58
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->A0:Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    return v0
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

.method public d1()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/y;->O0:Z

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
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->N0()Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v0, v1, v2}, Lcom/voxdon/xplorer/file/g;->e(Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz p1, :cond_1d

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v1, "r"

    .line 24
    .line 25
    invoke-static {p1, v0, v1}, Lcom/voxdon/xplorer/file/g;->o(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_1d
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->x()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v1, "rw"

    .line 35
    .line 36
    invoke-static {p1, v0, v1}, Lcom/voxdon/xplorer/file/g;->o(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
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

.method public f1()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/y;->P0:Z

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

.method public g1(Z)V
    .registers 6

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->X()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_b7

    .line 7
    .line 8
    const/4 v0, -0x2

    .line 9
    :try_start_8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_20

    .line 14
    .line 15
    invoke-static {}, Lcom/voxdon/xplorer/shizuku/c;->t()Lcom/voxdon/xplorer/shizuku/c;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2, p1}, Lcom/voxdon/xplorer/shizuku/c;->u(Ljava/lang/String;Z)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eq v1, v0, :cond_20

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/n;->d0(I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_20
    iget-object v1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 34
    .line 35
    new-instance v2, Lcom/voxdon/xplorer/file/y$a;

    .line 36
    .line 37
    invoke-direct {v2, p0, p1}, Lcom/voxdon/xplorer/file/y$a;-><init>(Lcom/voxdon/xplorer/file/y;Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-nez v1, :cond_af

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sget-object v2, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 51
    .line 52
    if-eq v1, v2, :cond_3b

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_57

    .line 59
    .line 60
    :cond_3b
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->n0()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_57

    .line 65
    .line 66
    invoke-static {}, Lcom/voxdon/xplorer/file/z;->Y()Lcom/voxdon/xplorer/file/z;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v1, v2, p1}, Lcom/voxdon/xplorer/file/z;->C(Ljava/lang/String;Z)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-gez p1, :cond_53

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/n;->d0(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_b7

    .line 84
    :cond_53
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/n;->d0(I)V

    .line 85
    .line 86
    .line 87
    goto :goto_b7

    .line 88
    :cond_57
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->m0()Z

    .line 89
    .line 90
    .line 91
    move-result p1
    :try_end_5b
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_5b} :catch_b4

    .line 92
    if-eqz p1, :cond_ab

    .line 93
    .line 94
    :try_start_5d
    iget-object p1, p0, Lcom/voxdon/xplorer/file/y;->m0:Lcom/voxdon/xplorer/file/x;

    .line 95
    .line 96
    invoke-static {p1, p0}, Lcom/voxdon/xplorer/file/g;->J(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-eqz p1, :cond_6d

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/n;->d0(I)V

    .line 107
    .line 108
    .line 109
    goto :goto_b7

    .line 110
    :cond_6d
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/n;->d0(I)V
    :try_end_70
    .catch Lax/b3/j; {:try_start_5d .. :try_end_70} :catch_a7
    .catch Ljava/lang/NullPointerException; {:try_start_5d .. :try_end_70} :catch_71
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5d .. :try_end_70} :catch_b4

    .line 111
    .line 112
    .line 113
    goto :goto_b7

    .line 114
    :catch_71
    :try_start_71
    const-string p1, "HELPERNULL"

    .line 115
    .line 116
    new-instance v1, Ljava/lang/Exception;

    .line 117
    .line 118
    new-instance v2, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    const-string v3, "NullPointer helper==null:"

    .line 124
    .line 125
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object v3, p0, Lcom/voxdon/xplorer/file/y;->m0:Lcom/voxdon/xplorer/file/x;

    .line 129
    .line 130
    if-nez v3, :cond_85

    .line 131
    .line 132
    const/4 v3, 0x1

    .line 133
    goto :goto_86

    .line 134
    :cond_85
    const/4 v3, 0x0

    .line 135
    :goto_86
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v3, ","

    .line 139
    .line 140
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v3}, Lax/c3/K;->k()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {p1, v1}, Lax/Q2/d;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/n;->d0(I)V

    .line 165
    .line 166
    .line 167
    goto :goto_b7

    .line 168
    :catch_a7
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/n;->d0(I)V

    .line 169
    .line 170
    .line 171
    goto :goto_b7

    .line 172
    :cond_ab
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/n;->d0(I)V

    .line 173
    .line 174
    .line 175
    goto :goto_b7

    .line 176
    :cond_af
    array-length p1, v1

    .line 177
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/n;->d0(I)V
    :try_end_b3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_71 .. :try_end_b3} :catch_b4

    .line 178
    .line 179
    .line 180
    goto :goto_b7

    .line 181
    :catch_b4
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/n;->d0(I)V

    .line 182
    .line 183
    .line 184
    :cond_b7
    :goto_b7
    return-void
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
.end method

.method public h()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->K0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_14

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->C()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "."

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->K0:Ljava/lang/Boolean;

    .line 20
    .line 21
    :cond_14
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->K0:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0
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
.end method

.method public h1(Z)Z
    .registers 5

    .line 1
    invoke-static {}, Lax/X2/Q;->V1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->o0()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->f1()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_16

    .line 21
    .line 22
    return v1

    .line 23
    :cond_16
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Lax/c3/K;->e:Lax/c3/K;

    .line 28
    .line 29
    if-ne v0, v1, :cond_23

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1

    .line 36
    :cond_23
    sget-object v1, Lax/c3/K;->f:Lax/c3/K;

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    if-ne v0, v1, :cond_3f

    .line 40
    .line 41
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, v0}, Lax/Z2/j;->j0(Lax/c3/K;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_37

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    return p1

    .line 56
    :cond_37
    if-eqz p1, :cond_3a

    .line 57
    .line 58
    return v2

    .line 59
    :cond_3a
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1

    .line 64
    :cond_3f
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1, v0}, Lax/Z2/j;->j0(Lax/c3/K;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    xor-int/2addr p1, v2

    .line 73
    return p1
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
.end method

.method public i0()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/y;->h1(Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
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

.method public i1(J)V
    .registers 3

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->u0:Ljava/lang/Long;

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

.method public isDirectory()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_2d

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->x0:Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v0, :cond_10

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_10

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_10
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->e1()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1b

    .line 22
    .line 23
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 26
    .line 27
    goto :goto_2d

    .line 28
    :cond_1b
    invoke-static {}, Lax/X2/Q;->P1()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_26

    .line 33
    .line 34
    :try_start_21
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->t1()V
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_24} :catch_25

    .line 35
    .line 36
    .line 37
    goto :goto_26

    .line 38
    :catch_25
    nop

    .line 39
    :cond_26
    :goto_26
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 40
    .line 41
    if-nez v0, :cond_2d

    .line 42
    .line 43
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->p1()V

    .line 44
    .line 45
    .line 46
    :cond_2d
    :goto_2d
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->y0:Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    return v0
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

.method public j()Z
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->z0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_53

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->z0:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_53

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_53

    .line 28
    .line 29
    :try_start_1c
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->s1()Z
    :try_end_1f
    .catch Lax/b3/r; {:try_start_1c .. :try_end_1f} :catch_53
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1f} :catch_20

    .line 30
    .line 31
    .line 32
    goto :goto_53

    .line 33
    :catch_20
    move-exception v0

    .line 34
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "DOCUMENT FILE CANWRITE"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v2, "loc:"

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Lax/c3/K;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 82
    .line 83
    .line 84
    :catch_53
    :cond_53
    :goto_53
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->z0:Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    return v0
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

.method public j0()Z
    .registers 2

    .line 1
    invoke-static {}, Lax/X2/Q;->F1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->d1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_e
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public j1(Z)V
    .registers 2

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->x0:Ljava/lang/Boolean;

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

.method public k0()Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->m0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lax/c3/K;->e:Lax/c3/K;

    .line 14
    .line 15
    if-ne v0, v1, :cond_15

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_15
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->R0()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0
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
.end method

.method public k1(Lcom/voxdon/xplorer/file/y$b;)V
    .registers 3

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/y$b;->q:Lcom/voxdon/xplorer/file/y$b;

    .line 2
    .line 3
    if-eq p1, v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_7

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    :goto_7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->K0:Ljava/lang/Boolean;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->L0:Lcom/voxdon/xplorer/file/y$b;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public l()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->s0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_22

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lax/Q2/f;->t0:Lax/Q2/f;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1e

    .line 12
    .line 13
    :try_start_c
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 14
    .line 15
    invoke-static {v0}, Lax/c3/B;->R(Ljava/io/File;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->s0:Ljava/lang/Boolean;
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_18} :catch_19

    .line 24
    .line 25
    goto :goto_22

    .line 26
    :catch_19
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->s0:Ljava/lang/Boolean;

    .line 29
    .line 30
    goto :goto_22

    .line 31
    :cond_1e
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->s0:Ljava/lang/Boolean;

    .line 34
    .line 35
    :cond_22
    :goto_22
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->s0:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    return v0
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

.method public l1(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/y;->O0:Z

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

.method public m0()Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->i0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-static {}, Lax/X2/J;->l()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_19

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lax/X2/J;->C(Lax/c3/K;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_19

    .line 24
    .line 25
    return v1

    .line 26
    :cond_19
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->T0()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    return v0
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
.end method

.method public m1(J)V
    .registers 3

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

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

.method public n()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->x0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->q1()V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->x0:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public o0()Z
    .registers 3

    .line 1
    invoke-static {}, Lax/X2/Q;->a2()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1a

    .line 6
    .line 7
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lax/Z2/j;->q()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1a

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lax/c3/K;->h:Lax/c3/K;

    .line 22
    .line 23
    if-ne v0, v1, :cond_1a

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1a
    const/4 v0, 0x0

    .line 28
    return v0
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
.end method

.method public o1()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public p()J
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_16

    .line 4
    .line 5
    invoke-static {}, Lax/X2/Q;->P1()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_f

    .line 10
    .line 11
    :try_start_a
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->t1()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_d} :catch_e

    .line 12
    .line 13
    .line 14
    goto :goto_f

    .line 15
    :catch_e
    nop

    .line 16
    :cond_f
    :goto_f
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 17
    .line 18
    if-nez v0, :cond_16

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->y1()V

    .line 21
    .line 22
    .line 23
    :cond_16
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->v0:Ljava/lang/Long;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    return-wide v0
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
.end method

.method public q()J
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->v1()V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public q0()Z
    .registers 7

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_9

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->v1()V

    .line 7
    .line 8
    .line 9
    return v1

    .line 10
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->v1()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    cmp-long v0, v4, v2

    .line 24
    .line 25
    if-eqz v0, :cond_1c

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_1c
    return v1
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
.end method

.method public q1()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/file/y;->p0(ZZ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->x0:Ljava/lang/Boolean;

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

.method public r(Z)I
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/y;->g1(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->X()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
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

.method public r0()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->t0:Ljava/lang/Long;

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
.end method

.method public r1()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->w0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->x0:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p0, v0, v1}, Lcom/voxdon/xplorer/file/y;->p0(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->x0:Ljava/lang/Boolean;

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public s()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->o0:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->v0()V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->o0:Ljava/lang/String;

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
.end method

.method public s0(Lcom/voxdon/xplorer/file/n;)I
    .registers 4

    .line 1
    const/4 v0, -0x1

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    :try_start_4
    iget-object v1, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 6
    .line 7
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/io/File;->compareTo(Ljava/io/File;)I

    .line 12
    .line 13
    .line 14
    move-result p1
    :try_end_e
    .catch Ljava/lang/ClassCastException; {:try_start_4 .. :try_end_e} :catch_f

    .line 15
    return p1

    .line 16
    :catch_f
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public t()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

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

.method public t0(Lcom/voxdon/xplorer/file/y;)V
    .registers 3

    .line 1
    iget-object v0, p1, Lcom/voxdon/xplorer/file/y;->C0:Ljava/lang/Boolean;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->C0:Ljava/lang/Boolean;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/voxdon/xplorer/file/y;->G0:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/voxdon/xplorer/file/y;->G0:Ljava/lang/String;

    .line 8
    .line 9
    return-void
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

.method public t1()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v0, v0, v1}, Lcom/voxdon/xplorer/file/y;->u1(ZZZZ)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->z0()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->A0()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->y0()V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected u(I)Z
    .registers 3

    .line 1
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/file/n;->u(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_9

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->Q0:Ljava/lang/String;

    .line 9
    .line 10
    :cond_9
    return p1
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

.method public v1()V
    .registers 2

    .line 1
    invoke-static {}, Lax/X2/Q;->P1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    :try_start_6
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->t1()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_9} :catch_a

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catch_a
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->w1()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/y;->w1()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public w0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->x0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->r1()V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->x0:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public x0()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/y;->n0:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

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

.method public x1()Landroid/net/Uri;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/r;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/voxdon/xplorer/file/y;->B0:Landroid/net/Uri;

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->N0()Landroid/net/Uri;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
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
