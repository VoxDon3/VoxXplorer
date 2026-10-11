.class public final synthetic Lax/i1/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/l;


# instance fields
.field public final synthetic a:Lax/i1/N$a;

.field public final synthetic b:Lax/i1/y;

.field public final synthetic c:Lax/i1/B;

.field public final synthetic d:Ljava/io/IOException;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lax/i1/N$a;Lax/i1/y;Lax/i1/B;Ljava/io/IOException;Z)V
    .registers 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i1/I;->a:Lax/i1/N$a;

    iput-object p2, p0, Lax/i1/I;->b:Lax/i1/y;

    iput-object p3, p0, Lax/i1/I;->c:Lax/i1/B;

    iput-object p4, p0, Lax/i1/I;->d:Ljava/io/IOException;

    iput-boolean p5, p0, Lax/i1/I;->e:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/i1/I;->a:Lax/i1/N$a;

    iget-object v1, p0, Lax/i1/I;->b:Lax/i1/y;

    iget-object v2, p0, Lax/i1/I;->c:Lax/i1/B;

    iget-object v3, p0, Lax/i1/I;->d:Ljava/io/IOException;

    iget-boolean v4, p0, Lax/i1/I;->e:Z

    move-object v5, p1

    check-cast v5, Lax/i1/N;

    invoke-static/range {v0 .. v5}, Lax/i1/N$a;->b(Lax/i1/N$a;Lax/i1/y;Lax/i1/B;Ljava/io/IOException;ZLax/i1/N;)V

    return-void
.end method
