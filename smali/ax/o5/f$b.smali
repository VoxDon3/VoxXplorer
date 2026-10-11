.class final Lax/o5/f$b;
.super Lax/o5/p$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lax/o5/s;

.field private b:Lax/o5/p$b;


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/o5/p$a;-><init>()V

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


# virtual methods
.method public a()Lax/o5/p;
    .registers 5

    .line 1
    new-instance v0, Lax/o5/f;

    .line 2
    .line 3
    iget-object v1, p0, Lax/o5/f$b;->a:Lax/o5/s;

    .line 4
    .line 5
    iget-object v2, p0, Lax/o5/f$b;->b:Lax/o5/p$b;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lax/o5/f;-><init>(Lax/o5/s;Lax/o5/p$b;Lax/o5/f$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method public b(Lax/o5/s;)Lax/o5/p$a;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o5/f$b;->a:Lax/o5/s;

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

.method public c(Lax/o5/p$b;)Lax/o5/p$a;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o5/f$b;->b:Lax/o5/p$b;

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
