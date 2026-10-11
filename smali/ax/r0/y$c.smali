.class public abstract Lax/r0/y$c;
.super Lax/r0/y;
.source "SourceFile"

# interfaces
.implements Lax/r0/T;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/r0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lax/r0/y$c<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lax/r0/y<",
        "TMessageType;TBuilderType;>;",
        "Lax/r0/T;"
    }
.end annotation


# instance fields
.field protected extensions:Lax/r0/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r0/u<",
            "Lax/r0/y$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/r0/y;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lax/r0/u;->h()Lax/r0/u;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lax/r0/y$c;->extensions:Lax/r0/u;

    .line 9
    .line 10
    return-void
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
.method J()Lax/r0/u;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/r0/u<",
            "Lax/r0/y$d;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/r0/y$c;->extensions:Lax/r0/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/r0/u;->o()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_10

    .line 8
    .line 9
    iget-object v0, p0, Lax/r0/y$c;->extensions:Lax/r0/u;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/r0/u;->b()Lax/r0/u;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/r0/y$c;->extensions:Lax/r0/u;

    .line 16
    .line 17
    :cond_10
    iget-object v0, p0, Lax/r0/y$c;->extensions:Lax/r0/u;

    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method public bridge synthetic c()Lax/r0/S;
    .registers 2

    .line 1
    invoke-super {p0}, Lax/r0/y;->y()Lax/r0/y;

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

.method public bridge synthetic d()Lax/r0/S$a;
    .registers 2

    .line 1
    invoke-super {p0}, Lax/r0/y;->I()Lax/r0/y$a;

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

.method public bridge synthetic j()Lax/r0/S$a;
    .registers 2

    .line 1
    invoke-super {p0}, Lax/r0/y;->D()Lax/r0/y$a;

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
