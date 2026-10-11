.class public Lax/k2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lax/o2/h$c;

.field public final d:Lax/k2/u$e;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/k2/u$b;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Z

.field public final g:Lax/k2/u$d;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Landroid/content/Intent;

.field public final k:Z

.field public final l:Z

.field private final m:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Ljava/lang/String;

.field public final o:Ljava/io/File;

.field public final p:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/l2/a;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lax/o2/h$c;Lax/k2/u$e;Ljava/util/List;ZLax/k2/u$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lax/k2/u$f;Ljava/util/List;Ljava/util/List;)V
    .registers 24
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lax/o2/h$c;",
            "Lax/k2/u$e;",
            "Ljava/util/List<",
            "+",
            "Lax/k2/u$b;",
            ">;Z",
            "Lax/k2/u$d;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            "Landroid/content/Intent;",
            "ZZ",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Ljava/util/concurrent/Callable<",
            "Ljava/io/InputStream;",
            ">;",
            "Lax/k2/u$f;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lax/l2/a;",
            ">;)V"
        }
    .end annotation

    move-object v0, p10

    move-object/from16 v1, p18

    move-object/from16 v2, p19

    const-string v3, "context"

    invoke-static {p1, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "sqliteOpenHelperFactory"

    invoke-static {p3, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "migrationContainer"

    invoke-static {p4, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "journalMode"

    invoke-static {p7, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "queryExecutor"

    invoke-static {p8, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "transactionExecutor"

    invoke-static {p9, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "typeConverters"

    invoke-static {v1, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "autoMigrationSpecs"

    invoke-static {v2, v3}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lax/k2/f;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lax/k2/f;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lax/k2/f;->c:Lax/o2/h$c;

    .line 5
    iput-object p4, p0, Lax/k2/f;->d:Lax/k2/u$e;

    .line 6
    iput-object p5, p0, Lax/k2/f;->e:Ljava/util/List;

    .line 7
    iput-boolean p6, p0, Lax/k2/f;->f:Z

    .line 8
    iput-object p7, p0, Lax/k2/f;->g:Lax/k2/u$d;

    .line 9
    iput-object p8, p0, Lax/k2/f;->h:Ljava/util/concurrent/Executor;

    .line 10
    iput-object p9, p0, Lax/k2/f;->i:Ljava/util/concurrent/Executor;

    .line 11
    iput-object v0, p0, Lax/k2/f;->j:Landroid/content/Intent;

    move p1, p11

    .line 12
    iput-boolean p1, p0, Lax/k2/f;->k:Z

    move/from16 p1, p12

    .line 13
    iput-boolean p1, p0, Lax/k2/f;->l:Z

    move-object/from16 p1, p13

    .line 14
    iput-object p1, p0, Lax/k2/f;->m:Ljava/util/Set;

    move-object/from16 p1, p14

    .line 15
    iput-object p1, p0, Lax/k2/f;->n:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Lax/k2/f;->o:Ljava/io/File;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lax/k2/f;->p:Ljava/util/concurrent/Callable;

    .line 18
    iput-object v1, p0, Lax/k2/f;->q:Ljava/util/List;

    .line 19
    iput-object v2, p0, Lax/k2/f;->r:Ljava/util/List;

    if-eqz v0, :cond_63

    const/4 p1, 0x1

    goto :goto_64

    :cond_63
    const/4 p1, 0x0

    .line 20
    :goto_64
    iput-boolean p1, p0, Lax/k2/f;->s:Z

    return-void
.end method


# virtual methods
.method public a(II)Z
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-le p1, p2, :cond_8

    .line 3
    .line 4
    iget-boolean p2, p0, Lax/k2/f;->l:Z

    .line 5
    .line 6
    if-eqz p2, :cond_8

    .line 7
    .line 8
    return v0

    .line 9
    :cond_8
    iget-boolean p2, p0, Lax/k2/f;->k:Z

    .line 10
    .line 11
    if-eqz p2, :cond_1c

    .line 12
    .line 13
    iget-object p2, p0, Lax/k2/f;->m:Ljava/util/Set;

    .line 14
    .line 15
    if-eqz p2, :cond_1a

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_1c

    .line 26
    .line 27
    :cond_1a
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_1c
    return v0
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
