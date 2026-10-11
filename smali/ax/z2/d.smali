.class public final Lax/z2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/z2/c;


# instance fields
.field private final b:Lax/A2/m;

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lax/A2/m;)V
    .registers 11

    const-string v0, "densityCompatHelper"

    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lax/z2/d;->b:Lax/A2/m;

    .line 3
    invoke-static {}, Lax/c0/F0$m;->g()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 4
    invoke-static {}, Lax/c0/F0$m;->f()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 5
    invoke-static {}, Lax/c0/F0$m;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 6
    invoke-static {}, Lax/c0/F0$m;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 7
    invoke-static {}, Lax/c0/F0$m;->i()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 8
    invoke-static {}, Lax/c0/F0$m;->e()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 9
    invoke-static {}, Lax/c0/F0$m;->j()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 10
    invoke-static {}, Lax/c0/F0$m;->b()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v7, 0x8

    new-array v7, v7, [Ljava/lang/Integer;

    const/4 v8, 0x0

    aput-object p1, v7, v8

    const/4 p1, 0x1

    aput-object v0, v7, p1

    const/4 p1, 0x2

    aput-object v1, v7, p1

    const/4 p1, 0x3

    aput-object v2, v7, p1

    const/4 p1, 0x4

    aput-object v3, v7, p1

    const/4 p1, 0x5

    aput-object v4, v7, p1

    const/4 p1, 0x6

    aput-object v5, v7, p1

    const/4 p1, 0x7

    aput-object v6, v7, p1

    .line 11
    invoke-static {v7}, Lax/tb/o;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lax/z2/d;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Lax/A2/m;ILax/Gb/g;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_a

    .line 12
    sget-object p1, Lax/A2/m;->a:Lax/A2/m$a;

    invoke-virtual {p1}, Lax/A2/m$a;->a()Lax/A2/m;

    move-result-object p1

    .line 13
    :cond_a
    invoke-direct {p0, p1}, Lax/z2/d;-><init>(Lax/A2/m;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lax/z2/a;
    .registers 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lax/A2/v;->a:Lax/A2/v$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/A2/v$a;->a()Lax/A2/v;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lax/z2/d;->b:Lax/A2/m;

    .line 13
    .line 14
    invoke-interface {v0, p1, v1}, Lax/A2/v;->a(Landroid/content/Context;Lax/A2/m;)Lax/z2/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public b(Landroid/app/Activity;)Lax/z2/a;
    .registers 4

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lax/A2/v;->a:Lax/A2/v$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/A2/v$a;->a()Lax/A2/v;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lax/z2/d;->b:Lax/A2/m;

    .line 13
    .line 14
    invoke-interface {v0, p1, v1}, Lax/A2/v;->b(Landroid/app/Activity;Lax/A2/m;)Lax/z2/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
.end method
