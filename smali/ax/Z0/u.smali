.class public final synthetic Lax/Z0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;IIZ)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/u;->a:Lax/Z0/c$a;

    iput p2, p0, Lax/Z0/u;->b:I

    iput p3, p0, Lax/Z0/u;->c:I

    iput-boolean p4, p0, Lax/Z0/u;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/Z0/u;->a:Lax/Z0/c$a;

    iget v1, p0, Lax/Z0/u;->b:I

    iget v2, p0, Lax/Z0/u;->c:I

    iget-boolean v3, p0, Lax/Z0/u;->d:Z

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, v2, v3, p1}, Lax/Z0/u0;->D0(Lax/Z0/c$a;IIZLax/Z0/c;)V

    return-void
.end method
