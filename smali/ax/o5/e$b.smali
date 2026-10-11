.class final Lax/o5/e$b;
.super Lax/o5/o$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lax/o5/o$b;

.field private b:Lax/o5/a;


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/o5/o$a;-><init>()V

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
.method public a()Lax/o5/o;
    .registers 5

    .line 1
    new-instance v0, Lax/o5/e;

    .line 2
    .line 3
    iget-object v1, p0, Lax/o5/e$b;->a:Lax/o5/o$b;

    .line 4
    .line 5
    iget-object v2, p0, Lax/o5/e$b;->b:Lax/o5/a;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lax/o5/e;-><init>(Lax/o5/o$b;Lax/o5/a;Lax/o5/e$a;)V

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

.method public b(Lax/o5/a;)Lax/o5/o$a;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o5/e$b;->b:Lax/o5/a;

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

.method public c(Lax/o5/o$b;)Lax/o5/o$a;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o5/e$b;->a:Lax/o5/o$b;

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
