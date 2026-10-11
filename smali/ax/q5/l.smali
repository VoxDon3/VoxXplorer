.class public final Lax/q5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/r5/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/r5/b<",
        "Lax/q5/k;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lax/ib/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/ib/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lax/ib/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/ib/a<",
            "Lax/q5/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lax/ib/a;Lax/ib/a;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/ib/a<",
            "Landroid/content/Context;",
            ">;",
            "Lax/ib/a<",
            "Lax/q5/i;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/q5/l;->a:Lax/ib/a;

    .line 5
    .line 6
    iput-object p2, p0, Lax/q5/l;->b:Lax/ib/a;

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

.method public static a(Lax/ib/a;Lax/ib/a;)Lax/q5/l;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/ib/a<",
            "Landroid/content/Context;",
            ">;",
            "Lax/ib/a<",
            "Lax/q5/i;",
            ">;)",
            "Lax/q5/l;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/q5/l;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lax/q5/l;-><init>(Lax/ib/a;Lax/ib/a;)V

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

.method public static c(Landroid/content/Context;Ljava/lang/Object;)Lax/q5/k;
    .registers 3

    .line 1
    new-instance v0, Lax/q5/k;

    .line 2
    .line 3
    check-cast p1, Lax/q5/i;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lax/q5/k;-><init>(Landroid/content/Context;Lax/q5/i;)V

    .line 6
    .line 7
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
.method public b()Lax/q5/k;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/q5/l;->a:Lax/ib/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/ib/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    iget-object v1, p0, Lax/q5/l;->b:Lax/ib/a;

    .line 10
    .line 11
    invoke-interface {v1}, Lax/ib/a;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lax/q5/l;->c(Landroid/content/Context;Ljava/lang/Object;)Lax/q5/k;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/q5/l;->b()Lax/q5/k;

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
