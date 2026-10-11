.class public final Lax/N3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/N3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/N3/i$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/N3/c<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lax/X3/l;


# direct methods
.method constructor <init>(Ljava/io/InputStream;Lax/Q3/b;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/X3/l;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Lax/X3/l;-><init>(Ljava/io/InputStream;Lax/Q3/b;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/N3/i;->a:Lax/X3/l;

    .line 10
    .line 11
    const/high16 p1, 0x500000

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lax/X3/l;->mark(I)V

    .line 14
    .line 15
    .line 16
    return-void
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
.method public bridge synthetic a()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/N3/i;->c()Ljava/io/InputStream;

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

.method public b()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/N3/i;->a:Lax/X3/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/X3/l;->c()V

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
.end method

.method public c()Ljava/io/InputStream;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/N3/i;->a:Lax/X3/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/X3/l;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/N3/i;->a:Lax/X3/l;

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
.end method
