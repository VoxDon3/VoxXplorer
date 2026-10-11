.class public abstract Lax/o5/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static a(Ljava/util/List;)Lax/o5/n;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/o5/u;",
            ">;)",
            "Lax/o5/n;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/o5/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/o5/d;-><init>(Ljava/util/List;)V

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
.end method

.method public static b()Lax/U7/a;
    .registers 2

    .line 1
    new-instance v0, Lax/W7/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/W7/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lax/o5/b;->a:Lax/V7/a;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lax/W7/d;->j(Lax/V7/a;)Lax/W7/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Lax/W7/d;->k(Z)Lax/W7/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lax/W7/d;->i()Lax/U7/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/o5/u;",
            ">;"
        }
    .end annotation
.end method
