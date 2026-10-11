.class public final synthetic Lax/Z0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:Lax/i1/y;

.field public final synthetic c:Lax/i1/B;

.field public final synthetic d:Ljava/io/IOException;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;Lax/i1/y;Lax/i1/B;Ljava/io/IOException;Z)V
    .registers 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/i;->a:Lax/Z0/c$a;

    iput-object p2, p0, Lax/Z0/i;->b:Lax/i1/y;

    iput-object p3, p0, Lax/Z0/i;->c:Lax/i1/B;

    iput-object p4, p0, Lax/Z0/i;->d:Ljava/io/IOException;

    iput-boolean p5, p0, Lax/Z0/i;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/Z0/i;->a:Lax/Z0/c$a;

    iget-object v1, p0, Lax/Z0/i;->b:Lax/i1/y;

    iget-object v2, p0, Lax/Z0/i;->c:Lax/i1/B;

    iget-object v3, p0, Lax/Z0/i;->d:Ljava/io/IOException;

    iget-boolean v4, p0, Lax/Z0/i;->e:Z

    move-object v5, p1

    check-cast v5, Lax/Z0/c;

    invoke-static/range {v0 .. v5}, Lax/Z0/u0;->f1(Lax/Z0/c$a;Lax/i1/y;Lax/i1/B;Ljava/io/IOException;ZLax/Z0/c;)V

    return-void
.end method
